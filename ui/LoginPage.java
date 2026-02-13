package com.example.EduPlan.ui;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("login")
public class LoginPage extends VerticalLayout {

    public LoginPage(){
        
        setSizeFull(); 

       
        setJustifyContentMode(JustifyContentMode.CENTER); 
        setAlignItems(Alignment.CENTER);

      Html backgroundVideo = new Html(
            "<video autoplay loop muted playsinline " +
            "style='position: fixed; top: 0; left: 0; min-width: 100%; min-height: 100%; " +
            "z-index: -1; object-fit: cover;'>" +
            " <source src='space-bg.mp4' type='video/mp4'>" +
            "</video>"
        );

        // 2. Style the Login Form to look better against dark space
        LoginForm loginForm = new LoginForm();
        loginForm.getElement().getStyle().set("background", "rgba(255, 255, 255, 0.9)");
        loginForm.getElement().getStyle().set("border-radius", "15px");
        loginForm.getElement().getStyle().set("padding", "10px");

        add(backgroundVideo, loginForm);
    }

}//ph premium
