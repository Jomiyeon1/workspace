package february.miyeon10;

public class Example1
{
	public static void main(String[] args) 
	{
		// 1~100�� ������ �Է¹޾� 90 ��/80 ��/70 ��/60 ��/ �� �� ��
		// �ڡ� 1 ~ 100�� ���ڰ� �ƴ� ��쿣...?

		// �Է¹��� ������ int�� ��ȯ
		int i = Integer.parseInt(args[0]); 

		// 1~100 ���� �ƴ� ��� �߸��� ���̶�� ���.
/*		if (i  <= 0 || i  > 100)
		{
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. ������ �������� ��ȯ�� �� �����ϴ�.");
		}else if( i >= 90){ // 90��
			System.out.println("�Է��Ͻ� �� " + i +"���� �� �Դϴ�.");
		}else if(i >= 80){ // 80 ��
			System.out.println("�Է��Ͻ� �� " + i +"���� �� �Դϴ�.");
		}else if(i >= 70){ // 70 ��
			System.out.println("�Է��Ͻ� �� " + i +"���� �� �Դϴ�.");
		}else if(i >= 60){ // 60 ��
			System.out.println("�Է��Ͻ� �� " + i +"���� �� �Դϴ�.");
		}else{ // �� �� ��
			System.out.println("�Է��Ͻ� �� " + i +"���� �� �Դϴ�.");
		}
*/

		// int i =  i  <= 0 || i  > 100 ? 1 : 2
		// case �� ���� : �Է¹��� ���� / 10 => �� ���� �̿��ؼ� Ȱ���� ��.

			if ( args.length !=1 ) // �Էµ� ���� 1���� �ƴ� ��
		{
			System.out.println("���� �߸��Է��ϼ̽��ϴ�. 1���� ���� �Է����ּ���.");
			return;
		} // if

		// �Էµ� ���� ������ ������ �Ѿ��� ��
		if ( i  > 100 || i < 0 )
		{
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. ������ �������� ��ȯ�� �� �����ϴ�.");
			return;
		} // if
		
		// ========================
		int j = i/10;
		//Switch ��
		switch(j){
		case 10:
		case 9 :
		   System.out.println("�Է��Ͻ� �� " + i +"���� �� �Դϴ�.");
		   break;
		case 8:
			System.out.println("�Է��Ͻ� �� " + i +"���� �� �Դϴ�.");
			break;
		case 7:
			System.out.println("�Է��Ͻ� �� " + i +"���� �� �Դϴ�.");
			break;		
		case 6:
			System.out.println("�Է��Ͻ� �� " + i +"���� �� �Դϴ�.");
			break;		
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("�Է��Ͻ� �� " + i +"���� �� �Դϴ�.");
		break;
		//=======================
				
	default : 
	    System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. ������ �������� ��ȯ�� �� �����ϴ�.");
		// 101 ~ 109�� �ɷ����� ����.  ����� if�� ���� �ɷ��ֱ� ������, "��"��� ������� ��� ����� ���� ����. 
		// ==> else�� �ɾ��ְų� return; ���� ���ᰡ��.
		
		} // Switch





	}//main
}//class
