class Pulser150{
	
	boolean coolingSys = true;

	public void accelaration(boolean changeFuelIntake){
         
         if (changeFuelIntake == true) {
         	System.out.println(this+" increase fuel intake");
         }else{
         	System.out.println(this+" do not increase the fuel intake");
         }
	}
}
class Pulser180 extends Pulser150{

	boolean fogLights = true;

	public void transmission(boolean changeGear){
         
         if (changeGear == true) {
         	System.out.println(this+" increase the gear");
         }else{
         	System.out.println(this+" decrease the gear");
         }
	}
}
class Pulser220 extends Pulser180{

	boolean silencer = true;

	public void antiBreakingSystem(boolean applyBreak){
        
        if (applyBreak == true) {
        	System.out.println(this+" reducing the speed");
        }else{
        	System.out.println(this+" maintaining the speed");
        }
	}
}
class Driver{

	public static void main(String[] args) {
		System.out.println("main starts...");

        Pulser150 p150 = new Pulser150();
        p150.accelaration(false);
        System.out.println("the vehicles coolingSys is present! "+p150.coolingSys);

        Pulser180 p180 = new Pulser180();
        p180.transmission(false);
        System.out.println("turn on fog lights!"+p180.fogLights);
        p180.accelaration(false);

        Pulser220 p220 = new Pulser220();
        p220.antiBreakingSystem(true);
        System.out.println("New silence!"+p220.silencer);

        p220.transmission(true);
        p220.accelaration(false);


		System.out.println("main ends...");
		return;
	}
}