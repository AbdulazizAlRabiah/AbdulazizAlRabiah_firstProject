import java.io.*;

public class Lab {

	private String name;
	private String location;
	private Equipment [] arrEq;
	private int nbEq;
	
	public Lab(String name, String loc) {
		this.name = name;
		this.location = loc;
		arrEq = new Equipment[15];
		nbEq = 0;
	}
	
	public void addEquipment(Equipment e) {
		try {
			if (e instanceof Printer) {
				arrEq[nbEq] = new Printer ( (Printer) e);
				nbEq++;
			}
			else if (e instanceof LapTop) {
				arrEq[nbEq] = new LapTop ( (LapTop) e);
				nbEq++;
			} else {
				arrEq[nbEq] = new Equipment (e);
				nbEq++;
			}
				
		}   catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Error the array is full.");
		}
		
	}
	
	public void SaveLaptops(String fileName) throws IOException {
		File f = new File(fileName);
		FileOutputStream f1 = new FileOutputStream(f);
		ObjectOutputStream f2 = new ObjectOutputStream(f1);
		try {
		for (int i = 0; i<nbEq; i++) {
			if(arrEq[i] instanceof LapTop) {
				f2.writeObject( arrEq[i] );
			}
		} 
		} catch (IOException e) {
			System.out.println("Error to save File");
			
		}
		f2.close();
	}
	
	public void readAddPrinters(String fileName) throws IOException,ArrayIndexOutOfBoundsException, ClassNotFoundException {
		File s = new File(fileName);
		FileInputStream s1 = new FileInputStream(s);
		ObjectInputStream s2 = new ObjectInputStream(s1);
		try {
		for (int i = 0; i<nbEq; i++) {
		if (s2.readObject() instanceof Printer ) {
			arrEq[i] = (Printer) s2.readObject();
			nbEq++;
		}
		}
			
		}catch(IOException e) {
			System.out.println("Error to read File");
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error the array is full.");
		}catch (ClassNotFoundException e) {
			System.out.println("Error class wasn't found");
		}
		
		s2.close();
	}
	
	public int getNbPrinters(int s) throws Exception {
		try {
		if (s < 15) {
			throw new Exception();
		}
		}catch (Exception e) {
			System.out.println("The speed must be greater than 15");
			return -1;
		}
		
		int total = 0;
		
		for (int i =0; i<nbEq; i++) {
			if ( ( (Printer) arrEq[i]).getSpeed() > s && arrEq[i] instanceof Printer  ) {
				total++;
			}
		}
		return total;
	}
	
	public Printer [] getPrinters(int s) {
		Printer [] p = new Printer[arrEq.length];
		int j = 0;
		for (int i =0;i<nbEq;i++) {
			if(arrEq[i] instanceof Printer && ( (Printer) arrEq[i]).getSpeed() > s) {
				p[j] = (Printer) arrEq[i];
				j++;
			}
		}
		
		Printer [] p2 = new Printer[j];
		for (int i = 0;i<j;i++) {
			p2[i] = p[i];
		}
		return p2;
		
	}
	
}
