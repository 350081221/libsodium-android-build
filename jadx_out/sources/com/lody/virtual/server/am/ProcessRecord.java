package com.lody.virtual.server.am;

import android.content.pm.ApplicationInfo;
import android.os.Binder;
import android.os.IInterface;
import android.os.Process;
import com.lody.virtual.client.IVClient;
import com.lody.virtual.client.stub.StubManifest;
import com.lody.virtual.helper.compat.ObjectsCompat;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.remote.ClientConfig;
import com.lody.virtual.server.extension.VExtPackageAccessor;
import com.lody.virtual.server.pm.PrivilegeAppOptimizer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ProcessRecord extends Binder {
    public IInterface appThread;
    public IVClient client;
    public final ApplicationInfo info;
    public final boolean isExt;
    public int pid;
    final Set<String> pkgList = Collections.synchronizedSet(new HashSet());
    public boolean privilege;
    public final String processName;
    public final int userId;
    public final int vpid;
    public final int vuid;

    public ProcessRecord(ApplicationInfo applicationInfo, String str, int i5, int i6, boolean z4) {
        this.info = applicationInfo;
        this.vuid = i5;
        this.vpid = i6;
        this.userId = VUserHandle.getUserId(i5);
        this.processName = str;
        this.isExt = z4;
        this.privilege = PrivilegeAppOptimizer.get().isPrivilegeProcess(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProcessRecord.class != obj.getClass()) {
            return false;
        }
        ProcessRecord processRecord = (ProcessRecord) obj;
        if (this.vuid == processRecord.vuid && this.vpid == processRecord.vpid && this.isExt == processRecord.isExt && this.userId == processRecord.userId && ObjectsCompat.equals(this.processName, processRecord.processName)) {
            return true;
        }
        return false;
    }

    public ClientConfig getClientConfig() {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.isExt = this.isExt;
        clientConfig.vuid = this.vuid;
        clientConfig.vpid = this.vpid;
        clientConfig.packageName = this.info.packageName;
        clientConfig.processName = this.processName;
        clientConfig.token = this;
        return clientConfig;
    }

    public String getProviderAuthority() {
        return StubManifest.getStubAuthority(this.vpid, this.isExt);
    }

    public int hashCode() {
        return ObjectsCompat.hash(this.processName, Integer.valueOf(this.vuid), Integer.valueOf(this.vpid), Boolean.valueOf(this.isExt), Integer.valueOf(this.userId));
    }

    public boolean isPrivilegeProcess() {
        return this.privilege;
    }

    public void kill() {
        if (this.isExt) {
            VExtPackageAccessor.forceStop(new int[]{this.pid});
            return;
        }
        try {
            Process.killProcess(this.pid);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
