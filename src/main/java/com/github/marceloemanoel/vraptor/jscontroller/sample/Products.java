package com.github.marceloemanoel.vraptor.jscontroller.sample;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;

@Component
@ApplicationScoped
public class Products {
  
  private Map<Integer, Product> products;
  
  public Products(){
    products = new HashMap<Integer, Product>();
    products.put(0, new Product(0, "name0", "desc0", 0D));
    products.put(1, new Product(1, "name1", "desc1", 1D));
    products.put(2, new Product(2, "name2", "desc2", 2D));
  }
  
  public Collection<Product> all() {
    return products.values();
  }
  
  public void add(Product produto){
    products.put(products.size(), produto);
  }
  
  public Product select(int index) {
    return products.get(index);
  }

  public void update(int id, Product produto) {
    products.put(id, produto);
  }

  public void remove(int id) {
    products.remove(id);
  }

  public List<Product> onSale() {
      return Lists.newArrayList(all());
  }
  
}
