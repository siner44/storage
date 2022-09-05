package stream;

import java.io.OutputStream;

public class SystemOutEx {
	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;		
		
		for(byte b=48; b<58; b++) {
			os.write(b); }		
		os.write(10);  //한행을 넘겨줌
		
		for(byte b=97; b<123; b++) {
			os.write(b); }		
		os.write(10);		

		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
	}
}
