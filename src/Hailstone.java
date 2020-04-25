public class Hailstone {

    /** Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        /* to be implemented in part (a)
        * rules: even = /2, odd = x3 +1
        */

        if (n == 1) {
            return 1;

        } else {
            int num = 1;

            while (n > 1) {

                if (n % 2 != 0) {
                    n = 3*n+1;
                    num++;

                } else {
                    n /= 2;
                    num++;
                }
            }
            return num;
        }
    }


    /** Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise, as described in part (b).
     * Precondition: n > 0
     */
    public static boolean isLongSeq(int n){
        /* to be implemented in part (b) */
        boolean res = false;

        if (n < hailstoneLength(n)) {
            res = true;
        }
        return res;
    }


    /** Returns the proportion of the first n hailstone sequences that are considered long,
     * as described in part (c).
     * Precondition: n > 0
     */
    public static double propLong(int n){
        /* to be implemented in part (c) */
        double num = 0;

        for (int i = 1; i <= n; i++) {
            if (isLongSeq(i)) {
                num++;
            }
        }
        return num / n;
    }

    // There may be instance variables, constructors, and methods not shown.

}