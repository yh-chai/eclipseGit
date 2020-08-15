package javastulding;

public class 菱形 {

	public static void main(String[] args) {
/*

   		         	第一行          空格3        星号 1
   		         	第2行          空格 2       星号 3
   		         	第3行          空格   1     星号 5
   		         	第4行          空格     0   星号 7
   		         	第5行          空格     1   星号 5
   		         	第6行          空格    2    星号 3
   		         	第7行          空格    3    星号 1    
   *     			
  ***
 *****				
******* 
 *****
  ***
   *    
         */

		//菱形上半部分
				for(int i=1;i<=4;i++)
				{
					//上半部分空格循环
					for(int j=1;j<=4-i+1;j++)
					{
						System.out.print(" ");
					}
					//上半部分菱形循环
					for(int k=1;k<i*2;k++)
					{
						System.out.print("*");
					}
						System.out.println();
					}
				//菱形下半部分
				for(int l=1;l<=3;l++)
				{
					//下半部分空格循环
					for(int m=0;m<=l;m++)
					{
						System.out.print(" ");
					}
					//下半部分菱形循环
				//	for(int n=7;n>l*2;n--)
					for(int n=1;n<=(4-l )*2-1;n++)
					{
						System.out.print("*");
					}
					System.out.println();

				}
			}
		}
