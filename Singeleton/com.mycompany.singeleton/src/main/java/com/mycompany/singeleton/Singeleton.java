/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.singeleton;

/**
 *
 * @author sedra
 */
public class Singeleton {

    public static void main(String[] args) {
       Database db1 = Database.getInstance();
       db1.Query("SELECT S1");
       db1.Query("INSERT KING");
       db1.Query("SELECT KING");
       
       //returns the same query result because
       // They point to the same instance
       Database db2 = Database.getInstance();
       db1.Query("SELECT KING");
      
        
        
    }
}


 class Database {
    private static Database database;
    private String name ;
    private String[] data = new String[10] ;
    
    private Database(){
        name = "Iam the static database instance Please Do a querry";
      }
    public static Database getInstance(){
        
        
            if (database == null){
               
                   
                        database = new Database();
                    
                
                    
                    
                
                return database;
                
            }
            else{
                return database;
                
            }
        
            
        }
    public void Query(String Command){
        System.out.println(name);
        
        boolean Exist = false ;
        if(Command.split(" ")[0].equals("SELECT")){
            for (String string : data) {
                if(((Command.split(" ")[1]).equals(string))){
                    System.out.println("Field Exists");
                    Exist = true ;
                    
                }
                
            }
            if(!Exist){
                System.out.println("Field Doesn't Exist");
            }
            
      
      
        
    }
        else{
            for(int i=0; i < data.length; i++){
                if(data[i]==null){
                    data[i]= Command.split(" ")[1];
                    System.out.println("Object Successfully Inserted");
                    break;
                }
            }
        }
    
}
    
}

