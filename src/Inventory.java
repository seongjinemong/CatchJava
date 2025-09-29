import java.util.*;

public class Inventory {
    static int N = 3;
    static int K = 5;

    public static void main(String[] args) {

//        System.out.println(getConditionalProbability(0,1,1));

        double[][] dp = new double[N][6];

        for (int i = 0; i <= 5; i++) {
            dp[N - 1][i] = 5 - i;
        }

        System.out.println(Arrays.deepToString(dp));

        for (int i = N - 2; i >= 0; i--) { // N
            for (int j = 0; j < 6; j++) { // s
                double[] nplusonereward = new double[2];

                for (int k = 0; k < 6; k++) { // conditionalProbability
                    nplusonereward[0] += dp[i + 1][k] * getConditionalProbability(k, j, 0);
                    nplusonereward[1] += dp[i + 1][k] * getConditionalProbability(k, j, 1);
                }

                System.out.println("N = " + (i + 1) + ", s = " + j + ", a = " + 0 + ", result = " + (getReward(j, 0) + nplusonereward[0]));
                System.out.println("N = " + (i + 1) + ", s = " + j + ", a = " + 1 + ", result = " + (getReward(j, 1) + nplusonereward[1]));
                System.out.println();

                //System.out.println(getReward(j, 0) + " " + getReward(j, 1));
                dp[i][j] = Math.max(getReward(j, 0) + nplusonereward[0], getReward(j, 1) + nplusonereward[1]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static double getConditionalProbability(int j, int s, int a) {
        if (a == 0) {
            if (j >= s) return getProbability(j - s);
            else return 0;
        } else {
            return getProbability(j);
        }
    }

    public static double getProbability(int j) {
        return Math.pow(0.4, j) * (1.0 - 0.4);
    }

    public static double getReward(int s, int a) {
        if (a == 0) return (-1.0) * h(s);
        else return -(double) K + (-1.0) * h(0);
    }

    public static double h(int s) {
        return 2.0 * s;
    }
}