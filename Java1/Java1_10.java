/* print (x^1, x^2, x^3) */
public class Java1_10
{
        public static void main(String[] args)
        {
          int x = 39;
          for(int i=1; i<4; i++) {
            System.out.println(x+ "^" +i+ " = " +(int)(Math.pow(x,i)));
          }
        }
}
