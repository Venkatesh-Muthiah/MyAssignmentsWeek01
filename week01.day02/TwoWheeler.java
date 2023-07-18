package week01.day02;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 13981381638163l;
	boolean isPunctured = false;
	String bikeName = "Harley Davidson";
	double runningKM = 13.486;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoWheeler specifications = new TwoWheeler();

		System.out.println(specifications.noOfWheels);
		System.out.println(specifications.noOfMirrors);
		System.out.println(specifications.chassisNumber);
		System.out.println(specifications.isPunctured);
		System.out.println(specifications.bikeName);
		System.out.println(specifications.runningKM);

	}

}
