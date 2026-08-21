# Contains Duplicate

## Problem

Given an integer array `nums`, return `true` if any value appears at least twice in the array.

Return `false` if every element in the array is distinct.

## Example

### Input

4

1 2 3 1

### Output

True

## Approach

Use a `HashSet` to store the elements that have already been visited.

For every element:

- Check if the element already exists in the `HashSet`.
- If it exists, a duplicate is found, so return `true`.
- Otherwise, add the element to the `HashSet`.

If all elements are processed without finding a duplicate, return `false`.

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

## Language

Java
