# java-generics
A java CLI project which demonstrates the use of Generics. 
The execution occurs from the "Main" class. Player class is extended by the Football, Soccer, Baseball classes.
The Team class uses generics which helps us pass parameters to the class. 
The parameter should be a sub class of the Player class. We ensure this while making the type parameter(the parameter passed to the class using generics) extend the Player class.
The Team class also implements the Comparable interface, in order to use the compareTo method, which allows us to use the Collections.sort() mtehod to our will.
The League class also uses generics to ensure that only one type of class which extends Player class is allowed in a specific League. 
