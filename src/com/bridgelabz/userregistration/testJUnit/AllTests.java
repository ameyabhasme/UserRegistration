package com.bridgelabz.userregistration.testJUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FirstNameTest.class, LastNameTest.class, MobileNumberTest.class, EmailIdTest.class, PasswordTest.class})
public class AllTests {

}
