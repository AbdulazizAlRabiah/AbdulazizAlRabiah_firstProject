
public class Printer extends Equipment {
private int speed;

public Printer(int k, int l) {
	super(k);
	speed = l;
}

public Printer(Printer e) {
	super(e);
	this.speed = e.speed;
}

public int getSpeed() {
	return speed;
}
}
