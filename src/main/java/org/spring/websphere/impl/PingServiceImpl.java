package org.spring.websphere.impl;

import org.spring.websphere.service.PingService;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional
public class PingServiceImpl implements PingService {
	
	public String sayHello(String a) {
        return "Hello " + a + ", Welcome to CXF RS Spring Boot World!!!";
    }
	
	public String ping() {
        return "Ping... Welcome to JAX RS Spring Boot World!!!";
    }
	
}
