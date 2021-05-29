import java.util.Scanner;

public class StringArray {
	public static void acceptArr(String[] s)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter strings in array");
		for(int i=0;i<s.length;i++)
			s[i]=obj.nextLine();
		System.out.println("-------------------------------");
		for(int i=0;i<s.length;i++)
			System.out.println(s[i].toUpperCase()+" ");
		obj.close();
	}
	public static void main(String[] args) {
		
		
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter the size of array string");
			int i=obj.nextInt();
			String []arr=new String[i];
	           acceptArr(arr);
	           obj.close();
		

	}

}
