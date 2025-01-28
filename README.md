# ArrayReduction
Given an array, reduce the array to a single value with the minimum cost.   You must use a PriorityQueue.

```
Given array 1,2,3 
Add all values to a priority queue
Get the 2 smallest values and add their sum back to the pq
The queue would contain 3,3
The min cost so far is 3
Get the 2 smallest values and add their sum back to the pq
The queue would contain 6
The min cost is 9
The loop stops when the pq has a single value
```

## Sample Data : 
```
212
25,10,20
1,2,3
1,2,3,4,7,22,33,54,-66,3,4,5,76,7,999
1,1,1,1,1
1,1
```

## Sample Output :
```
0
85
9
947
12
2
```

