# PathfindingAlgorithm
Based on Java.<br>
By adding a M\*N matrix to delimit the initial state.<br>
If the programme reach '1', then it will end the loop and try again.<br>
It'll mark down the path it went through.<br>
"5" is used for marking the path.<br>
* The default settings of the maze.<br>  
>{0 0 1 0 0 0 1 0}<br>
{0 0 1 0 0 0 1 0}<br>
{0 0 1 0 1 1 0 1}<br>
{0 1 1 1 0 0 1 0}<br>
{0 0 0 1 0 0 0 0}<br>
{0 1 0 0 0 1 0 1}<br>
{0 1 1 1 1 0 0 1}<br>
{1 1 0 0 0 1 0 1}<br>
{1 1 0 0 0 0 0 0}<br>
![](https://github.com/evencats/PathfindingAlgorithm/blob/master/DefautMaze.png)<br>

Some result: <br>
>1530087205349<br>
Solution1:<br>
Answer:<br>
5 5 1 0 0 0 1 0 <br>
5 5 1 0 0 0 1 0 <br>
5 0 1 0 1 1 0 1 <br>
5 1 1 1 0 0 1 0 <br>
5 5 5 1 5 5 5 0 <br>
0 1 5 5 5 1 5 1 <br>
0 1 1 1 1 0 5 1 <br>
1 1 0 0 0 1 5 1 <br>
1 1 0 0 0 0 5 0 <br>
![](https://github.com/evencats/PathfindingAlgorithm/blob/master/Solution2.png)<br>

>Solution2:<br>
Answer:<br>
5 5 1 0 0 0 1 0 <br>
0 5 1 0 0 0 1 0 <br>
5 5 1 0 1 1 0 1 <br>
5 1 1 1 5 5 1 0 <br>
5 5 5 1 5 5 5 0 <br>
0 1 5 5 5 1 5 1 <br>
0 1 1 1 1 0 5 1 <br>
1 1 0 0 0 1 5 1 <br>
1 1 0 0 0 0 5 0 <br>
![](https://github.com/evencats/PathfindingAlgorithm/blob/master/Solution3.png)<br>
