/*
 * MarvelComics
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.marvel.gateway.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreatorDataWrapper 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5131554302794692511L;
    private String attributionHTML;
    private String attributionText;
    private int code;
    private String copyright;
    private CreatorDataContainer data;
    private String etag;
    private String status;
    /** GETTER
     * An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.
     */
    @JsonGetter("attributionHTML")
    public String getAttributionHTML ( ) { 
        return this.attributionHTML;
    }
    
    /** SETTER
     * An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.
     */
    @JsonSetter("attributionHTML")
    public void setAttributionHTML (String value) { 
        this.attributionHTML = value;
    }
 
    /** GETTER
     * The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.
     */
    @JsonGetter("attributionText")
    public String getAttributionText ( ) { 
        return this.attributionText;
    }
    
    /** SETTER
     * The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.
     */
    @JsonSetter("attributionText")
    public void setAttributionText (String value) { 
        this.attributionText = value;
    }
 
    /** GETTER
     * The HTTP status code of the returned result.
     */
    @JsonGetter("code")
    public int getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * The HTTP status code of the returned result.
     */
    @JsonSetter("code")
    public void setCode (int value) { 
        this.code = value;
    }
 
    /** GETTER
     * The copyright notice for the returned result.
     */
    @JsonGetter("copyright")
    public String getCopyright ( ) { 
        return this.copyright;
    }
    
    /** SETTER
     * The copyright notice for the returned result.
     */
    @JsonSetter("copyright")
    public void setCopyright (String value) { 
        this.copyright = value;
    }
 
    /** GETTER
     * The results returned by the call.
     */
    @JsonGetter("data")
    public CreatorDataContainer getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The results returned by the call.
     */
    @JsonSetter("data")
    public void setData (CreatorDataContainer value) { 
        this.data = value;
    }
 
    /** GETTER
     * A digest value of the content returned by the call.
     */
    @JsonGetter("etag")
    public String getEtag ( ) { 
        return this.etag;
    }
    
    /** SETTER
     * A digest value of the content returned by the call.
     */
    @JsonSetter("etag")
    public void setEtag (String value) { 
        this.etag = value;
    }
 
    /** GETTER
     * A string description of the call status.
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * A string description of the call status.
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
}
 