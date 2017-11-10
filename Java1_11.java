/* print (x/n, x%n ※n<x) */
public class Java1_11
{
        public static void main(String[] args)
        {
          int x = 10;
          for(int i=1; i<x; i++) {
            System.out.println(x+ " / " +i+ " = " +(x/i)+ " ･･･ " +(x%i));
          }
        }
}
