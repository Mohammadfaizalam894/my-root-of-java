import java.util.*;

public class Fibbonachi {
    public static void main(String[] args) {
        System.out.println("enter how many number you want to print");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <=n)
        { int temp =b;
            b = a+b;
            a = temp;
            System.out.println(b + " ");
            count++;
        }
    }  
}
