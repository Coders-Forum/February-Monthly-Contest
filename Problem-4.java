//Pattern :+A1 - A2 + A3 - A4 + A5 - A6 ...

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] num = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();  
        int sign=1;
        int sum=0;
        for(int i:num){
            sum+=sign*i;
            sign=-sign;
        }
        System.out.println(sum);
    }
}
