/**
 * 字符串工具类
 */
public class StringUtil {

    //1.是否为合法的用户名，不能超过25个字符，不包含空格，单双引号，问号等特殊字符
    public static boolean isCorrectUserName(String userName){
        boolean isCorrect = true;
        if (userName == null) return false;
        if (userName.length() > 25) return false;

        char[] unValidChar = {' ','\'','"','?','<','>',','};
        for (char ch: unValidChar
             ) {
            if (userName.contains(Character.toString(ch))) {
                isCorrect = false;
                break;
            }
        }

        return isCorrect;
    }


    /**
     * 2.  密码 6- 18 位，只能包含字母、数字、特殊符号(下划线、@、#、!)
     *     纯数字、纯字母的时候，密码强度为弱（两颗星）
     *     数字+密码、数字+符号、数字+字母，强度为中
     *     同时存在三种字符，强度为强
     * @param password
     * @return   如果返回值为空，则密码验证失败，验证成功则返回星号代表强度
     */
    public static String validPassword(String password){

        String power = "";//如果返回值为空则密码验证失败，验证成功则返回星号代表强度

        if (password == null) {
            return power;
        }
        if( password.length() < 6 || password.length() > 18 ) return power;


//        String[] correctPart = {"_","@","#","$","!"};
        String part = "_@#!$";

        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                if (!part.contains(Character.toString(password.charAt(i)))){
                    return power;
                }
            }
        }
        //下面开始判断密码强度
        if (isDigit(password) || isLetter(password)){
            power = "密码强度为：⭐⭐⭐";
        }else if (isDigitAndLetter(password)){
            power = "密码强度为：⭐⭐⭐⭐";

        }else if (isDigitAndLetterAndSymble(password)){
            power = "密码强度为：⭐⭐⭐⭐⭐";
        }

        return power;

    }

    /**
     * 判断一个字符串是不是纯数字
     * @param value
     * @return
     */
    private static boolean isDigit(String value){
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isDigit(value.charAt(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * 判断一个字符串是不是纯字母
     * @param value
     * @return
     */
    private static boolean isLetter(String value){
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isLetter(value.charAt(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * 判断一个字符串是不是字母和数字组合
     * @param value
     * @return
     */
    private static boolean isDigitAndLetter(String value){
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isLetterOrDigit(value.charAt(i))){
                return false;
            }
        }
        return true;
    }


    /**
     * 判断一个字符串中是否包含合法的特殊字符
     * @param value
     * @return
     */
    private static boolean isContainsSymble(String value){
        String part = "!@#$_";
        for (int i = 0; i < value.length(); i++) {
            if (part.contains(Character.toString(value.charAt(i)))){
                return true;
            }
        }
        return false;
    }



    /**
     * 判断一个字符串是不是字母和数字以及特殊字符
     * @param value
     * @return
     */
    private static boolean isDigitAndLetterAndSymble(String value){
        for (int i = 0; i < value.length(); i++) {
            if (!(Character.isLetterOrDigit(value.charAt(i)) || "!@#$_".contains(Character.toString(value.charAt(i))))){
                return false;
            }
        }
        return true;
    }

}
