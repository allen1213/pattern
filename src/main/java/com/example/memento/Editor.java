package com.example.memento;

import java.util.ArrayList;
import java.util.List;

public class Editor {//编辑器
    private Doc doc;//文档引用

    private List<History> historyRecords;//历史记录列表

    private int historyPosition = -1;// 历史记录当前位置

    public Editor(Doc doc) {
        System.out.println("<<<打开文档" + doc.getTitle());
        this.doc = doc;
        historyRecords = new ArrayList<>();
        show();
    }

    public void append(String txt) {
        System.out.println("<<<插入操作");
        doc.setBody(doc.getBody() + txt);
        show();
    }

    public void save() {
        System.out.println("<<<存盘操作");
    }

    public void delete() {
        System.out.println("<<<删除操作");
        doc.setBody("");
        show();
    }

    public void backup() {
        historyRecords.add(doc.createHistory());
        historyPosition++;
    }

    private void show() {//显示当前文本内容
        System.out.println(doc.getBody());
        System.out.println("文章结束>>>\n");
    }

    public void undo() {
        System.out.println(">>>撤销操作");

        if (historyPosition == 0) {
            return;
        }

        historyPosition --;
        History history = historyRecords.get(historyPosition);
        doc.restoreHistory(history);
        show();
    }

    // public void redo(); 省略实现代码
}
