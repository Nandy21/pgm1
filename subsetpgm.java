import java.util.Scanner;


public class subset {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=5;
		int n2=10;
		int[] a1=new int[n1]; 
		int[] a2=new int[n2];
		int count=0;
		for(int i=0;i<n1;i++)
		{
			a1[i]=sc.nextInt();
		}
		for(int i=0;i<n2;i++)
		{
			a2[i]=sc.nextInt();
		}
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(a1[i]==a2[j])
				{
					continue;
				}
				else
				{
					count++;
				}
			}
		}
		if(count!=1)
		{
			System.out.println("a1 is a subset of a2");
		}
		else
		{
			System.out.println("a1 is not a subset of a2");
		}
	}
}
