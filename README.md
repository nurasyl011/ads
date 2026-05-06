# Assignment 3: Sorting and Searching Algorithm Analysis

 📌 Project Overview
This project implements and compares three algorithms:
- Selection Sort (Basic Sorting)
- Merge Sort (Advanced Sorting)
- Binary Search (Searching)

The goal is to measure execution times, analyze efficiency, and compare theoretical Big‑O complexity with practical results.

---

⚙️ Algorithm Descriptions
 Selection Sort
- How it works: Iteratively finds the minimum element and swaps it with the first unsorted element.
- Time Complexity: O(n²)
- Notes: Simple but inefficient for large datasets.

Merge Sort
- How it works: Recursively divides the array into halves, sorts them, and merges back.
- Time Complexity: O(n log n)
- Notes: Much faster on large arrays, stable sorting.

 Binary Search
- How it works: Repeatedly halves the search space in a sorted array until the target is found.
- Time Complexity: O(log n)
- Notes: Requires sorted input, very efficient compared to linear search.

---

 📊 Experimental Results

 Measured Execution Times (System.nanoTime)

| Array Size | Basic Sort (Selection) | Advanced Sort (Merge) | Binary Search |
|------------|-------------------------|-----------------------|---------------|
| 10         | 4100 ns                 | 4700 ns               | 1400 ns       |
| 100        | 52900 ns                | 55300 ns              | 800 ns        |
| 1000       | 1488500 ns              | 101500 ns             | 900 ns        |

---

 🔎 Analysis

- Which sorting algorithm performed faster?
  For small arrays (10, 100 elements), Selection Sort and Merge Sort showed similar times. However, for large arrays (1000 elements), Merge Sort was dramatically faster (≈15× improvement).

- How does performance change with input size?
  Selection Sort grows quadratically, leading to huge times at 1000 elements. Merge Sort scales much better, consistent with O(n log n).

- How does sorted vs unsorted data affect performance?
  On sorted arrays, Binary Search is extremely efficient. Sorting algorithms still need to process, but Merge Sort benefits from divide‑and‑conquer.

- Do results match expected Big‑O complexity?
  Yes. Selection Sort’s O(n²) growth is visible in the jump from 100 to 1000 elements. Merge Sort’s O(n log n) scaling is confirmed by its much lower time at 1000 elements. Binary Search consistently shows logarithmic efficiency.

- Which searching algorithm is more efficient? Why?
  Binary Search is more efficient than Linear Search because it reduces

  
---

💡 Reflection
Through this experiment, I learned:
- Theoretical complexity strongly predicts practical performance, especially for large datasets.
- Merge Sort is far superior to Selection Sort when scaling up.
- Binary Search is extremely efficient but requires sorted input.
- Small arrays sometimes show negligible differences because constant factors dominate.
- The main challenge was structuring the project with proper OOP design and ensuring clean GitHub workflow.

