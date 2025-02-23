// Definición de la clase DivisionPOO

class DivisionPOO {

    // Declaración de dos atributos decimales
    double num;
    double num2;

    // Constructor vacío de la clase DivisionPOO
    DivisionPOO() {

    }

    // Método para calcular la division de los dos números
    public double calcularDivision() {
        return num / num2; // Retorna la division de num y num2
    }

    // Método getter para obtener el valor de num
    public double getNum() {
        return num;
    }

    // Método setter para asignar un valor a num
    public void setNum(double num) {
        this.num = num; // Asigna el valor recibido al atributo num
    }

    // Método getter para obtener el valor de num2
    public double getNum2() {
        return num2;
    }

    // Método setter para asignar un valor a num2
    public void setNum2(double num2) {
        this.num2 = num2; // Asigna el valor recibido al atributo num2
    }

} // Fin de la clase DivisionPOO
