package ge.btu.guram.dvalishvili.covid_19.services;

import ge.btu.guram.dvalishvili.covid_19.models.Covid;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class CovidService {
    public List<Covid> covidData = new ArrayList<>();

    public CovidService() {
        covidData.add(new Covid("US", 760245, 40702, 71003));
        covidData.add(new Covid("Spain", 200210, 166256, 635895));
        covidData.add(new Covid("Italy", 178972, 23660, 51003));
    }

    @WebMethod
    public Covid getCountryStatistic(String country) {
        for (int i = 0; i < covidData.size(); i++) {
            if (covidData.get(i).getCountry() == country) {
                return covidData.get(i);
            }
        }
        return null;
    }

    @WebMethod
    public List<Covid> getStatistic() {
        return covidData;
    }

    @WebMethod
    public int TotalConfirmed() {
        int total = 0;
        for (int i = 0; i < covidData.size(); i++) {
            total += covidData.get(i).getConfirmed();
        }
        return total;
    }

    @WebMethod
    public int TotalDeathGet() {
        int total = 0;
        for (int i = 0; i < covidData.size(); i++) {
            total += covidData.get(i).getDeaths();
        }
        return total;
    }

    @WebMethod
    public int TotalRecoveryGet() {
        int total = 0;
        for (int i = 0; i < covidData.size(); i++) {
            total += covidData.get(i).getRecovered();
        }
        return total;
    }
}
