package assn_05;

public class ReverseString {
	    public static void main(String[] args) {
	        String input = "KESHAV";
	        String reversed = "";

	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed += input.charAt(i);
	        }

	        System.out.println(reversed);
	    }
	}


