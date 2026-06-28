package com.yuanqi.group.home.models;

import android.content.Context;
import com.lody.virtual.client.ipc.VDeviceManager;
import com.lody.virtual.remote.InstalledAppInfo;

/* loaded from: classes3.dex */
public class e extends j {
    public e(Context context, InstalledAppInfo installedAppInfo, int i5) {
        super(context, installedAppInfo, i5);
    }

    public boolean b() {
        return VDeviceManager.get().isEnable(this.f14038b);
    }
}
