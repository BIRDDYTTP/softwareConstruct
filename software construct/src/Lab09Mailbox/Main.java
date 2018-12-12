package Lab09Mailbox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // initialize MailBox object
        Mailbox m = new Mailbox();

        System.out.println("Welcome to Comsi Condominium");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Please select menu [I] = insert mail ; [C] = check total mail ; [G] = get mail ; [E] = exit");
            String command = sc.next();
            if(command.toLowerCase().charAt(0) == 'i'){
                System.out.println("Please enter [roomNumber numberOfMail] e.g. 14019 5");
                int room = sc.nextInt();
                int letter = sc.nextInt();
                try {
                    m.checkRoom(room);
                    m.insertMail(room, letter);
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Invalid Room Number");
                }

            }else if(command.toLowerCase().charAt(0) == 'c'){
                System.out.println("Please enter [roomNumber] e.g. 14019");
                int room = sc.nextInt();
                try {
                    m.checkRoom(room);
                    System.out.println("Total Mail in Your MailBox :  "+ m.checkMail(room));
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Invalid Room Number");
                }


            }else if (command.toLowerCase().charAt(0) == 'g'){
                System.out.println("Please enter [roomNumber] e.g. 14019");
                int room = sc.nextInt();
                try{
                    m.checkRoom(room);
                    m.getMail(room);
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Invalid Room Number");
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }



            }else if(command.toLowerCase().charAt(0 )== 'e'){
                break;
            }
        }
    }
}
