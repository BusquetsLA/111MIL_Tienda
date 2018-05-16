/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas.proveedores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import modelos.DetallePedido;
import modelos.EstadoPedido;
import modelos.Factura;
import modelos.Pedido;
import modelos.Pizza;
import modelos.TamanioPizza;
import modelos.TipoPizza;
import modelos.VariedadPizza;


/**
 *
 * @author utku38
 */
public class PedidosFalsos implements PedidosParaEstadisticas{
    
    private EstadoPedido estadoParatodos = new EstadoPedido();
    private Factura facturaParaTodos = new Factura();
    
    private Pizza miPizza = new Pizza("mazaG", 189.22f, new TamanioPizza(12, "grande"), new TipoPizza("dsfasdfsd", "Horno"), new VariedadPizza("sdfsdfgfdsf", "Muzzarella"));
    private Pizza miPizza2 = new Pizza("Especial", 170.5f, new TamanioPizza(8 , "mediana"), new TipoPizza("askd", "Piedra"), new VariedadPizza("kajsdjkas", "Anana"));
        
    private List<VariedadPizza> variedades = Arrays.asList(
              new VariedadPizza("askjdkj", "Muzzarella"),
              new VariedadPizza("asdsaasd", "Anana"),
              new VariedadPizza("sjakdkajsd", "A"),
              new VariedadPizza("sjakdkajsd", "Especial"),
              new VariedadPizza("sjakdkajsd", "B"),
              new VariedadPizza("sjakdkajsd", "C"),
              new VariedadPizza("sjakdkajsd", "D"),
              new VariedadPizza("sjakdkajsd", "E"),
              new VariedadPizza("sjakdkajsd", "F"),
              new VariedadPizza("sjakdkajsd", "G"),
              new VariedadPizza("sjakdkajsd", "H"),
              new VariedadPizza("sjakdkajsd", "I"),
              new VariedadPizza("sjakdkajsd", "J"));
    
    private List<TipoPizza> tiposDePizza = Arrays.asList(
            new TipoPizza ("kajada", "Horno"), 
            new TipoPizza ("kajada", "Piedra"), 
            new TipoPizza ("kajada", "Parrilla"));
    
    Date date1 = new Date(2017, 5, 30);
    Date date2 = new Date(2017, 6, 05);
    Date date3 = new Date(2017, 7, 30);
    Date date4 = new Date(2017, 8, 30);
    Date date5 = new Date(2017, 9, 30);
    Date date6 = new Date(2017, 10, 30);
    
     private List<Pedido> pedidos = Arrays.asList(
            new Pedido("Toby", 4, date1, date2, facturaParaTodos, estadoParatodos));
    
     
    public PedidosFalsos() {
        ArrayList<DetallePedido> detalles = new ArrayList<>();
        detalles.add(new DetallePedido(5, miPizza));
        detalles.add(new DetallePedido(2, miPizza2));
        
        for(Pedido pedido: pedidos){
            pedido.agregarDetalleDePedido(detalles);
        }
    }

     
     @Override
    public List<Pedido> obtenerPedidos() {
        return this.pedidos;
    }

    @Override
    public List<TipoPizza> obtenerTiposPizza() {
        return this.tiposDePizza;
    }

    @Override
    public List<VariedadPizza> obtenerVariedadesPizza() {
        return this.variedades;
    }
}

   
