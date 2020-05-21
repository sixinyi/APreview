public class StudentRecord {

    private int[] scores; // contains scores.length values. scores.length > 1

    public StudentRecord(int[] scores) {
        this.scores = scores;
    }

    /** Returns the average (arithmetic mean) of the values in scores
     * whose subscripts are between first and last, inclusive
     * precondition: 0 <= first <= last < scores.length
     * Method is marked public for testing purposes.
     */
    public double average(int first, int last) {
        /* to be implemented in part (a) */
        double ave = 0, len = 0, res= 0 ;

        for(int n = first; n <= last; n++){
            ave += scores[n];
            len++;
        }

        return ave / len;
    }

    /** Returns true if each successive value in scores is greater
     * than or equal to the previous value;
     * otherwise, returns false
     * Method marked public for testing purposes.
     */
    public boolean hasImproved() {
        /* to be implemented in part (b) */
        boolean imp = true;

        for(int n = 0; n < scores.length - 1; n++){

            if(scores[n] > scores[n + 1]){
                imp = false;
                break;
            }

        }

        return imp;
    }

    /** If the values in scores have improved, returns the average of the elements in scores
     * with indexes greater than or equal to scores.length/2;
     * otherwise, returns the average of all the values in scores
     */
    public double finalAverage() {
        /* to be implemented in part (c) */
        double ave;

        if(hasImproved()){
            int sta = (scores.length) / 2;
            ave = average(sta, scores.length - 1);
        }

        else{
            ave = average(0, scores.length - 1);
        }

        return ave;
    }
}
