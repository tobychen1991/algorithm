import java.util.ArrayList;
import java.util.List;

/**
 * Created by toby on 21/03/2018.
 */
public class T401BinaryWatch {

    public static void main(String[] args) {
        for (String s : T401BinaryWatch.readBinaryWatch(1)) {
            System.out.println(s);
        }
    }

    public static List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(i * 64 + j) == num) {
                    list.add(String.format("%d:%02d",i,j));
                }
            }
        }
        return list;
    }
}
