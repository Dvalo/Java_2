package edu.btu.guram.dvalishvili.davaleba5;

import edu.btu.guram.dvalishvili.davaleba5.services.impl.CalculatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Davaleba5Application {

    public static void main(String[] args) {
        SpringApplication.run(Davaleba5Application.class, args);

        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        System.out.println(calculatorService.multiplication(10, 7));
    }

}
