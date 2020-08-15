package javastulding;

import java.util.Scanner;

public class iftext3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入你的成绩");
		int grade=scan.nextInt();
		scan.close();
		if(grade>100||grade<0) {
			System.out.println("你输入的成绩不合法");
			return;
		}
		String info="";
		switch(grade/10) {
		case 10:
		info="满分";
		break;
		case 9:
		info="优秀";
		break;
		case 8:
		info="良好";
		break;
		case 7:
		info="中等";
		break;
		case 6:
		info="及格";
		break;
		default:
		info="不及格";
		break;
		
		
		
		
		
		
		}
		
		System.out.println(info);
		
		
		
	}

}
