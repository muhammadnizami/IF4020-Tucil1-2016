
//TODO belum selesai
public class StandardVigenereKey {
	char [] key;
	
	public StandardVigenereKey(char [] key) throws Exception{
		if (FindKeyError(key)!=null) throw new Exception("Invalid Key");
                this.key = new char[key.length];
		for (int i=0;i<key.length;i++){
			this.key[i]=Character.toUpperCase(key[i]);
		}
	}
	
	public static String FindKeyError(char [] key){
		for (int i=0;i<key.length;i++){
			char curchar = key[i];
			if (curchar<'A'
					|| (curchar>'Z'&&curchar<'a')
					|| curchar > 'z') return "INVALID CHARACTER: '" + curchar + "'";
		}
		return null;
	}
	
	public char[] encrypt(char[] plaintext){
		char[] cipherText = new char[plaintext.length];
		int key_i=0;
		for (int i=0;i<plaintext.length;i++){
                    char curchar = plaintext[i];
                    if ((curchar>='A'&&curchar<='Z')||(curchar>='a'&&curchar<='z')){
                        curchar = Character.toUpperCase(curchar);
			char curchar_val = (char) (curchar-'A');
                        char curkey_val = (char) (key[key_i]-'A');
			char curcipherchar_val = (char) ((curchar_val + curkey_val)%26);
			cipherText[i]=(char) (curcipherchar_val + 'A');
			key_i++;
			if (key_i>=key.length)key_i=0;
                    }else{
                        cipherText[i]=curchar;
                    }
		}
		return cipherText;
	}
        
        public char [] decrypt(char [] cipherText){
		char[] plainText = new char[cipherText.length];
		int key_i=0;
		for (int i=0;i<cipherText.length;i++){
                    char curchar = cipherText[i];
                    if ((curchar>='A'&&curchar<='Z')||(curchar>='a'&&curchar<='z')){
                        curchar = Character.toUpperCase(curchar);
			char curchar_val = (char) (curchar-'A');
                        char curkey_val = (char) (key[key_i]-'A');
			char curcipherchar_val = (char) ((curchar_val+26 - curkey_val)%26);
			plainText[i]=(char) (curcipherchar_val + 'A');
			key_i++;
			if (key_i>=key.length)key_i=0;
                    }else{
                        plainText[i]=curchar;
                    }
		}
		return plainText;
            
        }
}
