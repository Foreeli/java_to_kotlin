/* print calculate of (x,y) */
import java.io.*;

public class Java4_19
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in) );

      for(double i=1,sum=0; i>0; i++) {
        System.out.print("num[" +(int)i+ "] = ");
        int num = Integer.parseInt(br.readLine());
        sum += num;
          if(num == 0) {
            System.out.println("Total : " +sum);
            System.out.println("Average : " +(sum/(i-1)));
            i=-1;
        }
      }

     }
}
