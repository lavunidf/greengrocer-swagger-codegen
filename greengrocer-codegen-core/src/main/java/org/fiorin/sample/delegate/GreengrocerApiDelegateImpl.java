package org.fiorin.sample.delegate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import io.swagger.api.GreengrocerApiDelegate;
import io.swagger.model.BuyApplesRequest;
import io.swagger.model.BuyApplesResponse;
import io.swagger.model.Outcome;

@Component
public class GreengrocerApiDelegateImpl implements GreengrocerApiDelegate {

	/**
	 * Simple implementation of an operation
	 */
	@Override
	public ResponseEntity<BuyApplesResponse> buyApples(BuyApplesRequest buyApplesRequest) {

		// Decoupling between request and Data Transfer Object shoulde be here
		//
		// Service component call should be here
		// buyAppleResponseDTO = AppleService.buyApples(buyApplesRequestDTO)

		BuyApplesResponse response = new BuyApplesResponse();

		Outcome outcome = new Outcome();
		outcome.setOutcome(Boolean.TRUE);

		response.setOutcome(outcome);
		return new ResponseEntity<BuyApplesResponse>(response, HttpStatus.OK);
	}
}
