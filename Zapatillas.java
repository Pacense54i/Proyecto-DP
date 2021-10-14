
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
    private String tipo;
    private double valor; //valor numérico del agarre o amortiguación de las zapatillas
    private int numero;
    
    
    /**
     * Contructor de los objetos de la clase Zapatillas
     */
    public Zapatillas()
    {
        // initialise instance variables
        modelo = " ";
        tipo = " ";
        valor = 0;
        numero = 0;
    }
    
    /**
     * Constructor parametrizado para objetos de la clase Zapatilla
     */
    public Zapatillas(String model,String type, int value,int number)
    {
        modelo = model;
        tipo = type;
        valor = value;
        numero = number;
    }

    /**
     * Set model para especificar el modelo de la zapatillas
     * 
     * @param String model
     */
    public void setModelo(String model)
    {
        this.modelo = model;
    }
    
    /**
     * Devuelve el modelo actual
     * 
     * @return valor de la varible modelo(String)
     */
    public String getModelo()
    {
        return this.modelo;
    }
    
    
    /**
     * Set type para especificar tipo de las zapatillas
     * 
     * @param String type
     */
    public void setTipo(String type)
    {
        this.tipo = type;
    }
    
    /**
     * Devuelve el tipo actual
     * 
     * @return valor de la varible Tipo(String)
     */
    public String getTipo()
    {
        return this.tipo;
    }
    
    
    /**
     * Set value para especificar el valor de las zapatillas
     * 
     * @param double value
     */
    public void setValor(double value)
    {
        this.valor = value;
    }
    
    /**
     * Devuelve el valor actual
     * 
     * @return valor de la varible valor(int)
     */
    public double getValor()
    {
        return this.valor;
    }
    
    
    /**
     * Set num para especificar el numero de las zapatillas
     * 
     * @param int num
     */
    public void setNumero(int num)
    {
        this.numero = num;
    }
    
    /**
     * Devuelve el numero actual
     * 
     * @return valor de la varible numero(int)
     */
    public int getNumero()
    {
        return this.numero;
    }
    
    
    /**
     * Muestra en pantalla los valores de la diferentes variables
     */
    public void mostrarZapatillas()
    {
        System.out.println(" Zapatillas [" + 
        "Modelo=" + modelo + "," + "Numero=" + numero + "," + "Tipo=" + tipo + "," + "Valor " + valor + "," + "]");
    }
    
    /**
     * Devolve el valor de saque de las zapatillas
     * 
     * @return  variable resto multiplicado por 2 si la zapatilla
     *          es de tipo amortiguacion
     */
    public double calcularValorSaque()
    {
        double resto;
        resto = 0;
        
        if(tipo == "amortiguacion"){
            resto = valor * 2;
        }

        return resto;
    }
    
    /**
     * Devolve el valor de resto de las zapatillas
     * 
     * @return  variable resto multiplicado por 1.5 si la zapatilla
     *          es de tipo agarre
     */
    public double calcularValorResto()
    {
        double resto;
        resto = 0;
        
        if(tipo == "agarre"){
            resto = valor * 1.5;
        }
        
        return resto;
    }
}
