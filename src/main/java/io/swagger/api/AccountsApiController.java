package io.swagger.api;

import io.swagger.model.AccountDetails;
import io.swagger.model.Accounts;

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
public class AccountsApiController implements AccountsApi {

    public ResponseEntity<Void> createAccount(@ApiParam(value = "The account to be created."  ) @RequestBody AccountDetails accountDetails) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<AccountDetails> getAccountDetails(@ApiParam(value = "The person's accountNumber",required=true ) @PathVariable("accountNumber") Integer accountNumber) {
        // do some magic!
        return new ResponseEntity<AccountDetails>(HttpStatus.OK);
    }

    public ResponseEntity<Accounts> getAllAccounts() {
        // do some magic!
        return new ResponseEntity<Accounts>(HttpStatus.OK);
    }

}
