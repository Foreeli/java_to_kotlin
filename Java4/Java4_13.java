/* print calculate of (x,y) */
import java.io.*;

public class Java4_13
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in) );
      int b=0,s=0;
      System.out.println("Strike >> 1, Ball >> 2");

      for(int i=0; i>=0; i++) {
        System.out.print("judge[" +(i+1)+ "] = ");
        int num = Integer.parseInt(br.readLine());
        if(num==1) s++;
        else if(num==2) b++;
        if((s==3)||(b==4)) i=-2;
      }
      System.out.print("Strike : " +s+ ", Ball : " +b);
      System.out.println();
    }
}
