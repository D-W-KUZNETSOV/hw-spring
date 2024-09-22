package proskyhwspring2.controller;

import java.util.Collection;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import proskyhwspring2.service.BasketService;

@RestController
@RequestMapping("/store/order")
public class BasketController {

  private final BasketService service;

  public BasketController(BasketService service) {
    this.service = service;
  }


  @GetMapping("/add")
  public void add(@RequestParam List<Integer> ids) {
    service.add(ids);
  }

  @GetMapping("/get")
  public Collection<Integer> get(@RequestParam List<Integer> ids) {
    return service.get();

  }
}
