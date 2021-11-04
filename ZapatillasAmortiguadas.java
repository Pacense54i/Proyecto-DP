
/**
 * Write a description of class ZapatillasAmortiguadas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillasAmortiguadas extends Zapatillas
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class ZapatillasConAgarre
     */
    public ZapatillasAmortiguadas(String model,double number,double value)
    {
        super(model,number,value);
    }
    
    @Override
    public double calcularValorSaque()
    {
        double v = super.calcularValorSaque();
        v = v * 1.8;
        return v;
    }
    
    @Override
    public double calcularValorResto()
    {
        return super.calcularValorResto();
    }

}