package com.piugin.gson;

import java.util.List;

public class Book {
    /**
     * title : Design Patterns
     * edition : 1
     * authors : ["Erich Gamma","Richard Helm","Ralph Johnson","John Vlissides"]
     */

    private String title;
    private int edition;
    private List<String> authors;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
