package february.miyeon11;

class  javaExample5
{
	public static void main(String[] args) 
	{
		// ���ڿ� �迭 �����
		String[][] text = new String[9][9];
		//������
		// 1���� ����մϴ�.
		// text[0][0] : 1*1=1 ...

		//��Ʈ�� ��Ʈ�� ��ȯ
		//text =  Integer.parseInt(); 
		//int[] nums = Arrays.stream(text).mapToInt(Integer::parseInt).toArray();
		//int i = Integer.parseInt(args[0]); 

		// �迭�� �� ����.
		// ù��° �迭�� ����
		for(int i = 0; i < text.length; i++){
			System.out.println((i+1) + "���� ����մϴ�.");
			// �迭�� �迭��
			for(int j = 0; j < text.length; j++){
				text[i][j] =(i+1)+"*"+(j+1)+"="+(i+1)*(j+1);
				System.out.println("text["+i+"]["+j+"]:"+text[i][j]);

			}
		}



	}//main
} //class