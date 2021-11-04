
/**
 * Write a description of class ZapatillasConAgarre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillasConAgarre extends Zapatillas
{
    // instance variables - replace the example below with your own

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
        double j = super.calcularValorResto();
        j = j * 1.7;
        return j;
    }

}
