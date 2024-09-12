import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    //The Previous solution doesn't work, Here is a new proposed solution
    public List<Integer> findDisappearedNumbers(int[] array) {
        List<Integer> result = new ArrayList<>();
        int[] marked = new int[array.length + 1];
        for(int i = 0; i < array.length; i++){
            marked[array[i]] += 1;
        }
        for(int i = 1; i < array.length; i++){
            if(marked[i] ==  0)
                result.add(i);
        }

        return result;
    }
}
