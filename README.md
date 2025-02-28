https://effective-lira-arditheusih-d260384e.koyeb.app/product/list
https://effective-lira-arditheusih-d260384e.koyeb.app/car/list

<details>
<summary>Module 1</summary>

# Reflection 1


1. Meaningful Names
   `ProductRepository` and `productData`: Clearly convey the intent and context, improving readability.

-  `findProductByName` and `editProduct`: Use descriptive method names that specify their actions, which aligns with clean code principles.

2. Single Responsibility Principle (SRP)
   Each method in ProductRepository performs a specific action:

   `create` adds a product.

   `findAll` retrieves all products.

   `findProductByName` searches for a product by name.

   `editProduct` modifies a product.

   `deleteProduct` removes a product.

This adherence to SRP makes the code easier to maintain and extend.

4. Secure Coding Practices
- Data Encapsulation: The `productData` list is private, ensuring that it cannot be modified directly from outside the repository class.

- Immutable Objects: When a product is found, edited, or deleted, operations are performed on copies rather than directly manipulating the original objects. This reduces the risk of unintended side effects.
---
# Reflection 2

## How many unit tests should be made in a class?
The number of unit tests in a class depends on the complexity and functionality of the class. Generally, every public method should have at least one corresponding unit test to verify its behavior under different conditions. Additionally, consider testing edge cases and negative scenarios. While there's no fixed number, the goal is to ensure comprehensive coverage of the class’s functionality.

## How to make sure that our unit tests are enough to verify our program?
### Test Different Scenarios:

Positive Scenarios: Verify that the methods work as expected under normal conditions.

Negative Scenarios: Ensure that the methods handle erroneous or unexpected inputs gracefully.

Edge Cases: Test boundary conditions to ensure the methods work correctly at the limits of their input ranges.

###Use Assertions:

Verify expected results using assertion statements. Make sure to cover various aspects of the methods, such as return values, state changes, and exceptions.

###Mock Dependencies:

Use mocking frameworks to simulate dependencies and isolate the unit under test. This helps in verifying the behavior of the unit independently.

###Refactor and Improve:

Continuously refactor your tests to improve readability and maintainability. Ensure tests are clear and well-organized.

## Code Coverage
Code coverage is a metric that helps you understand how much of your source code is executed while running tests. It provides insights into which parts of the code are tested and which are not. There are several types of code coverage metrics, including:

- Line Coverage: The percentage of lines of code that are executed.

- Branch Coverage: The percentage of branches (e.g., if-else statements) that are executed.

- Method Coverage: The percentage of methods that are called during testing.

100% Code Coverage and Bugs
Achieving 100% code coverage means that all lines of code are executed at least once during testing. However, this does not guarantee that your code is free from bugs or errors. Here’s why:

- Coverage Quality:

Code coverage measures the quantity of code executed, not the quality of the tests. Tests might not thoroughly verify the correctness of the code.

- Logic Flaws:

Even with 100% coverage, there can be logical errors or edge cases that are not adequately tested.

- False Sense of Security:

High coverage might give a false sense of security. It’s essential to focus on writing meaningful and thorough tests rather than just achieving high coverage.

</details>

<details>
<summary>Module 2</summary>

# Reflection module 2

Looking at the CI/CD workflows, I believe the current implementation meets the definition of both Continuous Integration (CI) and Continuous Deployment (CD). The GitHub Actions workflow in `ci.yml`
automatically runs tests on every push and pull request, ensuring that changes are validated before merging. Additionally, the `scorecard.yml`
workflow helps maintain repository security and code quality standards. These workflows align with CI principles by integrating and testing code continuously.

To further enhance code quality, I integrated a SonarCloud code scanner, which automatically analyzes the codebase for bugs, vulnerabilities, and maintainability issues. This ensures that the project adheres to best coding practices and reduces the likelihood of introducing technical debt.

Since the application is deployed automatically to Koyeb, it fulfills the requirements of Continuous Deployment. Every successful merge into the main branch results in an automatic deployment, ensuring that the latest stable version of the application is always live. 
This eliminates the need for manual deployment steps and ensures rapid delivery of new features and fixes.
</details>

<details>
<summary>Module 3</summary>

SOLID 
Single Responsibility Principle (SRP)
I implemented SRP by creating separate classes for CarController and HomeController, removing them from the ProductController file. This ensures that each class interacts with only one model. Additionally, I removed extends ProductController from CarController, making CarController solely focused on the Car model.

Open-Closed Principle (OCP)


Liskov Substitution Principle (LSP)
The *ServiceImpl classes are derived from the *Service interfaces. These *ServiceImpl classes can replace their corresponding *Service interfaces, aligning with LSP, which states that subclasses should be substitutable for their parent classes.

Interface Segregation Principle (ISP)
The interfaces in this project have been separated into ProductService and CarService, ensuring that ProductServiceImpl and CarServiceImpl implement only the interfaces they actually need.

Dependency Inversion Principle (DIP)
I changed private CarServiceImpl carservice; to private CarService carservice; in CarController. This follows DIP, where a class should depend on an interface or an abstract class rather than a concrete implementation.



</details>