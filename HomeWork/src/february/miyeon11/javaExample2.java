package february.miyeon11;

class javaExample2 
{
	public static void main(String[] args) 
	{
		int dan = Integer.parseInt(args[0]); 

/*
		// 1~9사이의 숫자 입력이 아닐경우, 재입력받기.
		if(dan < 0 || dan >9 ){
			System.out.println("잘못 입력하셨습니다. 1~9 사이의 숫자를 입력해주세요. ");
		}  // if(잘못입력)
		else { System.out.println(dan + "단을 출력합니다.");
			for(int i = 1; i < 10; i++){
			System.out.println( dan + " * " + i + " = " + (dan*i); } //for
		} //else

*/		if(dan < 1 || dan > 9 ){
			System.out.println("잘못 입력하셨습니다. 1~9 사이의 숫자를 입력해주세요. ");
		}  // if(잘못입력)
			else { System.out.println(dan + "단을 출력합니다."); //1 ~ 9까지의 값이라면,
						int i =1;
						while(i<10){ // 1 ~ 9 까지.
							System.out.println(dan + " * " + i + " = " + (dan*i));
							i++;
						}// while
			
			}//else
		


	}//main
} // class
