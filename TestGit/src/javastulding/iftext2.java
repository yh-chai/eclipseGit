package javastulding;

import java.util.Scanner;

public class iftext2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("�������һ����");
		int a=scan.nextInt();
		System.out.println("������ڶ�����");
		int b=scan.nextInt();
		System.out.println("�������������");
		int c=scan.nextInt();
		scan.close();
		String info;
		if(a>b) {
			if(b>c) {
				info=a+">"+b+">"+c;
		}else//(a>b  b<c) 
		{
			if(a>c) {
				info=a+">"+c+">"+b;	
		}else {
				info=c+">"+a+">"+b;
		}
		}	
	}else//a<b 
		{
			if(a>c) {
				info=b+">"+a+">"+c;
			}else {//b>a c>a
			if(b<c) {
				info=c+">"+b+">"+a;
			}else {//b>C
				info=b+">"+c+">"+a;
			}
			}
		
	}
		System.out.println(info);
	}
}
