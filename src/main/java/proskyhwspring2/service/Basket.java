package proskyhwspring2.service;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Basket {

  private final Set<Integer> items = new HashSet<>();

  public void addItems(List<Integer> ids) {
    items.addAll(ids);
  }

  public Collection<Integer> getItems() {
    return Collections.unmodifiableSet(items);
  }
}
