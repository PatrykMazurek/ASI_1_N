package pl.uken.asi1_n.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.uken.asi1_n.model.Currency;

import java.util.Arrays;
import java.util.List;

@Service
public class CurrencyService {

    private List<Currency> getData(){
        String url = "https://api.nbp.pl/api/exchangerates/tables/c/?format=json";
        RestTemplate template = new RestTemplate();
        String result = template.getForObject(url, String.class);
        ObjectMapper mapper = new ObjectMapper();
        Currency[] currencyList = null;
        try {
            currencyList = mapper.readValue(result, Currency[].class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return Arrays.asList(currencyList);
    }

    public Currency getAllCurrency(){
        return getData().get(0);
    }

}
