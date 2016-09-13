/*
 * MarvelComics
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.marvel.gateway.interfaces;

import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import com.marvel.gateway.models.*;

public interface ComicsInterface {
    /**
     * Fetches a single comic by id.
     * @param    comicId    Required parameter: A single comic.
	 * @return	Returns the Comic response from the API call*/
    @GET
    @Path("/comics/{comicId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Comic getComicIndividualAsync(
            @PathParam("comicId") String comicId);
    /**
     * Fetches lists of characters filtered by a comic id.
     * @param    comicId    Required parameter: A single comic.
     * @param    events    Optional parameter: Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids).
     * @param    limit    Optional parameter: Limit the result set to the specified number of resources.
     * @param    modifiedSince    Optional parameter: Return only characters which have been modified since the specified date.
     * @param    name    Optional parameter: Return only characters matching the specified full character name (e.g. Spider-Man).
     * @param    nameStartsWith    Optional parameter: Return characters with names that begin with the specified string (e.g. Sp).
     * @param    offset    Optional parameter: Skip the specified number of resources in the result set.
     * @param    orderBy    Optional parameter: Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "name", "modified", "-name", "-modified")
     * @param    series    Optional parameter: Return only characters which appear the specified series (accepts a comma-separated list of ids).
     * @param    stories    Optional parameter: Return only characters which appear the specified stories (accepts a comma-separated list of ids).
	 * @return	Returns the CharacterDataWrapper response from the API call*/
    @GET
    @Path("/comics/{comicId}/characters")
    @Produces(MediaType.APPLICATION_JSON)
    public CharacterDataWrapper getComicCharacterCollectionAsync(
            @PathParam("comicId") String comicId,
            @QueryParam("events") String events,
            @QueryParam("limit") String limit,
            @QueryParam("modifiedSince") String modifiedSince,
            @QueryParam("name") String name,
            @QueryParam("nameStartsWith") String nameStartsWith,
            @QueryParam("offset") String offset,
            @QueryParam("orderBy") String orderBy,
            @QueryParam("series") String series,
            @QueryParam("stories") String stories);
    /**
     * Fetches lists of creators filtered by a comic id.
     * @param    comicId    Required parameter: A single comic.
     * @param    comics    Optional parameter: Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).
     * @param    firstName    Optional parameter: Filter by creator first name (e.g. brian).
     * @param    firstNameStartsWith    Optional parameter: Filter by creator first names that match critera (e.g. B, St L).
     * @param    lastName    Optional parameter: Filter by creator last name (e.g. Bendis).
     * @param    lastNameStartsWith    Optional parameter: Filter by creator last names that match critera (e.g. Ben).
     * @param    limit    Optional parameter: Limit the result set to the specified number of resources.
     * @param    middleName    Optional parameter: Filter by creator middle name (e.g. Michael).
     * @param    middleNameStartsWith    Optional parameter: Filter by creator middle names that match critera (e.g. Mi).
     * @param    modifiedSince    Optional parameter: Return only creators which have been modified since the specified date.
     * @param    nameStartsWith    Optional parameter: Filter by creator names that match critera (e.g. B, St L).
     * @param    offset    Optional parameter: Skip the specified number of resources in the result set.
     * @param    orderBy    Optional parameter: Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "lastName", "firstName", "middleName", "suffix", "modified", "-lastName", "-firstName", "-middleName", "-suffix", "-modified")
     * @param    series    Optional parameter: Return only creators who worked on the specified series (accepts a comma-separated list of ids).
     * @param    stories    Optional parameter: Return only creators who worked on the specified stories (accepts a comma-separated list of ids).
     * @param    suffix    Optional parameter: Filter by suffix or honorific (e.g. Jr., Sr.).
	 * @return	Returns the CreatorDataWrapper response from the API call*/
    @GET
    @Path("/comics/{comicId}/creators")
    @Produces(MediaType.APPLICATION_JSON)
    public CreatorDataWrapper getCreatorCollectionByComicIdAsync(
            @PathParam("comicId") String comicId,
            @QueryParam("comics") String comics,
            @QueryParam("firstName") String firstName,
            @QueryParam("firstNameStartsWith") String firstNameStartsWith,
            @QueryParam("lastName") String lastName,
            @QueryParam("lastNameStartsWith") String lastNameStartsWith,
            @QueryParam("limit") String limit,
            @QueryParam("middleName") String middleName,
            @QueryParam("middleNameStartsWith") String middleNameStartsWith,
            @QueryParam("modifiedSince") String modifiedSince,
            @QueryParam("nameStartsWith") String nameStartsWith,
            @QueryParam("offset") String offset,
            @QueryParam("orderBy") String orderBy,
            @QueryParam("series") String series,
            @QueryParam("stories") String stories,
            @QueryParam("suffix") String suffix);
    /**
     * Fetches lists of events filtered by a comic id.
     * @param    comicId    Required parameter: A single comic.
     * @param    characters    Optional parameter: Return only events which feature the specified characters (accepts a comma-separated list of ids).
     * @param    creators    Optional parameter: Return only events which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param    limit    Optional parameter: Limit the result set to the specified number of resources.
     * @param    modifiedSince    Optional parameter: Return only events which have been modified since the specified date.
     * @param    name    Optional parameter: Filter the event list by name.
     * @param    nameStartsWith    Optional parameter: Return events with names that begin with the specified string (e.g. Sp).
     * @param    offset    Optional parameter: Skip the specified number of resources in the result set.
     * @param    orderBy    Optional parameter: Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "name", "startDate", "modified", "-name", "-startDate", "-modified")
     * @param    series    Optional parameter: Return only events which are part of the specified series (accepts a comma-separated list of ids).
     * @param    stories    Optional parameter: Return only events which contain the specified stories (accepts a comma-separated list of ids).
	 * @return	Returns the EventDataWrapper response from the API call*/
    @GET
    @Path("/comics/{comicId}/events")
    @Produces(MediaType.APPLICATION_JSON)
    public EventDataWrapper getIssueEventsCollectionAsync(
            @PathParam("comicId") String comicId,
            @QueryParam("characters") String characters,
            @QueryParam("creators") String creators,
            @QueryParam("limit") String limit,
            @QueryParam("modifiedSince") String modifiedSince,
            @QueryParam("name") String name,
            @QueryParam("nameStartsWith") String nameStartsWith,
            @QueryParam("offset") String offset,
            @QueryParam("orderBy") String orderBy,
            @QueryParam("series") String series,
            @QueryParam("stories") String stories);
    /**
     * Fetches lists of stories filtered by a comic id.
     * @param    comicId    Required parameter: A single comic.
     * @param    characters    Optional parameter: Return only stories which feature the specified characters (accepts a comma-separated list of ids).
     * @param    creators    Optional parameter: Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param    events    Optional parameter: Return only stories which take place during the specified events (accepts a comma-separated list of ids).
     * @param    limit    Optional parameter: Limit the result set to the specified number of resources.
     * @param    modifiedSince    Optional parameter: Return only stories which have been modified since the specified date.
     * @param    offset    Optional parameter: Skip the specified number of resources.
     * @param    orderBy    Optional parameter: Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "id", "modified", "-id", "-modified")
     * @param    series    Optional parameter: Return only stories contained the specified series (accepts a comma-separated list of ids).
	 * @return	Returns the StoryDataWrapper response from the API call*/
    @GET
    @Path("/comics/{comicId}/stories")
    @Produces(MediaType.APPLICATION_JSON)
    public StoryDataWrapper getComicStoryCollectionByComicIdAsync(
            @PathParam("comicId") String comicId,
            @QueryParam("characters") String characters,
            @QueryParam("creators") String creators,
            @QueryParam("events") String events,
            @QueryParam("limit") String limit,
            @QueryParam("modifiedSince") String modifiedSince,
            @QueryParam("offset") String offset,
            @QueryParam("orderBy") String orderBy,
            @QueryParam("series") String series);
    /**
     * Fetches lists of comics.
     * @param    characters    Optional parameter: Return only comics which feature the specified characters (accepts a comma-separated list of ids).
     * @param    collaborators    Optional parameter: Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). Accepts a comma-separated list of ids.
     * @param    creators    Optional parameter: Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param    dateDescriptor    Optional parameter: Return comics within a predefined date range.
     * @param    dateRange    Optional parameter: Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.
     * @param    diamondCode    Optional parameter: Filter by diamond code.
     * @param    digitalId    Optional parameter: Filter by digital comic id.
     * @param    ean    Optional parameter: Filter by EAN.
     * @param    events    Optional parameter: Return only comics which take place in the specified events (accepts a comma-separated list of ids).
     * @param    format    Optional parameter: Filter by the issue format (e.g. comic, digital comic, hardcover). (Acceptable values are: "comic", "magazine", "trade paperback", "hardcover", "digest", "graphic novel", "digital comic", "infinite comic")
     * @param    formatType    Optional parameter: Filter by the issue format type (comic or collection).
     * @param    hasDigitalIssue    Optional parameter: Include only results which are available digitally. (Acceptable values are: "true")
     * @param    isbn    Optional parameter: Filter by ISBN.
     * @param    issn    Optional parameter: Filter by ISSN.
     * @param    issueNumber    Optional parameter: Return only issues in series whose issue number matches the input.
     * @param    limit    Optional parameter: Limit the result set to the specified number of resources.
     * @param    modifiedSince    Optional parameter: Return only comics which have been modified since the specified date.
     * @param    noVariants    Optional parameter: Exclude variants (alternate covers, secondary printings, director's cuts, etc.) from the result set. (Acceptable values are: "true")
     * @param    offset    Optional parameter: Skip the specified number of resources in the result set.
     * @param    orderBy    Optional parameter: Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "focDate", "onsaleDate", "title", "issueNumber", "modified", "-focDate", "-onsaleDate", "-title", "-issueNumber", "-modified")
     * @param    series    Optional parameter: Return only comics which are part of the specified series (accepts a comma-separated list of ids).
     * @param    sharedAppearances    Optional parameter: Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). Accepts a comma-separated list of ids.
     * @param    startYear    Optional parameter: Return only issues in series whose start year matches the input.
     * @param    stories    Optional parameter: Return only comics which contain the specified stories (accepts a comma-separated list of ids).
     * @param    title    Optional parameter: Return only issues in series whose title matches the input.
     * @param    titleStartsWith    Optional parameter: Return only issues in series whose title starts with the input.
     * @param    upc    Optional parameter: Filter by UPC.
	 * @return	Returns the ComicDataWrapper response from the API call*/
    @GET
    @Path("/comics")
    @Produces(MediaType.APPLICATION_JSON)
    public ComicDataWrapper getComicsCollectionAsync(
            @QueryParam("characters") String characters,
            @QueryParam("collaborators") String collaborators,
            @QueryParam("creators") String creators,
            @QueryParam("dateDescriptor") String dateDescriptor,
            @QueryParam("dateRange") String dateRange,
            @QueryParam("diamondCode") String diamondCode,
            @QueryParam("digitalId") String digitalId,
            @QueryParam("ean") String ean,
            @QueryParam("events") String events,
            @QueryParam("format") String format,
            @QueryParam("formatType") String formatType,
            @QueryParam("hasDigitalIssue") String hasDigitalIssue,
            @QueryParam("isbn") String isbn,
            @QueryParam("issn") String issn,
            @QueryParam("issueNumber") String issueNumber,
            @QueryParam("limit") String limit,
            @QueryParam("modifiedSince") String modifiedSince,
            @QueryParam("noVariants") String noVariants,
            @QueryParam("offset") String offset,
            @QueryParam("orderBy") String orderBy,
            @QueryParam("series") String series,
            @QueryParam("sharedAppearances") String sharedAppearances,
            @QueryParam("startYear") String startYear,
            @QueryParam("stories") String stories,
            @QueryParam("title") String title,
            @QueryParam("titleStartsWith") String titleStartsWith,
            @QueryParam("upc") String upc);
}