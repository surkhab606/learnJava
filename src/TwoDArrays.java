public class TwoDArrays {

    public static void main(String[] args) {

        //First way of making a 2D array
        int[][] lotteryCard = { {20, 15, 7},
                                {10, 13, 15},
                                {10, 10, 10}

        };

        //Second way of making a 2D array
        int[][] lotteryCard2 = new int[3][3];
        lotteryCard2[0][0] = 20;
        lotteryCard2[0][1] = 15;
        lotteryCard2[0][2] = 7;
        lotteryCard2[1][0] = 10;
        lotteryCard2[1][1] = 13;
        lotteryCard2[1][2] = 15;
        lotteryCard2[2][0] = 10;
        lotteryCard2[2][1] = 10;
        lotteryCard2[2][2] = 10;


        for(int i = 0; i < 3; i++) {
            System.out.println(lotteryCard[i][i]);
        }

    }
}
