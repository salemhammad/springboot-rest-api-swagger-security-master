package com.example.salemwebser.payload;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Api(value = "Orders model information")
@Data
public class OrdersDto {
    @ApiModelProperty(value = "Orders id")
    private int ordersId;

    @ApiModelProperty(value = "Orders date")
    @NotEmpty(message = "Date should not be null or empty")
    private String date;

    // Getters and setters
}