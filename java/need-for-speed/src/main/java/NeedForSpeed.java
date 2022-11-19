class NeedForSpeed {
	
	private int speed;
	private int batteryDrain;
	private int distanceDriven = 0;
	private int battery = 100;
	
	public NeedForSpeed(int speed, int batteryDrain) {
		this.speed = speed;
		this.batteryDrain = batteryDrain;
	}

	public int getSpeed() {
		return this.speed;
	}
	
	public boolean batteryDrained() {
    	if (this.battery < this.batteryDrain) {
    		return true;
    	}
    	return false;
    }

    public int distanceDriven() {
    	return this.distanceDriven;
    }

    public void drive() {
    	if (!this.batteryDrained()) {
    		this.distanceDriven += this.speed;
        	this.battery -= this.batteryDrain;
    	}
    	
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

	private int distance;
	
	public RaceTrack(int distance) {
		this.distance = distance;
	}
	
    public boolean carCanFinish(NeedForSpeed car) {
    	for (int i = 0; i < this.distance; i += car.getSpeed()) {
    		car.drive();
    		if (car.batteryDrained() && car.distanceDriven() < this.distance) {
    			return false;
    		}
    	}
    	return true;
    }
}
