package Poli;

public class Main {
    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("GH67", "Ferrari", "A89");
        misVehiculos[1] = new VehiculoTurismo(4, "GH67", "Ferrari", "A89");
        misVehiculos[2] = new VehiculoDeportivo(500, "GH67", "Ferrari", "A89");
        misVehiculos[3] = new VehiculoFurgoneta(40, "GH67", "Ferrari", "A89");

        for (Vehiculo vehiculos : misVehiculos) {
            System.out.println(vehiculos.mostrarDatos());
            System.out.println(" ");
        }
    }
}
