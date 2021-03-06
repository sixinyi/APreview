public class TokenPass {

    private int[] board;
    private int currentPlayer;

    /** Creates the board array to be of size playerCount and fills it with
     * random integer values from 1 to 10, inclusive. Initializes currentPlayer to a
     * random integer value in the range between 0 and playerCount-1, inclusive.
     * @param playerCount the number of players
     */
    public TokenPass(int playerCount) {
        board = new int[playerCount];
        for(int n = 0; n < board.length; n++){
            board[n] = (int)(Math.random() * 9) + 1;
        }
        currentPlayer = (int)(Math.random() * playerCount);
    }

    /** Distributes the tokens from the current player's position one at a time to each player in
     * the game. Distribution begins with the next position and continues until all the tokens
     * have been distributed. If there are still tokens to distribute when the player at the
     * highest position is reached, the next token will be distributed to the player at position 0.
     * Precondition: the current player has at least one token.
     * Postcondition: the current player has not changed.
     */
    public void distributeCurrentPlayerTokens() {
        int cot = currentPlayer;
        while(board[currentPlayer] != 1){
            if(cot == board.length - 1)
                cot = 0;
            else
                cot++;
            board[cot]++;
            board[currentPlayer]--;
        }
    }
    public int[]getBoard(){return board;}
    public void setBoard(int[] ary){board = ary;}
    public int getCurrentPlayer(){return currentPlayer;}
    public void setCurrentPlayer(int i){currentPlayer = i;}
}
