//package com.kodilla.hibernate.invoice;
//
//import javax.persistence.CascadeType;
//import javax.persistence.FetchType;
//import javax.persistence.OneToMany;
//import java.util.List;
//
//public class Invoice {
//    private int id;
//    private String number;
//    private List<Item> items;
//
//    public Invoice(String number, List<Item> items) {
//        this.number = number;
//        this.items = items;
//    }
//
//    public Invoice() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getNumber() {
//        return number;
//    }
//
//    @OneToMany(
//            targetEntity = Item.class,
//            mappedBy = "item",
//            cascade = CascadeType.ALL,
//            fetch = FetchType.EAGER
//    )
//    public List<Item> getItems() {
//        return items;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setNumber(String number) {
//        this.number = number;
//    }
//
//    public void setItems(List<Item> items) {
//        this.items = items;
//    }
//}