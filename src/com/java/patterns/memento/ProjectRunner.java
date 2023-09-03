package com.java.patterns.memento;

import java.time.LocalDate;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        RemoteRepository repository = new RemoteRepository();

        System.out.println("Creating new project. ver 1.0");
        project.setCurrentVersion("version 1.0", LocalDate.now().minusDays(1L));
        System.out.println(project);

        System.out.println("Saving current project snapshot version 1.0 to remote repository");
        repository.setSnapshot(project.saveSnapshot());

        System.out.println("Adding bad code to project");
        System.out.println("Updating current project version to 1.1");
        project.setCurrentVersion("version 1.1", LocalDate.now());

        System.out.println("Printing current project version: " + project);

        System.out.println("Something went wrong");
        System.out.println("Rolling back to previous version");
        project.restorePreviousSnapshot(repository.getSnapshot());

        System.out.println("Project after rollback");
        System.out.println(project);
    }
}
