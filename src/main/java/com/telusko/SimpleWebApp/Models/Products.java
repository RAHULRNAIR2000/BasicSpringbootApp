package com.telusko.SimpleWebApp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Products {
    @Id
    public int prodId;

    public Products() {
    }

    public String prodName;
    public int price;
}
