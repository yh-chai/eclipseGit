package javastulding;

public class ˽�б��� {

	public static void main(String[] args) {
		
		Clerk clerk1=new Clerk("С��",100,100.5f);
		
		System.out.println("������"+clerk1.name
						+"нˮ��"+clerk1.sal()
						+"������"+clerk1.age());
							//�����нˮ��˽�е� �ܱ���
							//	�޷����� �������
					//�� ͨ��һ����Ա����
					// return  this.˽�еĳ�Ա����
	}

}
class Clerk
{
	public String name;
	private int age;
	private float salary;
	public Clerk(String name,int age,float sal)//���캯��
	{
		this.name=name;
		this.age=age;
		this.salary=sal;
	}

	
	public int age()
	{
		return this.age;
	}
	public float sal()//��Ա����
	{
		return this.salary;
	}
}