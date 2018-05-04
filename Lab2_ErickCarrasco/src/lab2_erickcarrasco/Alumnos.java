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
    private String nationality;
    private String city;
    private String id;
    
    //Constructor
    public Alumnos(){
    
    }
    
    //Mutador
    public Alumnos(String name, String user, String password, String nationality, String city, String id){
        this.name=name;
        this.user=user;
        this.password=password;
        this.nationality=nationality;
        this.city=city;
        this.id=id;   
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
        this.password= password;
    }
    
    public String getPassword(String password){
        return password;
    }
    
    public void setNationality(String nationality){
        this.nationality=nationality;
    }
    
    public String getNationality(String nationality){
        return nationality;
    }
    
    public void setCity(String city){
        this.city= city;
    }
    
    public String getCity(String city){
        return city;
    }
    
    public void setID(String id){
        this.id= id;
    }
    
    public String getID(String id){
        return id;
    }
    
    //Metodo admin
    @Override
    public String toString(){
        return "Nombre: "+name+" "+"Nacionalidad: "+nationality+" "+"City: "+city+" "+"id: "+id+ "Usuario: "+user+ " "+ "Password: "+password;
    }
    
    
    
    
    
}
