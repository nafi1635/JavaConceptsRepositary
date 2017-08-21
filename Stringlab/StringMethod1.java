package Stringlab;

import java.lang.String;
import java.lang.StringBuffer;
//import java.lang.StringBuilde;
public class StringMethod1
{
	public static void main(String args[])
	{
		String s1="Java";
		String s2=new String("this is a Java");
		String s3="Java";
		int l=s1.length();
		System.out.println(l);
		String s4=s1.toUpperCase();
		System.out.println(s4);
		String s5=s1.toLowerCase();
		System.out.println(s5);
		char ch[]=s1.toCharArray();
		for(char x:ch)
		{
			System.out.println(x);
		}
		char c=s1.charAt(1);
		System.out.println(c);
		boolean b1=s1.equals("java");
		System.out.println(b1);
		boolean b2=s1.equals("Java");
		System.out.println(b2);
		int i=s1.compareTo("Java");
		System.out.println(i);
		int j=s1.compareTo("Jata");
		System.out.println(j);
		int k=s1.compareTo("jaya");
		System.out.println(k);
		int k1=s1.indexOf('a');
		System.out.println(k1);
		int k2=s2.indexOf("is");
		System.out.println(k2);
		int k3=s2.lastIndexOf("is");
		System.out.println(k3);
		String sub=s2.substring(3,10);
		System.out.println(sub);
		String s6=s1.replace('a','i');
		System.out.println(s6);
		String s="HELLO ";
		s=s+"WORLD";
		System.out.println(s);
		String arr[]=s2.split(" ");
		for(String x:arr)
		{
			System.out.println(x);
		}
		
		
	
	}
}
