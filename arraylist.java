import java.util.ArrayList;

public class arraylist {
    public static void main(String[]args){
        ArrayList<String> list=new ArrayList<>();
        list.add("R");
        list.add("A");
        list.add("F");
        list.add("F");
        list.add("I");
        list.add("N");
        System.out.println("Array List Element:"+list);
        list.add(1,"E");
        System.out.println("After Adding 'E At Index1:"+list);
        list.remove(2);
        System.out.println("After Removing Element At Index2:"+list);
        list.remove("A");
        System.out.println("After Removing Element 'A' :" +list);
        String elementAtIndex1=list.get(1);
        System.out.println("element at index 1:"+elementAtIndex1);
        list.set(0, "E");
        System.out.println("After replacing element at index 0 with 'F':" + list);
        int size=list.size();
        System.out.println("size of Arraylist:"+size);


    }
}
