package beersongchallengeprogram;

public class SongCode {

	
	
	 int totalBeers;
	
	public void SongProgram() {
		
	
	
			for( totalBeers = 99; 0 <= totalBeers;)
			{
				System.out.println(totalBeers + " bottles of beer on the wall, "+  totalBeers + " bottles of beer.");
				totalBeers--;
				System.out.println("Take one down and pass it around, "+  totalBeers + " bottles of beer on the wall.");
				System.out.println("");
				
				if(totalBeers == 0)
				{
					GoneBeerShopping();
					break;
				}
			}
	}

	public void GoneBeerShopping()
	{
		totalBeers = 99;
		System.out.println("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, " + totalBeers + " bottles of beer on the wall.");
	
	}
	
}
