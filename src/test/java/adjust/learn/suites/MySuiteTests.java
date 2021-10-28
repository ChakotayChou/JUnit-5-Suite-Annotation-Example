package adjust.learn.suites;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("JUnit 5 Test Suite")
@SelectPackages("adjust.learn.packageA")
@IncludeClassNamePatterns(".*Test")
public class MySuiteTests {
}
