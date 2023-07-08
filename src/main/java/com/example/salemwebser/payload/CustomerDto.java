package com.example.salemwebser.payload;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Api(value = "Customer model information")
@Data
public class CustomerDto {
    @ApiModelProperty(value = "Customer id")
    private int customerId;

    @ApiModelProperty(value = "Customer first name")
    @NotEmpty(message = "First name should not be null or empty")
    private String firstName;

    @ApiModelProperty(value = "Customer last name")
    @NotEmpty(message = "Last name should not be null or empty")
    private String lastName;

    @ApiModelProperty(value = "Customer birth date")
    @NotEmpty(message = "Birth date should not be null or empty")
    private String bornAtDate;

    // Getters and setters
}