


public class mainClass {
	static SQL s = new SQL();
	public static void main(String [] args) {
		s.deletDatabases();
		s.createDatabases();
		
		s.insertArt("Vogel", "dort", "sirus");
		s.insertTier("lon","1982","mänlich", "1984", "1988", "ars", "Vogel");
		s.selectTiere();
		//s.insert();
		//(s.insertTier("lon","1982","mänlich", "1984", "1988", "", "");
		//s.insertTier("luis","1982","mänlich", "1984", "1988", "", "");
		//System.out.println(s.selectTiere());
		//s.insertFutter("Banane");
		//s.insertFutter("Banan");
		//s.insertFutter("Bnane");
		//s.selectFutter();
		//String [] arr = new String[2];
		//arr=s.selectFutter();
		//for (String Element : arr){
		//System.out.println(Element);
		//}
		//System.out.println("blablabla   \n     blabla");
		
	}
	
	

}
