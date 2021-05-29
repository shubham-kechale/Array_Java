import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a=obj.nextInt();
		int[] arr=new int[a];
		int i,j;
		System.out.println("Enter the element in an array");
		for(i=0;i<arr.length;i++)
			arr[i]=obj.nextInt();
		
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("-------sorted array-----------");
		for(i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
