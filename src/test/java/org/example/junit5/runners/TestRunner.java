package org.example.junit5.runners;

import org.example.junit5.tests.TesteFacebook;
import org.example.junit5.tests.TesteGoogle;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Suite de testes Facebook e Google")
//@SelectPackages("org.example.junit5.tests")
//@SelectClasses(TesteGoogle.class)
@SelectClasses({TesteGoogle.class, TesteFacebook.class})
public class TestRunner {
}
