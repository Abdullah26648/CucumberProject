package StepDefinitions;

import Pages.ToDoListPage;
import Pages.ToDoListParallelPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.util.List;

public class ToDoListParallelStepDefinitions {
    ToDoListParallelPage toDoListParallelPage = new ToDoListParallelPage();
    @When("enters todos")
    public void enter_todos(DataTable dataTable) {

        List<String> toDoList = dataTable.asList();
        System.out.println("toDoList = " + toDoList);

        for (String w : toDoList) {
            toDoListParallelPage.input.sendKeys(w + Keys.ENTER);
        }

    }

}
