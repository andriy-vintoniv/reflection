package com.epam.part1.app;

import com.epam.part1.copy.CopyService;
import com.epam.part1.model.C;

public class App {
	public static void main(String[] args) {
		C c = new C();
		c.setF1(10l);
		c.setF2("field2");
		c.setF3(12.3);
		c.setF4((short) 32);
		C.setF0(12);
		C.setF10(321);

		System.out.println(c);

		CopyService copyService = new CopyService();
		C copy = (C) copyService.copy(c);

		System.out.println(copy);
	}
}
