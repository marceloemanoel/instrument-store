package com.github.marceloemanoel.vraptor.jscontroller.sample.web;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.github.marceloemanoel.vraptor.jscontroller.sample.Products;
import com.github.marceloemanoel.vraptor.jscontroller.sample.Promotions;

@Resource
public class HomeController {
    
    private Result result;
    private Products products;
    private Promotions promotions;
    
    public HomeController(Result result, Products products, Promotions promotions) {
        this.result = result;
        this.products = products;
        this.promotions = promotions;
        
        promotions.addPromotion("2012-fall-limited-guitars-hero-1220x508_0.jpg", products.select(0));
        promotions.addPromotion("316ce-acoustic-taylor-guitar-1220x508.jpg", products.select(1));
        promotions.addPromotion("hero-nylon-814cen-taylor-guitars.jpg", products.select(2));
    }
    
    @Get
    @Path("/")
    public void index(){
        result.include("onSale", promotions.onSale());
        
    }

}
