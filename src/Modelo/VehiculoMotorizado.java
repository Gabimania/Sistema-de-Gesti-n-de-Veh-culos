package Modelo;

public class VehiculoMotorizado extends Vehiculo {

    private String tipo_combustible;

    public VehiculoMotorizado(String marca, String modelo, int ano_fabricacion, String tipo_combustible) {
        super(marca, modelo, ano_fabricacion);
        this.tipo_combustible = tipo_combustible;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public String mostrarDetalles(){
        return super.mostrarDetalles()+" Y su tipo de combustible es "+ tipo_combustible;

    }

    @Override
    public String toString() {
        return "VehiculoMotorizado{" +
                "tipo_combustible='" + tipo_combustible + '\'' +
                '}';
    }
}
