package javastulding;

import java.util.Scanner;

public class NewDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//�������ɨ����
		System.out.println("����������");
		String name=scan.nextLine();
		System.out.println("����������");
		int age=scan.nextInt();
		System.out.println("���������"+name+"���������"+age);
        scan.close();
}
}