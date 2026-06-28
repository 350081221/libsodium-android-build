package com.lody.virtual.server.accounts;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.lody.virtual.server.pm.PackageCacheManager;
import com.lody.virtual.server.pm.PackageSetting;

/* loaded from: classes3.dex */
public class RegisteredServicesParser {
    public XmlResourceParser getParser(Context context, ServiceInfo serviceInfo, String str) {
        int i5;
        Bundle bundle = serviceInfo.metaData;
        if (bundle != null && (i5 = bundle.getInt(str)) != 0) {
            try {
                return getResources(context, serviceInfo.applicationInfo).getXml(i5);
            } catch (Exception e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public Resources getResources(Context context, ApplicationInfo applicationInfo) {
        PackageSetting setting = PackageCacheManager.getSetting(applicationInfo.packageName);
        if (setting != null) {
            AssetManager newInstance = mirror.android.content.res.AssetManager.ctor.newInstance();
            mirror.android.content.res.AssetManager.addAssetPath.call(newInstance, setting.getPackagePath());
            Resources resources = context.getResources();
            return new Resources(newInstance, resources.getDisplayMetrics(), resources.getConfiguration());
        }
        return null;
    }
}
