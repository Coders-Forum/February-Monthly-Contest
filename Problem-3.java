//Shift Each Character Forward By One

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        for(char c:s.toCharArray()){
            if(c=='z'){
                res+='a';
            }else{
                res+=++c;
            }
        }
        System.out.println(res);
    }
}
