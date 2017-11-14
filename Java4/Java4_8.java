/* print calculate of (x,y) */
import java.io.*;

public class Java4_8
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in) );

      int num[] = new int [10];
      int max=0,min=0;

      for(int cnt=0; cnt<10; cnt++) {
        System.out.print("num[" +(cnt+1)+ "] = ");
        num[cnt] = Integer.parseInt(br.readLine());
      }

      for(int cnt=9; cnt>=0; cnt--) {
        if(cnt==9) {
          max = Math.max(num[cnt],num[cnt-1]);
        }
        else max = Math.max(num[cnt],max);
      }

      for(int cnt=9; cnt>=0; cnt--) {
        if(cnt==9) {
          min = Math.min(num[cnt],num[cnt-1]);
        }
        else min = Math.min(num[cnt],min);
      }

      System.out.println("Max : " +max);
      System.out.println("Min : " +min);
    }
}
