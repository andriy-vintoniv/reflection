package com.epam.part2.app.service;

import javax.xml.bind.annotation.XmlElement;

public interface PowerfulService {
	void powerfulMethod1() throws InterruptedException;

	void powerfulMethod2(int powerfulParameter) throws InterruptedException;

	@XmlElement
	void powerfulMethod3(String powerfulStringParameter,
			double powerfulDoubleParameter) throws InterruptedException;
}
