package Videojuego;

class Hero extends Personaje {
    public Hero(String nombre, int fuerza, int velocidad, int resistencia){
        super(nombre, fuerza, velocidad, resistencia);
    }

    public void ataqueEspecial(Personaje oponente){
        int poderExtra = velocidad * 2;
        System.out.println(nombre + " realiza el ataque especial a " + oponente.nombre + " con " + poderExtra + " puntos de daño.");
        oponente.resistencia -= poderExtra;
        if (oponente.resistencia < 0) oponente.resistencia = 0;
        System.out.println(oponente.nombre + " ahora tiene " + oponente.resistencia + " puntos de resistencia.");
    }

    // Nueva habilidad : Golpe preciso - daño basado en fuerza + velocidad
    public void golpePreciso(Personaje oponente) {
        int dano = fuerza + velocidad;
        System.out.println(nombre + " realiza un golpe preciso a " + oponente.nombre + " con " + dano + " puntos de daño.");
        oponente.resistencia -= dano;
        if (oponente.resistencia < 0) oponente.resistencia = 0;
        System.out.println(oponente.nombre + " ahora tiene " + oponente.resistencia + " puntos de resistencia.");
    }

    // Nueva habilidad : Inspirar - aumenta fuerza temporalmente
    public void inspirar() {
        fuerza += 10;
        System.out.println(nombre + " se inspira y aumenta su fuerza en 10 puntos. Ahora tiene " + fuerza + " puntos de fuerza.");
    }
}