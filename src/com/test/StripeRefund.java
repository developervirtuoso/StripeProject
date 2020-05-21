package com.test;

import java.util.HashMap;
import java.util.Map;

import com.stripe.exception.StripeException;
import com.stripe.model.Refund;

public class StripeRefund {
	public static void main(String[] args) throws StripeException {
		StripeService stripeService=new StripeService();
		Map<String, Object> params = new HashMap<>();
		params.put(
		  "charge",
		  "ch_1Gk138Cum01rodh25QIeen08"
		);
		Refund refund = Refund.create(params);
		System.out.println("id = "+refund.getId());
		System.out.println("Object = "+refund.getObject());
		System.out.println("amount = "+refund.getAmount());
		System.out.println("charge = "+refund.getCharge());
		System.out.println("created = "+refund.getCreated());
		System.out.println("currency = "+refund.getCurrency());
		System.out.println("metadata = "+refund.getMetadata());
		System.out.println("payment_intent = "+refund.getPaymentIntent());
		System.out.println(refund.getStatus());
	}
}
