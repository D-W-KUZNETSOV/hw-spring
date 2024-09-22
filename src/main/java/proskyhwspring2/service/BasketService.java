package proskyhwspring2.service;

import java.util.Collection;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BasketService {

  private final Basket basket;

  public BasketService(Basket basket) {
    this.basket = basket;
  }


  public void add(List<Integer> ids) {
    basket.addItems(ids);
  }

  public Collection<Integer> get() {
    return basket.getItems();
  }
}
