/*
 * MarvelComics
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.marvel.gateway.models;

import java.util.*;

public class ComicPriceBuilder {
    //the instance to build
    private ComicPrice comicPrice;

    /**
     * Default constructor to initialize the instance
     */
    public ComicPriceBuilder() {
        comicPrice = new ComicPrice();
    }

    /**
     * The price (all prices in USD).
     */
    public ComicPriceBuilder price(double price) {
        comicPrice.setPrice(price);
        return this;
    }

    /**
     * A description of the price (e.g. print price, digital price).
     */
    public ComicPriceBuilder type(String type) {
        comicPrice.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ComicPrice build() {
        return comicPrice;
    }
}