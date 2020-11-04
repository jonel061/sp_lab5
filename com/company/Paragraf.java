package com.company;

public class Paragraf implements  Element{
    String title;
    String text;
    AlignStrategy textAlignment = null;

    public Paragraf(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", textAlignment=" + (textAlignment == null ? "N/A" : textAlignment) +
                '}';
    }

    @Override
    public void render() {
        System.out.println(this + " which is aligned to the " + (textAlignment == null ? "N/A" : textAlignment));
    }

    public void setTextAlignmentLeft(){
        textAlignment = new AlignLeft();
        textAlignment.setAlignment(this, null);
    }

    public void setTextAlignmentRight(){
        textAlignment = new AlignRight();
        textAlignment.setAlignment(this,null);
    }

    public void setAlignStrategy(AlignStrategy a){
        textAlignment = a;
        textAlignment.setAlignment(this, null);
    }

}