/* print calculate of (x,y) */
import java.io.*;

public class Java4_21
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in) );

      System.out.print("size = ");
      int s = Integer.parseInt(br.readLine());

      System.out.println("X");
      for(int i=1; i<=s; i++){
        System.out.print(" ");
      }
      System.out.println("");
    }
}
