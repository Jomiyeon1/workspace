package february.miyeon11;

class javaExample2 
{
	public static void main(String[] args) 
	{
		int dan = Integer.parseInt(args[0]); 

/*
		// 1~9������ ���� �Է��� �ƴҰ��, ���Է¹ޱ�.
		if(dan < 0 || dan >9 ){
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~9 ������ ���ڸ� �Է����ּ���. ");
		}  // if(�߸��Է�)
		else { System.out.println(dan + "���� ����մϴ�.");
			for(int i = 1; i < 10; i++){
			System.out.println( dan + " * " + i + " = " + (dan*i); } //for
		} //else

*/		if(dan < 1 || dan > 9 ){
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~9 ������ ���ڸ� �Է����ּ���. ");
		}  // if(�߸��Է�)
			else { System.out.println(dan + "���� ����մϴ�."); //1 ~ 9������ ���̶��,
						int i =1;
						while(i<10){ // 1 ~ 9 ����.
							System.out.println(dan + " * " + i + " = " + (dan*i));
							i++;
						}// while
			
			}//else
		


	}//main
} // class
