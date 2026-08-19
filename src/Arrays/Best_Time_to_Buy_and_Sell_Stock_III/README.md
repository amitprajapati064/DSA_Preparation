
# Best Time to Buy and Sell Stock III

## Problem

Given an array of stock prices, find the maximum profit possible using at most two transactions.

You must sell the stock before buying again.

## Example

### Input

8
3 3 5 0 0 3 1 4

### Output

6

### Explanation

First transaction:

Buy at `0` and sell at `3`.

```text
Profit = 3 - 0 = 3
````

Second transaction:

Buy at `1` and sell at `4`.

```text
Profit = 4 - 1 = 3
```

Total profit:

```text
3 + 3 = 6
```

## Approach

Use two arrays:

* `left[i]` → maximum profit using one transaction from index `0` to `i`.
* `right[i]` → maximum profit using one transaction from index `i` to the end.

### Step 1: Calculate `left[]`

Traverse from left to right and keep track of the minimum price seen so far.

```text
left[i] = maximum profit from 0 to i
```

### Step 2: Calculate `right[]`

Traverse from right to left and keep track of the maximum price seen so far.

```text
right[i] = maximum profit from i to the end
```

### Step 3: Combine both transactions

For every index:

```text
totalProfit = left[i] + right[i]
```

Keep the maximum value.

This divides the two transactions into a left part and a right part, ensuring that the transactions do not overlap.

## Complexity

* Time Complexity: `O(n)`
* Space Complexity: `O(n)`

## Language

Java

