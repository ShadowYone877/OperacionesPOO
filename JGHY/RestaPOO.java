// Definición de la clase RestaPOO

class RestaPOO {

    // Declaración de dos atributos enteros
    int num;
    int num2;

    // Constructor vacío de la clase RestaPOO
    RestaPOO() {

    }

    // Método para calcular la resta de los dos números
    public int calcularResta() {
        return num - num2; // Retorna la resta de num y num2
    }

    // Método getter para obtener el valor de num
    public int getNum() {
        return num;
    }

    // Método setter para asignar un valor a num
    public void setNum(int num) {
        this.num = num; // Asigna el valor recibido al atributo num
    }

    // Método getter para obtener el valor de num2
    public int getNum2() {
        return num2;
    }

    // Método setter para asignar un valor a num2
    public void setNum2(int num2) {
        this.num2 = num2; // Asigna el valor recibido al atributo num2
    }

} // Fin de la clase RestaPOO