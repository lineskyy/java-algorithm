package org.java.ex04;

import java.util.Arrays;


class ArrayUtil{
	private int[] a;
	private int[] b;
	ArrayUtil(){}
	ArrayUtil(int a,int b){
		this.a=new int[a];
		this.b=new int[b];
	}
	public static ArrayUtil[] concat(int[] a,int[] b) {
		ArrayUtil[] tmp=new ArrayUtil[a.length+b.length];
		
		for(int i=0; i<tmp.length; i++) {
			tmp[i]= new ArrayUtil();
			tmp[i]= new ArrayUtil(a[i],b[i]);
		}

		return tmp;
	}
	public static void print() {
		
		System.out.println(concat(null, null));
		
	}
}
public class StaticEx {
	public static void main(String[] args) {
		int[] array1= {1,5,7,9};
		int[] array2= {3,6,-1,100,77};
		ArrayUtil[] array3= ArrayUtil.concat(array1,array2);
		ArrayUtil.print(array3);
	}
}
