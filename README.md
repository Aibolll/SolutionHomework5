# 🎯 Design Patterns Homework: Proxy & Flyweight

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
