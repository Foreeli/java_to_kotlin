/* print calculate of (x,y) */
import java.io.*;

public class Java3_9
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader(System.in) );

        System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
        System.out.print("曜日 = ");
        int day = Integer.parseInt(br.readLine());

        System.out.println("0=午前、1=午後、2=夜間");
        System.out.print("時間帯 = ");
        int time = Integer.parseInt(br.readLine());

        switch(day) {
          case 0:
            System.out.println("×");
            break;
          case 3:
            if(time == 2) System.out.println("×");
            else System.out.println("○");
            break;
          case 6:
            if(time == 0) System.out.println("○");
            else System.out.println("×");
            break;
          case 2:
          case 5:
            if(time == 0) System.out.println("×");
            else System.out.println("○");
            break;
          case 1:
          case 4:
            System.out.println("○");
            break;
        }
    }
}
