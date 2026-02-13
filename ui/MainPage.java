package com.example.EduPlan.ui;


import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainPage extends FlexLayout{

    private SignupBox signupBox = new SignupBox();
    private String name = "Edu Plan";
    

    public MainPage(){

        
        
        setFlexDirection(FlexDirection.ROW); // Keeps things side-by-side like HorizontalLayout
        
        setWidthFull();
        setMinHeight("100vh");
        
      
        Div blueBox = new Div();
        blueBox.setWidthFull();
        blueBox.setHeight("500px");
        blueBox.getStyle().setBackgroundColor("#065519");
        blueBox.getStyle().set("position", "relative");
    
        
        
        Div infoBox = new Div();
        infoBox.setHeight("500px");
        infoBox.setWidth("1200px");
        infoBox.getStyle().set("position", "relative");
        infoBox.getStyle().setBackgroundColor("#bb9f04");

        
        H1 title = new H1("Welcome to " + name + " where we make your academic dreams come true");
        title.getStyle().set("position", "absolute");
        title.getStyle().set("top", "50px");
        title.getStyle().set("left", "50px");
        title.getStyle().set("color", "white"); 
      
        Paragraph infoText = new Paragraph("Join " + name + " in order to achieve something in life and worship. All hail to Christina and enlist to participate in the general amin regime");
        infoText.getStyle().set("position", "absolute");
        infoText.getStyle().set("top", "250px");
        infoText.getStyle().set("left", "50px");
        infoText.setWidth("300px");
        infoText.getStyle().set("color", "white"); 

        Button login = new Button("LOGIN");
        login.setWidth("100px");
        login.setHeight("50px");
        login.getStyle().set("position", "absolute");
        login.getStyle().set("top", "40px");
        login.getStyle().set("left", "650px");

        login.addClickListener(e ->  {
    UI.getCurrent().navigate("login");
    });
        
        infoBox.add(title, infoText);
        blueBox.add(signupBox,login);
        
       
        add(infoBox,blueBox);
        
    }
        

}
