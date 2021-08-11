public class Ducati extends BikeCal implements BikeElect
{
	int hp;
	float weight;
	Ducati()
	{
		hp=207;
		weight=430;
	}

	public void electronicsInfo()
	{
		System.out.println("About EleCtronics: ");
		System.out.println("Quick Shifter and auto blipper: Yes");
		System.out.println("Cooling: Liquid cooling");
		System.out.println("Ignition: Digital");
		System.out.println("Power modes: 4 (City, Rain, SuperSport, V)");
		System.out.println("Traction control: 3 (Track, Race, Rain)");
		System.out.println("Lights: All LEDs");
		System.out.println("Brakes: Cornering ABS with dual carbon ceramics Front discs");
	 	System.out.println("Emission : "+emission);
	}
	public void showInfo()
	{
		System.out.println("Ducati Panigale V4S");
		System.out.println("Displacement:- 1103cc");
		System.out.println("Transmission:- 6 speed manual");
		System.out.println("Bhp:- 214Hp");
		System.out.println("Torque:- 124Nm");
		System.out.println("No.of Cylinder: 4 cylinder");
		System.out.println("Clutch: Dry clutch mechanical");
		System.out.println("Bike type :- Supersport");
		System.out.println("Brand : Europian");
		System.out.println("Power to Weight Ratio: "+(powToWeight(hp,weight))+" lbs/hp");


	}
	public void basicInfo()
	{
		System.out.println("Drive type: Chain drive");
		System.out.println("Tires: Front :-120/70-ZR17, Rear :-200/60-ZR17");
		System.out.println("Fuel Capacity: 16 Liters");

	}



}