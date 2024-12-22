public class Circulo extends FiguraGeometrica {
    private double radio;
    private final double PI = 3.1416;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Círculo [Radio = " + radio + ", Área = " + calcularArea() + "]";
    }
}
