package learning;

public class People implements IGoing, IDriving {

	private String name;
	private String surname;
	private int age;
	private String drivingLicense;

	@Override
	public void drive() {
		if (getDrivingLicense() != null) {
			if (getAge() > 17) {
				System.out.println("We are driving!");
			}
		}		
	}

	@Override
	public void go() {
		if ((getAge() < 18) || (getDrivingLicense() == null)) {
			System.out.println("We are not driving, but we are going!");
		}		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

}
