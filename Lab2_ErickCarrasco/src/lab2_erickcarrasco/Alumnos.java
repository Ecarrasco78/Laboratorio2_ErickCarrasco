/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_erickcarrasco;

/**
 *
 * @author erick
 */
public class Alumnos {
    private String user;
    private String name;
    private String password;
    
    //Constructor
    public Alumnos(){
    
    }
    
    //Mutador
    public Alumnos(String name, String user, String password){
        this.name=name;
        this.user=user;
        this.password=password;
    }
    public void setName(String name){
        this.name= name;
    }
    
    public String getName(String name){
        return name;
    }
    
    public void setUser(String user){
        this.user= user;
    }
    
    public String getUser(String user){
        return user;
    }
    
    public void setPassword(String password){
        this.password= name;
    }
    
    public String getPassword(String password){
        return password;
    }
    
    //Metodo admin
    @Override
    public String toString(){
        return "Nombre: "+name+" "+ "Usuario: "+user+ " "+ "Password: "+password;
    }
    
    
    
    
    
}
