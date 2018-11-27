package BookV2.BookV1;

import java.io.*;

/**
 * 包含对文件的读写静态方法：方便使用
 */
public class FileUtil {

    private static final String BookFile = "D:/wss.txt";
    private static final String sepAttr = ",";
    private static final String sep = System.getProperty("line.separator");

    /**
     * 写操作的文件
     * 注意：本方法会将图书仓库数组中的内容全新的写入到文件中，相当于覆盖操作
     *
     * @param bookArray
     */
    public static void SaveBooks(Book... bookArray) {
        BookBiz bookBiz = new BookBiz();
        if (bookArray == null || bookArray.length == 0) {
            return;
        }
        File file = new File(BookFile);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }


            try (FileWriter fileWriter = new FileWriter(file, false);
                 BufferedWriter out = new BufferedWriter(fileWriter);
            ) {
                StringBuffer content = new StringBuffer();
                int bookCOunt = bookBiz.getBookCount(bookArray);
                for (int i = 0; i < bookCOunt; i++
                ) {
                    content.append(bookArray[i].getBookId());
                    content.append(sepAttr);
                    content.append(bookArray[i].getBookName());
                    content.append(sepAttr);
                    content.append(bookArray[i].getCount());
                    content.append(sep);
                }

                //将字符写入文件中去
                out.write(content.toString());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }

    /**
     * 从文件中读取内容，将内容逐行拆解，重新整合成对象数组，并返回
     *
     * @return
     */
    public static Book[] LoadBooks() {
        File file = new File(BookFile);
        if (!file.exists()) {
            return null;
        }
        Book[] bookArray = new Book[999];
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr);) {
            String line = null;
            int count = 0;
            while ((line = br.readLine()) != null) {
                Book currBook = new Book();
                String[] attrs = line.split(sepAttr);
                currBook.setBookId(attrs[0].trim());
                currBook.setBookName(attrs[1].trim());
                currBook.setCount(Integer.parseInt(attrs[2].trim()));

                bookArray[count++] = currBook;

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookArray;
    }

}
