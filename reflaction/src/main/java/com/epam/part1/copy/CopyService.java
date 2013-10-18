package com.epam.part1.copy;

import java.lang.reflect.Field;

public class CopyService {

	public Object copy(Object originObject) {
		Object copy = null;
		Class<? extends Object> clazz = originObject.getClass();

		try {
			copy = clazz.newInstance();

			Field[] fields = clazz.getDeclaredFields();

			for (Field field : fields) {
				field.setAccessible(true);
				Object fieldValue = field.get(originObject);

				field.set(copy, fieldValue);
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return copy;
	}

}
