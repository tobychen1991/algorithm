import java.util.*;

/**
 * 查找一个数组中重复出现n次的字符
 * Created by toby on 21/03/2018.
 */
public class FindRepeatNum {

    public static void main(String[] args) {
        String[] strings = {"a","d","a","j","o","d"};
        System.out.println(FindRepeatNum.findNum(strings,2));
    }

    public static List findNum(String[] array,int n) {
        List<String> resultList = new ArrayList();
        HashMap<String,Integer> hashMap = new HashMap<>();
        Integer num;
        for (String str : array) {
            if ((num = hashMap.get(str)) == null) {
                hashMap.put(str,1);
            }else{
                hashMap.put(str,++num);
            }
        }
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == n) {
                resultList.add(entry.getKey());
            }
        }
        if (resultList.size() > 0) {
            return resultList;
        }else {
            throw new IllegalArgumentException("no such String");
        }
    }
}
