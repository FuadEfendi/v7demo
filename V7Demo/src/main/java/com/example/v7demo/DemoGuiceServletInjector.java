package com.example.v7demo;

import java.util.List;

import uk.co.q3c.v7.base.config.V7Ini;
import uk.co.q3c.v7.base.guice.BaseGuiceServletInjector;

import com.google.inject.Module;

public class DemoGuiceServletInjector extends BaseGuiceServletInjector {

	@Override
	protected void addAppModules(List<Module> modules, V7Ini ini) {
		modules.add(new DemoModule());
		modules.add(new DemoUIModule());
	}

}
