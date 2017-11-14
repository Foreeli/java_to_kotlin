/* print calculate of (x,y) */
import java.io.*;

public class Java4_11
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in) );

      System.out.print("num = ");
      int num = Integer.parseInt(br.readLine());
      int x = num/10;

      System.out.println("-------------------");
      if(x > 0) {
        for(;x>0;x--) {
          System.out.println("0 1 2 3 4 5 6 7 8 9");
        }
      }

      for(int y=num%10,i=0; y>0; y--,i++) {
        System.out.print(i+ " ");
      }
      System.out.println();
      System.out.println("-------------------");
    }
}
