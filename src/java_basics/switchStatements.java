		package java_basics;

    public class switchStatements {

   	public static void main(String[] args) {
		
    int month = 6;
		String monthString;
		
		switch(month){
		
		case 1: monthString = "January";
			break;
			
		case 2: monthString = "Febuary";
			break;
		case 3: monthString = "March";
			break;
		case 4: monthString = "April";
			break;
		default: monthString = "Unknown Month";
			break;
			
		}
		System.out.println(monthString);
    
    }
