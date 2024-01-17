package Modelo;

public class Motocicleta extends Automovil{
    private String tipo_motocicleta;

    public Motocicleta(String marca, String modelo, int ano_fabricacion, String tipo_combustible, int numero_puertas, String tipo_motocicleta) {
        super(marca, modelo, ano_fabricacion, tipo_combustible, numero_puertas);
        this.tipo_motocicleta = tipo_motocicleta;
    }

    public String getTipo_motocicleta() {
        return tipo_motocicleta;
    }

    public void setTipo_motocicleta(String tipo_motocicleta) {
        this.tipo_motocicleta = tipo_motocicleta;
    }

    public String mostrarDetalles(){
        return super.mostrarDetalles()+ " y el tipo de motocicleta es " + tipo_motocicleta;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "tipo_motocicleta='" + tipo_motocicleta + '\'' +
                '}';
    }
}
