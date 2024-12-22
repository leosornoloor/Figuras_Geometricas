public class Main {
    public static void main(String[] args) {
        
        Rectangulo rectangulo = new Rectangulo(5, 4);
        Triangulo triangulo = new Triangulo(3, 6);
        Circulo circulo = new Circulo(7);

        System.out.println(rectangulo);
        System.out.println(triangulo);
        System.out.println(circulo);

        System.out.println("\nComparaciones:");
        System.out.println("El rectángulo tiene un área mayor que el triángulo: " + rectangulo.mayorQue(triangulo));
        System.out.println("El círculo tiene un área mayor que el rectángulo: " + circulo.mayorQue(rectangulo));
        System.out.println("El triángulo tiene un área mayor que el círculo: " + triangulo.mayorQue(circulo));
    }
}
