
/**
 * Write a description of class ConAgarre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillasConAgarre extends Zapatillas
{
    // instance variables - replace the example below with your own
    private String tipo;

    /**
     * Constructor for objects of class ConAgarre
     */
    public ZapatillasConAgarre(String model,double number,double value, String type)
    {
        super( model, number, value);

        this.tipo = type;
    }

    /**
     * Devuelve el numero actual
     * 
     * @return valor actual de la varible numero(int) de la clase Zapatillas
     */
    public String getTipo()
    {
        return this.tipo;
    }
    
    /**
     * Devuelve el numero actual
     * 
     * @return valor actual de la varible numero(int) de la clase Zapatillas
     */
    public void setTipo(String type)
    {
         this.tipo = type;
    }
}
