/* print calculate of (x,y) */
import java.io.*;

public class Java4_7
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in) );

      int gscore=0, tscore=0, gtotal=0, ttotal=0;

      for(int cnt=0; cnt<9; cnt++) {
        System.out.print("Giants [" +(cnt+1)+ "] score : ");
        gscore = Integer.parseInt(br.readLine());
        gtotal += gscore;
        System.out.print("Tigers [" +(cnt+1)+ "] score : ");
        tscore = Integer.parseInt(br.readLine());
        ttotal += tscore;
      }
      if(gtotal == ttotal) {
        for(int cnt=9; gtotal==ttotal; cnt++) {
          System.out.print("Giants [" +(cnt+1)+ "] score : ");
          gscore = Integer.parseInt(br.readLine());
          gtotal += gscore;
          System.out.print("Tigers [" +(cnt+1)+ "] score : ");
          tscore = Integer.parseInt(br.readLine());
          ttotal += tscore;
        }
      }
        System.out.println("=============================");
        System.out.println("Giants Total Score : " +gtotal);
        System.out.println("Tigers Total Score : " +ttotal);
        if(gtotal>ttotal) System.out.println("Giants Win！");
        else System.out.println("Tigers Win！");
    }
}
