package org.reactnative.camera.utils;

import android.content.Context;

import java.io.File;

import android.content.ContextWrapper;

import android.os.Environment;


/**
 * Created by jgfidelis on 23/01/18.
 */

public class ScopedContext {

    private File cacheDirectory = null;

    public ScopedContext(Context context) {
        createCacheDirectory(context);
    }

    public void createCacheDirectory(Context context) {
        ContextWrapper cw = new ContextWrapper(context);
        cacheDirectory = new File(cw.getExternalFilesDir(Environment.DIRECTORY_MOVIES), "Camera");
    }

    public File getCacheDirectory() {
        return cacheDirectory;
    }

}
