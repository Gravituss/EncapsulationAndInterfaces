/** For learning purposes this little program uses interfaces and 
 * encapsulation mechanisms. 
 */


package learning;

public class MainC {

	public static void main(String[] args) {
		
		BusDriver jackBones = new BusDriver();
		// Entering input data --------------------------
		jackBones.setName("Jack");
		jackBones.setSurname("Bones");
		// Valid age for driving is at least 18 y.o.
		jackBones.setAge(18);
		// At least some driving license is enough for driving
		jackBones.setDrivingLicense("B");
		jackBones.setYearsExperience(6);
		// ----------------------------------------------

		jackBones.drive();
		jackBones.go();
	}
}
