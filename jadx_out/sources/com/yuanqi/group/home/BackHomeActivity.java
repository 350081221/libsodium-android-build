package com.yuanqi.group.home;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import java.util.Iterator;

@Instrumented
/* loaded from: classes3.dex */
public class BackHomeActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        boolean z4;
        ComponentName componentName;
        ComponentName componentName2;
        ComponentName componentName3;
        ComponentName componentName4;
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        ComponentName componentName5 = new ComponentName(this, (Class<?>) HomeActivity.class);
        Iterator<ActivityManager.RunningTaskInfo> it = activityManager.getRunningTasks(Integer.MAX_VALUE).iterator();
        while (true) {
            z4 = false;
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.RunningTaskInfo next = it.next();
            componentName = next.baseActivity;
            if (componentName != null) {
                componentName4 = next.baseActivity;
                if (componentName4.equals(componentName5)) {
                    activityManager.moveTaskToFront(next.id, 0);
                    break;
                }
            }
            componentName2 = next.topActivity;
            if (componentName2 != null) {
                componentName3 = next.topActivity;
                if (componentName3.equals(componentName5)) {
                    activityManager.moveTaskToFront(next.id, 0);
                    break;
                }
            }
        }
        z4 = true;
        if (!z4) {
            Intent intent = new Intent(this, (Class<?>) HomeActivity.class);
            intent.addFlags(268435456);
            intent.addFlags(131072);
            startActivity(intent);
        }
        finish();
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    @Override // android.app.Activity
    protected void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    @Override // android.app.Activity
    protected void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
