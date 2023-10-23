package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearOutputData {
    private final ArrayList<String> deletedUser;
    public ClearOutputData(ArrayList<String>deletedUser){
        this.deletedUser=deletedUser;
    }

    public ArrayList<String> getDeletedUser() {
        return deletedUser;
    }
}
