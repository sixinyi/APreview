public class SpinnerGame {
    /** Precondition: min < max
     * Simulates a spin of a spinner by returning a random integer
     * between min and max, inclusive.
     */
    public int spin(int min, int max) {
        int num = max - min + 1;
        return(int)(Math.random() * num) + min;
    }
    /** Simulates one round of the game as described in part (b).
     */
    public void playRound() {
        int rum = 0;
        boolean tie = true;
        while(rum < 2 && tie == true) {
            int psp = spin(1, 10);
            int csp = spin(2, 9);
            int dif;
            if (csp > psp) {
                dif = psp - csp;
                System.out.println("You lose. "+dif+" points");
                tie = false;
            } else if (psp > csp) {
                dif = psp - csp;
                System.out.println("You win! "+dif+" points");
                tie = false;
            }
            psp++;
        }
        if(tie == true)
            System.out.println("Tie. 0 points");

    }
}
