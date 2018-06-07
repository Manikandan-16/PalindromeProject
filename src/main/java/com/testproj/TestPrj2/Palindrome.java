package com.testproj.TestPrj2;

class Palindrome implements DistInterface {

	static boolean pal(String str)		//method to check if the passed String is palindrome or not

	{

		int x = str.length();
		int k = x - 1;

		int i;

		for (i = 0; i < x; i++, k--) 		

		{

			if (str.charAt(i) != str.charAt(k))

				return false;

		}

		return true;

	}

	public int countPal(String s)

	{

		int i, n = s.length(), count = 0, j;

		for (i = 2; i <= n; i++)		//checks for palindrome words for length more than 1

		{

			for (j = 0; j <= n - i; j++)

			{
				if (pal(s.substring(j, j + i)))

				{

					//System.out.println(s.substring(j, j + i));

					count++;

				}

				else

					continue;

			}
		}

		return count;	//print the total possible value

	}
}