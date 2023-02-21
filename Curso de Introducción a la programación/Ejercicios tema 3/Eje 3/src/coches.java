public class coches {
    
    public static void main(String[] args) {
        coche miCoche = new coche();

        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();

        System.out.println(miCoche.puertas);
    }
}


class coche {
    public int puertas = 0;

    public void agregarPuertas () {
        this.puertas++;
    }
}