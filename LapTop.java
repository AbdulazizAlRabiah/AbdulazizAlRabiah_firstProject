
public class LapTop extends Equipment {
private String h;

public LapTop(int k, String h) {
	super(k);
	this.h = h;
}

public LapTop(LapTop e) {
	super(e);
	this.h = e.h;
}

}
