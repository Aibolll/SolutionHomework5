# Design Patterns Homework: Proxy & Flyweight

This project demonstrates the use of two structural design patterns in Java:

1. **Proxy Pattern** – for managing real estate image loading
2. **Flyweight Pattern** – for optimizing map marker rendering

---

## 1. Proxy Pattern – Real Estate Image Viewer

### Problem
High-resolution images of properties slow down page loading and waste bandwidth if all are loaded upfront.

### Solution
The **Proxy Pattern** is used to:
- Show a **thumbnail** image quickly (low resource usage).
- Load the **high-resolution** image **only when requested** via `displayFullImage()`.
- Add a **protection proxy** (`ImageUploader`) to ensure only **logged-in agents** can upload or replace images.

### Package
`src/proxy/`

### Files
- `Image` – Interface
- `HighResolutionImage` – The real image object
- `ImageProxy` – Loads full image only when needed
- `ImageUploader` – Restricts upload access
- `ProxyDemo` – Runs a sample test

### Run Demo
```bash
Run ProxyDemo.java
```

---

## 2. Flyweight Pattern – Map Marker Optimization

### Real-World Scenario
You're building a map application that renders **thousands of location markers** — gas stations, hospitals, restaurants, etc. Each of these locations uses styles like icon type, color, and label style, which are often **repeated** across many markers.

---

### Problem
Storing a full set of style data for every marker wastes memory:
- Thousands of objects with **duplicated style data**
- Performance issues on large-scale maps

---

### Solution – Flyweight Pattern
The **Flyweight Pattern** lets us share common style objects across multiple markers:
- Created shared, **immutable style objects** (`MarkerStyle`)
- Centralized style management via a **factory** (`MarkerStyleFactory`)
- Each `MapMarker` holds only a reference to a shared style + its location

---

### Structure

### Classes:
- `MarkerStyle` – Flyweight class (shared object with icon + color)
- `MarkerStyleFactory` – Manages and reuses `MarkerStyle` instances
- `MapMarker` – Concrete object with unique location + shared style
- `FlyweightDemo` – Creates and renders a large number of markers

### Package: `flyweight`

---

### Demo Output
```bash
Run FlyweightDemo.java

