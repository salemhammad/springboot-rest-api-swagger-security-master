
package com.example.salemwebser.payload;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Api(value = "ProductOrder model information")
@Data
public class ProductOrderDto {
    @ApiModelProperty(value = "ProductOrder id")
    private int id;

    @ApiModelProperty(value = "ProductOrder quantity")
    private int quantity;

    @ApiModelProperty(value = "ProductOrder price")
    private double price;

    @ApiModelProperty(value = "ProductOrder VAT")
    private double vat;

    // Getters and setters
}
