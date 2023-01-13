/*
 * Activity 2.4.4
 */
public class LetterFrequencies
{
	public static void main(String[] args)
	{
		String letters = "abcdefghijklmnopqrstuvwxyz"; 
		String phrase = "This is a phrase!";

		
		System.out.println("The following shows the letter frequencies for the phrase");

		for (int i = 0; i <letters.length(); i++ )
		{
		  int count = 0;
		  String let = letters.substring(i, i+1);

		
			for (int k = 0; k <phrase.length(); k++ ){
				String phr = phrase.substring(k, k+1);

				if (let.equals(phr)){
					count++;
				}
				
			}

			System.out.println(let + " appears " + count + " times");
		}
    /* your code here */
	}
}
