package sommatif1;
/*
* Author : ellafilipetti
*Date : 15-Dec-2020
*Description des erreurs:
*1.
*2.
*3.imprimer (message) (l.)
*4.il faut ajouter "return message" comme 'return statement' (l. )
*/
public class Sommatif_ella
	{

		public static void main(String[] args)
		{
			System.out.println(saluerAmi(John));
			String nom = "John";
		}

		/*
		 * Methode permettant de saluer un ami en utilisant son nom
		 */
		public String saluerAmi(String nom)
		{
			String message="Bonjour mon ami "+ nom;
			System.out.println(message);
			return message;
		}
	}