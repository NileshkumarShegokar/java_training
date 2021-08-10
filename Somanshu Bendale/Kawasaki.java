public class Kawasaki extends BikeCal implements BikeElect
{
	int hp;
	float weight;
	Kawasaki()
	{
		hp=203;
		weight=454;
	}

	public void electronicsInfo()
	{
		System.out.println("About EleCtronics: ");
		System.out.println("Quick Shifter and auto blipper: Yes");
		System.out.println("Cooling: Liquid cooling");
		System.out.println("Ignition: Digital");
		System.out.println("Power modes: 3 (City, Rain, Sport)");
		System.out.println("Traction control: 3 (A,B,C)");
		System.out.println("Lights: All LEDs");
		System.out.println("Brakes: Cornering ABS with dual petal Front discs");
 		System.out.println("Emission : "+emission);
	}
	public void showInfo()
	{
		System.out.println("Kawasaki ZX-10rr");
		System.out.println("Displacement:- 998cc");
		System.out.println("Transmission:- 6 speed manual");
		System.out.println("Bhp:- 203Hp");
		System.out.println("Torque:- 114Nm");
		System.out.println("Clutch: Dual plate wet clutch");
		System.out.println("Type and No.of Cylinder: Inline-4");
		System.out.println("Bike type :- Supersport");
		System.out.println("Brand: Japnese");
		System.out.println("Power to Weight Ratio: "+(powToWeight(hp,weight))+" lbs/hp");


	}
	public void basicInfo()
	{
		System.out.println("Drive type: Chain drive");
	}



}