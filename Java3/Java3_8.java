/* print calculate of (x,y) */
import java.io.*;

public class Java3_8
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader(System.in) );

        System.out.print("中間 = ");
        int x = Integer.parseInt(br.readLine());

        System.out.print("期末 = ");
        int y = Integer.parseInt(br.readLine());

        if((x>=60) && (y>=60)) System.out.println("合格");
        else if(x+y >= 130) System.out.println("合格");
        else if(x+y >= 100) {
          if((x>=90) || (y>=90)) System.out.println("合格");
          else System.out.println("不合格");
        }
        else System.out.println("不合格");
    }
}
