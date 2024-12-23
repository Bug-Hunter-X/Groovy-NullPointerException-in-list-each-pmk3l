```groovy
def myMethod(List<String> list) {
  list.each { element ->
    if (element) { // Safe check for null
      println element
    } else {
      println "Null element encountered"
    }
  }
}

//Alternative using ?. operator (Groovy's safe navigation operator)

def myMethod2(List<String> list) {
    list.each { element ->
        println element?.toString() ?: "Null element encountered"
    }
}

myMethod(["apple", null, "banana"])
myMethod2(["apple", null, "banana"])
```