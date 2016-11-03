package io.swagger.api;

import io.swagger.model.CardDetails;
import io.swagger.model.Cards;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-02T17:32:19.191+05:30")

@Api(value = "card", description = "the card API")
public interface CardApi {

    @ApiOperation(value = "Creates a card", notes = "Adds a new card to the Finkit system.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Card succesfully created.", response = Void.class),
        @ApiResponse(code = 400, message = "Error creating the card", response = Void.class) })
    @RequestMapping(value = "/card",
        method = RequestMethod.POST)
    ResponseEntity<Void> createCard(@ApiParam(value = "The card to be created."  ) @RequestBody CardDetails cardDetails);


    @ApiOperation(value = "Gets card details", notes = "Returns a list containing all card details", response = Cards.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of Cards", response = Cards.class) })
    @RequestMapping(value = "/card",
        method = RequestMethod.GET)
    ResponseEntity<Cards> getAllCards();

}
