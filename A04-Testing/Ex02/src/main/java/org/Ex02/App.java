package org.Ex02;


public class App 
{
	public static double PRICE = 5.0;
	public static double PLACES = 60.0;
    
    public static double run(Person p, int AI) throws NotAllowedException {
    	
    	double price = PRICE, reserved = 0, places = PLACES;
        if (valid(p, AI)) {
        	if(AI < 100) {
        		price = level0(p);
        	}
        	if(AI <=200) {
        		price = level1(p);
        		places = 0.8*places;
        	}
        	if (AI <= 300) {
        		price = level2(p);
        		places = 0.6*places;
        		reserved = 0.6*places;
        	}
        	if(AI <= 500) {
        		price = level3(p);
        		places = 0.4*places;
        		reserved = 0.8*places;
        	}
        	if (AI > 500) {
        		price = level4(p);
        		places = 0.3*places;
        		reserved = 0.9*places;
        	}
        }else {
        	throw new NotAllowedException();
        }
        return price;
    }
    public static double level0(Person p) {
    	double price = PRICE;
    	if (p.getAge() < 23) {
			price = 0.4*PRICE;
		}
    	if (p.getAge() > 65) {
    		price = 0.2*PRICE;
    	}
    	return price;
    }
    
    public static double level1(Person p) {
    	double price = PRICE;
    	if (p.getAge() < 23) {
			price = 0.7*PRICE;
		}
    	if (p.getAge() > 65) {
    		price = 0.5*PRICE;
    	}
    	return price;
    }
    public static double level2(Person p) {
    	double price = PRICE;
    	if (p.getAge() > 65) {
    		price = 1.2*PRICE;
    	}
    	return price;
    }
    public static double level3(Person p) {
    	double price = PRICE;
    	if (p.getAge() < 23) {
			price = 1.2*PRICE;
		}
    	if (p.getAge() > 65) {
    		price = 1.5*PRICE;
    	}
    	return price;
    }
    public static double level4(Person p) {
    	double price = PRICE;
    	if (p.getAge() < 23) {
			price = 1.5*PRICE;
		}
    	return price;
    }
    public static boolean valid(Person p, int AI) {
    	boolean valid = false;
    	if (((!p.isIll() && !p.isHasContact() && !p.isHasSymptoms()) || (p.isPassport() && !p.isIll())) && (!(p.getAge() > 65 && AI > 500) || p.getAge() <=65) ){
    		valid = true;
    	}
    	return valid;
    }
}
