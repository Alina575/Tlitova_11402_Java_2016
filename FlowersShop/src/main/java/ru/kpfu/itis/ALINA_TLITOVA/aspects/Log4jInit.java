package ru.kpfu.itis.ALINA_TLITOVA.aspects;

import org.apache.log4j.LogManager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.junit.BeforeClass;
import org.apache.log4j.Logger;
import org.springframework.security.core.context.SecurityContextHolder;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

/**
 * @author Alina Tlitova
 *         11-402
 *         30.04.2016
 */

@Aspect
public class Log4jInit {
    private static final Logger logger1 = LogManager.getLogger(User.class);

    @BeforeClass
    static public void beforeClass() {
        logger1.trace("Entering application.");
        User u = new User();
        if (u.getLogin().contains(".")) {
            logger1.error("Illegal character in login!");
        }
        logger1.trace("Exiting application.");
    }


    private static final Logger logger2 = Logger.getLogger(Log4jInit.class);

    @Around("execution(* ru.kpfu.itis.ALINA_TLITOVA.repositories.*.*(..))")
    public Object advice(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Around advice");
        Object[] args = jp.getArgs();
        if (args.length > 0) {
            System.out.print("Arguments passed: ");
        }
        return jp.proceed();
    }


    @Before("execution(* ru.kpfu.itis.ALINA_TLITOVA.repositories.*.*(..))")
    public void log1(JoinPoint point) throws Throwable {
        logger2.info("Method " + point.getSignature().getName() + " is called.");
    }

}
