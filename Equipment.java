
public class Equipment {
private int k;

public Equipment(int k) {
	this.k = k;
}

public Equipment(Equipment e) {
	this.k = e.k;
	
}

public int getK() {
	return k;
}

public void setK(int k) {
	this.k = k;
}
}
