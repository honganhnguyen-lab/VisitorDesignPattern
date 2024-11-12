# VisitorDesignPattern

For the Activity1, this commit 52fdd18bea280546506b630f6233706ee54619e4 has been push to main branch to add 2 files AltMain and AltVehicleService

-> Apply Factory Pattern

For the Activity2, this commit 76dd4b055927727543b189a71b5dad65f4b6b6ff
has been push to main branch to apply Singleton pattern

For the Activity3, this commit 6d7417175cd8e9f7ab664d544e77e8a6b2ba0957
has been push to main branch to apply Strategy Pattern

Difference between Strategy and Visitor

The Visitor and Strategy patterns are two diverse ways of approaching software design. 
The Visitor pattern uses a DoubleDispatch function dependent on both the Inspection and Visitor components. The Accept() method of the Inspection takes in an object of the Visitor, and obtains responses back through the function visit(). 
In the case of the Strategy pattern, there are classes related to context and a strategy class with different operations that Contexts can be applied to.
I would prefer the Strategy pattern because it makes a few algorithms available for many different classes and allows different algorithms to be used by a class at different times. 
This is particularly useful whenever operations require data that the Object shouldn't know about, (which Strategy must known), and when an object structure is likely to change frequently. 
This flexibility and maintainability of the Strategy pattern make it more practical in many cases of software design, especially with larger scope.