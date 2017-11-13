/* print calculate of (x,y) */
import java.io.*;

public class Java4_17
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in) );

      for(int i=1; i<10; i++) {
        for(int j=1; j<10; j++) {
          System.out.printf("%3d",i*j );
        }
        System.out.println();
      }

     }
}
