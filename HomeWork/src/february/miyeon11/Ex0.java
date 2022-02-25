package february.miyeon11;

public class Ex0
{   
   public static void main(String[] args) 
   {
      // 두 수 입력받기
      int first = Integer.parseInt(args[0]);
      int second = Integer.parseInt(args[1]);
      int temp=0; int temp2=0;
      int row=0;
      int high=0;
      // 두수 사이의 합 구하기
      if(first<second){
          row= first;
          high = second;
      }else if(first == second){
         System.out.println("입력값이 같습니다.");
      }else{
         row=second;
         high=first;
      }
         temp2=row;
      for(;row<=high; row++){
         temp+=row;
      }
      System.out.println(temp2+"~"+high+"의 합은"+temp+"입니다.");
   }
}