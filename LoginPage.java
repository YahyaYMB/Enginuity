package com.example.EduPlan.ui;

import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("login")
public class LoginPage extends VerticalLayout {

    public LoginPage(){
    
        setSizeFull(); 

       
        setJustifyContentMode(JustifyContentMode.CENTER); 
        setAlignItems(Alignment.CENTER);
        
        LoginForm loginForm = new LoginForm();
        
       

       
        add(loginForm);
    }

}
