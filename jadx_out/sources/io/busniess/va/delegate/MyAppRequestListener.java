package io.busniess.va.delegate;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.remote.VAppInstallerParams;
import com.lody.virtual.remote.VAppInstallerResult;
import java.io.File;

/* loaded from: classes3.dex */
public class MyAppRequestListener implements VirtualCore.AppRequestListener {
    private final Context mContext;

    public MyAppRequestListener(Context context) {
        this.mContext = context;
    }

    private static void info(String str) {
        VLog.e("AppInstaller", str);
    }

    @Override // com.lody.virtual.client.core.VirtualCore.AppRequestListener
    public void onRequestInstall(String str) {
        String str2;
        info("Start installing: " + str);
        VAppInstallerResult installPackage = VirtualCore.get().installPackage(Uri.fromFile(new File(str)), new VAppInstallerParams());
        if (installPackage.status == 0) {
            info("Install " + installPackage.packageName + " success.");
            boolean launchApp = VActivityManager.get().launchApp(0, installPackage.packageName);
            StringBuilder sb = new StringBuilder();
            sb.append("launch app ");
            if (launchApp) {
                str2 = "success.";
            } else {
                str2 = "fail.";
            }
            sb.append(str2);
            info(sb.toString());
            return;
        }
        info("Install " + installPackage.packageName + " fail, error code: " + installPackage.status);
    }

    @Override // com.lody.virtual.client.core.VirtualCore.AppRequestListener
    public void onRequestUninstall(String str) {
        Toast.makeText(this.mContext, "Intercept uninstall request: " + str, 0).show();
    }
}
