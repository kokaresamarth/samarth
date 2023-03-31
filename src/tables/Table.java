package tables;
import java.util.Scanner;
public class Table 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number you want to print table");
		int no=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(no+"*"+i+"=" +no*i);
		}
	}

}
