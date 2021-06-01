package ru.mirea.vinnikov.project.ui.story;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {ru.mirea.vinnikov.project.ui.story.Cell.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ru.mirea.vinnikov.project.ui.story.HistoryDao storyDao();
}

