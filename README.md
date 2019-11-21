## Usage


run all tests

        gradle test 

run current class or method

    gradle test --tests com.vk.qa.login.LoginTest
    gradle test --tests com.vk.qa.login.LoginTest.checkWeCanLogin
    
run current suite

    gradle clean test -PsuiteName=<name of xml suite file>
    gradle clean test -PsuiteName=simpleSuite
        
notice

    add 
    -DbaseUrl=https://www.vk.com 
    to VM options if u want run tests localy    