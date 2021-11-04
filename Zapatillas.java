
/**
 * Clase Zapatilla la cual incluye los metodos get y set de cada atributo y otros modulos necesarios
 * 
 * @author (Carlos Garcia Sanchez, Sergio Jimenez Macias, Alfonso David Recio Calderon) 
 * @version (1.0)
 */
public class Zapatillas implements InterfaceZapatillas
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

    public void setModelo(String model)
    {
        this.modelo = model;
    }
    
    public String getModelo()
    {
        return this.modelo;
    }
    
    public void setValor(double value)
    {
        this.valor = value;
    }
    
    public double getValor()
    {
        return this.valor;
    }
    
    public void setNumero(int num)
    {
        this.numero = num;
    }
    
    public double getNumero()
    {
        return this.numero;
    }
    
    @Override
    public String toString()
    {
        String cadena =" Zapatillas [" + 
        "Modelo=" + modelo + "," + "Numero=" + numero + "," + "Valor " + valor + "," + "]";
        return cadena;
    }
    
    public double calcularValorSaque()
    {   
        double ValorDeSaque;
        ValorDeSaque= this.getValor() * 1.2;
        return ValorDeSaque;
    }
    
    public double calcularValorResto()
    {
        double ValorDeResto;
        ValorDeResto= this.getValor() * 1.3;
        return ValorDeResto;
    }
}
