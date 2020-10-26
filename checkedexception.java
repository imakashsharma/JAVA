package akashsharma;

import java.io.FileInputStream;

public class checkedexception {
	public static void main(String[] args) {
		FileInputStream a = new FileInputStream("d:abc.txt'");
		//it is showing error while the time of copilation because there is no file named as abc.txt
	}

}
