public class ShuffleCardsDemo {
    public static void main(String[] args){

        final int N =52;
        int[] cards = new int[N];

        for (int i = 0; i < cards.length; i++) {
            cards[i] = i;
        }

//        System.out.println("洗牌前：");
//        for (int i = 0; i < cards.length; i++) {
//            System.out.print(cards[i]);
//            if((i + 1 ) % 13 == 0){
//                System.out.println();
//            }else {
//                System.out.print(",");
//            }
//        }


        for (int i = 0; i <cards.length ; i++) {
            int newIndex = (int)(Math.random() * N);
            int temp = cards[i];
            cards[i] = cards[newIndex];
            cards[newIndex] = temp;
        }

        String[] cardsColor = {"♠","♥","♦","♣"};

        String[] cardsValue = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};





        System.out.println("洗牌后：");
        for (int i = 0; i < cards.length; i++) {
//        System.out.printf("%s-%s",cardsColor[cards[i]/13],cardsValue[cards[i] % 13]);
        System.out.print(cards[i]);
            if((i + 1 ) % 13 == 0){
                System.out.println();
            }else {
                System.out.print("  ");
            }
        }



    }
}
