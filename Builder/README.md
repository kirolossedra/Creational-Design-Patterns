
```mermaid
classDiagram
Builder ..|> ConcreteBuilder1
Builder ..|> ConcreteBuilder2
ConcreteBuilder1 --> Product1
ConcreteBuilder2 --> Product2
Client --> Director
class Client
class Builder{
<<interface>> 
    + reset()
    + BuildStepA()
    + BuildStepB()
    + BuildStepZ()
}

class Director{
-builder : Builder
+ Director(Builder)
+ ChangeBuilder(Builder)
+ make(type)
}

class ConcreteBuilder1{
-result : Product1
+ reset()
+ BuildStepA()
+ BuildStepB()
+ BuildStepZ()
+getResult():Product1

}

class ConcreteBuilder2{
-result : Product2
+ reset()
+ BuildStepA()
+ BuildStepB()
+ BuildStepZ()
+ getResult():Product2

}
class Product1
class Product2

```
