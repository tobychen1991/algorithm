import java.util.HashMap;

/**
 * Created by toby on 20/03/2018.
 */
public class T1TwoSum {

    public static void main(String[] args) {
        int[] array = {1,3,5,6,10};
        int target = 8;

        T1TwoSum.twoSum(array,target);
    }

    public static int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int num2;
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(num2 = target - numbers[i])) {
                return new int[]{map.get(num2),i};
            }
            map.put(numbers[i],i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
