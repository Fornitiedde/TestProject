package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.net.*;


public class Page {
    private String Link;
    private ArrayList<String> StringList;

    // Constructors, empty Link & Initialized List
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
    public int size(){return this.StringList.size(); }
    //Print List
    public void printList(){
        System.out.println("StringList: ");
        for(int i=0; i<this.StringList.size(); i++){
            System.out.println(this.StringList.get(i));
        }
    }

    // Read Source Text
    public void read() throws Exception{
        URL u;
        Scanner s;
            u = new URL(this.Link);
            s = new Scanner(u.openStream());

            while(s.hasNextLine()){
                this.StringList.add(s.nextLine());
            }
    }

    // Interpert Source Text
    public String checkLine(int index){
        int border;
        border = this.StringList.get(index).indexOf(">");
        String type = this.StringList.get(index).substring(1,border);
        return type;
    }

    // Check if title or text
    public void PrintCheck(String type){
        type = type.toLowerCase();
        switch(type){
            case "title":
                System.out.println("Title found");
                break;
            case "p":
                System.out.println("Text found");
                break;
            default:
                break;
        }
    }


    public void search() throws Exception{
        for(int i = 0; i<this.StringList.size(); i++){
            //Check type of Line
            //Display text, else move on to next line.
            if(!this.StringList.get(i).isEmpty()){
                PrintCheck(checkLine(i));
            }
        }
    }
}
