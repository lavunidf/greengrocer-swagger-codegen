package org.fiorin.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.codegen.CodegenType;
import io.swagger.codegen.languages.AbstractJavaCodegen;

public class CustomJavaCodegen extends AbstractJavaCodegen {

	public static final String CUSTOM_SPRING_RESTTEMPLATE = "custom-spring-resttemplate";

	static Logger LOGGER = LoggerFactory.getLogger(CustomJavaCodegen.class);

	public CustomJavaCodegen() {

		super();

		supportsInheritance = true;
		modelTemplateFiles.clear();
		apiTemplateFiles.clear();
		apiTestTemplateFiles.clear();
		modelDocTemplateFiles.clear();
		apiDocTemplateFiles.clear();

		modelTemplateFiles.put("custom-model.mustache", ".java");

		outputFolder = "generated-code/custom-mustache";
		modelPackage = "io.swagger.model";

	}

	@Override
	public CodegenType getTag () {

		// TODO Auto-generated method stub
		return null;
	}

	// That's the name to use inside your project
	@Override
	public String getName () {

		return CUSTOM_SPRING_RESTTEMPLATE;
	}

	@Override
	public String getHelp () {

		return "This is a custom swagger-codegen implementation";
	}

}
