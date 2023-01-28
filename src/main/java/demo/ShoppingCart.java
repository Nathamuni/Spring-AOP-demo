package demo;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String a){
        System.out.println(a+" checkout method 😁");
    }
}
