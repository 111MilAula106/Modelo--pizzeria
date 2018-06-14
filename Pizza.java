/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mar
 */
public class Pizza
{
    private String nombre;
    private String tipo;
    private String variedad;
    private int tamanio;
    private double precioUnitario;

    public Pizza(String nombre, String tipo, String variedad, int tamanio)
    {
	this.nombre = nombre;
	this.tipo = tipo;
	this.variedad = variedad;
	this.tamanio = tamanio;
    }

    
    
    
    public String getNombre()
    {
	return nombre;
    }

    public void setNombre(String nombre)
    {
	this.nombre = nombre;
    }

    public String getTipo()
    {
	return tipo;
    }

    public void setTipo(String tipo)
    {
	this.tipo = tipo;
    }

    public String getVariedad()
    {
	return variedad;
    }

    public void setVariedad(String variedad)
    {
	this.variedad = variedad;
    }

    public int getTamanio()
    {
	return tamanio;
    }

    public void setTamanio(int tamanio)
    {
	this.tamanio = tamanio;
    }

    public double getPrecioUnitario()
    {
	return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario)
    {
	this.precioUnitario = precioUnitario;
    }
    
    
    
}
