package javastulding;

public class 学生费用 {

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
	public static int getTotalFee()//类方法  或是   静态方法
	{
		return totalFee;
	}
	
}


