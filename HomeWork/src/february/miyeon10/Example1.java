package february.miyeon10;

public class Example1
{
	public static void main(String[] args) 
	{
		// 1~100의 점수를 입력받아 90 수/80 우/70 미/60 양/ 그 외 가
		// ★★ 1 ~ 100의 숫자가 아닐 경우엔...?

		// 입력받은 점수를 int로 변환
		int i = Integer.parseInt(args[0]); 

		// 1~100 값이 아닐 경우 잘못된 값이라고 출력.
/*		if (i  <= 0 || i  > 100)
		{
			System.out.println("잘못된 값을 입력하셨습니다. 점수를 성적으로 변환할 수 없습니다.");
		}else if( i >= 90){ // 90수
			System.out.println("입력하신 값 " + i +"점은 수 입니다.");
		}else if(i >= 80){ // 80 우
			System.out.println("입력하신 값 " + i +"점은 우 입니다.");
		}else if(i >= 70){ // 70 미
			System.out.println("입력하신 값 " + i +"점은 미 입니다.");
		}else if(i >= 60){ // 60 양
			System.out.println("입력하신 값 " + i +"점은 양 입니다.");
		}else{ // 그 외 가
			System.out.println("입력하신 값 " + i +"점은 가 입니다.");
		}
*/

		// int i =  i  <= 0 || i  > 100 ? 1 : 2
		// case 옆 숫자 : 입력받은 점수 / 10 => 의 몫을 이용해서 활용할 것.

			if ( args.length !=1 ) // 입력된 값이 1개가 아닐 때
		{
			System.out.println("값을 잘못입력하셨습니다. 1개의 값만 입력해주세요.");
			return;
		} // if

		// 입력된 값이 점수의 범위를 넘었을 때
		if ( i  > 100 || i < 0 )
		{
			System.out.println("잘못된 값을 입력하셨습니다. 점수를 성적으로 변환할 수 없습니다.");
			return;
		} // if
		
		// ========================
		int j = i/10;
		//Switch 문
		switch(j){
		case 10:
		case 9 :
		   System.out.println("입력하신 값 " + i +"점은 수 입니다.");
		   break;
		case 8:
			System.out.println("입력하신 값 " + i +"점은 우 입니다.");
			break;
		case 7:
			System.out.println("입력하신 값 " + i +"점은 미 입니다.");
			break;		
		case 6:
			System.out.println("입력하신 값 " + i +"점은 양 입니다.");
			break;		
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("입력하신 값 " + i +"점은 가 입니다.");
		break;
		//=======================
				
	default : 
	    System.out.println("잘못된 값을 입력하셨습니다. 점수를 성적으로 변환할 수 없습니다.");
		// 101 ~ 109는 걸러지지 않음.  상단의 if로 값을 걸러주긴 했지만, "수"라는 점수라는 출력 결과도 같이 나옴. 
		// ==> else를 걸어주거나 return; 으로 종료가능.
		
		} // Switch





	}//main
}//class
