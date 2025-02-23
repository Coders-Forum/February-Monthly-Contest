//Sum of Even Indexed Elements

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] num = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();  
        int sum=0;
        for(int i=0;i<num.length;i+=2){
            sum+=num[i];
        }
        System.out.println(sum);
    }
}
