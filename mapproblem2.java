import java.util.LinkedHashMap;
import java.util.Map;

public class mapproblem2 {
    public static void main(String[] args) {
        String word= "hello";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char ch : word.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        map.forEach((key,value)->{
            System.out.println(key+" "+ value);
        });
    }
}
