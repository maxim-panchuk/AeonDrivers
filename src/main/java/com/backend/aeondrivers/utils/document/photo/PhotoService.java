package com.backend.aeondrivers.utils.document.photo;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tsypk on 28.11.2021 02:39
 * @project AeonDrivers
 */
@Named
@ApplicationScoped
public class PhotoService {

    private List<Photo> photos;

    @PostConstruct
    public void init() {
        photos = new ArrayList<>();

        photos.add(new Photo("/resources/photos/img1.png", "/resources/photos/img1.png",
                "Description for Image 1", "Title 1"));
        photos.add(new Photo("/resources/photos/img2.png", "/resources/photos/img2.png",
                "Description for Image 2", "Title 2"));

        photos.add(new Photo("/resources/photos/img3.png", "/resources/photos/img3.png",
                "Description for Image 3", "Title 3"));

    }

    public List<Photo> getPhotos() {
        return photos;
    }
}
