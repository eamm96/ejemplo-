import java.util.Scanner;
public class miclase {

	{
	
	}

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		String cadena;
		System.out.print("Ingrese una cadena: ");
		cadena=s.next();
		if(cadena.equals("prueba"))
		{
			System.out.print("es igual a prueba: ");
			}else
			{
				System.out.print("No es igual a prueba.");
			}
	}
	
}
