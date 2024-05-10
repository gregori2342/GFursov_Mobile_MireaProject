package ru.mirea.fursovgs.mireaproject.ui;

import android.media.MediaPlayer;
import android.content.Context;
import android.media.MediaPlayer;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import ru.mirea.fursovgs.mireaproject.R;

public class MusicPlayer extends Worker {
    private MediaPlayer mediaPlayer;
    public MusicPlayer(
            @NonNull Context context,
            @NonNull WorkerParameters params) {
        super(context, params);
        this.mediaPlayer = MediaPlayer.create(context, R.raw.music);
    }

    @Override
    public Result doWork() {
        mediaPlayer.start();
        return Result.success();
    }
}
