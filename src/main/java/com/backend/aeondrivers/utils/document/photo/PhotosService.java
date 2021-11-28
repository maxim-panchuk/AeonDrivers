package com.backend.aeondrivers.utils.document.photo;

import com.backend.aeondrivers.utils.document.FileUploadView;
import lombok.NoArgsConstructor;
import org.primefaces.model.file.UploadedFile;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tsypk on 28.11.2021 05:23
 * @project AeonDrivers
 */
@Named
@ApplicationScoped
@NoArgsConstructor
public class PhotosService {
    @Inject
    private FileUploadView view;
    private List<InputStream> photos;

    public List<InputStream> getPhotos() {
        add();
        System.out.println("!!!!!           " + photos.size() + "               !!!!!");
        return photos;
    }

    private void add() {
        photos = new ArrayList<>();
        if (view.getFiles() != null) {
            for (UploadedFile f : view.getFiles().getFiles()) {
                photos.add(retImg(f.getContent()));
            }
        }
    }

    public InputStream retImg(byte[] img) {
        return new ByteArrayInputStream(img);
    }

    public void setPhotos(List<InputStream> photos) {
        this.photos = photos;
    }

    public FileUploadView getView() {
        return view;
    }

    public void setView(FileUploadView view) {
        this.view = view;
    }
}
