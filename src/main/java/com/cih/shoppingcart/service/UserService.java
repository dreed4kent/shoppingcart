//package com.cih.shoppingcart.service;
//
//import com.cih.shoppingcart.repo.PhoneMarketRepo;
//import com.cih.shoppingcart.model.PhoneMarket;
//import com.cih.shoppingcart.controller.PhoneController;
//import lombok.Data;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//
//@Service
//@Data
//@Transactional
//public class UserService {
//
//    @Autowired
//    private PhoneMarketRepo repo;
//
//    public Iterable<PhoneMarket> getAllPhones() {
//        return repo.findAll();
//    }
//
//    public PhoneMarket getPhone(Integer id) {
//        return repo.findById(id).get();
//    }
//}
