package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is your value of n?");
		int n= in.nextInt();

		boolean numbers [] = new boolean [n+3];

		for (int i=0; i<n; i++) 
		{
			numbers [i]=true;
		}
			for (int j=2; j<n/2; j++)
			{
				for (int multiple=j*2; j<numbers.length; multiple+=j)
				{
					numbers [multiple]=false;
				}
				
				for (int a=0; a<numbers.length; a++)
				{
					if (numbers [a]==true)
					{
						System.out.println(a);
					}
					
			}
		}
		}
	}