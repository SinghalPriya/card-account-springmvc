package io.swagger.api;

import io.swagger.model.CardDetails;
import io.swagger.model.Cards;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-02T17:32:19.191+05:30")

@Controller
public class CardApiController implements CardApi {

    public ResponseEntity<Void> createCard(@ApiParam(value = "The card to be created."  ) @RequestBody CardDetails cardDetails) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Cards> getAllCards() {
        // do some magic!
        return new ResponseEntity<Cards>(HttpStatus.OK);
    }

}
