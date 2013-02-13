package com.github.marceloemanoel.vraptor.jscontroller.sample.web;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.github.marceloemanoel.vraptor.jscontroller.sample.repository.Products;
import com.github.marceloemanoel.vraptor.jscontroller.sample.repository.Promotions;

@Resource
public class HomeController {
    
    private Result result;
    private Products products;
    private Promotions promotions;
    
    public HomeController(Result result, Products products, Promotions promotions) {
        this.result = result;
        this.products = products;
        this.promotions = promotions;
    }
    
    @Get
    @Path("/")
    public void index(){
        result.include("onSale", promotions.onSale());
        
    }

}
