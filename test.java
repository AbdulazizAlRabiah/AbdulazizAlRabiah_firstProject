
public class test {

	public static void main(String[] args) throws Exception {
		Lab l = new Lab("aziz", "Riyadh");
		Printer p = new Printer(200, 78);
		l.addEquipment(p);
		
		LinkedListOfLabs k = new LinkedListOfLabs();
		k.insertAtFront(l);
		System.out.println(k.countLabs(77));
		
		System.out.println(l.getNbPrinters(71));
		
	}

}
