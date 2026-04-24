package main;

public class Main {
    public static void main(String[] args) {

        Vehiculo V1 = new Auto("ABC123", "Ford");
        Vehiculo V2 = new Auto("DEF456", "Ford");
        Vehiculo V3 = new Auto("GHI789", "Chevrolet");
        Vehiculo V4 = new Auto("JKL012", "Lamborghini");
        Vehiculo V5 = new Auto("MNO345", "Ferrari");

        Vehiculo V6 = new Moto("PQR678", "Yamaha");
        Vehiculo V7 = new Moto("STU901", "Honda");
        Vehiculo V8 = new Moto("VWX234", "Honda");
        Vehiculo V9 = new Moto("YZA567", "Suzuki");
        Vehiculo V10 = new Moto("BCD890", "Ducati");

        Vendedor VA = new Vendedor("Junior");
        Vendedor VB = new Vendedor("Joako");
        Vendedor VC = new Vendedor("Chego");

        VA.agregarVehiculo(V9);
        VA.agregarVehiculo(V1);
        VA.agregarVehiculo(V2);

        VB.agregarVehiculo(V8);
        VB.agregarVehiculo(V3);
        VB.agregarVehiculo(V6);
        VB.agregarVehiculo(V4);

        VC.agregarVehiculo(V7);
        VC.agregarVehiculo(V10);
        VC.agregarVehiculo(V5);

        VA.mostrar();
        VB.mostrar();
        VC.mostrar();
    }
}