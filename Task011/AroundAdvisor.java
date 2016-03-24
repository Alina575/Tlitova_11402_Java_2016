package ru.kpfu.itis.ALINA_TLITOVA.advisors;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

import java.util.Date;

/**
 * @author Alina Tlitova
 *         11-402
 *         011
 */

public class AroundAdvisor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        Object[] arguments = mi.getArguments();

        for (Object u : arguments) {
            if (u instanceof User) {
                User user = (User) u;
                if (user.getLogin() == null) {
                    System.out.println("Не указан логин");
                } else {
                    System.out.println("Login:" + user.getLogin());
                }
            }
        }

        System.out.println("Time before method start: " + new Date());
        System.out.println("Start executing method '" + mi.getMethod().getName() + "'");
        Object obj = mi.proceed();
        System.out.println("Time after method start: " + new Date());
        System.out.println("End executing method '" + mi.getMethod().getName()+"'");
        System.out.println();
        return obj;
    }
}