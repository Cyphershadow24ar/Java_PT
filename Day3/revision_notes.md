# Java Control Structures & Data Types - Revision Notes

## 1. Float vs Double (`float` vs `double`)
You asked how to identify which number is float or double.
- **Double (Default):** Any decimal number written in Java (e.g., `0.9`, `10.5`) is treated as a `double` by default (64-bit precision).
- **Float:** You must explicitly add an `f` or `F` suffix (e.g., `0.9f`, `10.5f`) to make it a `float` (32-bit precision).

### The "Not Same" Logic
In your code:
```java
float a = 0.9f;
if(a == 0.9) { ... }
```
**Why does this print "Not same"?**
- `0.9f` is a **float**. It stores an approximation of 0.9 in 32 bits.
- `0.9` is a **double**. It stores a more precise approximation of 0.9 in 64 bits.
- Because floating-point numbers cannot exactly represent 0.9 in binary, the 32-bit version and 64-bit version have slightly different values. Thus, `a == 0.9` returns `false`.

**Correction:**
Always compare values of the same type, or use a small "epsilon" margin for errors.
```java
if(a == 0.9f) // True
```

---

## 2. Nested If-Else Logic
Your goal: Check divisibility by 2, 3, or both.

**Your Code Analysis:**
```java
if(n%2==0){
    if(n%3==0){
        // At this point, we KNOW n is divisible by 2 AND 3.
        // So checking (n%2==0 && n%3==0) again inside here is redundant.
    }
}
```

**Correction (Simplified Logic):**
Check the "both" condition first, or structure it more cleanly.
```java
if (n % 2 == 0 && n % 3 == 0) {
    System.out.println(n + " is divisible by BOTH 2 and 3");
} else if (n % 2 == 0) {
    System.out.println(n + " is divisible by 2 only");
} else if (n % 3 == 0) {
    System.out.println(n + " is divisible by 3 only");
} else {
    System.out.println("Not divisible by either");
}
```

---

## 3. Switch Case Pitfalls
You encountered two specific errors in your switch statement:

### Error 1: `case 2.0:` (Incompatible Types)
- **Rule:** A `switch` variable in Java (prior to modern pattern matching updates) works with `int`, `char`, `byte`, `short`, `String`, or `enum`.
- **Reason:** `choice` is an `int`. You cannot have a `case` label that is a `double` (`2.0`). It must be an integer.

### Error 2: `case 65:` (Duplicate Case Label)
- **Rule:** You cannot have two cases with the same value.
- **Reason:**
    - `case 'A':` -> The character 'A' has an ASCII value of **65**.
    - `case 65:` -> This is numerically the same as 'A'.
    - Java sees `case 65:` and `case 'A':` as the exact same number, hence the "duplicate case label" error.

**Correction:**
Remove one of them. If you want to handle character input, change `choice` to `char`. If you want to handle integer input, keep `choice` as `int` and use `case 65`.

---

## 4. Syntax Correction (Cascaded If)
**Error:**
```java
System.out.println("Enter the marks You have scored: ") // Missing semicolon
```
**Correction:**
```java
System.out.println("Enter the marks You have scored: ");
```

---

## 5. `printf` in Java
Your note about C is correct (`printf` returns int count).
In Java:
- `System.out.println(...)` returns `void` (nothing).
- `System.out.printf(...)` returns `PrintStream` (the output stream itself), NOT the character count. 
- **Tip:** Don't confuse C behavior with Java methods.

---

# Summary of Tips to Remember
1. **Suffixes:** Use `f` for float (`3.14f`), `L` for long (`100L`).
2. **Precision:** Never compare `float` == `double` directly if high precision matters.
3. **Switch:** Integers and Characters are compatible (char 'A' == int 65). Watch out for duplicates.
4. **Style:** Avoid deeply nested `if`s if meaningful `else if` checks can do the job simpler.
