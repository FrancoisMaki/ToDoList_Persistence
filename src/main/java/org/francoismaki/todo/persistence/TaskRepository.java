package org.francoismaki.todo.persistence;

import org.francoismaki.todo.domain.Task;

import java.io.IOException;
import java.util.List;

public interface TaskRepository {
    List<Task> loadAll() throws IOException;
    void saveAll(List<Task> tasks) throws IOException;
}
