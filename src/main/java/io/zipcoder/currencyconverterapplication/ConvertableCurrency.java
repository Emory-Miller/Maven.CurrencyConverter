package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {

    CurrencyType ct = null;

    default CurrencyType getCurrencyType() {
        return ct;
    }
    default Double convert(CurrencyType currencyType) {
        return ct.getRate() / currencyType.getRate();
    }
}
