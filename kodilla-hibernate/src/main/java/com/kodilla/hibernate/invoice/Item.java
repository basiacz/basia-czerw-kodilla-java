//package com.kodilla.hibernate.invoice;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import java.math.BigDecimal;
//
//public class Item {
//    private int id;
//    private Product product;
//    private BigDecimal price;
//    private int quality;
//    private BigDecimal value;
//    private Invoice invoices;
//
//    public Item(Product product, BigDecimal price, int quality, BigDecimal value) {
//        this.product = product;
//        this.price = price;
//        this.quality = quality;
//        this.value = value;
//    }
//
//    public Item() {
//    }
//
//    @Id
//    @NotNull
//    @GeneratedValue
//    @Column(name = "ID", unique = true)
//    public int getId() {
//        return id;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "PRODUCT_ID")
//    public Product getProduct() {
//        return product;
//    }
//
//    @Column(name = "PRICE")
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    @Column(name = "QUALITY")
//    public int getQuality() {
//        return quality;
//    }
//
//    @Column(name = "VALUE")
//    public BigDecimal getValue() {
//        return value;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "INVOICE_ID")
//    public Invoice invoices() {
//        return invoices;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    public void setQuality(int quality) {
//        this.quality = quality;
//    }
//
//    public void setValue(BigDecimal value) {
//        this.value = value;
//    }
//
//    public void setInvoices(Invoice invoices) {
//        this.invoices = invoices;
//    }
//}