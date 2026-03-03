package ejercicios7Interfaces.ejercicio1;

public class IesSaladillo {

    int index = 0;

    public void run() {
	Persona[] personal = new Persona[15];

	insertPersonal(personal);
	// showOrder(personal);
	// showObjects(personal);
	Validate[] val = personal;
	processData(val);
	showObjects(personal);

    }

    public void insertPersonal(Persona[] personal) {

	personal[index] = new Alumno("Maria Espinosa");
	index++;
	personal[index] = new Alumno("Jose Valverde");
	index++;

	personal[index] = new Alumno("Juan Ruiz");
	index++;

	personal[index] = new Alumno("Pepe Perez");
	index++;

	personal[index] = new Alumno("Rosa Mancebo");
	index++;

	personal[index] = new Profesor("Eva Rojas", 1500);
	index++;

	personal[index] = new Profesor("Ana Mijas", 1700);
	index++;

	personal[index] = new Profesor("Javier Cuevas", 1200);
	index++;

    }

    public void showOrder(Persona[] personal) {

	for (int i = 0; personal[i] != null; i++) {

	    System.out.println(personal[i].numberType());
	}

    }

    public void showObjects(Persona[] personal) {

	for (int i = 0; personal[i] != null; i++) {
	    System.out.println(personal[i].toString());
	}

    }

    public void processData(Validate[] gestion) {

	for (int i = 0; gestion[i] != null; i++) {

	    gestion[i].validate();
	    if (gestion[i] instanceof GestionAlumno ga) {
		for (int j = 1; j <= i; j++) {
		    ga.registrarNota(2.5f * j);
		}

	    } else if (gestion[i] instanceof GestionProfesor gp) {

		gp.aumentarSueldo(10 * i);

	    }

	}

    }

}
