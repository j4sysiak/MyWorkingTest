package com.example.demo;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ImageTest {

    public static void main(String[] args) throws IOException {

        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                        "cloud_name", "dmzun82tu",
                        "api_key", "934522816349346",
                        "api_secret", "1GwL921hBbmyJzR79Eoj9oQwBF8"));

        File file = new File("smile.jpg");
        Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());

        System.out.println("finish upload ...-->  https://cloudinary.com/console/c-fc254271d87950dc6996de43aa8e74/media_library/folders/home");
    }
}
