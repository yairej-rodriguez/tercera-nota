package Videojuego;

public class Personaje {
    String nombre;
    int fuerza;
    int velocidad;
    int resistencia;
    
    public Personaje(String nombre, int fuerza, int velocidad, int resistencia) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.resistencia = resistencia;
    }

    public void atacar(Personaje oponente) {
        System.out.println(nombre + " ataca a " + oponente.nombre + " con una fuerza de " + fuerza + " puntos.");
        oponente.resistencia -= fuerza;
        if (oponente.resistencia < 0)
            oponente.resistencia = 0;

        System.out.println(oponente.nombre + " ahora tiene " + oponente.resistencia + " puntos de resistencia.");
    }

    public void mostrarEstadisticas() {
        System.out.println("\n--- Estadísticas de " + nombre + " ---");
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Resistencia: " + resistencia);
        System.out.println("-------------------------------------\n");
        // Asegurar que se imprima inmediatamente
        System.out.flush();
    }

    public void recuperarse(){
        resistencia += 20;
        System.out.println(nombre + " se ha recuperado y ahora tiene "+ resistencia + " puntos de resistencia.");
    }
}
