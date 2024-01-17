package Modelo;

public class Vehiculo {
private String marca;
private String modelo;
private int ano_fabricacion;

    public Vehiculo(String marca, String modelo, int año_fabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fabricacion = año_fabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño_fabricacion() {
        return ano_fabricacion;
    }

    public void setAño_fabricacion(int año_fabricacion) {
        this.ano_fabricacion = año_fabricacion;
    }

    public String mostrarDetalles(){
        return "Este vehículo es de la marca "+marca+ " del modelo "+ modelo +", que fue fabricado en el año "+ ano_fabricacion;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano_fabricacion=" + ano_fabricacion +
                '}';
    }
}
