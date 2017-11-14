/* print calculate of (x,y) */
import java.io.*;

public class Java4_10
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in) );

      System.out.print("num = ");
      int num = Integer.parseInt(br.readLine());

      for(; num>0; num--) {
        System.out.print("* ");
      }
      System.out.println();
    }
}
