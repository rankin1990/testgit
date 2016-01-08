package com.cosw.rankin;

import java.util.*;
import lib.Test2;

/**
 * my first java file.
 * @author rankin_dean@163.com
*/
public class Test1{
	/** counter. */
	public static int i = 0;
	/**
	 * @param args
	 *		  command argument
	*/
	public static void main(String[] args){
		Test2 test = new Test2();
		System.out.println(test);
		
		Random ran = new Random();
		
		int i1 = 0x1f;
		System.out.println("i1 = "+Integer.toBinaryString(i1));
		
		int i2 = 0x1F;
		System.out.println("i2 = "+Integer.toBinaryString(i2));
		
		int i3 = 0177;
		System.out.println("i3 = "+Integer.toBinaryString(i3));
		
		int i4 = 0xffff;
		System.out.println("i4 = "+Integer.toBinaryString(i3));
		
		int i = ran.nextInt(100);
		int j = ran.nextInt(100);
		int k = ran.nextInt(100);
		int l = ran.nextInt(100);

		
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		System.out.println("k = "+k);
		System.out.println("l = "+l);
		
		System.out.println("i > j:"+(i>j));
		System.out.println("i < j:"+(i<j));
		System.out.println("i == j:"+(i==j));
		System.out.println("i != j:"+(i!=j));
		
		System.out.println("(i>10)&&(j>10) is:"+((i>10)&&(j>10)));
		System.out.println("(i>10)||(j>10) is:"+((i>10)||(j>10)));
		
		int ii = 0;
		while(true){
			ii++;
			System.out.println("ii = "+ii);
			if(ii == 100){
				break;
			}
		}
		
		int jj = 0;
		do{
			jj++;
			System.out.println("jj = "+jj);
		}while(jj < 100);
		
		for(int kk=0;kk<100;kk++){
			if(kk % 2 == 0){
				continue;
			}
			System.out.println("kk = "+kk);
		}
		
		Float f[] = new Float[10];
		Random random = new Random();
		for(int m=0;m<10;m++){
			f[m] = random.nextFloat();
		}
		for(float x : f){
			System.out.println(x);
		}
		
		for(char ch : "I am a Chinese boy!".toCharArray()){
			System.out.print(ch + " ");
		}
		
		
		
		/*
		System.out.println(i);
		Test1 t1 = new Test1();
		t1.i++;
		Test1 t2 = new Test1();
		System.out.println(t1.i);
		t1.i++;
		System.out.println(t2.i);
		
		System.out.println(new Date());
		*/
	}
	
}