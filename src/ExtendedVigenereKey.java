
public class ExtendedVigenereKey {
	char [] key;
	
	public ExtendedVigenereKey(char [] key){
		this.key = (char[]) key.clone();
	}
	
	public char[] encrypt(char[] plaintext){
		char[] cipherText = new char[plaintext.length];
		int key_i=0;
		for (int i=0;i<plaintext.length;i++){
			cipherText[i]=(char) (((int)(plaintext[i]+key[key_i]))%256);
			key_i++;
			if (key_i>=key.length)key_i=0; 
		}
		return cipherText;
	}
        
	public char[] decrypt(char[] cipherText){
		char[] plainText = new char[cipherText.length];
		int key_i=0;
		for (int i=0;i<cipherText.length;i++){
			plainText[i]=(char) (((int)(cipherText[i]+256-key[key_i]))%256);
			key_i++;
			if (key_i>=key.length)key_i=0; 
		}
		return plainText;
	}
        
	
}
