/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author sedra
 */
public abstract class Dialog {
    public abstract Button createButton();
    
    public void render(){
        Button okButton = createButton();
        okButton.onClick("closeDialog");
        okButton.render();
    }
}

class WindowsDialog extends Dialog {
    
    @Override
    public Button createButton(){
        
        return new WindowsButton();
        
        
    }
    

}
class WebDialog extends Dialog {
    
    @Override
    public Button createButton(){
        
        return new HTMLButton();
        
        
    }
    

}

 interface Button {
    public void render();
    public void onClick(String event);
    
}
class WindowsButton implements Button{
    
    public WindowsButton(){
    }
    @Override public void render(){
        System.out.println("Iam Rendering a windows Button");
    }
    @Override public void onClick(String event){
        System.out.println("Iam Windows Button-Triggered event");
    }
    
}
class HTMLButton implements Button{
    
    public HTMLButton(){
    }
    @Override public void render(){
        System.out.println("Iam Rendering a web Button");
    }
    @Override public void onClick(String event){
        System.out.println("Iam web Button-Triggered event");
    }
    
}
