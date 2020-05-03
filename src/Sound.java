public class Sound {
    /** the array of values in this sound; guaranteed not to be null */
    private int[] samples;
    /** constructor created for testing purposes
     * Not part of original problem
     */
    public Sound(int[] samples) {
        this.samples = samples;
    }
    /** Changes those values in this sound that have an amplitude greater than limit.
     * Values greater than limit are changed to limit.
     * Values less than -limit are changed to -limit.
     * @param limit the amplitude limit
     *              Precondition limit >= 0
     * @return the number of values in this sound that this method changed.
     */
    public int limitAmplitude(int limit) {
        int nuc = 0;
        for (int n = 0; n < samples.length; n++) {
            if (samples[n] > limit) {
                samples[n] = limit;
                nuc++;
            } else if (samples[n] < -1 * limit) {
                samples[n] = -1 * limit;
                nuc++;
            }
        }
        return nuc;
    }
        /**
         * Removes all silence from the beginning of this sound.
         * Silence is represented by a value of 0;
         * Precodition: samples contains at least one nonzero value
         * Postcondition: the length of samples reflects the removal of starting silence
         */
        public void trimSilenceFromBeginning () {
            int sta = -1;
            for (int n = 0; n < samples.length; n++) {
                if (samples[n] == 0)
                    sta = n + 1;
                else
                    break;
            }
            int[] trim;
            if (sta != -1) {
                trim = new int[samples.length - sta];
            } else {
                return;
            }
            for (int n = 0; n < trim.length; n++) {
                trim[n] = samples[n + sta];
            }
            samples = trim;
        }
        /** accessor method used for testing purposes - Not part of original program */
        public int[] getSamples() {
            return samples;
        }
}