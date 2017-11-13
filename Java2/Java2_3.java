/* print pow of input number */
import java.io.*;

public class Java2_3
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader(System.in) );

        int n = Integer.parseInt(br.readLine());
        for(int cnt=2; cnt<11; cnt++) {
          System.out.println(n+"^" +cnt+ " = " +(int)Math.pow(n,cnt));
        }
    }
}
