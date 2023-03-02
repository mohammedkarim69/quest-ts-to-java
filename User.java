 import java.util.ArrayList;
 import java.util.Date;

public class User {
    

    private Date birthdate;
    private int size;
    private ArrayList<Photo> photos;
    private Address Address;

public User(Date birthdate, int size, ArrayList<Photo> photos , Address Address)  {
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos ;
        this.Address = Address;
    }


}