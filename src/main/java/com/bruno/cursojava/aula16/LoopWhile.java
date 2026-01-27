package com.bruno.cursojava.aula16;

/**
 *
 * @author 3714194
 */
public class LoopWhile {
    public static void main(String[] args){
        int i = 1;
        int max = 10;
        
        System.out.println("COntando ate " + max);
        
        while(i <= max) {
            System.out.println(i);
            i++;
        }
        System.out.println("------------------------");
        System.out.println(i);
        System.out.println("------------------------");
        
        do {
            i++;
            System.out.println(i);
        } while (i < 15);
        
        System.out.println(i);
    }
}
