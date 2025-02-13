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