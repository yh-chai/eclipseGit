package javastulding;

public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int lay;
	        lay = 7;//���ε��ܳ���
	        for(int m = 1; m <=(lay+1)/2; m++)//��������ϰ벿��
	        {
	            for(int b = 1; b <=(lay+1)/2-m ; b++)//����ո�
	            {
	                System.out.print(" ");
	            }
	            for(int c = 1; c <= m*2-1; c++)
	            {
	                System.out.print("*");    
	            }
	            System.out.println();//����
	        }
	        for(int d =(lay+1)/2-1;d >= 1; d --)//��������°벿��
	        {
	            for(int b = 1; b <= (lay+1)/2-d; b++)//����ո�
	            {
	                System.out.print(" ");
	            }
	            for(int c = (lay+1)/2-d; c <=(lay+1)/2-2+d; c ++)//(lay+1)/2-1��Ϊ�°��������
	            {
	                System.out.print("*");    
	            }
	            System.out.println();
	        }
	        
	    }
	}
	 