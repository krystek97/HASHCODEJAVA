package hashcode.sportcode.pl;

public class Firma 
{
	public static void main(String[] args)
	{
		Pracownik pracownik1 = new Pracownik(2000 , "Stefan") ;
		Pracownik pracownik2 = new Pracownik(3000 , "Jan") ; 
		
		System.out.println(pracownik1.hashCode());
		System.out.println(pracownik2.hashCode());
	}
}
