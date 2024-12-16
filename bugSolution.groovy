def myMethod(a, b) {
  if (a == null || b == null) {
    return null
  }
  // ... rest of the method
  return a + b
}

// Explicit null checks before calling the method
a = 10
b = null
println "Result: "+ (if (a != null && b != null) myMethod(a, b) else "Null value encountered")

a = null
b = 5
println "Result: "+(if (a != null && b != null) myMethod(a, b) else "Null value encountered")

//Handle the return value
println "Direct Return handling: "+ (myMethod(10,5) ?: "Null returned")
println "Direct Return handling: "+ (myMethod(null, 5) ?: "Null returned")