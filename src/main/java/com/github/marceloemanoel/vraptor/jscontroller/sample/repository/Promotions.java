package com.github.marceloemanoel.vraptor.jscontroller.sample.repository;

import java.util.Collection;
import java.util.Map;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;

import com.github.marceloemanoel.vraptor.jscontroller.sample.Product;
import com.github.marceloemanoel.vraptor.jscontroller.sample.Promotion;
import com.google.common.collect.Maps;

@Component
@ApplicationScoped
public class Promotions {
    
    private Map<Integer, Promotion> promotions;
    private static Integer idGenerator = 0;
    
    public Promotions(Products products){
        this.promotions = Maps.newHashMap();
        
        addPromotion("2012-fall-limited-guitars-hero-1220x508_0.jpg", products.select(0));
        addPromotion("316ce-acoustic-taylor-guitar-1220x508.jpg", products.select(1));
        addPromotion("hero-nylon-814cen-taylor-guitars.jpg", products.select(2));
    }
    
    public synchronized void addPromotion(String image, Product product) {
        Integer id = idGenerator++;
        promotions.put(id, new Promotion(id, product, image));
    }
    
    public Collection<Promotion> onSale(){
        return promotions.values();
    }
}
