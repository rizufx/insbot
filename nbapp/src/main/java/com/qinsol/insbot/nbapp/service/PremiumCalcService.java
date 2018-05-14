package com.qinsol.insbot.nbapp.service;

import com.qinsol.insbot.commons.CompanyConfigDto;
import com.qinsol.insbot.commons.QuoteDto;

/**
 * Created by fahmida on 4/11/2018.
 */
public interface PremiumCalcService {

    public QuoteDto calculatePremiums(QuoteDto quote, CompanyConfigDto company) throws Exception;

}
