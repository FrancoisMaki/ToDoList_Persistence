package org.francoismaki.todo.persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.francoismaki.todo.domain.Task;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class JsonTaskRepository implements TaskRepository{

    private static final ObjectMapper MAPPER = new ObjectMapper()
            .enable(SerializationFeature.INDENT_OUTPUT);

    private final Path dataFile;

    public JsonTaskRepository(Path dataFile){
        this.dataFile = dataFile;
    }

    @Override
    public List<Task> loadAll() throws IOException {
        return List.of();
    }

    @Override
    public void saveAll(List<Task> tasks) throws IOException {

    }
}
