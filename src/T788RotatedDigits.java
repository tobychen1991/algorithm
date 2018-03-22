/**
 * Created by toby on 22/03/2018.
 */
public class T788RotatedDigits {
    public int rotatedDigits(int N) {
        int count = 0;
        for (int i = 0; i <= N; i++) {
            if(isGood(i)) count++;
        }
        return count;
    }

    private boolean isGood(int i) {
        boolean flag = false;

        while (i > 0) {
            if(i%10 == 2) flag = true;
            if(i%10 == 5) flag = true;
            if(i%10 == 6) flag = true;
            if(i%10 == 9) flag = true;
            if(i%10 == 3) return false;
            if(i%10 == 4) return false;
            if(i%10 == 7) return false;
            i /= 10;
        }
        return flag;
    }
}
