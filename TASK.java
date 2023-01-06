

class A{

  public static void main(String args[]){
  package com.xworkz.praapp.practice;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		int [] value= {45,333,76,29,900,23,474,654,29,454};
		int tp=0;
		for(int i=0;i<value.length-1;i++) {
			for( int j=i+1;j<value.length-1;j++) {
				if(value[i]<value[j]) {
					tp=value[i];
					value[i]=value[j];
					value[j]=tp;
					
				}
			}
		}
		
		for(int k=0;k<value.length;k++) {
			if(k==0) {
				System.out.println("max value is:"+value[k]);
		}
			if(k==8) {
				System.out.println("min value is :"+value[k]);
			}
			
			
	}
		int []flower= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<flower.length;i++) {
			if(flower[i]%2==0) {
				System.out.println("love is true");
				
			}
			else {
				System.out.println("love is not true");
			}
		}

}
}

  }
}


******what are the generalized and speciliazed classes  in java?*****

Specialization and generaliazation is the subclass and superclass hierarchy mechanism in a relational database the concept of inheritance in java
Generaliazation: Converting a subclass type into a supperclass type is called generialiazation..
Specialization:converting a supperclass type into a sub class type is called speciliazed..

***** i dont want my class******
you should u declared a class but u  cant define your class as final

*****can u give a few example of final class******
java.lang.String
java.lang.Math are final class

****some alternative***
Delegation can be an alternative to inherutance
Delegation ,eans that you use an object of anothrt classes as an instance variable,and forward message to the instance..

****stored***
The sorted( )method in java 
the sorted() method used to sort the list of objects or collections of the objects in the ascending order
if the collections of the objects are comparable then it compares and return the sorted collection of objects ..

****difference between linkedlist and array list****
array list
1.fixed size
2.array are sorted
3.memory is allocated in compile time
4.elements can be acessed easily
5.insertion order

linkedlist:
1.dynamic size
2.list are not sorted
3. memory is allocated in run time.
4.elements accesing requires the traversal of whole linked list
5.un-order..

*****iterator and list iterator****
iterator:
1.It helps traverse through a map, list and a set.
2.Index can’t be obtained with the help of an iterator.
3.The iterator can’t modify or replace elements of a Collection.
4.It traverses through elements present in Collection.
5.This iteration can be done in the forward direction only.
6.Elements can’t be added, since it would throw ConcurrentModificationException.
7.Methods of the iterator are ‘next()’, ‘remove()’, ‘hasNext()’.

listiterator:
1.it helps traverse through a list only.
2.It can’t traverse through a map and a set.
3.It can traverse through the elements present in Collection.
4.The traversal can be done in both forward and backward directions.
5.Some of the methods of listiterator are ‘nextIndex()’, ‘previousIndex()’, ‘previous()’, ‘next()’.
6.The elements can be modified or replaced.

  
  
  ******overriding**
  The covariant method overriding approach, implemented in Java 5,
  helps to remove the client-side typecasting by enabling you to 
  return a subtype of the overridden method's actual return type. 
  Covariant Method overriding means that when overriding a method in the child class, the return type may vary.
  
  **memory leakeage in***
  A Memory Leak is a situation where there are objects present in the heap that are no longer used, 
  but the garbage collector is unable to remove them from memory, and therefore, they're unnecessarily maintained.
A memory leak is bad because it blocks memory resources and degrades system performance over time.


**** static polymorphism and dynamic polymorphism***
static polymorphism:
1.the type of polymorphism that collects the information to call a method during compile time.
2.occurs at compile time
3.knows as static binding a to early binding.
4.exection a speed is high.
5.method overloading

dynamic polymorphism:
1.a type of polymorphism that collects information call at a method to a run time.
2.occurs at run time.
3.knows a dynamic binding a to late binding.
4.exection is slow.
5.method overriding

*****11.**


