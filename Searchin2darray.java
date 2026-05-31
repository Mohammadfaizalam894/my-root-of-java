
import java.util.*;
public class Searchin2darray {
    public static void main(String[] args){
        int [][] arr = {{1,4,7},{2,5,8},{3,6,9}};
        int target = 77;
        System.out.println(Linearsearch(arr,target));
    }
    static boolean Linearsearch(int [][] arr,int target){
        if (arr.length ==0){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j]== target){
                    return true;
                }
                
            
        
        }
    }
        return false;
    
    
}
}