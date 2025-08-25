import java.util.*;
public class hashmap {
    public static void main(String[]args){
        //       <key,Value>
        HashMap<String,Integer> map = new HashMap<>();

        //Adding values in Map
        map.put("India",12);
        map.put("Nepal",112);
        map.put("England",122);
        map.put("Australia",102);

        System.out.println(map);

        //Repeating key(Ans:-present key-value pair gets replaced with new key-value pair)
        map.put("India",12222);
        System.out.println(map);

        //Repeating Value(Values of keys can be repeated)
        map.put("Pakistan",12222);
        System.out.println(map);

        //Searching by key
        if(map.containsKey("gufhwhguhyhewgfu")){
            System.out.println("Present");
        }
        else{
            System.out.println("Absent");
        }

        //Searching by Value
        if(map.containsValue(202)){
            System.out.println("Present");
        }
        else{
            System.out.println("Absent");
        }

        //Fetching value of key
        System.out.println(map.get("Nepal"));


        //Removing a pair
        map.remove("Australia");
        System.out.println(map);

        //Size of Map
        System.out.println(map.size());

        //Traversal(Iteration) through Map
        for(String i:map.keySet()){
            System.out.println(i+":"+map.get(i));
        }
    }
}
