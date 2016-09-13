/*
 * MarvelComics
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.marvel.gateway.models;

import java.util.*;

public class ComicDataWrapperBuilder {
    //the instance to build
    private ComicDataWrapper comicDataWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public ComicDataWrapperBuilder() {
        comicDataWrapper = new ComicDataWrapper();
    }

    /**
     * An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.
     */
    public ComicDataWrapperBuilder attributionHTML(String attributionHTML) {
        comicDataWrapper.setAttributionHTML(attributionHTML);
        return this;
    }

    /**
     * The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.
     */
    public ComicDataWrapperBuilder attributionText(String attributionText) {
        comicDataWrapper.setAttributionText(attributionText);
        return this;
    }

    /**
     * The HTTP status code of the returned result.
     */
    public ComicDataWrapperBuilder code(int code) {
        comicDataWrapper.setCode(code);
        return this;
    }

    /**
     * The copyright notice for the returned result.
     */
    public ComicDataWrapperBuilder copyright(String copyright) {
        comicDataWrapper.setCopyright(copyright);
        return this;
    }

    /**
     * The results returned by the call.
     */
    public ComicDataWrapperBuilder data(ComicDataContainer data) {
        comicDataWrapper.setData(data);
        return this;
    }

    /**
     * A digest value of the content returned by the call.
     */
    public ComicDataWrapperBuilder etag(String etag) {
        comicDataWrapper.setEtag(etag);
        return this;
    }

    /**
     * A string description of the call status.
     */
    public ComicDataWrapperBuilder status(String status) {
        comicDataWrapper.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ComicDataWrapper build() {
        return comicDataWrapper;
    }
}