package ej1;
public class HerramientaManual extends Herramienta {
    private String tipoEmpuñadura;

    public HerramientaManual(int codigo, String marca, String tipoEmpuñadura) {
        super(marca, codigo);
        this.tipoEmpuñadura = tipoEmpuñadura;
    }

    @Override
    public void operar() {
        usar();
        System.out.println("Empuñadura: " + tipoEmpuñadura);
        devolver();
    }
}
