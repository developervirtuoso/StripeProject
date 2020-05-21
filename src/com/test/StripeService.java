package com.test;

import java.util.HashMap;
import java.util.Map;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;

public class StripeService {
	public StripeService() {
        Stripe.apiKey = "sk_test_Lbxu4SAcJG7U1sV1WzUT3hmb00anSpB386";
    }
	 public Charge chargeNewCard(String token, double amount)  {
		
	        Map<String, Object> chargeParams = new HashMap<String, Object>();
	        chargeParams.put("amount", (int)(amount * 100));
	        chargeParams.put("currency", "INR");
	        chargeParams.put("source", token);
	        chargeParams.put(
	        		  "description",
	        		  "My First Test Charge (created for API docs)"
	        		);
	        Charge charge = null;
			try {
				charge = Charge.create(chargeParams);
			} catch (StripeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      
	        return charge;
	    }
}
