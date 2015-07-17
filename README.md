#Incompatible Types

0: type, 1: list of type, 2: list of type

inference variable {0} has incompatible bounds equality constraints: {1} upper bounds: {2}

~~~
Error:(16, 39) java: no suitable method found for convert(java.lang.Class<FooEntity>,java.lang.String,java.math.BigDecimal)

    method InvalidType.<ENTITY>convert(java.lang.Class<ENTITY>,java.lang.String,java.lang.Object) is not applicable
      (inference variable ENTITY has incompatible bounds
        equality constraints: FooEntity
        upper bounds: WithStatus)
    method InvalidType.<M,T>convert(java.lang.Class<T>,java.lang.Object) is not applicable
      (cannot infer type-variable(s) M,T
        (actual and formal argument lists differ in length))
~~~