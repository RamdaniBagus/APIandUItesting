**Automation Testing Project** 

📋 Overview
This is a comprehensive automation testing project that combines both API and UI testing using modern testing tools and frameworks. The project follows a structured approach with separate modules for API and UI testing.
🚀 Technologies Used
Java (JDK 8+)

Gradle - Build tool

TestNG - Testing framework

Cucumber - BDD framework for UI testing

Selenium WebDriver - Browser automation

RestAssured - API testing library

WebDriverManager - Automated driver management

Allure Reports - Test reporting

🔧 Setup Instructions
Prerequisites
Java JDK 8 or higher

Gradle (or use the provided wrapper)

Chrome browser (for UI tests)

📁 Modules Description

1. API Testing Module (api/)

Location: src/test/java/api/

Purpose: API endpoint testing using RestAssured

Key Files:

GetUserTest.java: Test case for GET user endpoint

ApiConfig.java: Configuration for API URLs and keys

2. UI Testing Module (ui/)

Location: src/test/java/ui/

Purpose: Browser automation testing using Selenium and Cucumber

Key Files:

LoginPage.java: Page Object Model for login page

LoginSteps.java: Cucumber step definitions

CucumberTestRunner.java: Test runner configuration

DriverFactory.java: WebDriver management with ThreadLocal

3. Configuration Files

testng.xml: TestNG suite configuration

build.gradle: Gradle build configuration with dependencies

🧪 Test Execution
Running Tests
Run all tests: Execute the TestNG suite via Gradle

Run specific tests: Use Gradle test filtering

CI/CD Ready: Includes headless configuration for GitHub Actions

Test Reports
Cucumber Reports: HTML reports in target/cucumber-report/

Allure Reports: Comprehensive test reports (after generation)

🎯 API Tests
Endpoint: GET /user?page=2

Base URL: https://reqres.in/api

Authentication: API Key based (reqres-free-v1)

Validation: Response status code and JSON path extraction

🌐 UI Tests
Application Under Test: SauceDemo (https://www.saucedemo.com/)

Test Scenario: Login functionality

Features: Cucumber BDD with Gherkin syntax

Browser Support: Chrome with headless mode for CI
