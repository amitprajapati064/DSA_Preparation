# Two Sum

## Problem

Given an array of integers and a target value, find two different
indices whose values add up to the target.

## Example

### Input

4
2 7 11 15
9

### Output

0 1

## Approach

As indices are required so we cannot sort the array as two pointers requires array to be sorted.
Instead 

Use a HashMap to store each number along with its index.

For every element:

req = target - nums[i]

If the required value already exists in the HashMap, we have
found the two required indices.

Otherwise, store the current number and its index in the HashMap.

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

## Language

Java