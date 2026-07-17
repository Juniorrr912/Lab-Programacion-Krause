package EJ8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Escuela escuela = new Escuela(15);

        Tutor tutor1 = new Tutor("Carlos Pérez", "11223344");
        escuela.agregarAlumno(new Alumno("45000111", "Jose Sa", "5to", tutor1));
        escuela.agregarAlumno(new Alumno("46000222", "Santiago Rodríguez", "5to", null));


        System.out.print("\nIngrese el índice del alumno a consultar (0 o 1): ");
        try {
            int indice = Integer.parseInt(scanner.nextLine());
            Alumno al = escuela.getAlumnos().get(indice);
            System.out.println("Alumno encontrado: " + al);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error : La posición ingresada no existe en el registro.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número entero para el índice.");
        }

        Alumno primerAlumno = escuela.getAlumnos().get(0);
        System.out.print("\nCuántas inasistencias desea sumarle a " + primerAlumno.getNombreApellido() + ": ");
        try {
            String entrada = scanner.nextLine();
            int faltas = Integer.parseInt(entrada); 
            
            primerAlumno.registrarInasistencias(faltas); 
            System.out.println("Inasistencias actualizadas. Total: " + primerAlumno.getInasistencias());
            
        } catch (NumberFormatException e) {
            System.out.println("Error: El valor ingresado no es un número válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Terminado");
        }
        for (Alumno al : escuela.getAlumnos()) {
            try {
                System.out.print("Alumno: " + al.getNombreApellido() + " -> ");
                String datosTutor = al.getTutor().toString(); 
                System.out.println(datosTutor);
            } catch (NullPointerException e) {
                System.out.println("Error El alumno no posee un tutor registrado.");
            }
        }

        try {
            primerAlumno.registrarInasistencias(20); 
            escuela.inscribirAExamenEspecial(primerAlumno);
        } catch (AlumnoLibreException e) {
            System.out.println("Error" + e.getMessage());
        }

        scanner.close();
    }
}