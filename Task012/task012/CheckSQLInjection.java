package ru.kpfu.itis.alina.task012;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author Alina Tlitova
 *         11-402
 *         012
 */

@Aspect
public class CheckSQLInjection {

    @Around("execution(* *..*.execute())")
    public Object check(ProceedingJoinPoint jp) throws Throwable {
        String id = (String) jp.getArgs()[0];
        String login = (String) jp.getArgs()[1];
        System.out.println(id + " " + login);

        if (id.matches("[0-9]")) {
            if (login.matches("^[A-ZÀ-ß]{1}[a-zà-ÿ]+")) {
                return jp.proceed();
            } else {
                System.out.println("SQL Injection on user login! Tried to insert - " + login);
                return null;
            }
        } else {
            System.out.println("SQL Injection on user ID! Tried to insert - " + id);
            return null;
        }
    }
}