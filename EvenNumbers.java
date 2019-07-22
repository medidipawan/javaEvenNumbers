import java.util.*;
public class EvenNumbers
	{
		public static void main (String[] args)
			{
				Scanner keyboard = new Scanner(System.in);

				System.out.print("Type a number: ");
				int x = keyboard.nextInt();
				System.out.print("Type another number: ");
				int y = keyboard.nextInt();

				for(int a = x; a<=y; a++)
					{
						if(a%2 == 0)
							{
								System.out.println(a);

							}

					}
			}
	}