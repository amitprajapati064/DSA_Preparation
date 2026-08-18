# Best Time to Buy and Sell Stock

## Problem

Given an array of stock prices, where `prices[i]` represents the price of the stock on the ith day, find the maximum profit that can be achieved by buying on one day and selling on a later day.

Only one transaction is allowed.

If no profit can be made, return `0`.

## Example 1

### Input

```text
6
7 1 5 3 6 4
```

### Output

```text
5
```

### Explanation

Buy at price `1` and sell at price `6`.

```text
Profit = 6 - 1 = 5
```

## Example 2

### Input

```text
5
7 6 4 3 1
```

### Output

```text
0
```

### Explanation

The prices keep decreasing, so no profitable transaction is possible.

Therefore, the maximum profit is `0`.

## Approach 1

Use a single pass through the array.

Keep track of:

* `buy` → minimum price seen so far
* `profit` → maximum profit found so far

For every price:

1. If the current price is lower than `buy`, update `buy`.
2. Otherwise, calculate the profit using the current price.
3. Update `profit` if the current profit is greater.

### Formula

```text
currentProfit = currentPrice - buy
```

The buying price is always from an earlier day, so the condition of buying before selling is maintained.

## Complexity

* Time Complexity: `O(n)`
* Space Complexity: `O(1)`


## Approach 2

Use an auxiliary array `min[]` to store the minimum price seen so far.

For every index:

```text
min[i] = minimum(prices[i], min[i-1])
```
Then calculate the profit for each day:

```
profit = prices[i] - min[i-1]
```
Keep updating the maximum profit found.

This ensures that the buying day always comes before the selling day.

## Complexity

* Time Complexity: `O(n)`
* Space Complexity: `O(n)`

## Language

Java

## Input Format

```text
n
prices[0] prices[1] ... prices[n-1]
```

## Output Format

```text
maximum profit
```