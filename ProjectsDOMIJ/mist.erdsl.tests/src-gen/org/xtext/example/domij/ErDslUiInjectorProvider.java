/*
 * generated by Xtext
 */
package org.xtext.example.domij;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ErDslUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.xtext.example.domij.ui.internal.ErDslActivator.getInstance().getInjector("org.xtext.example.domij.ErDsl");
	}
	
}
