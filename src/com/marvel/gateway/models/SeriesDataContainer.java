/*
 * MarvelComics
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.marvel.gateway.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SeriesDataContainer 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5167096509636883807L;
    private int count;
    private int limit;
    private int offset;
    private List<Series> results;
    private int total;
    /** GETTER
     * The total number of results returned by this call.
     */
    @JsonGetter("count")
    public int getCount ( ) { 
        return this.count;
    }
    
    /** SETTER
     * The total number of results returned by this call.
     */
    @JsonSetter("count")
    public void setCount (int value) { 
        this.count = value;
    }
 
    /** GETTER
     * The requested result limit.
     */
    @JsonGetter("limit")
    public int getLimit ( ) { 
        return this.limit;
    }
    
    /** SETTER
     * The requested result limit.
     */
    @JsonSetter("limit")
    public void setLimit (int value) { 
        this.limit = value;
    }
 
    /** GETTER
     * The requested offset (number of skipped results) of the call.
     */
    @JsonGetter("offset")
    public int getOffset ( ) { 
        return this.offset;
    }
    
    /** SETTER
     * The requested offset (number of skipped results) of the call.
     */
    @JsonSetter("offset")
    public void setOffset (int value) { 
        this.offset = value;
    }
 
    /** GETTER
     * The list of series returned by the call
     */
    @JsonGetter("results")
    public List<Series> getResults ( ) { 
        return this.results;
    }
    
    /** SETTER
     * The list of series returned by the call
     */
    @JsonSetter("results")
    public void setResults (List<Series> value) { 
        this.results = value;
    }
 
    /** GETTER
     * The total number of resources available given the current filter set.
     */
    @JsonGetter("total")
    public int getTotal ( ) { 
        return this.total;
    }
    
    /** SETTER
     * The total number of resources available given the current filter set.
     */
    @JsonSetter("total")
    public void setTotal (int value) { 
        this.total = value;
    }
 
}
 