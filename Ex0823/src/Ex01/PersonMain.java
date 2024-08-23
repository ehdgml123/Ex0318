package Ex01;

public class PersonMain {

	public static void main(String[] args) {
		
		Preson ps = new Preson("이동희", 20);
		ps.in();
		ps.dde();
		
		System.out.println("-------------------------------------");
		
		SalesMain sa = new SalesMain("홀길동",20,"가방", 50);
		sa.by();
		sa.in();
		

	}

}
