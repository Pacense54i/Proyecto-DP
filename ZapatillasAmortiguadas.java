
/**
 * Write a description of class Amortiguadas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillasAmortiguadas extends Zapatillas
{
    // instance variables - replace the example below with your own
    private String tipo;

    /**
     * Constructor for objects of class Amortiguadas
     */
    public ZapatillasAmortiguadas(String model,double number,double value,String type)
    {
        super( model, number, value);
        
        this.tipo = type;
    }

    
}
