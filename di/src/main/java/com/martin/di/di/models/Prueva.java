package com.martin.di.di.models;
import java.util.Stack;

public class Prueva {
    public static void main(String[] args) {
        System.out.println(p1("({)})"));
    }

    public static String p1(String s){
        Stack<Character> stack= new Stack<Character>();
       
        if(s.length()==0) return "true";
        char k=' ';
        for (int i = 0; i < s.length(); i++) {
            
            k=s.charAt(i);
            System.out.println(k);
            if(k=='{' || k=='[') stack.push(k);
            
            if(k=='}' ||k==']'){
                if(stack.size()>0) return "false";
                char pop= stack.pop();
                if(pop =='}'){
                    if(k != '{') return "false";
                } 
                
                if(pop ==']'){
                    if(k != '[') return "false";
                }
                
            }
        }

        if(k=='{' || k=='(') return "false";
       
        return "true";
    }
}
