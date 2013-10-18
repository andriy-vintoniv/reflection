package com.epam.part2.app.service.impl;

import java.util.Random;

import com.epam.part2.app.service.PowerfulService;

public class PowerfulServiceImpl implements PowerfulService {

	@Override
	public void powerfulMethod1() throws InterruptedException {
		System.out.println("powerfulMethod1");

		Thread.sleep(new Random().nextInt(5000));
	}

	@Override
	public void powerfulMethod2(int powerfulParameter)
			throws InterruptedException {
		System.out.println("powerfulMethod2 with parameter "
				+ powerfulParameter);

		Thread.sleep(new Random().nextInt(5000));
	}

	@Override
	public void powerfulMethod3(String powerfulStringParameter,
			double powerfulDoubleParameter) throws InterruptedException {
		System.out.println("powerfulMethod3 with parameters: "
				+ powerfulStringParameter + ", " + powerfulDoubleParameter);

		Thread.sleep(new Random().nextInt(5000));
	}

}
