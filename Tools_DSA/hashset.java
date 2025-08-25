import java.util.*;
public class hashset {
    public static void main(String args[]){
        HashSet<Integer>set=new HashSet<>();

        //HashSet has no indexing

        //adding elements
        set.add(2);set.add(3);set.add(4);set.add(5);
        System.out.println(set);

        set.add(2);
        System.out.println(set);

        //removing elements
        set.remove(4);
        System.out.println(set);

        //Size of set
        int x=set.size();
        System.out.println(x);

        //checking presence of value
        int y=4;
        if(set.contains(y)){
            System.out.println("Present.");
        }
        else{
            System.out.println("Not present.");
        }

        //traversing the set
        for(Integer i:set){
            System.out.print(i+"->");
        }
    }
}
