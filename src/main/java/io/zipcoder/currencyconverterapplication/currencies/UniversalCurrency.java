package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    CurrencyType ct = CurrencyType.UNIVERSAL_CURRENCY;

    public CurrencyType getCurrencyType() {
        return ct;
    }
}
