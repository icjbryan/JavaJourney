
public class Object {

	public static void main(String[] args) {
		//There is a method called Replace that can replace one character in a string with another.
		
		String quote = "The quick brown fox jumps over the lazy dog.";
		
		// The Replace() method takes in two parameters. The first parameter
		// is the character you want to replace, while the second parameter is the replacement.
		quote = quote.replace('o', '?');
		System.out.println(quote);
		
		quote = quote.replace('?', 'o');
		System.out.println(quote);
		
		quote = quote.replace('o', 'e');
		System.out.println(quote);
	}

}
