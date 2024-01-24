/**
 * Excepción personalizada para valores negativos.
 * @author OtroAutor
 * @version 2.0
 */
public class EsNegatiuEX extends Exception {
    /**
     * Constructor sin parámetros que establece el mensaje por defecto.
     */
    public EsNegatiuEX() {
        super("el valor no puede ser negativo");
    }

    /**
     * Constructor con parámetros que permite establecer un mensaje personalizado.
     * @param msg Mensaje de error personalizado.
     */
    public EsNegatiuEX(String msg) {
        super(msg);
    }
}

