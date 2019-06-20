package com.cih.shoppingcart.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
//@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Data
@Entity
@Table (name = "test")
public class PhoneMarket {
    @Id
    //@GeneratedValue(strategy= GenerationType.AUTO)  //auto generates the primary key "Id"
    private int id;
    private String phone;
    private String details;
    private Float price;
    private int inventory;
}
