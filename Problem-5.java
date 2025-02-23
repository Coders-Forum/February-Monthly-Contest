// Pattern :
//       Input:  1234  
//       Output: 21   → (1+4) * (2+3) = 5 * 6 = 30  

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int i=0;
        int j=n.length()-1;
        int mul=1;
      
        while(i<j){
            mul*=(n.charAt(i)-'0')+(n.charAt(j)-'0');
            i++;
            j--;
        }
        
        if(i==j){
            mul*=(n.charAt(i)-'0');
        }
        System.out.println(mul);  
    }
}
