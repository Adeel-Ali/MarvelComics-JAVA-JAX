/*
 * MarvelComics
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.marvel.gateway.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Event 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4620720583010773836L;
    private CharacterList characters;
    private ComicList comics;
    private CreatorList creators;
    private String description;
    private Date end;
    private int id;
    private Date modified;
    private EventSummary next;
    private EventSummary previous;
    private String resourceURI;
    private SeriesList series;
    private Date start;
    private StoryList stories;
    private Thumbnail thumbnail;
    private String title;
    private List<Url> urls;
    /** GETTER
     * A resource list containing the characters which appear in this event.
     */
    @JsonGetter("characters")
    public CharacterList getCharacters ( ) { 
        return this.characters;
    }
    
    /** SETTER
     * A resource list containing the characters which appear in this event.
     */
    @JsonSetter("characters")
    public void setCharacters (CharacterList value) { 
        this.characters = value;
    }
 
    /** GETTER
     * A resource list containing the comics in this event.
     */
    @JsonGetter("comics")
    public ComicList getComics ( ) { 
        return this.comics;
    }
    
    /** SETTER
     * A resource list containing the comics in this event.
     */
    @JsonSetter("comics")
    public void setComics (ComicList value) { 
        this.comics = value;
    }
 
    /** GETTER
     * A resource list containing creators whose work appears in this event.
     */
    @JsonGetter("creators")
    public CreatorList getCreators ( ) { 
        return this.creators;
    }
    
    /** SETTER
     * A resource list containing creators whose work appears in this event.
     */
    @JsonSetter("creators")
    public void setCreators (CreatorList value) { 
        this.creators = value;
    }
 
    /** GETTER
     * A description of the event.
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * A description of the event.
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * The date of publication of the last issue in this event.
     */
    @JsonGetter("end")
    public Date getEnd ( ) { 
        return this.end;
    }
    
    /** SETTER
     * The date of publication of the last issue in this event.
     */
    @JsonSetter("end")
    public void setEnd (Date value) { 
        this.end = value;
    }
 
    /** GETTER
     * The unique ID of the event resource.
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The unique ID of the event resource.
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
    }
 
    /** GETTER
     * The date the resource was most recently modified.
     */
    @JsonGetter("modified")
    public Date getModified ( ) { 
        return this.modified;
    }
    
    /** SETTER
     * The date the resource was most recently modified.
     */
    @JsonSetter("modified")
    public void setModified (Date value) { 
        this.modified = value;
    }
 
    /** GETTER
     * A summary representation of the event which follows this event.
     */
    @JsonGetter("next")
    public EventSummary getNext ( ) { 
        return this.next;
    }
    
    /** SETTER
     * A summary representation of the event which follows this event.
     */
    @JsonSetter("next")
    public void setNext (EventSummary value) { 
        this.next = value;
    }
 
    /** GETTER
     * A summary representation of the event which preceded this event.
     */
    @JsonGetter("previous")
    public EventSummary getPrevious ( ) { 
        return this.previous;
    }
    
    /** SETTER
     * A summary representation of the event which preceded this event.
     */
    @JsonSetter("previous")
    public void setPrevious (EventSummary value) { 
        this.previous = value;
    }
 
    /** GETTER
     * The canonical URL identifier for this resource.
     */
    @JsonGetter("resourceURI")
    public String getResourceURI ( ) { 
        return this.resourceURI;
    }
    
    /** SETTER
     * The canonical URL identifier for this resource.
     */
    @JsonSetter("resourceURI")
    public void setResourceURI (String value) { 
        this.resourceURI = value;
    }
 
    /** GETTER
     * A resource list containing the series in this event.
     */
    @JsonGetter("series")
    public SeriesList getSeries ( ) { 
        return this.series;
    }
    
    /** SETTER
     * A resource list containing the series in this event.
     */
    @JsonSetter("series")
    public void setSeries (SeriesList value) { 
        this.series = value;
    }
 
    /** GETTER
     * The date of publication of the first issue in this event.
     */
    @JsonGetter("start")
    public Date getStart ( ) { 
        return this.start;
    }
    
    /** SETTER
     * The date of publication of the first issue in this event.
     */
    @JsonSetter("start")
    public void setStart (Date value) { 
        this.start = value;
    }
 
    /** GETTER
     * A resource list containing the stories in this event.
     */
    @JsonGetter("stories")
    public StoryList getStories ( ) { 
        return this.stories;
    }
    
    /** SETTER
     * A resource list containing the stories in this event.
     */
    @JsonSetter("stories")
    public void setStories (StoryList value) { 
        this.stories = value;
    }
 
    /** GETTER
     * The representative image for this event.
     */
    @JsonGetter("thumbnail")
    public Thumbnail getThumbnail ( ) { 
        return this.thumbnail;
    }
    
    /** SETTER
     * The representative image for this event.
     */
    @JsonSetter("thumbnail")
    public void setThumbnail (Thumbnail value) { 
        this.thumbnail = value;
    }
 
    /** GETTER
     * The title of the event.
     */
    @JsonGetter("title")
    public String getTitle ( ) { 
        return this.title;
    }
    
    /** SETTER
     * The title of the event.
     */
    @JsonSetter("title")
    public void setTitle (String value) { 
        this.title = value;
    }
 
    /** GETTER
     * A set of public web site URLs for the event.
     */
    @JsonGetter("urls")
    public List<Url> getUrls ( ) { 
        return this.urls;
    }
    
    /** SETTER
     * A set of public web site URLs for the event.
     */
    @JsonSetter("urls")
    public void setUrls (List<Url> value) { 
        this.urls = value;
    }
 
}
 