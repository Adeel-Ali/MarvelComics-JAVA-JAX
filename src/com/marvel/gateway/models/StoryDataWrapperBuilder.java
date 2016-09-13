/*
 * MarvelComics
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.marvel.gateway.models;

import java.util.*;

public class StoryDataWrapperBuilder {
    //the instance to build
    private StoryDataWrapper storyDataWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public StoryDataWrapperBuilder() {
        storyDataWrapper = new StoryDataWrapper();
    }

    /**
     * An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.
     */
    public StoryDataWrapperBuilder attributionHTML(String attributionHTML) {
        storyDataWrapper.setAttributionHTML(attributionHTML);
        return this;
    }

    /**
     * The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.
     */
    public StoryDataWrapperBuilder attributionText(String attributionText) {
        storyDataWrapper.setAttributionText(attributionText);
        return this;
    }

    /**
     * The HTTP status code of the returned result.
     */
    public StoryDataWrapperBuilder code(int code) {
        storyDataWrapper.setCode(code);
        return this;
    }

    /**
     * The copyright notice for the returned result.
     */
    public StoryDataWrapperBuilder copyright(String copyright) {
        storyDataWrapper.setCopyright(copyright);
        return this;
    }

    /**
     * The results returned by the call.
     */
    public StoryDataWrapperBuilder data(StoryDataContainer data) {
        storyDataWrapper.setData(data);
        return this;
    }

    /**
     * A digest value of the content returned by the call.
     */
    public StoryDataWrapperBuilder etag(String etag) {
        storyDataWrapper.setEtag(etag);
        return this;
    }

    /**
     * A string description of the call status.
     */
    public StoryDataWrapperBuilder status(String status) {
        storyDataWrapper.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StoryDataWrapper build() {
        return storyDataWrapper;
    }
}