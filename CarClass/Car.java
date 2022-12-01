package CarClass;

class Car {

	String brand;
	int modle;
	int amountOfFuel;

		public Car(String brand,int modle,int amountOfFuel) {
		this.brand=brand;
		this.modle=modle;
		this.amountOfFuel=amountOfFuel;
	
	}
	
		public void setBrand(String brand) {
			this.brand=brand;
		}
		
		public void setModle(int modle) {
			this.modle=modle;
		}
		
		public void setAmountOfFuel(int amountOfFuel) {
			this.amountOfFuel=amountOfFuel;
			}
	
		
		public String getBrand() {
			return this.brand;
		}
		
		public int getModle() {
			return this.modle;
		}
		
	
			public void Break() {
			System.out.println("Car is breaking");
			}
	
			public void Accelerating() {
			System.out.println("Car is accelerating");
			this.amountOfFuel=amountOfFuel-=1;
			}
	
			public void PrintData() {
			System.out.println("The car brand is " + brand);
			System.out.println("The modle is " + modle);
			System.out.println("The amount fuel is " + amountOfFuel);
			}
			
					}
