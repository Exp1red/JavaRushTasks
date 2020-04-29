package com.javarush.task.task36.task3608;

import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.FakeModel;
import com.javarush.task.task36.task3608.model.MainModel;
import com.javarush.task.task36.task3608.model.Model;
import com.javarush.task.task36.task3608.view.EditUserView;
import com.javarush.task.task36.task3608.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        EditUserView editUserView = new EditUserView();

        UsersView usersView = new UsersView();
        Controller controller = new Controller();


        controller.setModel(model);
        controller.setUsersView(usersView);

        controller.setEditUserView(editUserView);
        controller.setEditUserView(editUserView);
        editUserView.setController(controller);
        usersView.setController(controller);

        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126);
        editUserView.fireEventUserDeleted(124L);
        usersView.fireEventShowDeletedUsers();
    }
}