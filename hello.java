class Hello {

	private String output;
	private int myInteger;
	private long aLong;

	public Hello(String outputText, int myInt){
		output = outputText;
		myInteger = myInt;
	}

	public Hello(){

	}

	public void setOutput(String newOutput, int intOutput) {
		output = newOutput;
		myInteger = intOutput;
	}

	public void printOutput() {
		System.out.println("Now I'm printing " + myInteger);
	}

}