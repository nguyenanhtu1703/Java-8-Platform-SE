import java.util.ArrayList;
import java.util.List;

interface Reputation {
	default public String getInfo() {
		return "Bad for business";
	}
}

class Car {
	private String initialReputation=null;
	private List<String> reputations = new ArrayList<String>();
	Car(){
		System.out.println("okayy");
	}
	public Car(String i) {
		this.initialReputation = i;
	}
	public void addReputation(String r) {
		reputations.add(r);
	}
	Reputation obj = new Reputation() {
		public String getInfo() {
			Zoom();
			return "Inner Car";
			
		}
		public void Zoom() {
			System.out.println("zoom");
		}
	};
}

class CarReputation {
	public static void main(String[] args) {
		Car car = new Car();
		car.obj.getInfo();
	}
}