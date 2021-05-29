import java.util.Scanner;

public class VarArgs {
	public static int add(int...a)
	{
		int sum=0;
		 for(int i=0;i<a.length;i++)
		 {
			 sum=sum+a[i];
		 }
		return sum;
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int i=obj.nextInt();
		int[]arr=new int[i];
		System.out.println("Enter the elements in an array");
		for(i=0;i<arr.length;i++)
			arr[i]=obj.nextInt();
		System.out.println("Total sum: "+add(arr));
         obj.close();

	}

}
