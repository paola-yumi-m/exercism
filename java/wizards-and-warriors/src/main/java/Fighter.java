abstract class Fighter {

    boolean isVulnerable() {
    	return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
    	return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
    	if (wizard.isVulnerable()) {
    		return 10;
    	}
    	return 6;
    }
}

class Wizard extends Fighter {

	boolean spell = false;
	
    @Override
    boolean isVulnerable() {
    	if (this.spell == false) {
    		return true;
    	}
    	return false;
    }

    @Override
    int damagePoints(Fighter warrior) {
    	if (this.spell == true) {
    		return 12;
    	}
    	return 3;
    }

    void prepareSpell() {
    	this.spell = true;
    }
    
    @Override
    public String toString() {
    	return "Fighter is a Wizard";
    }

}
