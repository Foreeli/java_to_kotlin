/* print calculate of (x,y) */
import java.io.*;

public class Java4_3
{
    public static void main( String[] args ) throws IOException
    {
      int num=0;
      for(int cnt=1; cnt<9; cnt++) {
        num = (int)Math.pow(2,cnt);
        System.out.printf("%d ", num);
      }
      System.out.println();
    }
}
