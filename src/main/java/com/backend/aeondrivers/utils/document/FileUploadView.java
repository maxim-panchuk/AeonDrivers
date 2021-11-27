package com.backend.aeondrivers.utils.document;

import lombok.Getter;
import lombok.Setter;
import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.FilesUploadEvent;
import org.primefaces.model.file.UploadedFile;
import org.primefaces.model.file.UploadedFiles;
import org.primefaces.util.EscapeUtils;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 * @author tsypk on 27.11.2021 23:57
 * @project AeonDrivers
 */
@Named
@ApplicationScoped
@Getter
@Setter
public class FileUploadView {

    private UploadedFile file;
    private UploadedFiles files;
    private byte[] img;
    private String dropZoneText = "Drop zone p:inputTextarea demo.";


    public void uploadMultiple() {
        if (files != null) {
            for (UploadedFile f : files.getFiles()) {
                FacesMessage message = new FacesMessage("Successful", f.getFileName() + " is uploaded.");
                FacesMessage message1 = new FacesMessage("File type is", f.getContentType());
                FacesContext.getCurrentInstance().addMessage(null, message1);
                FacesContext.getCurrentInstance().addMessage(null, message);
                img = f.getContent();
            }
        }
    }

    public void handleFileUpload(FileUploadEvent event) {
        FacesMessage message = new FacesMessage("Successful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public void handleFileUploadTextarea(FileUploadEvent event) {
        String jsVal = "PF('textarea').jq.val";
        String fileName = EscapeUtils.forJavaScript(event.getFile().getFileName());
        PrimeFaces.current().executeScript(jsVal + "(" + jsVal + "() + '\\n\\n" + fileName + " uploaded.')");
    }

    public void handleFilesUpload(FilesUploadEvent event) {
        for (UploadedFile f : event.getFiles().getFiles()) {
            FacesMessage message = new FacesMessage("Successful", f.getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }

}