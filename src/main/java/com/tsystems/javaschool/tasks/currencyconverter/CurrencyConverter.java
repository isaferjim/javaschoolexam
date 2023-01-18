package com.tsystems.javaschool.tasks.currencyconverter;

public class CurrencyConverter {

    /**
     * Currency converter which converts the input statement and returns the result value.
     *
     * @param dollarToEuroRate 1 Dollar equals XX Euro
     * @param statement input statement to convert
     * @return converted value
     */
    public String convert(double dollarToEuroRate, String statement) {
        // TODO: Implement the logic here
        
        String money1 = null;
        String money2 = null; 
        


        if (statement.isEmpty()) {
            throw new CannotConvertCurrencyException();}

        if (statement.contains("convertToDollar")){
            if (statement.contains("$")){
                throw new CannotConvertCurrencyException();
            }

            

        }else if (statement.contains("convertToEuro")) {
              if(statement.contains("euro")){
                throw new CannotConvertCurrencyException();
            }
            
         } else {
            throw new CannotConvertCurrencyException();}

            
            if (statement.contains("+")){
                String [] parts= statement.split("+");
                String money1 = parts[0];
                String money2 = parts[1];
                
    
            }





        return "";
    }

    public static int operacion(statement op, int n1, int n2){
        switch (op){
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;    
        }
    }
}
