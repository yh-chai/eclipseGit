package javastulding;

import java.util.Scanner;

public class ifTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入一个数");
		int grade=scan.nextInt();
		if(grade<60) {
			System.out.println("不及格");}
			
				else {if(grade<=90) {
				System.out.println("及格");}
					
				    else if(grade>90)
				    {System.out.println("优秀");}
				    }
		scan.close();
			
		
	}

}
