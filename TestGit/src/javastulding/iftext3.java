package javastulding;

import java.util.Scanner;

public class iftext3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("��������ĳɼ�");
		int grade=scan.nextInt();
		scan.close();
		if(grade>100||grade<0) {
			System.out.println("������ĳɼ����Ϸ�");
			return;
		}
		String info="";
		switch(grade/10) {
		case 10:
		info="����";
		break;
		case 9:
		info="����";
		break;
		case 8:
		info="����";
		break;
		case 7:
		info="�е�";
		break;
		case 6:
		info="����";
		break;
		default:
		info="������";
		break;
		
		
		
		
		
		
		}
		
		System.out.println(info);
		
		
		
	}

}
