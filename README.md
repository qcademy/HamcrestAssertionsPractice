# HamcrestAssertionsPractice

This is a simple Java project demonstrating the use of [Hamcrest](https://hamcrest.org/JavaHamcrest/index) assertions. 
The project includes a `MathOperations` and `StringUtils` classes.
`MathOperations` class includes basic arithmetic operations:
- `add(int a, int b)`: Adds two integers.
- `subtract(int a, int b)`: Subtracts the second integer from the first.
- `multiply(int a, int b)`: Multiplies two integers.
- `divide(int a, int b)`: Divides the first integer by the second. Throws IllegalArgumentException if dividing by zero.
- `square(int a)`: Returns the square of the input integer.
- `isEven(int number)`: Returns `true` or `false` if `number` is even or odd.

`StringUtils` class allows user to perform simple manipulations with the strings:
- `reverse(String str)`: Returns the reversed value of the string;.
- `capitalize(String str)`: Returns the string with first letter capitalized.
- `concatenate(String str1, String str2)`: Concatenates the strings, returns `null` if any of the input is null.
- `splitIntoWords(String str)`: Splits sentences into an array, if input value is null, then an empty array is returned.
- `createWordMap(String str)`: Splits sentences into a Map<String, String> where key is a word `key` + word number and value is a word 
from the sentence, e.g.: `createWordMap("Hello World")` will result to `{ "key1": "Hello", "key2":"World" }`. If input value is `null`,
then an empty Map is returned.
- `createWordCollection(String str)`: Splits sentences into collection List<String>, if input value is `null`, then an empty collection is returned.

## The Purpose
The purpose of this project is to practice with [Hamcrest](https://hamcrest.org/JavaHamcrest/index) assertions. Your goal is 
to use as many assertions and matchers as possible, please see the [java documentation](https://hamcrest.org/JavaHamcrest/javadoc/2.2/). 
The project has a specific rule of test coverage, it requires 100% (1,0) of coverage. If the coverage is less than 100%
then `./gradlew clean test jacocoTestCoverageVerification` command will fail. The next goal is to cover the code with unit tests
in a way that the result of the command `./gradlew clean test jacocoTestCoverageVerification` is `BUILD SUCCESSFUL`.

## What is Unit Testing?
Unit testing is a software testing technique where individual units or components of a software are tested in isolation.
The goal is to validate that each unit of the software performs as designed. Unit tests are typically automated and
focus on small, specific parts of the codebase.

### Why Unit Testing?
1. **Early Detection of Bugs:** Unit tests help identify and fix bugs early in the development process.
2. **Code Maintainability:** Tests act as documentation and provide confidence that code changes do not introduce new issues.
3. **Regression Testing:** Unit tests ensure that existing functionality continues to work as expected when new features
   are added or code is modified.

## How to Run Tests
### Prerequisites
- [Java](https://www.oracle.com/java/technologies/javase-downloads.html) installed

### Running Tests
1. Clone this repository:

   ```bash
   git clone git@github.com:qcademy/HamcrestAssertionsPractice.git
   cd HamcrestAssertionsPractice
   ```
2. Run tests with build tool [gradle](https://gradle.org/):
    ```bash
    ./gradlew clean test 
    ```
3. Run test coverage analysis:
    ```bash
    ./gradlew clean jacocoTestCoverageVerification 
    ```