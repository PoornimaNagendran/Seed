import java.util.Scanner;
public class Seed {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=s.nextInt();
		System.out.println("Enter its seed");
		int y=s.nextInt();
		int p=y;
		int k=p;
		int r;
		while(k!=0)
		{
			r=k%10;
			p=p*r;
			k=k/10;
		}
		if(p==x)
		{
			System.out.println(y+" is a seed of "+x);
		}
		else
		{
			System.out.println(y+" is not a seed of "+x);
		}

	}

}
