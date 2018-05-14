package com.qinsol.insbot.nbapp.service.impl;

import com.qinsol.insbot.commons.CompanyConfigDto;
import com.qinsol.insbot.commons.ProductOfferingDto;
import com.qinsol.insbot.commons.QuoteDto;
import com.qinsol.insbot.nbapp.service.PremiumCalcService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.stream.Collectors;

/**
 * Created by fahmida on 4/11/2018.
 */
@Service
public class PremiumCalcServiceImpl implements PremiumCalcService{

    @Override
    public QuoteDto calculatePremiums(QuoteDto quote, CompanyConfigDto company) throws Exception{

        ProductOfferingDto offering = company.getProductOfferings().get(0);

        BigDecimal premiumFactor = new BigDecimal(0.005);
        BigDecimal annualFactor = new BigDecimal(12);
        BigDecimal semiAnnualFactor = new BigDecimal(6);
        BigDecimal quarterFactor = new BigDecimal(3);

        MathContext mathContext = new MathContext(2, RoundingMode.HALF_UP);


        quote.setTotannualprem(quote.getTotalbasebenefit().multiply(premiumFactor).round(mathContext).multiply(annualFactor).round(mathContext));
        quote.setTotsemiprem(quote.getTotalbasebenefit().multiply(premiumFactor).round(mathContext).multiply(semiAnnualFactor).round(mathContext));
        quote.setTotquartprem(quote.getTotalbasebenefit().multiply(premiumFactor).round(mathContext).multiply(quarterFactor).round(mathContext));
        quote.setTotmonthlyprem(quote.getTotalbasebenefit().multiply(premiumFactor).round(mathContext).round(mathContext));
        quote.setTotspecialprem(new BigDecimal(0.00).round(mathContext).round(mathContext));

        return quote;
    }
}
