package ec.edu.intsuperior.modelo;

public class Empleado extends Persona {

    private double sueldo_bruto;

    public double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public void Mostrar() {
    }

    public void calcular_salario_neto() {
    }
    @Override
    public String toString() {
        return "sueldobruto: "
                + "el sueldo del empleado es: \n" +getSueldo_bruto();
}
}