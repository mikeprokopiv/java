//Task sleepIn

public boolean sleapIn (boolean weekday, boolean vacation) {
	if (weekday = false && vacation = false) {
		return true;		
	} else if (weekday = true && vacation = false) {
		return false;
	} else if (weekday = false && vacation = true) {
		return true;
}


//Correct one: 
public boolean sleapIn (boolean weekday, boolean vacation) {
if (!weekday || vacation) {
	return true;
} return false;



//Task diff21

public int diff21(int n) {
	if (n > 21) {
		return (n - 21) * 2;
	} else { 
		return 21-n;
	} 
}

//Task or35
public boolean or35(int n) {
	if (n>0 && n % 3 == 0 || n % 5 == 0) {
return true;		
	} return false;
}


