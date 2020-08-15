package javastulding;

public class Ã°ÅİÅÅĞò {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] numbers= {12,45,100,67,455,9};
		
		int n=numbers.length;
		for(int i=1;i<n-1;i++) {
			for(int j=1;j<=n-i-1;j++) {
				if(numbers[i-1]>numbers[i]) {
					int temp=numbers[i-1];
					numbers[i-1]=numbers[i];
					numbers[i]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(numbers[i]+" ");
		}
	}

}*/
	

			// 12,45,9,67,455,ÓÃÃ°ÅİÅÅĞòÊµÏÖÉıĞòÅÅÁĞ¡£

		
			int[] numbers = { 12,45,100,67,455,9 };

			for (int i = 0; i < numbers.length - 1; i++) {

				for (int j = 0; j < numbers.length - 1 - i; j++) {

			if (numbers[j] > numbers[j + 1]) {

			int temp;

			temp = numbers[j];

			numbers[j] = numbers[j + 1];

			numbers[j + 1] = temp;

			}

			}

			}

			System.out.println("ÅÅĞòºó£º");

			for (int i = 0; i < numbers.length; i++)

			System.out.print(numbers[i] + "\t");

			}

			}
