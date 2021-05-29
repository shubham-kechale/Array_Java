import java.util.Scanner;

public class Array2D_2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int i,j;
		int[][]arr=new int[3][3];
		int[][]arr2=new int[3][3];
		System.out.println("Enter the element in 2D array for 1st array");
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				arr[i][j]=obj.nextInt();
			}
		}
		System.out.println("Enter the element in 2D array for 2nd array");
		for(i=0;i<arr2.length;i++)
		{
			for(j=0;j<arr2.length;j++)
			{
				arr2[i][j]=obj.nextInt();
			}
		}
		int [][]arr3=new int[3][3];
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				arr3[i][j]=arr[i][j]+arr2[i][j];
			}
		}
		System.out.println("-------------------------------");
		for(i=0;i<arr3.length;i++)
		{
			for(j=0;j<arr3.length;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}

	}

}
