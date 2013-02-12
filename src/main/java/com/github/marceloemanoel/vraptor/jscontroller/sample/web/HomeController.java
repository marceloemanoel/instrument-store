package com.github.marceloemanoel.vraptor.jscontroller.sample.web;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;

@Resource
public class HomeController {
    
    @Get
    @Path("/")
    public void index(){}

}
