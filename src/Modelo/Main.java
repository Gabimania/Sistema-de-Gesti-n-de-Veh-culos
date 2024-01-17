package Modelo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Vehiculo coche = new Vehiculo("Peugeot", "206", 1998);
        System.out.println(coche.mostrarDetalles());
        VehiculoMotorizado carro = new VehiculoMotorizado("Seat", "Leon", 2012, "diesel");
        System.out.println(carro.mostrarDetalles());
        Automovil auto = new Automovil("Toyota", "Auris", 2023, "gasolina",4);
        System.out.println(auto.mostrarDetalles());
        Motocicleta moto = new Motocicleta("Honda", "Escóter", 2015,"diesel",0, " deportiva");
        System.out.println(moto.mostrarDetalles());

    }

}