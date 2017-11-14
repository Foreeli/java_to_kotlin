/* print calculate of (x,y) */
import java.io.*;

public class Java4_6
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in) );

      int win=0, lose=0;

      System.out.println("Win : 1, Lose : 0");

      for(int cnt=0; cnt<10; cnt++) {
        System.out.print("Round[" + (cnt+1) + "] = ");
        int num = Integer.parseInt(br.readLine());
          if(num==0) lose++;
          else if(num==1) win++;
      }

      System.out.println("Win : " +win);
      System.out.println("Lose : " +lose);

    }
}
