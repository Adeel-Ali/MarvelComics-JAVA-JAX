/*
 * MarvelComics
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.marvel.gateway.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Url 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5115871853077635882L;
    private String type;
    private String url;
    /** GETTER
     * A text identifier for the URL.
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * A text identifier for the URL.
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * A full URL (including scheme, domain, and path).
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * A full URL (including scheme, domain, and path).
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
}
 