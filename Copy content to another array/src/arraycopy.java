import java.util.Scanner;

class arraycopy 
{
public static void main(String[] args) 
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length");
	int n = scan.nextInt();
	int arr1[]=new int [n];
	
	System.out.println("Enter array contents");
	for (int i=0; i<=arr1.length-1; i++)
	{
		System.out.println("Enter an element");
		arr1[i] = scan.nextInt();
	}
	int arr2[] = new int[arr1.length];
	
	for (int i=0; i<= arr1.length-1; i++)
	{
		arr2[i]=arr1[i];
	}
	System.out.println("array 1 contents are ");
	for (int i=0; i<= arr1.length-1; i++)
	{
		System.out.print(arr1[i] + " ");
	}
	System.out.println();
	System.out.println("array 2 contents are ");
	for (int i=0; i<= arr1.length-1; i++)
	{
		System.out.print(arr2[i]+ " ");
	}
}
}
