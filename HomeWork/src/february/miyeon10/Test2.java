package february.miyeon10;

class Test2
{
	public static void main(String[] args) 
	{
		
		// �Է¹��� �μ�  int�� ����, ����/�� ���� ����  int ���� ����
		int i = Integer.parseInt(args[0]); 
		int j = Integer.parseInt(args[1]);
		int value;

		// ù��° ���ڰ� Ŭ �� ����.( i > j ) -> ���
		if( i > j ){
			value = i - j;
				System.out.println("ù��° �μ� : " + args[0] + " �ι�° �μ� : " + args[1] + ", " + i + " - " + j + " = " + value + "�Դϴ�.");
		
		// �ι��� ���ڰ� Ŭ �� ���ϱ�.( j > i ) -> ���
		}else if( j > i ){
			value = i + j;
				System.out.println("ù��° �μ� : " + args[0] + " �ι�° �μ� : " + args[1] + ", " + j + " + " + i + " = " + value + "�Դϴ�.");
				}
		else if (j == i){
				System.out.println("���� ���� ������ �Ұ����մϴ�.");		
		}
		
	
	} // main
} // class
