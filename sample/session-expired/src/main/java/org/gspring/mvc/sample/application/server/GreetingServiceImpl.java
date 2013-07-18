package org.gspring.mvc.sample.application.server;

import org.gspring.mvc.sample.application.client.GreetingService;
import org.gspring.mvc.sample.application.shared.security.ApplicationException;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@Service("greetingService")
public class GreetingServiceImpl implements GreetingService {
	@Override
	public String greetServer(String name) throws ApplicationException {
		return MessageFormat.format("Hello, {0}!", name);
	}
}
