package february.miyeon21;

public class Prob01{
	//method
	public void calc(int[] ix){
		//Ȧ¦ �����ϱ�.
		//Ȧ��, ¦�� ���� ���� �����ϱ�.
		int a = 0; // ¦���� ��
		int b = 0; // Ȧ���� ��
		for(int i = 0; i < ix.length; i++){
			if(ix[i] % 2 == 0){
				a += ix[i];
			}else{
				b += ix[i];
			}
		}// end of for (int i)
		System.out.print("Ȧ���� �� : " + b + "\n" + "¦���� �� : " + a + "\n");
		
	}//end of calc method


	//main
	public static void main(String[] args){
		int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
		int[] ib = new int[]{1, 2 , 3, 4, 5};

		Prob01 p = new Prob01();
		System.out.println("(�迭 ia)");
		p.calc(ia);

		System.out.println("(�迭 ib)");
		p.calc(ib);
		
	}//end of main
}//end of class