/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;

/**
 *
 * @author Mar
 */
public class Pedido
{
    private Date fechaCreacion;
    private Date fechaEntrega;
    private String nombreCliente;
    private int nroPedido;
    private Factura miFactura;
    private boolean estadoFactura; //esta cobrada?
    
    private ArrayList<Pizza> detallePedido; 

    public Pedido(String nombreCliente)
    {
	this.nombreCliente = nombreCliente;
    }

    public Date getFechaCreacion()
    {
	return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion)
    {
	this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaEntrega()
    {
	return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega)
    {
	this.fechaEntrega = fechaEntrega;
    }

    public String getNombreCliente()
    {
	return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente)
    {
	this.nombreCliente = nombreCliente;
    }

    public int getNroPedido()
    {
	return nroPedido;
    }

    public void setNroPedido(int nroPedido)
    {
	this.nroPedido = nroPedido;
    }

    public Factura getMiFactura()
    {
	return miFactura;
    }

    public void setMiFactura(Factura miFactura)
    {
	this.miFactura = miFactura;
    }

    public boolean isEstadoFactura()
    {
	return estadoFactura;
    }

    public void setEstadoFactura(boolean estadoFactura)
    {
	this.estadoFactura = estadoFactura;
    }

    public ArrayList<Pizza> getDetallePedido()
    {
	return detallePedido;
    }

    public void setDetallePedido(ArrayList<Pizza> detallePedido)
    {
	this.detallePedido = detallePedido;
    }
    
    
    
}
