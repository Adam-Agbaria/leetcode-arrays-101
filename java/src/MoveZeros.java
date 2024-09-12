public class MoveZeros {
    public void moveZeroes(int[] array) {
        //This Solution Solves it in O(n)
        int temp  = 0;
        for(int i = 0, j = 0; i < arr.length; i++){
            if(arr[i] != 0){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }     
        }
    }
}
