package main;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Test {
		
		public static void main(String[] args) { 
			Scanner sc = new Scanner(System.in);
			
			Stack stackChuoi = new Stack(); 
			
			System.out.println("Nhập vào chuỗi: "); 	
			String s = sc.nextLine(); 		
	
			for(int i=0; i stackSoDu = new Stack(); 		
			System.out.println("Nhập 1 số nguyên dương từ bàn phím"); 		
			int x = sc.nextInt(); 	
			while(x>0) { 			
				int soDu = x%2; 		
				System.out.println(soDu); 			
				stackSoDu.push(soDu+""); 		
				x = x/2; 		} 	
			System.out.println("Số nhị phân là:"); 		
			int n = stackSoDu.size(); 		
			for(int i=0; i
		}
	}


