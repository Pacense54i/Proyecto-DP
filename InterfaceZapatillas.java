
/**
 * Write a description of class InterfaceZapatillas here.
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
     * @return devuelve el valor de la variable de la clase zapatillas ---> (int)
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
     * Muestra en pantalla los valores de la diferentes variables
     */
    public String toString ();
    
    /**
     * Devolve el valor de saque de las zapatillas
     * 
     * @return double resto: si el tipo de la zapatilla es amortiguacion la variable resto es multiplicado por 2 
     *                       si no duevuelve 0 
     */
    public double calcularValorSaque();
    
    /**
     * Devolve el valor de resto de las zapatillas
     * 
     * @return  double resto: si el tipo de la zapatilla es agarre la variable resto es multiplicado por 1,5
     *                       si no duevuelve 0 
     */
    public double calcularValorResto();
}