class Solution {
    public boolean isValidSudoku(char[][] board) {
    for(int i=0;i<9;i++) if(!rowValid(board,i)) return false;
    for(int j=0;j<9;j++) if(!colValid(board,j)) return false;

    for(int i=0;i<9;i+=3)
    for(int j=0;j<9;j+=3)
    if(!gridValid(board,i,j)) return false;

    return true;
}

public static boolean rowValid(char[][] board, int row)
{
    Set<Character> set =  new HashSet<>();
    for(int j=0;j<9;j++)
    if(set.contains(board[row][j]))
    {System.out.println("Row not valid: "+row); return false; }
    else if(board[row][j]!='.') set.add(board[row][j]);

    return true;
}

public static boolean colValid(char[][] board, int col)
{
    Set<Character> set =  new HashSet<>();
    for(int i=0;i<9;i++)
    if(set.contains(board[i][col]))
    {System.out.println("col not valid"); return false; }
    else if(board[i][col]!='.') set.add(board[i][col]);

    return true;
}

public static boolean gridValid(char[][] board, int row, int col)
{
    Set<Character> set =  new HashSet<>();
    for(int i=row;i<row+3;i++)
    for(int j=col;j<col+3;j++)
    if(set.contains(board[i][j])) 
    {System.out.println("Grid not valid"); return false; }
    else if(board[i][j]!='.') set.add(board[i][j]);

    return true;
}



}
