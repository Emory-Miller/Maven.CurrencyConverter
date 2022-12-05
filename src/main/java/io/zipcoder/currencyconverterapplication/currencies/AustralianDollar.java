package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {

    CurrencyType ct = CurrencyType.AUSTRALIAN_DOLLAR;

    public CurrencyType getCurrencyType() {
        return ct;
    }
}
