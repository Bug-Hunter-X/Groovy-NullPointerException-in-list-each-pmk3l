```groovy
def myMethod(List<String> list) {
  list.each { element ->
    if (element == null) {
      throw new NullPointerException("Element in list cannot be null")
    }
    println element
  }
}

myMethod(["apple", null, "banana"])
```