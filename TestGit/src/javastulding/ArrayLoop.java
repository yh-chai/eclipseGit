package javastulding;

import java.util.Scanner;

public class ArrayLoop {

	private static Object a;

	public static void main(String[] args) {
		String[]names= {"Milk","John","Rick"};
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入名字");
		String name=scan.nextLine();
		scan.close();
		boolean flag=false;
		for(int i=0;i<names.length;i++) {
			if(names[i].equals(name)) {
				flag=true;
			}	
		}
			
		if(flag==true) {
			System.out.println("找到了");
			System.out.print(String.format("在第%d个", a));

		}else {
			System.out.println("没有找到");
			}
	}
}
