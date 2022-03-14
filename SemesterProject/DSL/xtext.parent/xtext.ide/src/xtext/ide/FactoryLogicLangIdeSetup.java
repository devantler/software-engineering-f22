/*
 * generated by Xtext 2.25.0
 */
package xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import xtext.FactoryLogicLangRuntimeModule;
import xtext.FactoryLogicLangStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class FactoryLogicLangIdeSetup extends FactoryLogicLangStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new FactoryLogicLangRuntimeModule(), new FactoryLogicLangIdeModule()));
	}
	
}