//Program of Wood
//Working with Setters in this case
// Calculating the price for a particular block of wood
// Assuming they all came in even feet, whch would never be the case, but not the point of the exercise.

class Wood{
	String typeWood;
	String feel;
	double height;
	double length;
	double depth;
	int vol;
	//double priceCubeFoot;
	double priceCubeFoot;
	double pricePerFoot;
	//int = cubicArea;
	double priceForBlock;
	
	double calcCubicAmt() {
		double cubicArea = height * length * depth;
		return cubicArea;
	}
	
	
	
	
	double calcPrice (double w, double l, double h) {
	
		//int area = calcCubicAmt ();
		double pricePerBlock = priceCubeFoot * (w * l *h);
		
		//System.out.println("Inside calcprice pricePerBlock=  " +pricePerBlock);
		return pricePerBlock;
		
	}
	
}



class TestIlene {
	public static void main (String[] args) {
		
		Wood WoodM = new Wood ();
			WoodM.typeWood = "A lovely maple cubic slap the size of ";
			WoodM.feel = "soft texture";
			WoodM.height = 2; //feet
			WoodM.length = 3; //feet
			WoodM.depth = 1; //feettem
			WoodM.priceCubeFoot = 10;
			double cubicArea = WoodM.calcCubicAmt();
			
			//System.out.println("from inside testIlene " + cubicArea);
			
			
			double ilene = WoodM.calcPrice(WoodM.height, WoodM.length, WoodM.height );
			double area = WoodM.calcCubicAmt();		
			
			System.out.println ("For " + WoodM.typeWood + area + " cubic feet" );
			System.out.println ("it will cost: " + WoodM.calcPrice(WoodM.height, WoodM.length, WoodM.height));
	}
	

}
