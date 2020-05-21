package com.test;

import java.util.HashMap;
import java.util.Map;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Sku;

public class SKU {
public static void main(String[] args) {
	Stripe.apiKey = "sk_test_Lbxu4SAcJG7U1sV1WzUT3hmb00anSpB386";

	Map<String, Object> attributes = new HashMap<>();
	attributes.put("size", "Medium");
	attributes.put("gender", "Unisex");
	Map<String, Object> inventory = new HashMap<>();
	inventory.put("type", "infinite");
	inventory.put("quantity", 1);
	Map<String, Object> params = new HashMap<>();
	//params.put("attributes", attributes);
	params.put("price", 100);
	params.put("currency", "inr");
	params.put("inventory", inventory);
	params.put("product", "prod_HHyQ6483dcwuu5");

	try {
		Sku sku = Sku.create(params);
		System.out.println(sku.getId());
	} catch (StripeException e) {
		e.printStackTrace();
	}
}
}
