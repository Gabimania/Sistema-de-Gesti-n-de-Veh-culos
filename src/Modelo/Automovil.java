package Modelo;

public class Automovil extends VehiculoMotorizado{
    private int numero_puertas;

    public Automovil(String marca, String modelo, int ano_fabricacion, String tipo_combustible, int numero_puertas) {
        super(marca, modelo, ano_fabricacion, tipo_combustible);
        this.numero_puertas = numero_puertas;
    }

    public int getNumero_puertas() {
        return numero_puertas;
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    public String mostrarDetalles(){
        return  super.mostrarDetalles()+ " Este coche tiene "+ numero_puertas+ " puertas";

    }

    @Override
    public String toString() {
        return "Automovil{" +
                "numero_puertas=" + numero_puertas +
                '}';
    }
}
