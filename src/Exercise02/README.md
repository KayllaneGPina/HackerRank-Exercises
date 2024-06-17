# Java STDIN and STDOUT II
In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below.

### Input Format
There are three lines of input:
1. The first line contains an integer.
2. The second line contains a double.
3. The third line contains a String.

### Output Format
There are three lines of output:
1. On the first line, print `String`: followed by the unaltered String read from stdin.
2. On the second line, print `Double`: followed by the unaltered double read from stdin.
3. On the third line, print `Int`: followed by the unaltered integer read from stdin.

**Note:** If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).

### Sample Output
```
42 
3.1415
Welcome to HackerRank's Java tutorials!
```

### Sample Output
```
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
```