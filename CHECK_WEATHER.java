public class CHECK_WEATHER {
	
	public static void main(String[] args) {

		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 60.0;

		check(isSnowing, isRaining, temperature);
	}
	
	static void check(boolean isSnowing, boolean isRaining, double temperature) {
		if(isSnowing || isRaining || temperature<50) {
			System.out.println("Let's Stay Home");
		}
		else {
			System.out.println("Let's Go Out!");
		}
	}
}