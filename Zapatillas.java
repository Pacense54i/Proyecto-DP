
/**
 * Write a description of class Zapatillas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zapatillas
{
    // instance variables - replace the example below with your own
    private String modelo;
    private String tipo;
    private int valor; //valor numérico del agarre o amortiguación de las zapatillas
    private int numero;
    
    
    /**
     * Constructor for objects of class Zapatillas
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
     * Set model to specify the modelo of the zapatillas
     */
    public void setModelo(String model)
    {
        modelo = model;
    }
    
    /**
     * Devuelve el modelo actual
     */
    public String getModelo()
    {
        return modelo;
    }
    
    
    /**
     * Set type to specify the tipo of the zapatillas
     */
    public void setTipo(String type)
    {
        tipo = type;
    }
    
    /**
     * Devuelve el tipo actual
     */
    public String getTipo()
    {
        return tipo;
    }
    
    
    /**
     * Set type to specify the tipo of the zapatillas
     */
    public void setValor(int value)
    {
        valor = value;
    }
    
    /**
     * Devuelve el valor actual
     */
    public int getValor()
    {
        return valor;
    }
    
    
    /**
     * Set num to specify the numero of the zapatillas
     */
    public void setNumero(int num)
    {
        numero = num;
    }
    
    /**
     * Devuelve el numero actual
     */
    public int getNumero()
    {
        return numero;
    }
    
    
    /**
     * Muestra en pantalla los valores de la diferentes variables
     */
    public void showZapatillas()
    {
        System.out.println(modelo);
        System.out.println(tipo);
        System.out.println(valor);
        System.out.println(numero);
    }
    
    /**
     * Devolve el valor de saque de las zapatillas
     */
    public int calcularValorSaque()
    {
        int resto;
        resto = 0;
        
        if(tipo == "amortiguacion"){
            resto = valor * 2;
        }

        return resto;
    }
    
    /**
     * Devolve el valor de resto de las zapatillas
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
