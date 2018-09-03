/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.accenture.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.accenture.model.JsonApiBodyRequest;
import com.accenture.model.JsonApiBodyResponseErrors;
import com.accenture.model.JsonApiBodyResponseSuccess;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-14T12:25:25.106-05:00")

@Api(value = "registrar", description = "the registrar API")
public interface RegistrarApi {
	@CrossOrigin(origins = "http://localhost:4200") 
    @ApiOperation(value = "registro de ofertas", nickname = "registrarPost", notes = "registro de ofertas", response = JsonApiBodyResponseSuccess.class, tags={ "ofertas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ofertas registrada correctamente", response = JsonApiBodyResponseSuccess.class),
        @ApiResponse(code = 400, message = "datos imcompletos o incorrectos", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/registrar",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<?> registrarPost(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody JsonApiBodyRequest body);

}
