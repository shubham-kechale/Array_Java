import java.util.Scanner;

public class AlternateCharacterInUpperCase {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=obj.nextLine();
		char []ch=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			if(ch[i]==' ')
			 System.out.print(" ");
			else if(i%2==0)
		System.out.print(Character.toUpperCase(ch[i]));
			else
				System.out.print(Character.toLowerCase(ch[i]));
		}
	}

}
