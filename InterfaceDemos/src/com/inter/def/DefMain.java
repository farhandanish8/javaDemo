package com.inter.def;

public class DefMain {
    public static void main(String[] args) {
        IBonusCalculator bonusCalculator = new Calculatorimpl();
        bonusCalculator.calculate(2000);
        bonusCalculator.policyType();
        IBonusCalculator.show();

        IAllowanceCalculator allowance = (IAllowanceCalculator) bonusCalculator;
        allowance.calculate(1000);
        allowance.policyType();
    }
}
