package javastulding;

public class ���� {

	public static void main(String[] args) {
/*

   		         	��һ��          �ո�3        �Ǻ� 1
   		         	��2��          �ո� 2       �Ǻ� 3
   		         	��3��          �ո�   1     �Ǻ� 5
   		         	��4��          �ո�     0   �Ǻ� 7
   		         	��5��          �ո�     1   �Ǻ� 5
   		         	��6��          �ո�    2    �Ǻ� 3
   		         	��7��          �ո�    3    �Ǻ� 1    
   *     			
  ***
 *****				
******* 
 *****
  ***
   *    
         */

		//�����ϰ벿��
				for(int i=1;i<=4;i++)
				{
					//�ϰ벿�ֿո�ѭ��
					for(int j=1;j<=4-i+1;j++)
					{
						System.out.print(" ");
					}
					//�ϰ벿������ѭ��
					for(int k=1;k<i*2;k++)
					{
						System.out.print("*");
					}
						System.out.println();
					}
				//�����°벿��
				for(int l=1;l<=3;l++)
				{
					//�°벿�ֿո�ѭ��
					for(int m=0;m<=l;m++)
					{
						System.out.print(" ");
					}
					//�°벿������ѭ��
				//	for(int n=7;n>l*2;n--)
					for(int n=1;n<=(4-l )*2-1;n++)
					{
						System.out.print("*");
					}
					System.out.println();

				}
			}
		}
