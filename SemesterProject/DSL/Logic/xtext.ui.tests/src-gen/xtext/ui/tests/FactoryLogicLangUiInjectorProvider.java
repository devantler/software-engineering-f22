/*
 * generated by Xtext 2.25.0
 */
package xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import xtext.ui.internal.XtextActivator;

public class FactoryLogicLangUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("xtext.FactoryLogicLang");
	}

}