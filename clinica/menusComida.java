/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinica;

/**
 *
 * @author Gustavo Cuéllar
 */
public class menusComida extends clinica
{
    private String menuDelDia;
    private String bebidas;
    
    public menusComida(Double precioComida, Double cobrarComida, String menuDelDia, String bebidas)
    {
        Super(precioComida, cobrarComida); 
        this.menuDelDia = menuDelDia; 
        this.bebidas = bebidas; 
    }

    private void Super(Double precioComida, Double cobrarComida) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
