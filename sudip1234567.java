import java.util.*;

class Q1

{

public static void main(String args[])

{

	int num[]=new int[100];
	int n,i;

	Scanner ob=new Scanner(System.in);

	System.out.println("Enter the size of the array:");

	n=ob.nextInt();

	for(i=0;i<n;i++)

	num[i]=ob.nextInt();

	int max=0,semax=0;

	for(i=0;i<n;i++)

	{

	if(max<num[i])

	{

	semax=max;

	max=num[i];
	
}

	else if(num[i]>semax)

	semax=num[i];

	}

	System.out.println("latgest number is "+max);

	System.out.println("2nd latgest number is "+semax);

}
}
	
