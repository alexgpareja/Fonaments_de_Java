
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Curs curs = new Curs("Fonaments de la programació");
		
		AlumneNacional alumne1 = new AlumneNacional(1, "Marc", "12345678A");
		AlumneNacional alumne2 = new AlumneNacional(2, "Laia", "98765432B");
		AlumneErasmus alumne3 = new  AlumneErasmus(3, "Peter", "ABC123456");
		AlumneErasmus alumne4 = new  AlumneErasmus(4, "Kate", "DEF654321");
		
		curs.insertaAlumne(alumne1);
		curs.insertaAlumne(alumne2);
		curs.insertaAlumne(alumne3);
		curs.insertaAlumne(alumne4);
		
		curs.mostraNomAlumnes();
		
		alumne1.insertarNota(1);
		alumne1.insertarNota(3);
		alumne1.insertarNota(5);
		alumne1.insertarNota(7);
		alumne1.insertarNota(9);
		
		alumne2.insertarNota(2);
		alumne2.insertarNota(4);
		alumne2.insertarNota(6);
		alumne2.insertarNota(8);
		alumne2.insertarNota(10);
		
		alumne3.insertarNota(1);
		alumne3.insertarNota(2);
		alumne3.insertarNota(5);
		alumne3.insertarNota(6);
		alumne3.insertarNota(9);
		alumne3.insertarNota(10);
		
		alumne4.insertarNota(3);
		alumne4.insertarNota(4);
		alumne4.insertarNota(7);
		alumne4.insertarNota(8);

		System.out.println(alumne1.presentarse());
		System.out.println(alumne2.presentarse());
		System.out.println(alumne3.presentarse());
		System.out.println(alumne4.presentarse());
		
		curs.eliminaAlumne(0); //el id de marc es uno pero su posicion en el array es 0!!!
		alumne3.setNom("Jason");
		curs.mostraNomAlumnes();
	}

}
