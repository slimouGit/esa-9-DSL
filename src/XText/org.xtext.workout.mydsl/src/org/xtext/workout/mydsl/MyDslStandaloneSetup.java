/*
 * generated by Xtext 2.25.0
 */
package org.xtext.workout.mydsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MyDslStandaloneSetup extends MyDslStandaloneSetupGenerated {

	public static void doSetup() {
		new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}