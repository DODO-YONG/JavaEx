package com.javaex.oop.exception;

import java.io.IOException;


//	예외의 두 종류
//	종류 1. checked Exception ->반드시 예외 처리를 해줘야 한다.
//	종류 2. runtime Exception -> 예외 처리를 해 주지 않아도 된다.
public class ThrowExcept {
	//	Checked Exception
	public void executeException() throws IOException {
		System.err.println("강제 예외 발생");
		throw new IOException("강제예외");
	}
	
	//	Unchecked Exception
	public void executeRuntimeException() {
		System.err.println("강제 런타임 예외");
		throw new RuntimeException("런타임 예외");
	}
	
	public double divide(int num1, int num2) {
		double result;
		
		result = num1 / num2;
		return result;
	}

}
