package com.catalog.catalog.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
//import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//@Entity
//@Table(name = "tb_categories")
public class Category implements Serializable {
    private static final long serialVersionUID=1L;

    private Long id;
    private String name;

//    private List<Product> products = new ArrayList<>();

    public Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  //  public List<Product> getProducts() {
  //      return products;
  //  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
