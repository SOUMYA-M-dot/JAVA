import java.util.*;
public class arraylist{

    public static void main(String args[]){
      //Class<Wrapper Class> obj_name(any name)=new Class<>();
        ArrayList<Integer> list=new ArrayList<>();

        //Adding values in list
        list.add(1);
        list.add(-1);
        list.add(4);
        list.add(2);
        list.add(7);
        list.add(11);
        list.add(20);

        System.out.println(list);
        
        //Removing values in list
        list.remove(5);
        System.out.println(list);

        //Accessing an element  
        int temp=list.get(2);
        System.out.println(temp);

        //changing an element   
        list.set(4,9);
        System.out.println(list);

        //size of ArrayList
        int x=list.size();
        System.out.println(x);

        //Sorting an arraylist
        Collections.sort(list);
        System.out.println(list);

        //Comparing two lists
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();

        list1.add(1);list1.add(2);list1.add(3);
        list2.add(2);list2.add(1);list2.add(3);
        System.out.println(list1.equals(list2));
    }
}
