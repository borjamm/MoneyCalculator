package moneycalculator;

import moneycalculator.model.Currency;
import moneycalculator.model.Money;

public class Main {
    
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        Money money = new Money(400,new Currency("USD","Dolar","$"));
        mainFrame.moneyDisplay().display(money);
    }
}
