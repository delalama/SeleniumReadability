# Selenium Readability
Readability with Last releases of Selenium and gecko, helped by PageObjects pattern 

As long as Selenium Team works on its automatization tools the results for the user is
a comfortable experience.

I ve done a simple project to test the last releases of selenium framework and Im surprised with
the readability of the result code.

If we do not use PageObject pattern we have this sintax
![](https://github.com/delalama/SeleniumReadability/blob/master/seleniumExample/1)

Applying PageObject...
![](https://github.com/delalama/SeleniumReadability/blob/master/seleniumExample/3.png)

Another example.
![](https://github.com/delalama/SeleniumReadability/blob/master/seleniumExample/2.png)

The PageObject pattern
---
The purpose of this java pattern is to simplify the code and try to have a maintainable code.
If we do not apply this the result will be a code plenty of incomprehensible lines.

The fact is that working with selenium we need to instantiate a lot of elements to navigate,
then the pattern help us for this.

We create the main class from which our PageObjects will extend
![](https://github.com/delalama/SeleniumReadability/blob/master/seleniumExample/5.png)

We create our desired PageObject containing the needed elements, usually all the elements
![](https://github.com/delalama/SeleniumReadability/blob/master/seleniumExample/6.png)
