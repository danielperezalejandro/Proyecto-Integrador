/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointegrador;

/**
 *
 * @author Daniel
 */
public class Usuario {
    private String nombre;
    private String dni;
    private String tipo;
    private String direccion;
    private int tlfn;
    private int qr;

   /**
    * Contructor de la clase Usuario
    * @param nombre
    * @param dni
    * @param direccion
    * @param tlfn
    * @param qr 
    */
    

    public Usuario(String nombre, String dni, String tipo, String direccion, int tlfn, int qr) {
        this.nombre = nombre;
        this.dni = dni;
        this.tipo=tipo;
        this.direccion = direccion;
        this.tlfn = tlfn;
        this.qr=qr;
    }
    public Usuario(){
        this.nombre=null;
        this.dni= null;
        this.tipo=null;
        this.direccion=null;
        this.tlfn= 0;
        this.qr=0;
        
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
     public void setQr(int qr) {
        this.qr = qr;
    }

    public int getQr() {
        return qr;
    }
    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTlfn() {
        return tlfn;
    }

    public void setTlfn(int tlfn) {
        this.tlfn = tlfn;
    }
    
    
    /**
     * Metodo para cambiar la dirección del usuario
     * @param cambio 
     */    
    public void modDireccion(String cambio){
        this.direccion=cambio;    
    }
    
    /**
     * Método que da un numero aleatorio con el que puede acceder al gimnasio
     */
    
    public void generarQr(){
        this.qr = (int) (Math.random()*1001);
    }
    
    /**
     * Método que valida el acceso mediante la comprobacion 
     * de que el codigo que se introduce es el mismo 
     * que se generó en el método genrar qr.
     * @param codigo
     * @return devuelve si se da acceso o no.
     */
    
    public String acceso(int codigo){
        if(codigo==this.qr){
            return "Acceso permitido";
        }else{
           return "codigo erroneo";
        }
    } 
    
    
}
