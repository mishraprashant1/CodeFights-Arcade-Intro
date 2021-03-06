/*

Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.

Given an integer, find its digit degree.

Example

For n = 5, the output should be
digitDegree(n) = 0;
For n = 100, the output should be
digitDegree(n) = 1.
1 + 0 + 0 = 1.
For n = 91, the output should be
digitDegree(n) = 2.
9 + 1 = 10 -> 1 + 0 = 1.

*/

int digitDegree(int n) {
    int count = 0;
    int r=0;
    while(n>9){
        String s=n+"";
        for(int i=0;i<s.length();i++)
            r=r+Integer.parseInt(s.charAt(i)+"");
        n=r;
        r=0;
        count++;
    }
    return count;
}
