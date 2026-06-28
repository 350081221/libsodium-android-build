package com.lody.virtual.oem;

import android.content.pm.PackageManager;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.compat.BuildCompat;
import mirror.RefObject;
import mirror.android.app.ActivityThread;
import mirror.huawei.android.app.HwApiCacheManagerEx;
import mirror.huawei.android.app.HwFrameworkFactory;

/* loaded from: classes3.dex */
public class EmuiHelper {
    public static void disableCache() {
        Class<?> cls;
        if (!BuildCompat.isEMUI()) {
            return;
        }
        Object hwApiCacheManagerEx = HwFrameworkFactory.getHwApiCacheManagerEx();
        try {
            if (HwFrameworkFactory.TYPE != null && hwApiCacheManagerEx != null && (cls = HwApiCacheManagerEx.TYPE) != null && cls.isInstance(hwApiCacheManagerEx)) {
                HwApiCacheManagerEx.disableCache(hwApiCacheManagerEx);
                ActivityThread.USE_CACHE(false);
                RefObject<PackageManager> refObject = HwApiCacheManagerEx.mPkg;
                if (refObject != null) {
                    refObject.set(HwApiCacheManagerEx.getDefault.call(new Object[0]), VirtualCore.getPM());
                }
            }
        } catch (Exception unused) {
        }
    }
}
