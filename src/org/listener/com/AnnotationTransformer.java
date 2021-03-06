package org.listener.com;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.IListenersAnnotation;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformer implements IAnnotationTransformer{

	/**
	   * This method will be invoked by TestNG to give you a chance to modify a TestNG annotation read
	   * from your test classes. You can change the values you need by calling any of the setters on the
	   * ITest interface.
	   *
	   * <p>Note that only one of the three parameters testClass, testConstructor and testMethod will be
	   * non-null.
	   *
	   * @param annotation The annotation that was read from your test class.
	   * @param testClass If the annotation was found on a class, this parameter represents this class
	   *     (null otherwise).
	   * @param testConstructor If the annotation was found on a constructor, this parameter represents
	   *     this constructor (null otherwise).
	   * @param testMethod If the annotation was found on a method, this parameter represents this
	   *     method (null otherwise).
	   */
	  public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	    
		  annotation.setRetryAnalyzer(ReRunFailureTest.class);
	  }

	  /**
	   * Transform an IConfiguration annotation.
	   *
	   * <p>Note that only one of the three parameters testClass, testConstructor and testMethod will be
	   * non-null.
	   *
	   * @param annotation The annotation that was read from your test class.
	   * @param testClass If the annotation was found on a class, this parameter represents this class
	   *     (null otherwise).
	   * @param testConstructor If the annotation was found on a constructor, this parameter represents
	   *     this constructor (null otherwise).
	   * @param testMethod If the annotation was found on a method, this parameter represents this
	   *     method (null otherwise).
	   */
	  public void transform(
	      IConfigurationAnnotation annotation,
	      Class testClass,
	      Constructor testConstructor,
	      Method testMethod) {
	    // not implemented
	  }

	  /**
	   * Transform an IDataProvider annotation.
	   *
	   * @param method The method annotated with the IDataProvider annotation.
	   */
	  public void transform(IDataProviderAnnotation annotation, Method method) {
	    // not implemented
	  }

	  /**
	   * Transform an IFactory annotation.
	   *
	   * @param method The method annotated with the IFactory annotation.
	   */
	  public void transform(IFactoryAnnotation annotation, Method method) {
	    // not implemented
	  }

	  public void transform(IListenersAnnotation annotation, Class testClass) {
	    // not implemented
	  }
}
