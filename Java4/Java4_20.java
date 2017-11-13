/* print calculate of (x,y) */
import java.io.*;

public class Java4_20
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in) );

      System.out.print("size = ");
      int s = Integer.parseInt(br.readLine());

      for(int i=0; i<s; i++) {
        for(int j=s; j>(s-i-1); j--) {
          System.out.print("$");
        }
        System.out.println();
      }
     }
}
