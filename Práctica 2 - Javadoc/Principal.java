/**
 * Aplicación principal que demuestra el uso de las funciones de la clase SocUtil
 * para determinar si un número es capicúa, primo o para calcular el factorial.
 * @author OtroAutor
 * @version 2.0
 */
public class Principal {
    /**
     * Método principal que muestra algunos ejemplos de uso de las funciones de la clase SocUtil.
     * @param args Argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        try {
            System.out.println("12345 es capicúa: " + SocUtil.esCapikua(12345));
            System.out.println("1221 es capicúa: " + SocUtil.esCapicua(1221));
            System.out.println("1234321 es capicúa: " + SocUtil.esCapikua(1234321));
        } catch (EsNegatiuEX ex) {
            // Manejo de la excepción en caso de que el número sea negativo.
        }
    }
}
