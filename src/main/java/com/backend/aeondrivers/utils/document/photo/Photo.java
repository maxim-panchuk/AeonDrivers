package com.backend.aeondrivers.utils.document.photo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author tsypk on 28.11.2021 02:39
 * @project AeonDrivers
 */

@NoArgsConstructor
@Getter
@Setter
public class Photo implements Serializable {

    private String itemImageSrc;
    private String thumbnailImageSrc;
    private String alt;
    private String title;

    public Photo(String itemImageSrc, String thumbnailImageSrc, String alt, String title) {
        this.itemImageSrc = itemImageSrc;
        this.thumbnailImageSrc = thumbnailImageSrc;
        this.alt = alt;
        this.title = title;
    }
}