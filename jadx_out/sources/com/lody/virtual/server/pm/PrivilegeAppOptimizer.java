package com.lody.virtual.server.pm;

import android.content.Intent;
import android.net.Uri;
import com.lody.virtual.GmsSupport;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.server.am.VActivityManagerService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class PrivilegeAppOptimizer {
    private static final PrivilegeAppOptimizer sInstance = new PrivilegeAppOptimizer();
    private final List<String> privilegeApps;
    private final List<String> privilegeProcessNames;

    private PrivilegeAppOptimizer() {
        ArrayList arrayList = new ArrayList();
        this.privilegeApps = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.privilegeProcessNames = arrayList2;
        arrayList.add(GmsSupport.GMS_PKG);
        arrayList.add(GmsSupport.GSF_PKG);
        arrayList2.add("com.google.android.gms.persistent");
        arrayList2.add("com.google.process.gapps");
    }

    public static PrivilegeAppOptimizer get() {
        return sInstance;
    }

    private Intent specifyApp(Intent intent, String str, int i5) {
        intent.putExtra("_VA_|_privilege_pkg_", str);
        intent.putExtra("_VA_|_user_id_", i5);
        return intent;
    }

    public void addPrivilegeApp(String str) {
        this.privilegeApps.add(str);
    }

    public List<String> getPrivilegeApps() {
        return Collections.unmodifiableList(this.privilegeApps);
    }

    public boolean isPrivilegeApp(String str) {
        return this.privilegeApps.contains(str);
    }

    public boolean isPrivilegeProcess(String str) {
        return this.privilegeProcessNames.contains(str);
    }

    public boolean performOptimize(String str, int i5) {
        if (!isPrivilegeApp(str)) {
            return false;
        }
        VActivityManagerService.get().sendBroadcastAsUser(specifyApp(new Intent("android.intent.action.BOOT_COMPLETED", (Uri) null), str, i5), new VUserHandle(i5));
        return true;
    }

    public void performOptimizeAllApps() {
        Iterator<String> it = this.privilegeApps.iterator();
        while (it.hasNext()) {
            performOptimize(it.next(), -1);
        }
    }

    public void removePrivilegeApp(String str) {
        this.privilegeApps.remove(str);
    }
}
