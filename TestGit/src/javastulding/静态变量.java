package javastulding;

public class 静态变量 {

	static int i=1;
	static 
	{
		i++;
	
	}
	

	public 静态变量()
	{
		System.out.println(i);
		i++;
		System.out.println(i);
		
	}
	
	public static void main(String[] args) {
		System.out.println(i);
		
	}

}
