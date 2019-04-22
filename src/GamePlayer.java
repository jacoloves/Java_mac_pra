public class GamePlayer {
    public  String playername;
    public GamePlayer(String name) {
        playername = name;
    }

    @Override
    public String toString() {
        return "[player:" + playername + "]";
    }

    public static void main(String[] args) {
        GamePlayer[] palyer = new GamePlayer[3];
        palyer[0] = new GamePlayer("Mad Hatter");
        palyer[1] = new GamePlayer("March Hare");
        palyer[2] = new GamePlayer("Alice");

        for (int i = 0; i < palyer.length; i++) {
            System.out.println(palyer[i]);
        }
    }
}
