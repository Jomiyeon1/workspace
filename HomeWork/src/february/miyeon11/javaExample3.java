package february.miyeon11;

class javaExample3 
{
	public static void main(String[] args) 
	{
		//�� ���� �Է¹ް�, �� ���� ���� �� ���ϱ�.
		// �Է¹ޱ�
		int i = Integer.parseInt(args[0]); 
		int j = Integer.parseInt(args[1]); 

		//���� ���� ��� ���� ���
		if( i == j){
				System.out.println("�Է°��� �����ϴ�. ���� ���� ���̰��� ���� �� ����� �Ұ����մϴ�.");
				return;
		} // if

/* �ݺ��� 2�� ���.
		
		// �հ踦 ���� ���� ����
		int sum = 0;

		//�� �� ������ �հ� ���ϱ�.
		// i > j �ϰ��
		if(i>j){ 			
			     for(int a = j; a<=i; a++){
			     sum += a;
				 } System.out.println(j + "~" + i + "�� ����" + sum + "�Դϴ�.");
			}else if(i<j){ 			
			for(int a = i; a<=j; a++){
			sum += a;
			}
				System.out.println(i + "~" + j + "�� ����" + sum + "�Դϴ�.");
		}//if   i>j

==========================================================================*/

		//�ݺ��� 1�� ���.
		//
		
/*		//���׿�����. int i = 1>5 ? 3 : 4
	for( int a = j; a <= i; a++ ){
		System.out.println(i>j ? 
		//true	
		
		j + "~" + i + "�� ����" + sum + "�Դϴ�." 
			
		//false
		: i + "~" + j + "�� ����" + sum + "�Դϴ�.");}// println

=================================================================================*/

		
		//System.out.println( i>j ? j + "~" + i + "�� ����" : i + "~" + j + "�� ����");
//=======================================================

			int sum;
			int temp = 0;
			int temp02 = 0;
			
			if(i>j){
				temp02 = j; // ������
				temp = i; //ū ��
				i=j;
				j=temp;
				
						
			}else{
				temp02 = i;
				temp = j;
				j=i;
				i=temp;

			}

			//===========================
			// System.out.println("ū�� : " + temp + "������" + temp02 );
			for(sum = 0 ; i < j+1; i++){
				sum += i;
				//System.out.println(i + "~" + j + "�� ����" + sum + "�Դϴ�.");
			
			     
		  					
			} System.out.println( temp02 + "~" + temp + "�� ����" + sum + "�Դϴ�.");
			// System.out.println("ū�� : " + temp + "������" + temp02 );
			

		
	} // main
} // class
