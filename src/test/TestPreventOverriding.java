package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class TVSeries
{
    protected int maxTVSeriesDurationInMinutes = 99;
    protected static int maxAdvertisementDurationInMinutes = 99;
    protected BigDecimal maxBudgetInDollars = new BigDecimal(99);
    protected List<String> platforms;

    public TVSeries() {  platforms = new ArrayList<>(); }

    private void setMaximumTVSeriesDurationInMinutes()
    {
        this.maxTVSeriesDurationInMinutes = 40;
    }

    public static void setAdvertisementDurationInMinutes()
    {
       maxAdvertisementDurationInMinutes = 15;
    }

    public final void setMaximumBudget()
    {
        this.maxBudgetInDollars = BigDecimal.valueOf(500000);
    }

    public void setPlatforms()
    {
        this.platforms.add("Netflix");
        this.platforms.add("BluTV");
        this.platforms.add("TRT");
    }

    @Override
    public String toString() {
        return "TVSeries{" +
                "maxTVSeriesDurationInMinutes=" + this.maxTVSeriesDurationInMinutes +
                ", maxAdvertisementDurationInMinutes=" + this.maxAdvertisementDurationInMinutes +
                ", maxBudgetInDollars=" + this.maxBudgetInDollars +
                ", platforms=" + this.platforms +
                '}';
    }
}

class PeakyBlinders extends TVSeries
{
    // ERROR: method does not override or implement a method from a supertype
//    @Override
//    public void setMaximumTVSeriesDurationInMinutes()
//    {
//        this.maxTVSeriesDurationInMinutes = 50;
//    }

    // ERROR: setAdvertisementDurationInMinutes() in test.PeakyBlinders
    // cannot override setAdvertisementDurationInMinutes() in test.TVSeries
    // overridden method is static
//    @Override
//    public void setAdvertisementDurationInMinutes()
//    {
//        maxAdvertisementDurationInMinutes = 15;
//    }

    // ERROR: setMaximumBudget() in test.PeakyBlinders
    // cannot override setMaximumBudget() in test.TVSeries
    // overridden method is final
//    @Override
//    public void setMaximumBudget()
//    {
//        this.maxBudgetInDollars = BigDecimal.valueOf(10000000);
//    }

    // can overriding because superclass have public, non-static and non-final modifier
    @Override
    public void setPlatforms()
    {
        this.platforms.add("HBO");
    }

    @Override
    public String toString() {
        return "PeakyBlinders{" +
                "maxTVSeriesDurationInMinutes=" + this.maxTVSeriesDurationInMinutes +
                ", maxAdvertisementDurationInMinutes=" + maxAdvertisementDurationInMinutes +
                ", maxBudgetInDollars=" + this.maxBudgetInDollars +
                ", platforms=" + this.platforms +
                '}';
    }
}

class PreventOverriding
{
    public static void main(String[] args)
    {
        TVSeries referencedTvSeries = new TVSeries();
        referencedTvSeries.setPlatforms();
        referencedTvSeries.setMaximumBudget();
        System.out.println(referencedTvSeries.toString());

        TVSeries.setAdvertisementDurationInMinutes();
        System.out.println(referencedTvSeries.toString());

        TVSeries referencedPeakyBlinders = new PeakyBlinders();
        referencedPeakyBlinders.setPlatforms();
        referencedPeakyBlinders.setMaximumBudget();

        PeakyBlinders peakyBlinders = new PeakyBlinders();
        peakyBlinders.setPlatforms();
        peakyBlinders.setMaximumBudget();


        System.out.println(referencedPeakyBlinders.toString());
        System.out.println(peakyBlinders.toString());
    }
}
