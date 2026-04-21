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

        List<Set<Character>> squares = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            squares.add(new HashSet<>());
        }

        // Square Checker
        for(int i = 0; i < board.length; i++){
            int rowPlace = i/3; 
            for(int j = 0; j < board[i].length; j++){  
                int colPlace = j/3;
                char num = board[i][j];
                switch(rowPlace){
                    case 0:
                        switch (colPlace){
                            case 0:
                                if (num == '.'){
                                    break;
                                }
                                if(!squares.get(0).add(num)){
                                    return false;
                                }
                                break;
                            case 1:
                                if (num == '.'){
                                    break;
                                }
                                if(!squares.get(1).add(num)){
                                    return false;
                                }
                                break;
                            case 2:
                                if (num == '.'){
                                    break;
                                }
                                if(!squares.get(2).add(num)){
                                    return false;
                                }
                                break;
                        }
                        break;
                    case 1:
                        switch (colPlace){
                            case 0:
                                if (num == '.'){
                                    break;
                                }
                                if(!squares.get(3).add(num)){
                                    return false;
                                }
                                break;
                            case 1:
                                if (num == '.'){
                                    break;
                                }
                                if(!squares.get(4).add(num)){
                                    return false;
                                }
                                break;
                            case 2:
                                if (num == '.'){
                                    break;
                                }
                                if(!squares.get(5).add(num)){
                                    return false;
                                }
                                break;
                        }
                        break; 
                    case 2:
                        switch (colPlace){
                            case 0:
                                if (num == '.'){
                                    break;
                                }
                                if(!squares.get(6).add(num)){
                                    return false;
                                }
                                break;
                            case 1:
                                if (num == '.'){
                                    break;
                                }
                                if(!squares.get(7).add(num)){
                                    return false;
                                }
                                break;
                            case 2:
                                if (num == '.'){
                                    break;
                                }
                                if(!squares.get(8).add(num)){
                                    return false;
                                }
                                break;
                        }
                        break;
                }
            }
        }
        
        return true;   
    }
}
