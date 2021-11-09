
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

}
