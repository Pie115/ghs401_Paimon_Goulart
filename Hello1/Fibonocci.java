import javax.swing.JOptionPane;
public class Fibonocci
{
   public static void main(){
       int numberfib = Integer.parseInt(JOptionPane.showInputDialog("Hey kid how mny fibs u wanna see :)"));
       
       int[] fibarray = new int[numberfib];
       
       if(fibarray.length == 0){
           System.out.println("Error");
        }
       
       if(fibarray.length>0){
           fibarray[0] = 0;
           fibarray[1] = 1;
           System.out.println("Index        Fib Num.        Running Total");
           System.out.println(0+"               "+0+"                 "+ 0);
           System.out.println(1+"                  "+1+"               "+ 1);
           int runningtotal = 0;
       for(int i = 2; i<numberfib;i = i +1){
           runningtotal = runningtotal + fibarray[i-1];
           fibarray[i] = fibarray[i-2]+fibarray[i-1];
           System.out.println(i-1+"                 "+fibarray[i]+ "             " + runningtotal);
        }
    }
}
}
