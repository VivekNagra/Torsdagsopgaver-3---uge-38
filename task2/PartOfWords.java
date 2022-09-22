class PartOfWords
{

	public printPartOfWord(String word, int a, int b)
	{
		String word = word
		for(int i = a; i <= b; i++)
			{
				system.out.print(word.charAt(i));
			}
	}

	public static void main(String [] args)
	{
		printPartOfWord("København", 1, 4);

	}
}