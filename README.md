# javaassignment
Q A-1a : Can you implement the sing() method for the bird?

Answer: No. There is no sing() method is implemented either in Animal or Bird class.so when the code compile will get an error(The method sing() is undefined for the type Bird).

Q A-1b :How did you optimize the code for maintainability? 
Answer : we know that not all of the subclasses should not have flying and singing behaviour so inheritance is not the correct solution when its come to maintenance.
we could take out fly and sing methods from Bird class and make separate interfaces for fly() and sing().That way,only the birds that are supposed to fly will implement that interface.

Q A-2 : Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound?

Answer for 2a,2b,2c,2d: provided simulator class and unit test class for test the functionality.

Q A-3 : Now how would you model a rooster?

Answer for 3a,3b,3c: provided simulator class and unit test class for test the functionality.

Q A-4d)How do you keep the parrot maintainable? What if we need another parrot
lives near a Duck? Or near a phone that rings frequently?

Answer : We can keep parrtot maintainable using Composition (Has-A relationship) with abstraction(implementing interfaces).
  Here the parrot has a relationship with cat,dog,duck and rooster.
  
Q B. Model fish as well as other swimming animals.

Ans:Test and Simulator classes created to test the behaviour.

Q D.Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly?

Answer : We can model caterpillar and butterfly using Composition/Aggregation - there is a relationship between
caterpillar and butterfly since Caterpillar is transforming to butterfly.

Q E: Can you share the code to count:
a. how many of these animals can fly?
b. how many of these animals can walk?
c. how many of these animals can sing?
d. how many of these animals can swim?

Answer : Test class implemented.
