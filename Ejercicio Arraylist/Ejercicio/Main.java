package ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("5°2°");

        Estudiante e1 = new Estudiante("Juan Suarez", "45123456", 8.5);
        Estudiante e2 = new Estudiante("Lionel Messi", "46789123", 9.2);
        Estudiante e3 = new Estudiante("Quiero Queque", "44556677", 7.0);

        curso.inscribir(e1);
        curso.inscribir(e2);
        curso.inscribir(e3);

        System.out.println("Cantidad de alumnos: " + curso.cantidadAlumnos());
        
        curso.darDeBaja(1);
        System.out.println("Se dio de baja al segundo alumno");

        curso.listarAlumnos();
        
        System.out.println("Cantidad final de alumnos: " + curso.cantidadAlumnos());
    }
}
