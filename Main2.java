package com.prokopim.java.warmup2;
//Warm up-2
public class Main2 {
	//stringTimes
	public String stringTimes (String str, int n) {
		String result="";
		for (int i=0; i<n; i++) {
			result+=str;
		}
		return result;
	}

	//frontTimes
	public String frontTimes (String str, int n) {
		String result = "";
		if (str.length() > 0) {
			for (int i = 0; i < n; i++) {
				if (str.length() >= 3) {
					result += str.substring(0, 3);
				} else {result += str;}
			}
			return result;
		}
		return str;
	}

	//countXX
	int countXX (String str) {
		int count = 0;
		if (str.length() > 0) {
			for (int i = 0; i < str.length() - 1; i++) {
				if (str.charAt(i) == 'x') {
					count++;
				}
			}
			return count;
		}
		return str;
	}



}