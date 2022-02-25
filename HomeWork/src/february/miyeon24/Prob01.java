package february.miyeon24;

public class Prob01{
	
	//method
	public static class Util{

		//���ڷ� ���� limit���� �Ҽ��� ������ return�ϴ� Method
		public int findPrimeCount(int limit){
			int num = 0;
			int primeCount = 0;
			for(int i = 2; i < limit+1; i++){
				num = 0;
				for( int j = 2; j < i + 1; j++){
					if( i % j == 0){
						num++;
					}//if
				}//for j
				if(num == 1) {
					primeCount++;
				}
			}//for i
			return primeCount;
		}// end of method

		//���ڷ� ���� limit���� �Ҽ����� �迭ũ�⸦ ���� int �迭�� ��� return�ϴ� Method
		public int[] findPrimeReturnArray(int limit){
		
			int num = 0;
			int index = 0;
			int primeCount = this.findPrimeCount(limit);
			int[] prime = new int[primeCount]; // �迭�� ���̸� ��ܿ��� ������.(�Ҽ��� ������ŭ�� �迭�� �����.)
			
			
			for(int i = 2; i < limit+1; i++){
				num = 0;
				for( int j = 2; j < i + 1; j++){
					if( i % j == 0){
						num++;
					}//if
				}//for j
				if(num == 1) {
					prime[index] = i;
					index++;

				}
			}//for i
			return prime;
		}
	}

//========================================

	//main
	public static void main(String[] args){
		int limit = 67;
		Util util = new Util();

		int primeCount = util.findPrimeCount(limit);
		System.out.println("1 ~ " + limit + "������ �Ҽ��� ������ " + primeCount +"EA�̸� �Ҽ��� �Ʒ��� ����.");
		System.out.println("/////////////////////////////////////////////");

		int[] primeArray = util.findPrimeReturnArray(limit);

		for(int i = 0; i < primeArray.length; i++){
			System.out.print(primeArray[i] + ( (primeArray.length - 1) != i ? "," : " "));
		}

	}
}