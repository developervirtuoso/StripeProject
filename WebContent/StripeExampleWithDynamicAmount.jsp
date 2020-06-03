<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="https://checkout.stripe.com/checkout.js"></script>
</head>
<body>
	<form action='charge' method='POST' id='checkout-form' xmlns:th="http://www.w3.org/1999/xhtml">
		              			
							    <div class="form-group">
								      <label for="amount">Amount:</label>
								      <input type="text" class="form-control" id="amount" value="10" name="amount" >
								      <button id="stripe-button" class="btn btn-success" style="color: white; background-color: green; " type="button"> Payment</button>
								    </div>
									<script>
									       $('#stripe-button').click(function(){
									         var token = function(res){
									        	 var $id = $('<input type=hidden name=stripeToken />').val(res.id);
									             var $email = $('<input type=hidden name=stripeEmail />').val(res.email);
									             $('form').append($id).append($email).submit();
									         };
									
									         var amount = $("#amount").val();
									         var amountnew=amount*100;
									         StripeCheckout.open({
									           key:         'pk_test_hg6egUHgulhUSON9P4WUfA9S000bJmOi0o',
									           amount:      amountnew,
									           currency:	'INR',
									           name:        'Serendipity Artisan Blends',
									           image:       'http://www.stackabuse.com/assets/images/sa-java-dark.svg?v=b5a08453df',
									           description: 'Purchase Products',
									           panelLabel:  'Checkout',
									           token:       token
									         });
									
									         return false;
									       });
									     </script>		
							</form>
</body>
</html>