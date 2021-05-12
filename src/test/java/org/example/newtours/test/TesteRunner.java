package org.example.newtours.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Suite de testes JUnit")
@SelectPackages("org.example.newtours.test")
public class TesteRunner {
}
