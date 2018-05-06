package com.company;

import java.util.ArrayList;

public class Page {
    private String Link;
    private ArrayList<String> StringList;

    // Constructors
    public Page(){
        this.Link = "";
        this.StringList = new ArrayList<>();
    }
    public Page(String Link){
        this.Link = Link;
    }

    //Set & Get Link
    public void setLink(String Link){
        this.Link = Link;
    }

    public String getLink(){
        return Link;
    }

    public void printLink(){
        System.out.println(Link);
    }

    //Add to List
    public void add(String Item){
        this.StringList.add(Item);
    }

    //Print List
    public void printList(){
        for(int i=0; i<this.StringList.size(); i++){
            System.out.println(this.StringList.get(i));
        }
    }

}
