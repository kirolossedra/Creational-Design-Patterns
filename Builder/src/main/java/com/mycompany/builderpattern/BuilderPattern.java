/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.builderpattern;

/**
 *
 * @author sedra
 */
public class BuilderPattern {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
       
        director .ConstructSportsCar(builder);
        builder.getProduct();
        
    }
}



class Car {
    boolean GPS ;
    boolean Engine ;
    int numberOfSeats;
    boolean tripComputer;
    
    
    
}

interface Builder{
    void reset();
    void setSeats(int NumberOfSeats);
    void setEngine(boolean Exists);
    void setTripComputer(boolean Exists);
    void setGPS(boolean Exists);
    
}
class CarBuilder implements Builder{
    
    private Car car;
    
    @Override
    public void reset(){
        this.car = new Car();
        
    }
    
    @Override
    public void setSeats(int NumberOfSeats){
        this.car.numberOfSeats = NumberOfSeats;
        
    }
    @Override
    public void setEngine(boolean Exists){
        this.car.Engine = Exists;
        
    }
    @Override
    public void setTripComputer(boolean Exists){
        this.car.tripComputer = Exists;
        
    }
    @Override
    public void setGPS(boolean Exists){
        this.car.GPS = Exists;
        
    }
    public Car getProduct(){
        Car product = car;
        
        this.reset();
        System.out.print("This car has Number Of Seats equal to ");
        System.out.println(product.numberOfSeats);
        return product;
    }


    
   
    
    
    
    
    }

class Director{
    
    public void ConstructSportsCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(true);
        builder.setGPS(true);
        builder.setTripComputer(true);
        
        
    }
    public void ConstructSUV(Builder builder){
        builder.reset();
        builder.setSeats(4);
        builder.setEngine(true);
        builder.setGPS(true);
        builder.setTripComputer(true);
    }
}


