# javaassignment
Q A-1a : Can you implement the sing() method for the bird?

Answer: No. There is no sing() method is implemented either in Animal or Bird class.so when the code compile will get an error(The method sing() is undefined for the type Bird).

Q A-1b :How did you optimize the code for maintainability? 
Answer : we know that not all of the subclasses should not have flying and singing behaviour so inheritance is not the correct solution when its come to maintenance.
we could take out fly and sing methods from Bird class and make separate interfaces for fly() and sing().That way,only the birds that are supposed to fly will implement that interface.

Q A-2 : Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound?

Answer for 2a,2b,2c,2d: provided simulator class and unit test class for test the functionality.
