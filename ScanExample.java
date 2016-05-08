import java.util.Scanner;
//Your code won't compile unless you import the scanner.
// It is part of the util library, from the java core stuff 
//(so you already have it on your machine, you just need to tell this class to use it.)

//This is a dumb class that will read in lines of input from the command line, and put it into
//"Mary had a little _____."
class ScanExample {
	

	public static void main(String[] args){
		//args is an array that holds all parameters passed in at the command line.
		//but, we don't want any. args[0] is always the name of your program, so there is 
		//always going to be at least 1 thing in there in java. So we check if there is more.
		if(args.length > 1)
			usage();

		System.out.println("Welcome to the scanner example, by Zeke.");

		//The backslashes before the quotes here tell java that the quotes are part of the text, and not the start/end of a String.
		//This is called 'escaping', many ASCII characters have special meanings in code/text formatting, so sometimes you have to use
		//their base meaning. because '/' is the escape character, if you want a backslash in your text you have to escape that too. So it would be '//'
		System.out.println("Type in any word, or words and press enter. I'll echo it as \"Mary had a little ____\"");
		System.out.println("To exit, enter just 'quit' or 'exit'.");
		System.out.println("Also Neil, you can just press control + c to quit anything running on the command line.");
		System.out.println("For more information, you can find the java documentation by searching 'Java scanner' ");
		
		//declare a Scanner object also named scanner.
		Scanner scanner;

		//instantiate a scanner. Parameter is the source of text to scan.
		scanner = new Scanner(System.in);

		//We are just going to keep accepting input until the user quits.
		while(true){
			//next line outputs a String, which is the scanner's next line.
			//if we fed in the scanner a file, it would do this for each line in the file.
			String inputText = scanner.nextLine();
			if(inputText.equalsIgnoreCase("exit") || inputText.equalsIgnoreCase("quit")) {
				System.exit(0); // in java, System.exit will close the program, the int param is a status code for why you quit.
			}
			System.out.println("Mary had a little " + inputText);
		}

	}

	//This usage() method is static, because we want to reference it from the static context above.
	//This means we can't use any persistent state that we would want to stick around between calls.
	//That's ok, because all it does it print out stuff nondeterministically. (the same every time.)
	private static void usage() {
		System.out.println("Learn how to command neil!");
		System.out.println("Proper usage:");
		System.out.println("java ScanExample");
	}

}