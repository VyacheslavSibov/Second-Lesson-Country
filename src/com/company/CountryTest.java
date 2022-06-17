package com.company;

public class CountryTest {
    public static void main(String[] args) {
        // ctrl + alt + L
        Country ukraine = new Country();

        ukraine.nameCountry = "Country : Ukraine";
        ukraine.capital = "Capital : Kyiv";
        ukraine.continent = "Continent : Europa";
        ukraine.population = "Population : 40,997,699 M";
        ukraine.square = "Square : 603,549 km";
        ukraine.timezone = "TimeZone : UTC +2";

        System.out.println(ukraine.nameCountry);
        System.out.println(ukraine.capital);
        System.out.println(ukraine.continent);
        System.out.println(ukraine.population);
        System.out.println(ukraine.square);
        System.out.println(ukraine.timezone);
    }
}
