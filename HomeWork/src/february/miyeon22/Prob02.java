package february.miyeon22;

public class Prob02 {

	public static void main(String[] args) {
		String sourceString = ("everyday we have is one more than wq deserve");
		String encodedString = "";
		
		//������
		for(int i = 0; i < sourceString.length(); i ++) {
			char c = sourceString.charAt(i);
			if( c == 'x'|| c == 'y'|| c == 'z') {
				encodedString += (char)(c - 23);
			}else if ( c == ' '){
				encodedString += ' ';
			}else {
				encodedString += (char)(c+3);
			}
		}
			
		
		
		//���
		System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
		System.out.println("��ȣȭ�� ���ڿ� : " + encodedString);
	
	}

}
