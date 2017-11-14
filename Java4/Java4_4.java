/* print calculate of (x,y) */
import java.io.*;

public class Java4_4
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in) );

      System.out.print("num = ");
      int num = Integer.parseInt(br.readLine());
      int base = num;

      for(int cnt=(num-1); cnt>0; cnt--) {
        System.out.println(num);
        num *= cnt;
      }
      System.out.println(base+ "！ = " +num);
    }
}
