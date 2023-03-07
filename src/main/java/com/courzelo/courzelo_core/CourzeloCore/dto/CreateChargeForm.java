package com.courzelo.courzelo_core.CourzeloCore.dto;

import lombok.Data;

/**
 * The form submitted to {@link ChargeController} to create a charge.
 * @author Jonathan Miller <john@essolutions.io>
 */
@Data
public class CreateChargeForm {
	private String token;
	private int price;
	private String currency;
	private String description;
}
