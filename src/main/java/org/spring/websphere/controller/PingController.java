package org.spring.websphere.controller;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.spring.websphere.service.PingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class PingController {
	
	@Autowired
	PingService pingService;
	
	@Autowired
	private DataSource dataSource;
	
	@RequestMapping(value = "/")
	public String test(){
		return "Non Service based ping... try hitting /hello/ping or /hello/sayHello/{name}";
	}

	@RequestMapping("/factoryBean")
	@ResponseBody
	public String factoryBean() {
		return "DataSource retrieved from JNDI using JndiObjectFactoryBean: " + dataSource;
	}	
	
	@RequestMapping("/direct")
	@ResponseBody
	public String direct() throws NamingException {
		return "DataSource retrieved directly from JNDI: " +
				new InitialContext().lookup("java:comp/env/jdbc/myDataSource");
	}
	
	@RequestMapping(value = "/ping")
	public String ping(){
		return pingService.ping();
	}
	
	@RequestMapping(value = "/sayHello/{name}")
	public String sayHello(@PathVariable String name){
		return pingService.sayHello(name);
	}

}
