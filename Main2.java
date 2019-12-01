//Warm up-2
public class Main2 {
	//stringTimes
	public String stringTimes (String str, int n) {
		String result="";
		for (int i=0; i<n; i++) {
			result+=str;
		} return result;
	}

	//frontTimes
	public String frontTimes (String str, int n) {
		String result="";
		for (int i=0; i<n; i++) {
			if (str.length()>=3) {
				result += str.substring(0,3);
			} else result +=str;
		} return result;
	}

	//countXX
	int countXX (String str) {
		int count = 0;
		for (int i=0; i<str.length()-1;i++){
			if (str.charAt(i)== 'x'){
				count++;
			}
		} return count;
	}



}