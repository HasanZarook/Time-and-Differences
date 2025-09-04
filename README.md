
# ⏰ Time Class (Time & Differences)

## 🌟 Overview

The `Time` class represents **time in hours, minutes, and seconds**. It provides:

* Multiple constructors to **initialize time**
* Methods to **calculate difference between two times**
* Methods to **set and print time**
* Demonstrates **static variable behavior**

---

## 🛠 Code Features

### Attributes

```java
private int h; // hours
private int m; // minutes
private int s; // seconds

static int a; // static variable shared across all Time objects
```

### Constructors

* **Seconds constructor** ⏱: Converts total seconds to `h:m:s`

  ```java
  Time(int sec)
  ```
* **Hour-Minute-Second constructor** 🕒: Directly assign values

  ```java
  Time(int hh,int mm,int ss)
  ```

### Methods

* `diffs(Time n)` 📏: Returns **difference from another time in seconds**
* `diff(Time n)` 📝: Returns **difference as "h\:m\:s"**
* `sett(int hh,int mm,int ss)` 🔧: Set time
* `gett()` 🖨: Print time in `h:m:s` format

---

## 🚀 Example Usage

```java
Time ab = new Time(12,22,4);
Time d = new Time(400); // 400 seconds → 0:6:40
d.gett(); // Output: 0:6:40
ab.gett(); // Output: 12:22:4

Time c = new Time(2,30,20);
System.out.println(ab.diff(c));  // Output: "9:51:44"
System.out.println(ab.diffs(c)); // Output: 35404 (seconds)
```

---

## ⚡ Notes

* `diffs()` and `diff()` calculate **absolute differences**
* Static variable `a` is **shared by all instances**

  ```java
  System.out.println(ab.a); // same as Time.a
  System.out.println(d.a);  // same as Time.a
  ```
* Using the **seconds constructor** automatically converts to hours, minutes, seconds.
* Useful for **time calculations and comparisons**

---
]
