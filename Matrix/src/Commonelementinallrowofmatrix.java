import java.util.HashMap;
import java.util.Map;

public class Commonelementinallrowofmatrix {
    static int M = 5;
    static int N = 5;
    static class  info{
        int row;
        int col;
        int valuel;
        int count;
    }
    static void findcommon(int[][] mat) {
        Map<Integer, info> map = new HashMap<>();
        //first we insert the first row simultaneusly check if there is the duplicate element is present
        //or not
        for (int i = 0; i < M; i++) {
            info element = new info();
            element.valuel = mat[0][i];
            element.row = 0;
            element.col = i;
            element.count = 1;
            if (map.containsKey(mat[0][i]) && map.get(mat[0][i]).row != 0) {
                info elements = map.get(mat[0][i]);
                elements.count = elements.count + 1;
                map.put(mat[0][i], elements);
            } else if(!map.containsKey(mat[0][i])) {
                map.put(mat[0][i],element);
            }else{

            }
        }
        for (int i = 1; i < M-1; i++) {
            for (int j = 0; j < M; j++) {
                info element = new info();
                element.valuel = mat[i][j];
                element.row = i;
                element.col = j;
                element.count= 1;
                if (map.containsKey(mat[i][j]) && map.get(mat[i][j]).row != j) {
                    info elements = map.get(mat[i][j]);
                    elements.count = elements.count + 1;
                    map.put(mat[i][j], elements);
                } else if(!map.containsKey(mat[i][j])){
                    map.put(mat[i][j],element);
                }else{

                }
            }
        }
        for(info el:map.values()){
            System.out.println("value"+el.valuel+"count:"+el.count);
        }
    }
    public static void main(String[] args) {
        int mat[][] = {
                {1,2,1,4,8},
                {3,7,8,5,1},
                {8,7,7,3,2},
                {8,1,7,9,9}};
        findcommon(mat);
    }
}
