package javastulding;

public class ѧ������ {

	public static void main(String[] args) {
		Stu stu1=new Stu(29,"aa",340);
		Stu stu2=new Stu(30,"ab",240);
		System.out.println(Stu.getTotalFee());
	}

}
class Stu
{
	public static char[] getTotalFee;
	int age;
	String name;
	int fee;
	static int totalFee;
	public  Stu (int age,String name, int fee)
	{
		this.age=age;
		this.name=name;
		totalFee+=fee;
	}
	public static int getTotalFee()//�෽��  ����   ��̬����
	{
		return totalFee;
	}
	
}


