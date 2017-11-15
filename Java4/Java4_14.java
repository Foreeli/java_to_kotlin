/* print calculate of (x,y) */
import java.io.*;

public class Java4_14
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in) );
      int b=0,s=0,f=0;
      System.out.println("Strike >> 1, Ball >> 2, Foul >> 3");

      for(int i=0; i>=0; i++) {
        System.out.print("judge[" +(i+1)+ "] = ");
        int num = Integer.parseInt(br.readLine());
        if(num==1) s++;
        else if(num==2) b++;
        else if(num==3) {
          f++;
          if(s!=2) s++;
        }
        if((s==3)||(b==4)) i=-2;
      }
      System.out.print("Strike : " +s+ ", Ball : " +b);
      System.out.println();
    }
}
