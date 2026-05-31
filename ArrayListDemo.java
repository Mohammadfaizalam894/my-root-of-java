import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> List = new ArrayList<>();
        List.add(10);
        List.add(20);
        List.add(30);
        System.out.println(List);
        List.add(1,15);
        System.out.println(List);
        List.remove(2);
        System.out.println(List);
        List.set(2,50);
        System.out.println(List);
    }

}