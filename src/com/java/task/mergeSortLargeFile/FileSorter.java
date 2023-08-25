package com.java.task.mergeSortLargeFile;

@FunctionalInterface
public interface FileSorter {
    void sort(String inputPath, String outputPath);
}