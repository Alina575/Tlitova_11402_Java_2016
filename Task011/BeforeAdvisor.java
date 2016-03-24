package ru.kpfu.itis.ALINA_TLITOVA.advisors;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;


/**
 * @author Alina Tlitova
 *         11-402
 *         011
 */

public class BeforeAdvisor implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objs, Object o) throws Throwable {
        System.out.println("Method '" + method.getName() + "' is called.");
        System.out.println("Arguments: " + Arrays.toString(objs));
    }
}
