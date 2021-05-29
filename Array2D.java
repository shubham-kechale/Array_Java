import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int i,j;
		int[][]arr=new int[3][3];
		System.out.println("Enter the element in 2D array");
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				arr[i][j]=obj.nextInt();
			}
		}
		System.out.println("------------------------------");
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
