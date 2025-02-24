//Nombre de la clase (UpperCamelCase)

public class Resta {

    // Atributos de la clase (lowerCamelCase)
    private int x, y;

    // Constructor vacio (UpperCamelCase)
    Resta() {
    }

    // Funcion para restar dos numeros (lowerCamelCase)
    public int getRestar() {
        return this.x - this.y;
    }

    // Metodo get (obtener) de x
    public int getX() {
        return x;
    }

    // Metodo set (asignar) de x
    public void setX(int x) {
        this.x = x;
    }

    // Metodo get (obtener) de y
    public int getY() {
        return y;
    }

    // Metodo set (asignar) de y
    public void setY(int y) {
        this.y = y;
    }

    // Metodo toString para mostrar los valores de x y y 
    @Override
    public String toString() {
        return "Resta [x=" + x + ", y=" + y + "]";
    }
}
