package com.category.product.boostrap;


import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.category.product.models.Category;
import com.category.product.repositories.CategoryRepository;

@Component
public class BoostrapCategory {
	@Autowired
    private CategoryRepository category;
    

	//@Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData(10);
    }

    private void initData(int count) {
       for(int i = 0; i < count; i++){
            String description = "descrpition"+i+".defult";
            
            String name = "aladin " + i;
            Category categorydto = new Category();
            categorydto.setName(name);
            categorydto.setDescription(description);
            
             category.save(categorydto);
            
       }   
    }

}
