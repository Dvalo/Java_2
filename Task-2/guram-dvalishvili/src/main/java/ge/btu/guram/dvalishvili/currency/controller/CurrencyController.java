package ge.btu.guram.dvalishvili.currency.controller;

import ge.btu.guram.dvalishvili.currency.model.Currency;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/currency")
public class CurrencyController {
    public List<Currency> currencyData = new ArrayList<>();

    public CurrencyController() {
        currencyData.add(new Currency("USD", 3.16, 3.2));
        currencyData.add(new Currency("EUR", 3.425, 3.475));
        currencyData.add(new Currency("GBP", 3.84, 3.94));
        currencyData.add(new Currency("RUB", 4.12, 4.3));
        currencyData.add(new Currency("TRY", 0.4, 0.47));
        currencyData.add(new Currency("AZN", 1.6, 1.84));
    }

    @GET
    @Path("/currencies")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Currency> displayCurrencies() {
        return currencyData;
    }

    @POST
    @Path("/buy")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public double convertFromGel(final PostData input) {
        String convertTo = input.to;
        double convertAmt = input.amount;
        for (int i = 0; i < currencyData.size(); i++) {
            if (convertTo.equals(currencyData.get(i).getTitle())) {
                return Currency.convertFromGel(currencyData.get(i).getSell(), convertAmt);
            }
        }
        return 0;
    }

    @POST
    @Path("/sell")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public double convertToGel(final PostData input) {
        String convertTo = input.to;
        double convertAmt = input.amount;
        for (int i = 0; i < currencyData.size(); i++) {
            if (convertTo.equals(currencyData.get(i).getTitle())) {
                return Currency.convertToGel(currencyData.get(i).getBuy(), convertAmt);
            }
        }
        return 0;
    }
}
