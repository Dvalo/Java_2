package edu.btu.guram.dvalishvili.davaleba5;

import edu.btu.guram.dvalishvili.davaleba5.services.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorServiceTest {
    @Autowired
    CalculatorService calculatorService;

    @Test
    void multiplication() {
        if (calculatorService.multiplication(10, 7) == 70) {
            System.out.println("I work");
        }
    }

}
