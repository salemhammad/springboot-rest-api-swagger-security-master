package com.example.salemwebser.payload;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Api(value = "Product model information")
@Data
public class ProductDto {
    @ApiModelProperty(value = "Product id")
    private int productId;

    @ApiModelProperty(value = "Product slug")
    @NotEmpty(message = "Slug should not be null or empty")
    private String slug;

    @ApiModelProperty(value = "Product name")
    @NotEmpty(message = "Name should not be null or empty")
    private String name;

    @ApiModelProperty(value = "Product reference")
    @NotEmpty(message = "Reference should not be null or empty")
    private String reference;

    @ApiModelProperty(value = "Product price")
    private double price;

    @ApiModelProperty(value = "Product VAT")
    private double vat;

    @ApiModelProperty(value = "Is product stockable")
    private boolean stockAble;

    // Getters and setters
}