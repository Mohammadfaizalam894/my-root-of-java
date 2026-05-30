import java.util.*;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String Department = sc.next();
        String branch = sc.next();
        
        switch (Department){
            case  "cse":
                System.out.println("enter the year");
                break;
            case "ece":
                System.out.println("enter the all subjects");
                break;
            case  "mech":
            
                    switch(branch){
                        case "1st year":
                            System.out.println("english,math");
                            break;
                        case "2nd year":
                            System.out.println("ds,java");
                            break;
                    }
                    break;
                default:
                        System.out.println("invalid choice");
                        
                }

        }
    }

