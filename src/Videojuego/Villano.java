package Videojuego;

class Villano extends Personaje {
    public Villano(String nombre, int fuerza, int velocidad, int resistencia){
        super(nombre, fuerza, velocidad, resistencia);
    }

    public void hacerTrampa(Personaje oponente){
        int dobleAtaque = fuerza * 2;
        System.out.println(nombre + " hace trampa y ataca con el doble de fuerza: "+ dobleAtaque + " puntos de daño.");
        oponente.resistencia -= dobleAtaque;
        if (oponente.resistencia < 0) oponente.resistencia = 0;
        System.out.println(oponente.nombre + " ahora tiene " + oponente.resistencia + " puntos de resistencia.");
    }

    // Nueva habilidad: Engañar - reduce velocidad del oponente
    public void enganar(Personaje oponente) {
        oponente.velocidad -= 5;
        if (oponente.velocidad < 0) oponente.velocidad = 0;
        System.out.println(nombre + " engaña a " + oponente.nombre + " y reduce su velocidad en 5 puntos. Ahora tiene " + oponente.velocidad + " puntos de velocidad.");
    }

    // Nueva habilidad: Ataque masivo - daño alto pero se daña a sí mismo
    public void ataqueMasivo(Personaje oponente) {
        int dano = fuerza * 3;
        System.out.println(nombre + " realiza un ataque masivo a " + oponente.nombre + " con " + dano + " puntos de daño, pero se daña a sí mismo.");
        oponente.resistencia -= dano;
        if (oponente.resistencia < 0) oponente.resistencia = 0;
        this.resistencia -= 20;
        if (this.resistencia < 0) this.resistencia = 0;
        System.out.println(oponente.nombre + " ahora tiene " + oponente.resistencia + " puntos de resistencia.");
        System.out.println(nombre + " ahora tiene " + this.resistencia + " puntos de resistencia.");
    }
}