public class Prob02 {
	public static void main(String[] args) 
	{
		// ������������ �����ϱ�.
		// [�迭�� ����] ok
		// 3, 24, 1, 55, 17, 43, 5 ok
		//[Ŭ���� ������] ok
		//1, 3, 5, 17, 24, 43, 55
		// ***** �������� �ʰ� ���ٿ� ��� ��� & �� ���������� , ���� ���
		int[] array = {3, 24, 1, 55, 17, 43, 5};
		System.out.println("[�迭�� ����]");
		// �迭�� ���� ��� & �������� ��ǥ����!
		for( int i = 1; i < array.length; i++){
			// �������� , ����.
			if( i == array.length-1){
				System.out.println(array[i]);
			}else{
				System.out.print(array[i] + ", ");			
			}//else
		} //for

		 System.out.println("[Ŭ���� ������]");
		 // �迭 ����
/*		 int[] temp = new int[array.length];
		 int i;
		 int j;
		//�������� �����ϱ�.
		   for( i = 0; i < array.length -1; i++){
			   for( j = 0; j < array.length -1;j++){
			   temp[i] = array[j];
			   temp[i+1] = array[j+1];

			   if (array[j] > array[j+1]){
					array[j] = temp[i];
					array[j+1] = temp[i+1];
				}//if
			   }// j for��
		   }// i for��
			
			for(i = 0; i < array.length-1; i++){
				if( i == array.length-1){
					System.out.println(temp[i]);
				}else{
					System.out.print(temp[i] + ", ");		
			}
			}
*/



			for(int i = 0; i < array.length - 1 ; i++){
				
				for(int j = 0; j < array.length - 1; j++){
					int temp = array[j];
					int temp1 = array[j+1];

					if(array[j] > array[j+1]){
						array[j] = temp1;
						array[j+1] = temp;
					}
					
				}// for j
			}// for i

			for(int i = 0; i <array.length; i++){
				if( i == array.length-1){
				System.out.println(array[i]);
				}else{
				System.out.print(array[i] + ", ");			
					}//else
				
			}// ��� for ��

	}//main
}//class
