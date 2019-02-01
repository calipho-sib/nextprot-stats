package org.nextprot.stats;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PublicationController {

	private static String NEXTPROT_API_HOST = "https://api.nextprot.org";

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(path="/publication/{pubid}", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation("Returns the requested course.")
	public PublicationBean protoBufCustomer(@PathVariable String pubid) {

		// https://api.nextprot.org/publication/pubid/630194.json

		Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("pubid", pubid);

		return new RestTemplate().getForObject(
				NEXTPROT_API_HOST+"/publication/pubid/{pubid}", PublicationBean.class,
				uriVariables);
	}
}