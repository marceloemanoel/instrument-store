package com.github.marceloemanoel.vraptor.jscontroller.sample;

import java.util.Collection;
import java.util.Map;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;

import com.google.common.collect.Maps;

@Component
@ApplicationScoped
public class Promotions {
    
    private Map<Integer, Promotion> promotions;
    private static Integer idGenerator = 0;
    
    public Promotions(){
        this.promotions = Maps.newHashMap();
    }
    
    public synchronized void addPromotion(String image, Product product) {
        Integer id = idGenerator++;
        promotions.put(id, new Promotion(id, product, image));
    }
    
    public Collection<Promotion> onSale(){
        return promotions.values();
    }
}
