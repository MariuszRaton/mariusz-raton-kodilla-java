package com.kodilla.stream.portfolio;


import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class TaskListAverageWorkingOnTask {

public void getTaskListAverageWorkingOnTask(PrepareTestData project, List<TaskList> inProgress){

  //  PrepareTestData project = prepareTestData;
   // PrepareTestData project = new PrepareTestData();

   // List<TaskList> inProgress = new ArrayList<>();
    inProgress.add(new TaskList("In progress"));

    int durationOfTaskInStatus = project.getPrepareTestData().getTaskLists().stream()
            .filter(inProgress::contains)
            .flatMap(d -> d.getTasks().stream())
            .map(task -> Period.between(task.getCreated(), LocalDate.now()).getDays())
            .reduce(0, (sum, current) -> sum += current);

    int tasksQty = project.getPrepareTestData().getTaskLists().stream()
            .filter(inProgress::contains)
            .flatMap(tl -> tl.getTasks().stream())
            .map(t -> 1)
            .reduce(0, (sum, current) -> sum += current);

    double avg = durationOfTaskInStatus / tasksQty;

}

}
