//package domain;

public class Exercise {
    public static String Calculate(int num){
      String divisor ="";
      int i=0;
        while(i <= num){
          i++;
          if(((float)num/i) % 1 == 0){
             divisor += i;
          
          if(num != i){
            divisor += ", ";
          }
          else{
            divisor += ".";
          }
          }
        }
        return divisor;
    }
}
