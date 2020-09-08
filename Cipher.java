import java.util.*;

public class Cipher {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string to cipher: ");
		
		String s = scan.next();
		
		System.out.println("Encrypted string: " + encrypt(s));
		System.out.println("Decrypted string: " + decrypt(encrypt(s)));
	}
	
	public static String encrypt(String str) {
		char[] encrypted = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			if(i%2 == 0) {
				encrypted[i] = (char)((int)str.charAt(i) + ((i/2) + 1));
			}
			else {
				encrypted[i] = (char)((int)str.charAt(i) - ((i/2) + 1));
			}
		}
		
		return String.valueOf(encrypted);
	}
	
	public static String decrypt(String str) {
		char[] decrypted = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			if(i%2 == 0) {
				decrypted[i] = (char)((int)str.charAt(i) - ((i/2) + 1));
			}
			else {
				decrypted[i] = (char)((int)str.charAt(i) + ((i/2) + 1));
			}
		}
		
		return String.valueOf(decrypted);
	}

}
