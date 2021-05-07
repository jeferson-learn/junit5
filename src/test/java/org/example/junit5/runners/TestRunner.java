package org.example.junit5.runners;

import org.example.junit5.tests.TesteFacebook;
import org.example.junit5.tests.TesteGoogle;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.*;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Suite de testes Facebook e Google")
//@SelectPackages("org.example.junit5.tests")
@SelectClasses(TesteFacebook.class)
//@SelectClasses({TesteGoogle.class, TesteFacebook.class})
//@IncludeTags("credenciais")
//@ExcludeTags("credenciais")
public class TestRunner {
}
