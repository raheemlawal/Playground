import java.util.*;

public class MapBasics{
    public static void main(String[]args){
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        
        hm.put("Apple",1);
        hm.put("Banana",2);
        
        for(Map.Entry<String,Integer> me : hm.entrySet()){
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }
    }
}