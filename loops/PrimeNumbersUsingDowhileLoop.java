
import java.util.Scanner;
class PrimeNumbersUsingDowhileLoop
{

void printPrimeNumbers(int num)
{
int i=1;
int n=0;
String primeNumbers="";
do
{
int counter=0; 		  
         for(n =i; n>=1; n--)
         {
	    if(i%n==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {
	    
	    primeNumbers = primeNumbers + i + " ";
	 }	
	 i++;
}while(i<=num);

	  
	  System.out.print(primeNumbers);
}
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
PrimeNumbersUsingDowhileLoop loop=new PrimeNumbersUsingDowhileLoop();
loop.printPrimeNumbers(num);
}

}