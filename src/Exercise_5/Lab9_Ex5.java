
package Exercise_5;

import java.util.Scanner;


public class Lab9_Ex5 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] numArray = {5,4,45,3,11};
        int sum = arraySum(numArray, numArray.length - 1);
        System.out.println(sum);
    }
   
    
    public static int arraySum(int[] a,int num){
        
        if(num > 0){
            return a[num] + arraySum(a, num - 1);
        }
        return a[num];
    }
}
