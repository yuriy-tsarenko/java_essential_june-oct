package com.java_essential.sych.homework.lesson1.book;

public class Title {
    private String title;

    public Title(){

    }

    public Title(String title) {
        this.title = "Кобзар";
    }
   public void show(){
       System.out.println(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
