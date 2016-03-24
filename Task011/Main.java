package ru.kpfu.itis.ALINA_TLITOVA.advisors;

import org.springframework.aop.framework.ProxyFactory;
import ru.kpfu.itis.ALINA_TLITOVA.models.*;

/**
 * @author Alina Tlitova
 *         11-402
 *         011
 */

public class Main {
    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory(new User());

        pf.addAdvice(new BeforeAdvisor());
        pf.addAdvice(new AroundAdvisor());

        User u1 = (User) pf.getProxy();
        u1.setLogin("Admin");
        System.out.println(u1.getLogin());

    }
}
