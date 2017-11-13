/* print calculate of (x,y) */
import java.io.*;

public class Java4_22
{
    public static void main( String[] args ) throws IOException
    {
      int num=0;
      int a=0, b=1, c=0;

      System.out.println(a);
      System.out.println(b);

        for(int i=0; ; i++) {
          num = a+b;
          if(num>1000) break;
          System.out.println(num);
          if(i%2 == 0) a = num;
          else b = num;
        }
    }
}
