public class LE1_Prob3
{
	public static void main(String[] args) {
	   int rows = Integer.parseInt(args[0]);
	   for (int i = 1 ; i <= rows ; i++){
	       for ( int j = 1 ; j <= i ; j++)
	        System.out.print(" ");
	        
	        for ( int k = rows ; k >=i ; k-- )
	        System.out.print(" *");
	        
	        System.out.println();
	   }
	}
}