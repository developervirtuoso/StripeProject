package com.test;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Refund;
import com.stripe.model.RefundCollection;

public class StripeAllRefund {
	public static void main(String[] args) throws StripeException, JSONException {
		Stripe.apiKey = "sk_test_Lbxu4SAcJG7U1sV1WzUT3hmb00anSpB386";
		Map<String, Object> params = new HashMap<>();
		params.put("limit", 3);

		RefundCollection refunds = Refund.list(params);
		//System.out.println(refunds.getRawJsonObject());
		JSONObject jsonObject=new JSONObject(refunds.getRawJsonObject().toString());  
		System.out.println(jsonObject);
		
	}
}
