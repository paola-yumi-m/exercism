class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
	
	private int distanceTravelled = 0;
	private int numberofVictories;
	
	public ProductionRemoteControlCar() {
		super();
	}
	
    public void drive() {
    	this.distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
    	return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
    	return this.numberofVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
    	this.numberofVictories = numberofVictories;
    }
    
    public int compareTo(ProductionRemoteControlCar otherCar) {
    	if (this.getNumberOfVictories() > otherCar.getNumberOfVictories()) {
    		return 1;
    	} else if (this.getNumberOfVictories() < otherCar.getNumberOfVictories()) {
    		return -1;
    	}
    	return 0;
    }
}
