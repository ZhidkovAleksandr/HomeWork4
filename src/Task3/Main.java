package Task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player walkman = new Player();

        Scanner sc = new Scanner(System.in);
        int action;

        while (true){
            System.out.println("Press the button 1-play/2-pause/3-record/4-stop");
            action = sc.nextInt();
            switch (action){
                case 1:
                    walkman.play();
                    break;
                case 2:
                    walkman.pause();
                    break;
                case 3:
                    walkman.record();
                    break;
                case 4:
                    walkman.stop();
                    return;
                default:
                    continue;
            }

        }

    }

}
