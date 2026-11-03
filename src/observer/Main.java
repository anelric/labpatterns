package observer;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String args[]){
		//cambia el programa principal para crear 2 pacientes Covid19Pacient con sus interfaces
		//PacientSymptomGUI y PacientObserverGUI.

		Covid19Pacient pacient=new Covid19Pacient("aitor", 35);
		new PacientObserverGUI (pacient);
		new PacientSymptomGUI (pacient);
	}


}
