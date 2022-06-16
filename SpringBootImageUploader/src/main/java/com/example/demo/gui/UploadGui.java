package com.example.demo.gui;

import com.example.demo.service.ImageUploader;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;


@Route("upload")
public class UploadGui extends VerticalLayout {

    //wstrzykujemy w konstruktorze instancję ImageUploader
    private ImageUploader imageUploader;

    @Autowired
    public UploadGui(ImageUploader imageUploader) {
        this.imageUploader = imageUploader;

        Label label = new Label();
//        TextField textField = new TextField();

        MemoryBuffer memoryBuffer = new MemoryBuffer();
        Upload singleFileUpload = new Upload(memoryBuffer);

        singleFileUpload.addSucceededListener(event -> {

            String uploadedImage = imageUploader.uploadFileAndSaveToDb(event.getFileName());
            Image image = new Image(uploadedImage, "nie ma obrazka");
            label.setText("Udało się wrzucić obrazek");
            add(label);
            add(image);

//           Component component = createComponent(event.getMIMEType(),
//                   event.getFileName(), memoryBuffer.getInputStream());
//           showOutput(event.getFileName(), component, output);
        });

//        Button button = new Button("upload");
//        button.addClickListener(clickEvent -> {
//            String uploadedImage = imageUploader.uploadFileAndSaveToDb(textField.getValue());
//            Image image = new Image(uploadedImage, "nie ma obrazka");
//            label.setText("Udało się wrzucić obrazek");
//            add(label);
//            add(image);
//        });

        add(singleFileUpload);
//        add(button);
    }
}















