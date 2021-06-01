package ru.mirea.vinnikov.project.ui.story;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface HistoryDao {
    @Query("SELECT * FROM Cell")
    List<ru.mirea.vinnikov.project.ui.story.Cell> getAll();
    @Query("SELECT * FROM Cell WHERE id = :id")
    ru.mirea.vinnikov.project.ui.story.Cell getById(long id);
    @Insert
    void insert(ru.mirea.vinnikov.project.ui.story.Cell cell);
    @Update
    void update(ru.mirea.vinnikov.project.ui.story.Cell cell);
    @Delete
    void delete(ru.mirea.vinnikov.project.ui.story.Cell cell);

}
