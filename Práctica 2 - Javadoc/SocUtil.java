/**
 * Clase utilitaria con diversas funciones matemáticas.
 * @author OtroAutor
 * @version 2.0
 */
public class SocUtil {
    /**
     * Determina si un número es capicúa.
     * @deprecated Este método está obsoleto desde la versión 1.35 y ha sido reemplazado por {@link #esCapikua(int)}.
     * @param numero Número a comprobar.
     * @return Verdadero si el número es capicúa; falso en caso contrario.
     * @throws EsNegatiuEX Lanza una excepción si el número es negativo.
     */
    @Deprecated
    public static boolean esCapicua(int numero) throws EsNegatiuEX {
        // Método desactualizado, consulte la documentación para utilizar la versión actualizada.
        throw new UnsupportedOperationException("Este método está obsoleto. Utilice esCapikua(int) en su lugar.");
    }

    /**
     * Determina si un número es capicúa.
     * @param numero Número a comprobar.
     * @return Verdadero si el número es capicúa; falso en caso contrario.
     * @throws EsNegatiuEX Lanza una excepción si el número es negativo.
     */
    public static boolean esCapikua(int numero) throws EsNegatiuEX {
        // Algoritmo: Convierte el número en cadena, inviértela y compara con la original.
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        String cadNum = Integer.toString(numero);
        String numAlReves = new StringBuilder(cadNum).reverse().toString();
        return cadNum.equals(numAlReves);
    }

    /**
     * Determina si un número es primo.
     * @param numero Número a comprobar.
     * @return Verdadero si el número es primo; falso en caso contrario.
     * @throws EsNegatiuEX Lanza una excepción si el número es negativo.
     */
    public static boolean esPrimo(int numero) throws EsNegatiuEX {
        // Algoritmo: Comprueba los divisores hasta la mitad del número.
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        int limite = numero / 2 + 1;
        int div = 2;
        while (div < limite) {
            if (numero % div == 0) {
                return false;
            }
            div++;
        }
        return true;
    }

    /**
     * Calcula el factorial de un número.
     * @param numero Número del cual se quiere calcular el factorial.
     * @return Factorial del número dado.
     * @throws EsNegatiuEX Lanza una excepción si el número es negativo.
     * @see EsNegatiuEX
     * @see <a href="http://www.sangakoo.com/es/temas/el-factorial-de-un-numero" target="_blank">Sangaku Maths</a>
     */
    public static long getFactorial(int numero) throws EsNegatiuEX {
        // Algoritmo: Multiplica sucesivamente los números hasta llegar a 1.
        if (numero < 0) {
            throw new EsNegatiuEX("no se puede calcular el factorial de un número negativo");
        }
        long fact = 1L;
        while (numero > 1) {
            fact *= numero;
            numero--;
        }
        return fact;
    }
}
