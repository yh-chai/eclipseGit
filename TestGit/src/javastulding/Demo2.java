package javastulding;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.speak();
		p1.jiSuan();
		p1.jiSuan(10);
		p1.add(12,10);
		int res=p1.add2(23,34);	
		System.out.println("res="+res);
	}
}

class Person
{
	int age;
	String name;
	public void speak()
	{
		System.out.println("我是一个好人");
	}
	public void jiSuan()
	{
		int result=0;
		for(int i=1;i<=1000;i++)
		{
			result=result+i;
		}
		
		
			System.out.println("result="+result);
	}
	public void jiSuan(int n)
	{   int result=0;
		for(int i=1;i<=n;i++)
		{
		
			result=result+i;
		
		}
		System.out.println("result="+result);
	}
	public void add(int num1,int num2)
	{
		int result=0;
		result=num1+num2;
		System.out.println("result="+result);
	}
	//计算两个数的和，并且把结果返回给调用他的函数
	public int add2(int num1,int num2)
	{	
		return num1+num2;
	}

}
