package february.miyeon11;

public class Ex0
{   
   public static void main(String[] args) 
   {
      // �� �� �Է¹ޱ�
      int first = Integer.parseInt(args[0]);
      int second = Integer.parseInt(args[1]);
      int temp=0; int temp2=0;
      int row=0;
      int high=0;
      // �μ� ������ �� ���ϱ�
      if(first<second){
          row= first;
          high = second;
      }else if(first == second){
         System.out.println("�Է°��� �����ϴ�.");
      }else{
         row=second;
         high=first;
      }
         temp2=row;
      for(;row<=high; row++){
         temp+=row;
      }
      System.out.println(temp2+"~"+high+"�� ����"+temp+"�Դϴ�.");
   }
}