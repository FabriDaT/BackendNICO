package Clase9;

public class Main {
    public static void main(String[] args) {
        FlyweightRopa fly = new FlyweightRopa();
        Ropa prenda1 = fly.getRopa("XS", "pantalon", false, false);
        Ropa prenda2 = fly.getRopa("XS", "pantalon", false, false);
        Ropa prenda3 = fly.getRopa("XS", "pantalon", false, false);
        Ropa prenda4 = fly.getRopa("L", "pantalon", true, true);
        Ropa prenda5 = fly.getRopa("L", "pantalon", true, true);
        Ropa prenda6 = fly.getRopa("M", "remeras", true, true);
        Ropa prenda7 = fly.getRopa("M", "remeras", true, true);

        System.out.println(fly.getRopaHashmap().values());
        System.out.println(fly.getContador());

    }
}
