
/**
 * Clase Zapatilla la cual incluye los metodos get y set de cada atributo y otros modulos necesarios
 * 
 * @author (Carlos Garcia Sanchez, Sergio Jimenez Macias, Alfonso David Recio Calderon) 
 * @version (1.0)
 */
public class Zapatillas
{
    // instance variables - replace the example below with your own
    private String modelo;
    private double valor; //valor numérico del agarre o amortiguación de las zapatillas
    private double numero;
    
    
    /**
     * Contructor de los objetos de la clase Zapatillas
     */
    public Zapatillas()
    {
        // initialise instance variables
        modelo = " ";
        valor = 0;
        numero = 0.0;
    }
    
    /**
     * Constructor parametrizado para objetos de la clase Zapatilla
     */
    public Zapatillas(String model,double number,double value)
    {
        modelo = model;
        valor = value;
        numero = number;
    }

    /**
     * Set model para especificar el modelo de la zapatillas
     * 
     * @param String model: modelo de la zapatilla.
     */
    public void setModelo(String model)
    {
        this.modelo = model;
    }
    
    /**
     * Devuelve el modelo actual
     * 
     * @return devuelve el valor de la varible modelo(String)
     */
    public String getModelo()
    {
        return this.modelo;
    }
    
    
    /**
     * Set value para especificar el valor de las zapatillas
     * 
     * @param double value: cambiar el valor de la variable de la clase zapatillas por value
     */
    public void setValor(double value)
    {
        this.valor = value;
    }
    
    /**
     * Devuelve el valor actual
     * 
     * @return devuelve el valor de la variable de la clase zapatillas ---> (int)
     */
    public double getValor()
    {
        return this.valor;
    }
    
    
    /**
     * Set num para especificar el numero de las zapatillas
     * 
     * @param int num: se cambia el valor de la variable Numero por num
     */
    public void setNumero(int num)
    {
        this.numero = num;
    }
    
    /**
     * Devuelve el numero actual
     * 
     * @return valor actual de la varible numero(int) de la clase Zapatillas
     */
    public double getNumero()
    {
        return this.numero;
    }
    
    
    /**
     * Muestra en pantalla los valores de la diferentes variables
     */
    @Override
    public String toString()
    {
        String cadena =" Zapatillas [" + 
        "Modelo=" + modelo + "," + "Numero=" + numero + "," + "Tipo="  + "," + "Valor " + valor + "," + "]";
        return cadena;
    }
    
    /**
     * Devolve el valor de saque de las zapatillas
     * 
     * @return double resto: si el tipo de la zapatilla es amortiguacion la variable resto es multiplicado por 2 
     *                       si no duevuelve 0 
     */
    public double calcularValorSaque()
    {
        double resto;
        resto = 0;
        
        // if(tipo.equals("amortiguacion")){
            // resto = this.getValor() * 1.8;
        // }
        // else{
            // resto = this.getValor() * 1.2;
        // }

        return resto;
    }
    
    /**
     * Devolve el valor de resto de las zapatillas
     * 
     * @return  double resto: si el tipo de la zapatilla es agarre la variable resto es multiplicado por 1,5
     *                       si no duevuelve 0 
     */
    public double calcularValorResto()
    {
        double resto;
        resto = 0;
        
        // if(tipo.equals("agarre")){
            // resto = this.getValor() * 1.7;
        // }
        // else{
            // resto = this.getValor() * 1.3;
        // }
        
        return resto;
    }
}
