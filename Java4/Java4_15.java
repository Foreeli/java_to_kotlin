/* print calculate of (x,y) */
import java.io.*;

public class Java4_15
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in) );

      System.out.print("num = ");
      int num = Integer.parseInt(br.readLine());

      if(num==2) System.out.println("素数");

      for(int i=num-1; i>1; i--) {
        if((num%i) == 0) {
          System.out.println("素数ではない");
          i = 0;
        }
        else if(i==2) {
          System.out.println("素数");
        }
      }
    }
}
