public class Maze {

    static void wall(){
        for (int k = 0; k < 2; k++){
            System.out.println("|");
        }
    }
    static void generate(){
        String boarder = " _____ ";
        System.out.println(boarder);
        wall();

    }
    public static void main(String[] args){
        generate();
    }
}
