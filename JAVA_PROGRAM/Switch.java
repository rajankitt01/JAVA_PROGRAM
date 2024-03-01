import java.util.*;
class Switch
{
	public static void main(String args[])
{
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	num=sc.nextInt();
	switch(num)
	{
	case 1:
	System.out.println("First");
	break;
	case 2:
	System.out.println("Second");
	break;
	case 3:
	System.out.println("Third");
	break;
	default:
	System.out.println("Invalid");
	}
}
}