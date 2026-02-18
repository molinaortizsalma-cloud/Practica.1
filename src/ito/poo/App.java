package ito.poo;

public class App {
    static Mascota mascota;

    static void run() {
        mascota = new Mascota("Sturn", 2, "perro", "chihuahua");
        System.out.println(mascota);
        mascota.cumpleaños();
        System.out.println("despues de cumplir años:" + mascota);
    }

    public static void main(String[] args) {
        run();
    }


}


