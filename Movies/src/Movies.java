import java.util.Arrays;

public class Movies {

    public static void main(String[] args) {

        String[] movies = {"Ca sent la raclette",
                "Rataboobs",
                "Les anneaux du plaisir"};

        String[][] actors = {{"Marion", "Arthur", "Chauvinho"},
                {"Marion", "Rey", "Gersou"},
                {"Yass", "Chauvinho", "Arthur"}};

        int i;
        for (i = 0; i < movies.length; i++){
            System.out.print("Dans le film :  " + movies[i] + " les personnages sont : ");
            for (int x = 0; x < actors[0].length; x++){
                 System.out.print(actors[i][x] + " ");
                }
            }
             System.out.println();
        }
    }

