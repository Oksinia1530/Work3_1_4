package ru.averinaoy.api;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<StudentGroup> groups1 = new ArrayList<>();
        groups1.add(new StudentGroup("Группа 1"));
        groups1.add(new StudentGroup("Группа 2"));
        List<StudentGroup> groups2 = new ArrayList<>();
        groups2.add(new StudentGroup("Группа 3"));
        groups2.add(new StudentGroup("Группа 4"));
        groups2.add(new StudentGroup("Группа 5"));

        Stream stream1 = new Stream(groups1);
        Stream stream2 = new Stream(groups2);

        List<Stream> streams = List.of(stream1, stream2);

        StreamComparator comparator = new StreamComparator();
        StreamService service = new StreamService();
        List<Stream> sortedStreams = service.SortStreamBySize(new ArrayList<>(streams), comparator);

        for (Stream stream : sortedStreams) {
            System.out.println("Поток с количеством групп: " + stream.studentGroups.size());
            for (StudentGroup group : stream) {
                System.out.println(" - " + group.getGroupName());
            }
        }
    }
}