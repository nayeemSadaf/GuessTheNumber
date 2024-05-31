//guess the number
import java.util.*;
class guess_no
{
	int num,r,uin,ul=100,ll=0;
	double rand,ran;
	int rounds=1;
	Scanner in=new Scanner(System.in);
	void input()
	{
		System.out.println("\t\t\twelcome to word game");
		rand=Math.random();
		ran=rand*100;
		r=(int)ran;
		System.out.println("\n\n\nenter a number to guess computers number");
		uin=in.nextInt();
		while(uin!=r)
		{
			if(uin<r)
			{
				ll=uin;
				System.out.println("enter a number between"+ll+"-"+ul);
				uin=in.nextInt();
				rounds++;
			}
			if(uin>r)
			{
				ul=uin;
				System.out.println("enter a number between"+ll+"-"+ul);
				uin=in.nextInt();
				rounds++;
			}
			if(uin==r)
			{
				System.out.println("congratulations you guessed the number in "+rounds+" rounds");
				break;
			}
		}
	}
	public static void main(String args[])
	{
		guess_no ob=new guess_no();
		ob.input();
	}
}
		