import java.util.LinkedHashMap;
import java.util.Map;

public class mapproblem {
    public static void main(String[] args) {
        String str= "hi hi hello hello how are are you";
        String[] s = str.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s2:s){
            map.put(s2, map.getOrDefault(s2, 0) + 1);
        }
        map.forEach((key,value)->{
            System.out.println(key+" " +value);
        });
    }
}
