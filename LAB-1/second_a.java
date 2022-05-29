import java.io.*; 
class second_a
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ir= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(ir);
        int rows=5;  
        for (int i= 0; i<= rows-1; i++)  
        {  
         for (int j=0; j<=i; j++)  
          {  
           System.out.print(" ");  
          }  
         for (int k=0; k<=rows-1-i; k++)  
          {  
           System.out.print("*" + " ");  
          }    
          System.out.println();  
        }  
    }
}