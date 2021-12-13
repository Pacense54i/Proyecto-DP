
/**
 * Write a description of interface InterfaceZapatillas2 here.
 * 
 * Interface en que incluye los metodos relacionados con calcular algo en este caso calcularValorSaque y calcularValorResto en la clase Zapatillas
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface InterfaceZapatillas2
{
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
