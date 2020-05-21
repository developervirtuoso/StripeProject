package com.test;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.ChargeCollection;

public class StripeAllCharge {
	public static void main(String[] args) throws StripeException, JSONException {
		Stripe.apiKey = "sk_test_Lbxu4SAcJG7U1sV1WzUT3hmb00anSpB386";
		Map<String, Object> params = new HashMap<>();
		//params.put("limit", 3);

		ChargeCollection charges = Charge.list(params);
		JSONObject jsonObject=new JSONObject(charges.getRawJsonObject().toString());  
		System.out.println(jsonObject);
		JSONArray jsonArrayj=jsonObject.getJSONArray("data");
		System.out.println(jsonArrayj.length());
	}
}
