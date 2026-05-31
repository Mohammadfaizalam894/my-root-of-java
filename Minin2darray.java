import java.util.*;
public class Minin2darray {
    public static void main(String[] args){
        int arr[][] = {{-1,4,7},{2,5,8},{3,6,54}};
        int min= arr[0][0];
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
                if (arr[i][j]<min ){
                    min = arr[i][j];
                    
                }
            }
        }
        System.out.println(min);
    }
    
}
