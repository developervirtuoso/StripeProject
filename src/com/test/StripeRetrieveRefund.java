package com.test;

import com.stripe.exception.StripeException;
import com.stripe.model.Refund;

public class StripeRetrieveRefund {
	public static void main(String[] args) throws StripeException {
		StripeService stripeService=new StripeService();
		Refund refund =Refund.retrieve("re_1GlAM3Cum01rodh2z65hMJny");
		System.out.println("id = "+refund.getId());
		System.out.println("Object = "+refund.getObject());
		System.out.println("amount = "+refund.getAmount());
		System.out.println("charge = "+refund.getCharge());
		System.out.println("created = "+refund.getCreated());
		System.out.println("currency = "+refund.getCurrency());
		System.out.println("metadata = "+refund.getMetadata());
		System.out.println("payment_intent = "+refund.getPaymentIntent());
		System.out.println("status = "+refund.getStatus());

	}
}
