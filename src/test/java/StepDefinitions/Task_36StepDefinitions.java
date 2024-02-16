package StepDefinitions;

import Pages.Task_36Page;
import io.cucumber.java.en.When;

import java.util.Map;


public class Task_36StepDefinitions {
    Task_36Page task_36 = new Task_36Page();

    @When("user enters title and note")
    public void user_enters_title_and_note(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> titlesandnotes = dataTable.asMap();

        for (Map.Entry<String, String> w : titlesandnotes.entrySet()) {

            String title = w.getKey();
            String note = w.getValue();

            task_36.title.sendKeys(title);
            task_36.note.sendKeys(note);
            task_36.addbutton.click();

        }

    }

}
