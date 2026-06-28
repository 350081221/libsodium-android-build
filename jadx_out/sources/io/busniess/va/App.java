package io.busniess.va;

import android.app.Application;
import android.content.Context;
import android.webkit.WebView;
import com.lody.virtual.helper.compat.BuildCompat;
import io.busniess.va.common.CommonApp;

/* loaded from: classes3.dex */
public class App extends Application {
    private static App gApp;
    CommonApp commonApp = new CommonApp();

    public static App getApp() {
        return gApp;
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        String processName;
        super.attachBaseContext(context);
        gApp = this;
        if (BuildCompat.isPie()) {
            try {
                processName = Application.getProcessName();
                WebView.setDataDirectorySuffix(processName);
            } catch (Throwable unused) {
            }
        }
        this.commonApp.attachBaseContext(context);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        this.commonApp.onCreate(this);
    }
}
