package february.miyeon18;

public class Prob01{

	//main
	public static void main(String[] args){
		// args[]�� �Է¹ޱ�.
		//1���� �����Ͽ� +2����.
		int i = Integer.parseInt(args[0]); 
		
		//�� �ɷ��ֱ�.
		if(i < 1 || i % 2 == 0){
			System.out.println("0�̻��� Ȧ���� �Է����ּ���.");
			return;
		}// end of if
		
		for(int j = 0; j < i+1; j++){
			System.out.print("*");
			
		
		} // end of for (j)


	}//end of main


}//end of class