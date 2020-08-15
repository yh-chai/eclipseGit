package javastulding;

public class 私有变量 {

	public static void main(String[] args) {
		
		Clerk clerk1=new Clerk("小米",100,100.5f);
		
		System.out.println("名字是"+clerk1.name
						+"薪水是"+clerk1.sal()
						+"年龄是"+clerk1.age());
							//年龄和薪水是私有的 受保护
							//	无法访问 若想访问
					//需 通过一个成员方法
					// return  this.私有的成员变量
	}

}
class Clerk
{
	public String name;
	private int age;
	private float salary;
	public Clerk(String name,int age,float sal)//构造函数
	{
		this.name=name;
		this.age=age;
		this.salary=sal;
	}

	
	public int age()
	{
		return this.age;
	}
	public float sal()//成员变量
	{
		return this.salary;
	}
}