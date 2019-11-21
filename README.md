## Usage


run all tests

        gradle test 

run current class or method

    gradle test --tests com.vk.qa.login.LoginTest
    gradle test --tests com.vk.qa.login.LoginTest.checkWeCanLogin
    
notice

    add 
    -DbaseUrl=https://www.vk.com 
    to VM options if u want run tests localy    