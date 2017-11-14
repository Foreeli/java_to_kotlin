/* print calculate of (x,y) */
import java.io.*;

public class Java4_12
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in) );

      int total = 0;

      for(int i=0; total<100; i++) {
        System.out.print("num[" +(i+1)+ "] = ");
        int num = Integer.parseInt(br.readLine());
        total += num;
      }
      System.out.println("Total : " +total);
    }
}
