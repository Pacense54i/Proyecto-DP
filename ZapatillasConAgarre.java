
/**
 * Write a description of class ZapatillasConAgarre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillasConAgarre extends Zapatillas
{

    /**
     * Constructor for objects of class ZapatillasConAgarre
     */
    public ZapatillasConAgarre(String model,double number,double value)
    {
        super(model,number,value);
    }
    
    @Override
    public double calcularValorSaque()
    {
        return super.calcularValorSaque();
    }
    
    @Override
    public double calcularValorResto()
    {
        return super.calcularValorResto()* 1.7;
    }
    
    /**
     * Muestra en pantalla los valores de la diferentes variables de la clase ZapatillasConAgarre
     * 
     * Con @Override se sobreescribe el metodo toString de la clase Zapatillas
     * @return devuelve una cadena (String) con lo que se quiere mostrar por pantalla
     */
    @Override
    public String toString()
    {
        return "       " + getClass().getName() + super.toString();
    }
}
