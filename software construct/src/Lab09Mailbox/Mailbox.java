package Lab09Mailbox;

public class Mailbox {
    private int[] totalmail;

    public Mailbox() {
        this.totalmail = new int[120];
    }

    public void insertMail(int room,int mail){
        totalmail[room-14010] += mail;
    }

    public int checkMail(int room){
        return this.totalmail[room-14010];
    }

    public void getMail(int room){
        if (this.totalmail[room-14010] == 0){
            throw new IllegalArgumentException("Not Found Mail in Room "+room);
        }
        this.totalmail[room-14010] = 0;
    }

    public void checkRoom(int room){
        if (room >14129 || room < 14010){
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
