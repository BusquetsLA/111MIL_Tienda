/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrar;

/**
 *
 * @author utku29
 */
public interface ContratoPresentadorAdministrar {
    
    public void procesarCategorias(int codigoCategorias);
    public void iniciar();
    public void procesarMenuCategoria(int opcion);

    public void crearNuevaVariedad(String nvoNombre, String nvosIngredientes);
    public void crearNuevoTipo(String nvoNombre, String nvaDescripcion);
    public void crearNuevoTamanio(int nvaCantPorciones, String nvoNombre);
    
    
}
