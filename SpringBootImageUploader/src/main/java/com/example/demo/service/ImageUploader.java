package com.example.demo.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Service
public class ImageUploader {

    private Cloudinary cloudinary;

    public ImageUploader() {
        this.cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dmzun82tu",
                "api_key", "934522816349346",
                "api_secret", "1GwL921hBbmyJzR79Eoj9oQwBF8"));
    }

    public String uploadFile(String path) {
        File file = new File(path);
        Map uploadResult = null;
        try {
            uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
        } catch (IOException e) {
            e.printStackTrace();
            //todo
        }
        return uploadResult.get("url").toString();
    }
}
