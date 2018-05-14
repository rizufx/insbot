package com.qinsol.insbot.nbapp.service;

import com.qinsol.insbot.commons.QuoteDto;

/**
 * Created by fahmida on 4/11/2018.
 */
public interface QuoteService {

    public QuoteDto getQuote(QuoteDto quote) throws Exception;
}
