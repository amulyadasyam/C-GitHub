package com.Ass2.Test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.Ass2.Test.ArrayOpeartionsTest;

public class ArrayOperationsTestRunner {

	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(ArrayOpeartionsTest.class);
		for(Failure f:r.getFailures())
		{
			System.out.println(f.toString());
		}
		System.out.println(r.wasSuccessful());

	}

}
