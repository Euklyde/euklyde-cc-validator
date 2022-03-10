# euklyde-cc-validator

![test](https://img.shields.io/github/license/Euklyde/euklyde-cc-validator) ![test2](https://img.shields.io/github/downloads/Euklyde/euklyde-cc-validator/total)

## What is CC Validator ?
CC Validator is a small Java library which can validate (or not) a credit card using the Luhn-10 algorithm.

## How to add CC Validator to your project ?
1. Download the latest [release](https://github.com/Euklyde/euklyde-cc-validator/releases) or build yourself
2. Add the jar in your project libraries
3. Enjoy !

## How to use CC Validator ?

Here's a basic example of how to use CC Validator

```java
//Card instantiation
Card myCard = new Card(1234567812345678L);

//Printing card validity
System.out.println(myCard.validate());
```
