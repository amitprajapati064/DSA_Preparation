# Maximum Subarray

## Problem

Given an integer array, find the contiguous subarray with the largest sum and return that maximum sum.

## Example

### Input

9
-2 1 -3 4 -1 2 1 -5 4

### Output

6

## Approach

Use Kadane's Algorithm.

Maintain two variables:

- `cs` → current subarray sum
- `ms` → maximum sum found so far

For every element:

```text
cs = max(cs + nums[i], nums[i])
ms = max(ms, cs)
````

For each element, decide whether:

* Continue the current subarray by adding the element to `cs`
* Start a new subarray from the current element

The maximum value of `cs` throughout the array is stored in `ms`.

For the given example:

```text
[-2, 1, -3, 4, -1, 2, 1, -5, 4]

Maximum subarray = [4, -1, 2, 1]

Maximum sum = 6
```

## Complexity

* Time Complexity: O(n)
* Space Complexity: O(1)

## Language

Java

