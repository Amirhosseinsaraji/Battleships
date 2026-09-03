public class SimpleStartup {
    private int[] locationCells;
    private int numOfHits = 0;

    public void setlocationCells(int[] locs){
        locationCells = locs;
    }
     public String checkYourself(int guess){
        String result ="miss";
        for( int cell : locationCells){
            if(guess == cell){
                result="hit";
                numOfHits++;
                break;
            }//end if
        }//end for
        if (numOfHits == locationCells.length){
            result="kill";
        }
        System.out.println(result);
        return result;
    }


}
