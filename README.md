# Groovy NullPointerException in list.each

This repository demonstrates a common Groovy error: a `NullPointerException` arising from using `list.each` when the list contains `null` values.  The `each` method doesn't perform null checks automatically, leading to unexpected crashes.

The `bug.groovy` file shows the problematic code, while `bugSolution.groovy` provides a solution using safe navigation and null checks.