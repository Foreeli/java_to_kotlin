/* print calculate of (x,y) */
import java.io.*;

public class Java4_5
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in) );

      int num[] = new int [10];
      double ave=0;

      for(int cnt=0; cnt<10; cnt++) {
        System.out.print("num[" + (cnt+1) +"] = ");
        num[cnt] = Integer.parseInt(br.readLine());
        ave += num[cnt];
      }
      System.out.println("Average = " +(ave/10));
    }
}
