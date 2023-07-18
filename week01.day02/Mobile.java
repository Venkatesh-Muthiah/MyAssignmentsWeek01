package week01.day02;

public class Mobile {

	String mobileBrandName = "Sony";
	char mobileLogo = 'S';
	short noOfMobilePiece = 12;
	int modelNumber = 311144;
	long mobileImeiNumber = 427842042149024L;
	float mobilePrice = 72.12335f;
	boolean isDamaged = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile features = new Mobile();

		System.out.println(features.mobileBrandName);
		System.out.println(features.mobileLogo);
		System.out.println(features.noOfMobilePiece);
		System.out.println(features.modelNumber);
		System.out.println(features.mobileImeiNumber);
		System.out.println(features.mobilePrice);
		System.out.println(features.isDamaged);

	}

}
