package cons.step1;

public class Car {
	String model;
	int price;
	String color;
	
	Engine engine;

	public Car(String model, int price, String color, Engine engine) {
		this.model = model;
		this.price = price;
		this.color = color;
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public Engine getEngine() {
		return engine;
	}
	
	public String getCarInfo(){
		return " 모델 : " + model + " 가격 : " + price + " 색상 : " + color + " 성능 : " + engine.getEngineInfo() ;
	}
}
