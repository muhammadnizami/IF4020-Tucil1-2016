import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayfairKey {
	char [][] key;
	char [][] extendedMatrix = null;
	
	public static String FindKeyError(char [][] key){
		if (key.length!=5) return "INVALID SIZE";
		Map<Character,Boolean> found = new HashMap<Character,Boolean>();
		for (char i = 'A';i<='Z';i++){
			found.put(i, false);
		}
		for (int i=0;i<key.length;i++){
			if (key[i].length!=5) return "INVALID SIZE";
			for (int j=0;j<key[i].length;j++){
				char curchar = key[i][j];
				if (curchar<'A'
						|| (curchar>'Z'&&curchar<'a')
						|| curchar > 'z') return "INVALID CHARACTER: '" + curchar + "'";
				curchar = Character.toUpperCase(curchar);
				if (found.get(curchar))
					return "DUPLICATE CHARACTER: '" + "'";
				else
					found.put(curchar, true);
			}
		}
		if (found.get('J')) return "INVALID CHARACTER: 'J'";
		return null;
	}
	
	public PlayfairKey(char [][] key) throws Exception{
		if (FindKeyError(key)!=null) throw new Exception("Invalid Key");
		this.key = new char[key.length][];
		for (int i=0;i<key.length;i++){
			this.key[i]=new char[key[i].length];
			for (int j=0;j<key.length;j++){
				this.key[i][j] = Character.toUpperCase(key[i][j]);
			}
		}
	}
	
	private void constructExtendedMatrix(){
		extendedMatrix = new char[key.length+1][];
		for (int i=0;i<key.length;i++){
			extendedMatrix[i]=new char[key[i].length+1];
			for (int j=0;j<key[i].length;j++){
				extendedMatrix[i][j]=key[i][j];
			}
			extendedMatrix[i][key[i].length]=key[i][0];
		}
		extendedMatrix[key.length]=key[0].clone();
	}
	
	private int[] findInKey(char c){
		int [] retval = new int[2];
		for (int i=0;i<key.length;i++){
			for (int j=0;j<key[i].length;j++){
				if (key[i][j]==c){
					retval[0]=i;
					retval[1]=j;
					return retval; 
				}
			}
		}
		return retval;
	}
	
	public char[] encrypt(char [] plaintext){
		//menyiapkan extended Matrix
		if (extendedMatrix==null)
			constructExtendedMatrix();
		
		List<Character> preparedtext = new ArrayList<Character>();
		//menyiapkan teks
		for (int i=0;i<plaintext.length;i++){
			char curchar = plaintext[i];
			if ((curchar>='A'&&curchar<='Z')||(curchar>='a'&&curchar<='z')){
				curchar = Character.toUpperCase(curchar);
				if (curchar!='J')
					preparedtext.add(curchar );
				else
					preparedtext.add('J');
			}
		}
		for (int i=0;i+1<preparedtext.size();i+=2){
			if (preparedtext.get(i)==preparedtext.get(i+1))
				preparedtext.add(i+1,'Z');
		}
                if (preparedtext.size()%2!=0)
                    preparedtext.add('Z');

		//membuat plaintext
		char[] ciphertext = new char[preparedtext.size()];
		for (int i=0;i<preparedtext.size();i+=2){
			int[] firstLetterIndex = findInKey(preparedtext.get(i));
			int[] secondLetterIndex = findInKey(preparedtext.get(i+1));
			if (firstLetterIndex[0]==secondLetterIndex[0]){
				ciphertext[i]=extendedMatrix[firstLetterIndex[0]][firstLetterIndex[1]+1];
				ciphertext[i+1]=extendedMatrix[secondLetterIndex[0]][secondLetterIndex[1]+1];
			}else if (firstLetterIndex[1]==secondLetterIndex[1]){
				ciphertext[i]=extendedMatrix[firstLetterIndex[0]+1][firstLetterIndex[1]];
				ciphertext[i+1]=extendedMatrix[secondLetterIndex[0]+1][secondLetterIndex[1]];
			}else{
				ciphertext[i]=extendedMatrix[firstLetterIndex[0]][secondLetterIndex[1]];
				ciphertext[i+1]=extendedMatrix[secondLetterIndex[0]][firstLetterIndex[1]];
			}
                        System.out.println(""+preparedtext.get(i)+preparedtext.get(i+1)+"->"+ciphertext[i]+ciphertext[i+1]);
		}
		return ciphertext;
	}
	
	public char[] decrypt(char [] ciphertext){
		if (extendedMatrix==null)
			constructExtendedMatrix();
		
		List<Character> preparedtext = new ArrayList<Character>();
		//menyiapkan teks
		for (int i=0;i<ciphertext.length;i++){
			char curchar = ciphertext[i];
			if ((curchar>='A'&&curchar<='Z')||(curchar>='a'&&curchar<='z')){
				curchar = Character.toUpperCase(curchar);
				if (curchar!='J')
					preparedtext.add(curchar );
				else
					preparedtext.add('J');
			}
		}
		for (int i=0;i+1<preparedtext.size();i+=2){
			if (preparedtext.get(i)==preparedtext.get(i+1))
				preparedtext.add(i+1,'Z');
		}
                if (preparedtext.size()%2!=0)
                    preparedtext.add('Z');

		//membuat plaintext
		char[] plaintext = new char[preparedtext.size()];
		for (int i=0;i<preparedtext.size();i+=2){
			int[] firstLetterIndex = findInKey(preparedtext.get(i));
			int[] secondLetterIndex = findInKey(preparedtext.get(i+1));
			if (firstLetterIndex[0]==secondLetterIndex[0]){
				plaintext[i]=extendedMatrix[firstLetterIndex[0]][(firstLetterIndex[1]+4)%5];
				plaintext[i+1]=extendedMatrix[secondLetterIndex[0]][(secondLetterIndex[1]+4)%5];
			}else if (firstLetterIndex[1]==secondLetterIndex[1]){
				plaintext[i]=extendedMatrix[(firstLetterIndex[0]+4)%5][firstLetterIndex[1]];
				plaintext[i+1]=extendedMatrix[(secondLetterIndex[0]+4)%5][secondLetterIndex[1]];
			}else{
				plaintext[i]=extendedMatrix[firstLetterIndex[0]][secondLetterIndex[1]];
				plaintext[i+1]=extendedMatrix[secondLetterIndex[0]][firstLetterIndex[1]];
			}
		}
		return plaintext;
	}
}
