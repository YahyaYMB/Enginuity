package com.example.EduPlan.ui;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;

public class SignupBox extends Div  {

    public SignupBox(){

        //box that contains signup information slots
        setWidth("300px");
        setHeight("300px");
        getStyle().setBackgroundColor("#ffffff");
        getStyle().set("border", "40px");
        getStyle().set("padding", "40px");

        getStyle().set("position", "relative");
        getStyle().set("top", "50px");
        getStyle().set("left", "150px");
        getStyle().set("box-shadow", "0 10px 20px rgba(0,0,0,0.2)");
        getStyle().set("border", "5px solid #0f0f2d");

        // to make all titles texts and fields over top the other
        VerticalLayout VL = new VerticalLayout();
        VL.setHeightFull();
        VL.setWidthFull();
        VL.getStyle().set("padding", "10px");

        //text and fields
        H1 title = new H1("SIGN UP");
        EmailField email = new EmailField("Email");
        PasswordField password = new PasswordField("Password");
        Checkbox checkbox = new Checkbox("I accept the terms and conditions");

        VL.add(title,email,password,checkbox);
        add(VL);



    

       
        
    }

}
