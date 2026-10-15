package que4;

public class TrafficLight {
	enum Traficlight{
 
		RED(60),
		GREEN(60),
		YELLOW(5);
		
		int duration;
		
		
		Traficlight(int duration){
			this.duration= duration;
			
		}
		
		

		public int getDuration() {
			return duration;
		}
		
	}
	
	public static void main(String[] args) {
		for(Traficlight light : Traficlight.values()) {
			System.out.println(light + " " + light.getDuration() + "Seconds");
		}
	}

}
