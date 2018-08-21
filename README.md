# Data Structures And Algorithms

## [Arrays](#arrays)
## [Lists](#lists)
## Stacks
## Queues
## [Binary Trees](#binary-trees)
## [Binary Search Trees](#binary-search-trees)
## Heaps
## Hashing
## Maps
## Graphs
---
## <a name="arrays"></a> Arrays
### Overview
An array is a collection of items stored at contiguous memory locations. The idea is to  
store multiple items of the same type together. This makes it easier to calculate the  
position of each element by simply adding an offset to a base value, i.e., the memory  
location of the first element of the array (generally denoted by the name of the array).
<br>

#### Dimension
The dimension of an array is the number of indices needed to select an element. Thus, if the  
array is seen as a function on a set of possible index combinations, it is the dimension of  
the space of which its domain is a discrete subset. Thus a one-dimensional array is a list of  
data, a two-dimensional array a rectangle of data, a three-dimensional array a block of data,  
etc.
<br>

#### Operations
- insertion: O(1)
- search: O(n)
- read: O(1)
<br>

#### Drawbacks
- static arrays have their sizes fixed from the beginning.
<br>
<br>
<br>

---

## <a name="lists"></a> Lists
### Linked List
A linked list is a linear collection of data elements, whose order is not given by their physical placement in memory. Instead, each element points to the next. It is a data structure consisting of a collection of nodes which together represent a sequence. In its most basic form, each node contains: data, and a reference (in other words, a link) to the next node in the sequence. This structure allows for efficient insertion or removal of elements from any position in the sequence during iteration.
<br>

### Disadvantages
- They use more memory than arrays because of the storage used by their pointers.
- Nodes in a linked list must be read in order from the beginning as linked lists are inherently sequential access.
- Nodes are not stored contiguously, greatly increasing the time periods required to access individual elements within the list, especially with a CPU cache.
- Difficulties arise in linked lists when it comes to reverse traversing. For instance, singly linked lists are cumbersome to navigate backwards and while doubly linked lists are somewhat easier to read, memory is consumed in allocating space for a back-pointer.
<br>

### Singly linked list
Singly linked lists contain nodes which have a data field as well as 'next' field, which points to the next node in line of nodes. Operations that can be performed on singly linked lists include insertion, deletion and traversal.
<br>

### Doubly linked list
In a 'doubly linked list', each node contains, besides the next-node link, a second link field pointing to the 'previous' node in the sequence.
<br>

### Circular linked list
In the last node of a list, the link field often contains a null reference, a special value used to indicate the lack of further nodes. A less common convention is to make it point to the first node of the list; in that case the list is said to be 'circular' or 'circularly linked'; otherwise it is said to be 'open' or 'linear'. It is a list where the last pointer points to the first node.
<br>

### Sentinel nodes
In some implementations an extra 'sentinel' or 'dummy' node may be added before the first data record or after the last one. This convention simplifies and accelerates some list-handling algorithms, by ensuring that all links can be safely dereferenced and that every list (even one that contains no data elements) always has a "first" and "last" node.
<br>

### Operations
- insert/ delete beginning: O(1)
- insert/ delete end: O(1) if end is known and is doubly linked list
O(n) otherwise
- insert/ delete middle: time to find element + O(1)                  
- indexing: O(n)
- search: O(n)

---


## <a name="binary-trees"></a> Binary Trees
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

## <a name="binary-search-trees"></a> Binary Search Trees
