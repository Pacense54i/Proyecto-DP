
/**
 * Write a description of class ZapatillasAmortiguadas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillasAmortiguadas extends Zapatillas
{
    
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
        return super.calcularValorSaque() * 1.8;
    }
    
    @Override
    public double calcularValorResto()
    {
        return super.calcularValorResto();
    }

}