//Nombre de la clase (UpperCamelCase)

public class Division {

    // Atributos de la clase (lowerCamelCase)
    private double x, y;

    // Constructor vacio (UpperCamelCase)
    public Division() {
    }

    // Funcion para dividir dos numeros (lowerCamelCase)
    public double getDividir() {
        return this.x / this.y;
    }

    // Metodo get (obtener) de x
    public double getX() {
        return x;
    }

    // Metodo set (asignar) de x
    public void setX(double x) {
        this.x = x;
    }

    // Metodo get (obtener) de y
    public double getY() {
        return y;
    }

    // Metodo set (asignar) de y
    public void setY(double y) {
        this.y = y;
    }

    // Metodo toString para mostrar los valores de x y y 
    @Override
    public String toString() {
        return "Division [x=" + x + ", y=" + y + "]";
    }
}
