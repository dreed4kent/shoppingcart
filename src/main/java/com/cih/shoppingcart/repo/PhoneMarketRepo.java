package com.cih.shoppingcart.repo;

import com.cih.shoppingcart.model.PhoneMarket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneMarketRepo extends CrudRepository<PhoneMarket, Integer> {
    //PhoneMarket findByName(String phone);
}
