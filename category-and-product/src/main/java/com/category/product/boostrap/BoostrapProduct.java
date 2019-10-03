package com.category.product.boostrap;


import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.category.product.models.Product;
import com.category.product.repositories.ProductRepository;

@Component
public class BoostrapProduct {
	@Autowired
    private ProductRepository product;
    

	//@Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData(100);
    }

    private void initData(int count) {
      /*  for(int i = 0; i < count; i++){
            String email = "example@example"+i+".com";
            String phone = "67" + (int)(Math.random() * 1000000 + 9999999);
            String name = "contact " + i;
            Contact contact = new Contact();
            contact.setEmail(email);
            contact.setName(name);
            contact.setPhone(phone);
            contactsRepository.save(contact);
        }*/
    }

}
