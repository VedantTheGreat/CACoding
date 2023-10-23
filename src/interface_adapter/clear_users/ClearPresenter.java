package interface_adapter.clear_users;

// TODO Complete me


import interface_adapter.ViewManagerModel;
import interface_adapter.logged_in.LoggedInState;
import interface_adapter.logged_in.LoggedInViewModel;
import interface_adapter.login.LoginViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import use_case.login.LoginOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }
    public void prepareSuccessView(ClearOutputData response) {
        // On success, switch to the logged in view.

        ClearState clearState = clearViewModel.getState();
        clearState.setDeletedUser(response.getDeletedUser());
        this.clearViewModel.setState(clearState);
        this.clearViewModel.firePropertyChanged();

    }

}
