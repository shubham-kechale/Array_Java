import java.util.Scanner;

public class ArrayMerge {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a size of first array");
		int a=obj.nextInt();
		int[] arr=new int[a];
		int i;
		System.out.println("Enter the elements in first array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println("Enter a size of second array");
	    a=obj.nextInt();
		int[] arr2=new int[a];
		System.out.println("Enter the elements in second array");
		for(i=0;i<arr2.length;i++)
		{
			arr2[i]=obj.nextInt();
		}
		int []arr3=new int[arr.length+arr2.length];
		for(i=0;i<arr.length;i++)
			arr3[i]=arr[i];
		for(i=0;i<arr2.length;i++)
			arr3[arr.length+i]=arr2[i];
		System.out.println("----------new array that merge previous two array--------");
		for(i=0;i<arr3.length;i++)
			System.out.print(arr3[i]+" ");


	}

}
