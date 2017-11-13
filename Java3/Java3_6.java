/* print calculate of (x,y) */
import java.io.*;

public class Java3_6
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader(System.in) );

        System.out.print("num = ");
        int x = Integer.parseInt(br.readLine());

        if(x<0) {
          x = Math.abs(x);
          if(x%2 == 0) System.out.println(x+ " : 負の偶数");
          if(x%2 == 1) System.out.println(x+ " : 負の奇数");
        }
        else if (x>0) {
          if(x%2 == 0) System.out.println(x+ " : 正の偶数");
          if(x%2 == 1) System.out.println(x+ " : 正の奇数");
        }
        else System.out.println(x+ " : 正の偶数");
    }
}
