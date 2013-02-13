package com.github.marceloemanoel.vraptor.jscontroller.sample.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.marceloemanoel.vraptor.jscontroller.sample.Product;
import com.google.common.collect.Lists;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;

@Component
@ApplicationScoped
public class Products {
  
  private Map<Integer, Product> products;
  
  public Products(){
    products = new HashMap<Integer, Product>();
    products.put(0, new Product(0, "Fall Limiteds", "Three fresh wood pairings spice up the season", 4298D));
    products.put(1, new Product(1, "300 Series", "The 316ce brings a new GS voice to the line", 1699D));
    products.put(2, new Product(2, "Nylon-Strings: Hybrid Style", "Modern styling meets signature Taylor playability 800 nylon", 23.95D));
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
