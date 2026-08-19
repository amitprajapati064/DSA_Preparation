# Best Time to Buy and Sell Stock II

## Problem

Given an array of stock prices, where `prices[i]` represents the price of the stock on the ith day, find the maximum profit that can be achieved by buying on one day and selling on a later day.

Unlimited transaction is allowed.

If no profit can be made, return `0`.

## Example 1

### Input

```text
6
7 1 5 3 6 4
```

### Output

```text
7
```

### Explanation

Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.

```text
Profit = 4 + 3 = 7
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

## Approach

Use a single pass through the array.

Since multiple transactions are allowed, take profit whenever the current day's price is greater than the previous day's price.

For every price:

1. Compare the current price with the previous day's price.
2. If the current price is higher, add the difference to `profit`.
3. If the current price is lower or equal, no transaction is made.

### Formula

```text
if prices[i] > prices[i-1]:

    profit += prices[i] - prices[i-1]
```
## Complexity

* Time Complexity: `O(n)`
* Space Complexity: `O(1)`


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