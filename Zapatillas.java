
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
    
    private int ESUNAPRUEBA123456;
    //hola carlosbdsvubdv
    
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
     * Set model to specify the modelo of the zapatillas
     */
    public void setModelo(String model)
    {
        modelo = model;
    }
    
    /**
     * Return the current modelo
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
     * Return the current tipo
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
     * Return the current valor
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
     * Return the current numero
     */
    public int getNumero()
    {
        return numero;
    }
    
    
    /**
     * Show in screen the values stored in instance variables
     */
    public void show()
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
