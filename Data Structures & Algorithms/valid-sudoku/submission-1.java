class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Row Checker
        for(char[] row : board){
            Set<Character> rowNums = new HashSet<>();
            for(char num : row){
                if (num == '.'){
                    continue;
                }
                if(!rowNums.add(num)){
                    return false;
                }
            }
        }

        // Column Checker
        for(int i = 0; i < board.length; i++){
            Set<Character> colNums = new HashSet<>();
            for(int j = 0; j < board[i].length; j++){    
                char num = board[j][i];
                if (num == '.'){
                    continue;
                }
                if(!colNums.add(num)){
                    return false;
                }
            }   
        }

        Map<String, Set<Character>> squares = new HashMap<>();
        // Square Checker
        for(int i = 0; i < board.length; i++){
            int rowPlace = i/3; 
            for(int j = 0; j < board[i].length; j++){  
                int colPlace = j/3;
                String key = rowPlace + "," + colPlace;

                char num = board[i][j];
                if (num == '.'){
                    continue;
                }
                
                squares.putIfAbsent(key, new HashSet<>());
                if(!squares.get(key).add(num)) return false;
            }
        }
        return true;   
    }
}
