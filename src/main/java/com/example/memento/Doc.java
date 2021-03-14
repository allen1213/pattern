package com.example.memento;

public class Doc {
    private String title;//文章标题
    private String body;//文章内容

    public Doc(String title) {
        this.title = title;
        this.body = "";
    }

    public String getTitle() {
        return title;
    }

    public Doc setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public Doc setBody(String body) {
        this.body = body;
        return this;
    }

    public History createHistory() {
        return new History(body);
    }

    public void restoreHistory(History history) {
        this.body = history.getBody();
    }
}
