package com.example.demo.gui;

import com.example.demo.model.Rectangle;
import com.example.demo.repository.RectangleRepo;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route
public class RectangleSizeGui  extends VerticalLayout {

    //wstrzykujemy repo - żeby coś z bazą zrobić
    private RectangleRepo rectangleRepo;

    private TextArea textAreaRectangles;

    @Autowired
    public RectangleSizeGui(RectangleRepo rectangleRepo) {
        this.rectangleRepo = rectangleRepo;
        this.textAreaRectangles = new TextArea();

        textAreaRectangles.setValue(rectangleRepo.getListOfBigRectangles().toString());
        add(textAreaRectangles);
    }



}
