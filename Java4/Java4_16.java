/* print calculate of (x,y) */
import java.io.*;

public class Java4_16
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in) );

      System.out.print("num = ");
      int num = Integer.parseInt(br.readLine());

      int prnum = num-1;

      for(int i=num-1; i>1; i--) {
        if((prnum%i) == 0) {
          System.out.println("素数ではない");
          System.out.println("最小の約数 : " +i);
          i = 0;
          prnum--;
        }
        else if(i==2) {
          System.out.println("素数");
          prnum--;
        }
      }
    }
}
