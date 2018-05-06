package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.net.*;


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
        System.out.println("StringList: ");
        for(int i=0; i<this.StringList.size(); i++){
            System.out.println(this.StringList.get(i));
        }
    }

    //
    public void read() throws Exception{
        URL u;
        Scanner s;
            u = new URL(this.Link);
            s = new Scanner(u.openStream());

            while(s.hasNext()){
                this.StringList.add(s.nextLine());
            }
    }
}
