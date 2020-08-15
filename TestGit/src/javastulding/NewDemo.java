package javastulding;

import java.util.Scanner;

public class NewDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//定义键盘扫描器
		System.out.println("请输入姓名");
		String name=scan.nextLine();
		System.out.println("请输入年龄");
		int age=scan.nextInt();
		System.out.println("你的名字是"+name+"你的年龄是"+age);
        scan.close();
}
}