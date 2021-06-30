package edu.btu.guram.dvalishvili.davaleba5.services.impl;

import edu.btu.guram.dvalishvili.davaleba5.aspect.Println;
import edu.btu.guram.dvalishvili.davaleba5.services.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Println
    @Override
    public int multiplication(int x, int y) {
        return x * y;
    }
}
