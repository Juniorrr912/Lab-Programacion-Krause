package ej9;

public class Main {

    public static void realizarSoundcheck(Cantante cantante) throws EspectaculoCortoException {
        if (cantante.getCantidadCanciones() < 5) {
            throw new EspectaculoCortoException("El show de " + cantante.getNombre() 
                    + " es muy corto, solo tiene " + cantante.getCantidadCanciones() + " canciones.");
        }
        System.out.println(" Soundcheck exitoso para " + cantante.getNombre());
    }

    public static void main(String[] args) {
        String[][] datosCantantes = {
            {"Taylor Swift", "Pop", "1500000", "18", "Tree Paine"},
            {"Bad Bunny", "Reggaeton", "RECHAZADO", "12", "Noah Assad"}, 
            {"Coldplay", "Rock", "1200000", "3", "Phil Harvey"},        
            {"Duki", "Trap", "500000", "14", null}                    
        };

        for (int i = 0; i < datosCantantes.length; i++) {
            String[] fila = datosCantantes[i];
            System.out.println("\nProcesando artista " + (i + 1) + ": " + fila[0]);

            try {
                int cachet = Integer.parseInt(fila[2]); 
                int canciones = Integer.parseInt(fila[3]);
                
                Cantante artista = new Cantante(fila[0], fila[1], cachet, canciones, fila[4]);
                
                if (artista.getManager() == null) {
                    throw new NullPointerException("El artista " + artista.getNombre() + " no tiene un manager registrado.");
                } else {
                    System.out.println(" Manager de " + artista.getNombre() + ": " + artista.getManager().toUpperCase());
                }

                realizarSoundcheck(artista);

                artista.asignarEscenario("Escenario Principal Main Stage");
                artista.liquidarHonorarios(21.0);

            } catch (NumberFormatException e) {
                System.out.println(" ERROR DE DATOS: Formato numérico inválido en los datos de origen " + e.getMessage() + ".");
            } catch (NullPointerException e) {
                System.out.println(" CONTROL DE NULOS: " + e.getMessage());
            } catch (EspectaculoCortoException e) {
                System.out.println(" EXCEPCIÓN DEL SHOW: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(" ERROR DE ARGUMENTO: " + e.getMessage());
            } finally {
                System.out.println(" Terminado.");
            }
        }
    }
}