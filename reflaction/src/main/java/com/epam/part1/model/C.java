package com.epam.part1.model;

public class C extends B {
	private long f1;
	protected String f2;
	public double f3;
	short f4;

	public long getF1() {
		return f1;
	}

	public void setF1(long f1) {
		this.f1 = f1;
	}

	public String getF2() {
		return f2;
	}

	public void setF2(String f2) {
		this.f2 = f2;
	}

	public double getF3() {
		return f3;
	}

	public void setF3(double f3) {
		this.f3 = f3;
	}

	public short getF4() {
		return f4;
	}

	public void setF4(short f4) {
		this.f4 = f4;
	}

	@Override
	public String toString() {
		return String
				.format("Class C: [f0 = %d, f10 = %d, f1 = %d, f2 = %s, f3 = %f, f4 = %d]",
						getF0(), getF10(), f1, f2, f3, f4);
	}
}
