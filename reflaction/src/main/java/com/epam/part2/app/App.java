package com.epam.part2.app;

import java.lang.reflect.Proxy;

import com.epam.part2.app.service.PowerfulService;
import com.epam.part2.app.service.impl.PowerfulServiceImpl;
import com.epam.part2.handler.PowerfulServiceInvocationHandler;

public class App {
	public static void main(String[] args) {

		PowerfulServiceInvocationHandler powerfulServiceInvocationHandler = new PowerfulServiceInvocationHandler(
				new PowerfulServiceImpl());

		PowerfulService powerfulService = (PowerfulService) Proxy
				.newProxyInstance(PowerfulServiceImpl.class.getClassLoader(),
						new Class[] { PowerfulService.class },
						powerfulServiceInvocationHandler);

		try {
			powerfulService.powerfulMethod1();
			powerfulService.powerfulMethod2(1024);
			powerfulService.powerfulMethod3("The best parameter", 123.456);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
