package com.epam.part2.handler;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

import com.epam.part2.app.service.PowerfulService;

public class PowerfulServiceInvocationHandler implements InvocationHandler {

	private PowerfulService powerfulService;

	public PowerfulServiceInvocationHandler(PowerfulService powerfulService) {
		this.powerfulService = powerfulService;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		showMethodInfo(method);

		Date startDate = new Date();
		Object result = method.invoke(powerfulService, args);
		Date endDate = new Date();

		System.out.println("Invocation time: "
				+ (endDate.getTime() - startDate.getTime()) + "ms.");
		System.out.println();
		return result;
	}

	private void showMethodInfo(Method method) {
		System.out.println("Method: " + method.getName());
		showDeclaredClassInfo(method.getDeclaringClass());
		showParametersInfo(method.getParameterTypes());
		showAnnotationsInfo(method.getDeclaredAnnotations());
	}

	private void showAnnotationsInfo(Annotation[] declaredAnnotations) {
		System.out.println("Annotations number: " + declaredAnnotations.length);
		for (Annotation annotation : declaredAnnotations) {
			System.out.println("Annotation: "
					+ annotation.annotationType().getName());
		}

	}

	private void showParametersInfo(Class<?>[] parameterTypes) {
		System.out.println("Parameters number: " + parameterTypes.length);
		for (Class<?> parameterType : parameterTypes) {
			System.out.println("Parameter: " + parameterType.getName());
		}
	}

	private void showDeclaredClassInfo(Class<?> declaringClass) {
		System.out.println("Declared class: " + declaringClass.getName());
	}

}
