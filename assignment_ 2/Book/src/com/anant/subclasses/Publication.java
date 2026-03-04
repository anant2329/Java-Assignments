package com.anant.subclasses;

public class Publication {
    private String publication_name;
    private int publication_id;

    public Publication(int publication_id, String publication_name) {
        this.publication_name = publication_name;
        this.publication_id = publication_id;
    }


    public int getPublication_id() {
        return publication_id;
    }

    public String getPublication_name() {
        return publication_name;
    }
    @Override
    public String toString() {
        return String.format("Publication name = %s, Publication ID = %d", publication_name, publication_id);
    }
}
