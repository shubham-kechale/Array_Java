import java.util.Scanner;

public class ArrayCharToString {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int c=obj.nextInt();
		char[] arr=new char[c];
		System.out.println("Enter the string letter by letter(please entered "+c+" words)");
		for(int i=0;i<arr.length;i++)
			arr[i]=obj.next().charAt(0);
		String str=String.valueOf(arr);
		System.out.println("---------string format----------");
		System.out.println(str);

	}

}
