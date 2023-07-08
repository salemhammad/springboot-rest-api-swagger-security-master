package com.example.salemwebser.payload;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Api(value = "Stoke model information")
@Data
public class StokeDto {
    @ApiModelProperty(value = "Stoke id")
    private int stokeID;

    @ApiModelProperty(value = "Stoke quantity")
    private int quantity;

    @ApiModelProperty(value = "Stoke update date and time")
    @NotEmpty(message = "Update date and time should not be null or empty")
    private String updateAtDateTime;

    // Getters and setters
}