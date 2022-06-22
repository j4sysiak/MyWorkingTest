package com.example.demo.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

// odpalamy tą stronę:  http://localhost:8080/rectanglegui

@Route
public class RectangleGui extends VerticalLayout {

    private TextField textFieldHeight;
    private TextField textFieldWeight;
    private Button button;

    public RectangleGui() {
        this.textFieldHeight = new TextField("Podaj wysokość: ");
        this.textFieldWeight = new TextField("Podaj szerokość: ");
        this.button = new Button("Dodaj");

        add(textFieldHeight);
        add(textFieldWeight);
        add(button);
    }

}
