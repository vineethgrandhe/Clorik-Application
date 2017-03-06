package com.vineeth.creation.clorikapplication;

/**
 * Created by vineeth on 05/03/2017.
 */

public class Item {
    private String title;
    private String subtitle;

    public Item(String title, String subtitle) {
        super();
        this.title = title;
        this.subtitle = subtitle;
    }

    public Item() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
