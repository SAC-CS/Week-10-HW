
public class Rolls {
	private int times;
	private int fresult;
	
	public Rolls() {}
	
	public void setRolls(int times)
	{
		this.times = times;
	}
	
	public void setFinalResult(int fresult){
		this.fresult = fresult;
		System.out.printf("The result was %d\n",fresult);
		}
	public void decision(int guess)
	{
		if(this.fresult == guess)
			System.out.print("You guessed correct! Lets hit up the Craps tables!");
		else
			System.out.println("You should stay away from the Craps tables!");
		
	}
	}


// You need a method to generate a Radom number in this class, Caesar.  And please update the default constructor.
