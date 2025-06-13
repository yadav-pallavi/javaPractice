import java.util.HashMap;
import java.util.Map;


public class CharCount
{
    public static void count(String s)
    {
        Map<Character,Integer> map=new HashMap<>();
        for (char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

    }
    public static void main(String[] args) {
        count("Selllllenium");
    }
}
