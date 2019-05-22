Event Parser Design Kata
============================

For better understanding that how you set up your tests changes the design of your production code.

Instructions
------------

You have an xml report produced by another system, which contains information about a particular store. 
The user wants to see some information about the next Store Event - the name and price. The report contains information about other products as well, but in this case we are only interested in Store Events - ie products that have a location.

You have written a 'spike solution', ie some throwaway code that shows how to extract these three
fields from a sample xml document. This spike code is in a class called 'Spike' with a main method.
Try running this so you can see it successfully extracts the relevant information.

You have started working on building the feature for real, using Test-Driven Development. However, you can
think of several different designs, and don't know which one to choose. At present, the code for all 
the options is commented out. Spend some time examining each option. Uncomment it, read the code, and think of pros and cons.

Then, without changing the test code, implement each one in turn.
Uncomment the tests one at a time to test-drive several implementations.

Each implemementation will drive a slightly different design for the production code.

  - Which design do you like best?
  - Did you predict that from just reading the tests? 

