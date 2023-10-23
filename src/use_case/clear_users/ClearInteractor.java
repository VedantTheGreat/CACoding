package use_case.clear_users;

// TODO Complete me

import entity.User;
import entity.UserFactory;
import use_case.login.LoginInputData;
import use_case.login.LoginOutputData;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
final ClearUserDataAccessInterface clearDataAccessObject;
final ClearOutputBoundary clearPresenter;
final UserFactory userFactory;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessObject, ClearOutputBoundary clearOutputBoundary, UserFactory userFactory) {
    this.clearDataAccessObject=clearDataAccessObject;
    this.userFactory=userFactory;
    this.clearPresenter=clearOutputBoundary;
    }
    public void execute() {
        ArrayList<String> deletedUser=clearDataAccessObject.clear();
        ClearOutputData clearOutputData=new ClearOutputData(deletedUser);
        clearPresenter.prepareSuccessView(clearOutputData);
        }
    }

