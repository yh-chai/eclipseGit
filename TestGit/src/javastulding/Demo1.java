package javastulding;

public class Demo1 {
//webGitUpdate
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lay=5;
		for(int i=1;i<=lay;i++)
			{	
		for(int d=1;d<=i;d++)
		{  System.out.print(" ");
		}
			for(int k=1;k<=(lay-i)*2-1;k++)
				{
			if (i==lay)	
					{System.out.print("*");}
				else
				{ if(k==1||k==(lay-i)*2-1)
				   
				   {System.out.print("*");}									
			  else {System.out.print(" ");}
				}
			  }	
		System.out.println();}
				  
			
		}
	


	}


