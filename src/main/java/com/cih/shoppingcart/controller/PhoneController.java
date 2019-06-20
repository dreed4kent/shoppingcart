package com.cih.shoppingcart.controller;

import com.cih.shoppingcart.model.PhoneMarket;
import com.cih.shoppingcart.repo.PhoneMarketRepo;
//import com.cih.shoppingcart.service.UserService;

//import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/main", produces = "application/json")
@CrossOrigin(origins = "*")
public class PhoneController {

  //  @Autowired
 //   private UserService service;
    
    @Autowired
    private PhoneMarketRepo repo;

    @GetMapping("/phone")                                      // specific path of the web address
    public @ResponseBody Iterable<PhoneMarket> getAllPhones() {
        //Iterable<PhoneMarket> phone = service.getAllPhones();
        //return phone;                                         // index is the html page
    	return repo.findAll();
    }
//
//    @GetMapping("/{id}")
//    public @ResponseBody PhoneMarket getPhone(@PathVariable Integer id) {
//        return service.getPhone(id);
//    }

//    @PostMapping("/addPhone")
//    public String submitPhoneForm(@ModelAttribute PhoneMarket phone) {
//        PhoneMarketRepo.save(phone);
//        return "index";
//    }
}
