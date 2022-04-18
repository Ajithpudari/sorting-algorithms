# sorting-algorithms
### Bubble sort algorithm

Bubble sort works by iterating first element to last element, comparing two adjacent elements and swapping them if they are not in correct order. Each iteration places next larger value to its correct place.

Time Complexity:

Best case: O(n)

Average case: O(n^2)

Worst case: O(n^2)

### InertionSort

Insertion sort works by comparing values at index with all its prior elements.We place value at the index where there are no lesser value to the elements. So when you reach last element,we get a sorted array.

Time Complexity:

Best case: O(n)

Average case: O(n^2)

Worst case: O(n^2)

### SelectionSort:

Selection sort is an in place comparison sorting algorithm. It is very simple to implement but it does not go well with large number of inputs.

Time Complexity:

Best case : O(N^2)

Average case : O(N^2)

Worst case : O(N^2)

### QuickSort

In quick sort, we first choose a pivot and divide into two sublists,one will contain elements lower than pivot and other will have elements greater than pivot.

Quick sort or partition-exchange sort, is a sorting algorithm, which is using divide and conquer algorithm.

Time Complexity:

Best case : O(nlogn)

Average case : O(nlogn)

Worst case : O(n^2)


### MergeSort
Merge sort is divide and conquer sorting algorithm. It is efficient, comparison based sorting algorithm.

Divide list into sublist of about half size in each iteration until each sublist has only one element.

Merge each sublist repeatedly to create sorted list. It will run until we have only 1 sorted list. This will be the sorted list.

Time Complexity:

Best case : O(nlogn)

Average case : O(nlogn)

Worst case : O(nlogn)
