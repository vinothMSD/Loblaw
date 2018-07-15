package week2day1;

public class RegularExp {

	public static void main(String[] args) {

		String text= "my   name    is Khan@123";
		System.out.println(text);
		String replaceAll = text.replaceAll("(\\s)+", " ");
		System.out.println(replaceAll);
		//System.out.println(replaceAll.replaceAll("\\d", ""));
		String[] split = text.split(" ");
		
	}

}
