package kpfu.itis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alina Tlitova
 *         11-402
 *         009
 */

@Configuration
@ComponentScan(basePackages = {"kpfu.itis"})
public class Config {

    @Bean
    ComplexMatrix2x2 cmDef() {
        return new ComplexMatrix2x2();
    }

    @Bean
    ComplexNumber cnDef() {
        return new ComplexNumber();
    }

    @Bean
    ComplexNumber cn1() {
        return new ComplexNumber(3.0, 1.0);
    }

    @Bean
    ComplexNumber cn2() {
        return new ComplexNumber(2.0, 3.0);
    }

    @Bean
    ComplexNumber cn3() {
        return new ComplexNumber(5.0, 2.0);
    }

    @Bean
    ComplexNumber cn4() {
        return new ComplexNumber(5.0, 8.0);
    }

    @Bean
    ComplexNumber cn5() {
        return new ComplexNumber(2.0, 1.0);
    }

     @Bean
    ComplexNumber cn6() {
        return new ComplexNumber(3.0, 10.0);
    }

    @Bean
    ComplexNumber cn1sumRes() {
        return new ComplexNumber(8.0, 3.0);
    }

    @Bean
    ComplexNumber cn2sumRes() {
        return new ComplexNumber(5.0, 9.0);
    }

    @Bean
    ComplexNumber cn3sumRes() {
        return new ComplexNumber(14.0, 6.0);
    }

    @Bean
    ComplexNumber cn4sumRes() {
        return new ComplexNumber(15.0, 23.0);
    }

    @Bean
    ComplexNumber cn1multRes() {
        return new ComplexNumber(15.0, 2.0);
    }

    @Bean
    ComplexNumber cn2multRes() {
        return new ComplexNumber(6.0, 18.0);
    }

    @Bean
    ComplexNumber cn3multRes() {
        return new ComplexNumber(45.0, 8.0);
    }

    @Bean
    ComplexNumber cn4multRes() {
        return new ComplexNumber(50.0, 120.0);
    }

    @Bean
    ComplexNumber cn1multVector2DRes() {
        return new ComplexNumber(-25.0, 62.0);
    }

    @Bean
    ComplexNumber cn2multVector2DRes() {
        return new ComplexNumber(-70.0, 130.0);
    }

    @Bean
    ComplexMatrix2x2 cm() {
        return new ComplexMatrix2x2(cn1(), cn2(), cn3(), cn4());
    }

    @Bean
    ComplexMatrix2x2 cm1() {
        return new ComplexMatrix2x2(cn5());
    }

    @Bean
    ComplexMatrix2x2 sumRes() {
        return new ComplexMatrix2x2(cn1sumRes(), cn2sumRes(), cn3sumRes(), cn4sumRes());
    }

    @Bean
    ComplexMatrix2x2 multRes() {
        return new ComplexMatrix2x2(cn1multRes(), cn2multRes(), cn3multRes(), cn4multRes());
    }

    @Bean
    ComplexVector2D multVecto2DRes() {
        return new ComplexVector2D(cn1multVector2DRes(), cn2multVector2DRes());
    }
}
