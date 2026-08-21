# Contains Duplicate II

## Problem

Given an integer array `nums` and an integer `k`, return `true` if there are two distinct indices `i` and `j` such that:

```text
nums[i] == nums[j]  &&  |i - j| <= k
```

Otherwise, return `false`.

## Example

### Input
4

1 2 3 1

3


### Output

True

## Approach

Use a `HashMap` to store each number along with its most recent index.

For every element:

* Check if the current number already exists in the `HashMap`.
* If it exists, get its previous index.
* Calculate the difference between the current index and the previous index.

```text
i - j <= k
```

If the difference is less than or equal to `k`, return `true`.

Otherwise, update the index of the current number in the `HashMap`.

If no valid pair is found, return `false`.

## Complexity

* Time Complexity: O(n)
* Space Complexity: O(n)

## Language

Java
