package february.miyeon14;

public class Prob02
{
	public static void main(String[] args) 
	{
		int limit = 50; // 50������ ����
		boolean prime = false;
		//int[] m;
		
		// �ڽ����� ������ ���� ���� 2���� ��� ���
		// 50������ �� üũ
		for( int i = 2; i < limit+1; i++){
			// i = 1 ~ 50 ( 1�� �Ҽ��� �ƴϹǷ� �����ϰ� 2���� �����Ѵ�.)
			int count = 0;

		//=========================================
			for(int j =2; j < i+1; j++){
				if( i % j == 0 ){
					count += 1; 
				}//if( i % j )

					
			}//for(j)
			if(count == 1){
						System.out.println(i);
					} // if count == 1 �̸� ���.

		}//for (i)
	



	}//main
}//class
