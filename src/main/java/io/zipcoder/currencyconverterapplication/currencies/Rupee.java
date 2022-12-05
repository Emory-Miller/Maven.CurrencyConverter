package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {
    CurrencyType ct = CurrencyType.RUPEE;

    public CurrencyType getCurrencyType() {
        return ct;
    }

    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/ ct.getRate() ;
    }
}

