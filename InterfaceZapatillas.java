
/**
 * Write a description of class InterfaceZapatillas here.
 * 
 * Interface en que incluye los metodos set, get y toString de cada atributo de la clase Zapatillas
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface InterfaceZapatillas
{
    
    /**
     * Set model para especificar el modelo de la zapatillas
     * 
     * @param String model: modelo de la zapatilla.
     */
    public void setModelo(String model);
    
    /**
     * Devuelve el modelo actual
     * 
     * @return devuelve el valor de la varible modelo(String)
     */
    public String getModelo();
    
    /**
     * Set value para especificar el valor de las zapatillas
     * 
     * @param double value: cambiar el valor de la variable de la clase zapatillas por value
     */
    public void setValor(double value);
    
    /**
     * Devuelve el valor actual
     * 
     * @return devuelve el valor de la variable valor(double) de la clase zapatillas 
     */
    public double getValor();
    
    /**
     * Set num para especificar el numero de las zapatillas
     * 
     * @param int num: se cambia el valor de la variable Numero por num
     */
    public void setNumero(int num);
    
    /**
     * Devuelve el numero actual
     * 
     * @return valor actual de la varible numero(int) de la clase Zapatillas
     */
    public double getNumero();
    
    /**
     * Muestra en pantalla los valores de la diferentes variables de la clase Zapatillas
     * 
     * Con @Override se sobreescribe el metodo toString de la clase Object
     */
    public String toString ();
    
}