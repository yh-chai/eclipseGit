package javastulding;

import java.util.Scanner;

public class ifTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("������һ����");
		int grade=scan.nextInt();
		if(grade<60) {
			System.out.println("������");}
			
				else {if(grade<=90) {
				System.out.println("����");}
					
				    else if(grade>90)
				    {System.out.println("����");}
				    }
		scan.close();
			
		
	}

}
