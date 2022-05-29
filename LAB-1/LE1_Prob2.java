public class LE1_Prob2
{
	public static void main(String[] args){
	int rows = Integer.parseInt(args[0]);
	for ( int i = 1 ; i <=rows ; i++){
		for ( int j = rows ; j >= i ; j--)
		System.out.print(" ");

		for ( int k = 1 ; k <=i ; k++)
		System.out.print("* ");

		System.out.println();  	

	}
     }
}