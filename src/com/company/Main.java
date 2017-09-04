package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	 int [] array = new int[20];
	 Random r = new Random();
	 for(int i = 0; i < array.length-1; i++){
	     array[i] = r.nextInt(10)+1;
     }
     for(int e : array){System.out.print(e + " ");}
     System.out.println();
		System.out.println("Wystąpienia:");

     for(int i = 1; i <= 10; i++){
		int a = 0;
	 	for(int j =0; j < array.length-1; j++){
	 		if(array[j] == i){a++;}

		}
		System.out.println(i + " - " + a);
	 }
    }
}
