package StepDefinitions;

import Pages.ToDoListPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.util.List;

public class ToDoListStepDefinitions {
    ToDoListPage toDoListPage = new ToDoListPage();
    @When("enter todos")
    public void enter_todos(DataTable dataTable) {

        List<String> toDoList = dataTable.asList();
        System.out.println("toDoList = " + toDoList);

        for (String w : toDoList) {
            toDoListPage.input.sendKeys(w + Keys.ENTER);
        }

    }

}
