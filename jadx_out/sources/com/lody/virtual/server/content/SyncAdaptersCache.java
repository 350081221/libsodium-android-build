package com.lody.virtual.server.content;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SyncAdapterType;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import com.lody.virtual.helper.utils.ComponentUtils;
import com.lody.virtual.server.accounts.RegisteredServicesParser;
import com.lody.virtual.server.pm.VPackageManagerService;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mirror.RefConstructor;
import mirror.android.content.SyncAdapterTypeN;
import mirror.com.android.internal.R_Hide;

/* loaded from: classes3.dex */
public class SyncAdaptersCache {
    private Context mContext;
    private final Map<String, SyncAdapterInfo> mSyncAdapterInfos = new HashMap();

    /* loaded from: classes3.dex */
    public static class SyncAdapterInfo {
        public ComponentName componentName;
        public ServiceInfo serviceInfo;
        public SyncAdapterType type;

        SyncAdapterInfo(SyncAdapterType syncAdapterType, ServiceInfo serviceInfo) {
            this.type = syncAdapterType;
            this.serviceInfo = serviceInfo;
            this.componentName = ComponentUtils.toComponentName(serviceInfo);
        }
    }

    public SyncAdaptersCache(Context context) {
        this.mContext = context;
    }

    private void generateServicesMap(List<ResolveInfo> list, Map<String, SyncAdapterInfo> map, RegisteredServicesParser registeredServicesParser) {
        int next;
        SyncAdapterType parseSyncAdapterType;
        for (ResolveInfo resolveInfo : list) {
            XmlResourceParser parser = registeredServicesParser.getParser(this.mContext, resolveInfo.serviceInfo, "android.content.SyncAdapter");
            if (parser != null) {
                try {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(parser);
                    do {
                        next = parser.next();
                        if (next == 1) {
                            break;
                        }
                    } while (next != 2);
                    if ("sync-adapter".equals(parser.getName()) && (parseSyncAdapterType = parseSyncAdapterType(registeredServicesParser.getResources(this.mContext, resolveInfo.serviceInfo.applicationInfo), asAttributeSet)) != null) {
                        map.put(parseSyncAdapterType.accountType + "/" + parseSyncAdapterType.authority, new SyncAdapterInfo(parseSyncAdapterType, resolveInfo.serviceInfo));
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    private SyncAdapterType parseSyncAdapterType(Resources resources, AttributeSet attributeSet) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, R_Hide.styleable.SyncAdapter.get());
        try {
            String string = obtainAttributes.getString(R_Hide.styleable.SyncAdapter_contentAuthority.get());
            String string2 = obtainAttributes.getString(R_Hide.styleable.SyncAdapter_accountType.get());
            if (string != null && string2 != null) {
                boolean z4 = obtainAttributes.getBoolean(R_Hide.styleable.SyncAdapter_userVisible.get(), true);
                boolean z5 = obtainAttributes.getBoolean(R_Hide.styleable.SyncAdapter_supportsUploading.get(), true);
                boolean z6 = obtainAttributes.getBoolean(R_Hide.styleable.SyncAdapter_isAlwaysSyncable.get(), true);
                boolean z7 = obtainAttributes.getBoolean(R_Hide.styleable.SyncAdapter_allowParallelSyncs.get(), true);
                String string3 = obtainAttributes.getString(R_Hide.styleable.SyncAdapter_settingsActivity.get());
                RefConstructor<SyncAdapterType> refConstructor = SyncAdapterTypeN.ctor;
                if (refConstructor != null) {
                    SyncAdapterType newInstance = refConstructor.newInstance(string, string2, Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6), Boolean.valueOf(z7), string3, null);
                    obtainAttributes.recycle();
                    return newInstance;
                }
                SyncAdapterType newInstance2 = mirror.android.content.SyncAdapterType.ctor.newInstance(string, string2, Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6), Boolean.valueOf(z7), string3);
                obtainAttributes.recycle();
                return newInstance2;
            }
            obtainAttributes.recycle();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public Collection<SyncAdapterInfo> getAllServices() {
        return this.mSyncAdapterInfos.values();
    }

    public SyncAdapterInfo getServiceInfo(Account account, String str) {
        SyncAdapterInfo syncAdapterInfo;
        synchronized (this.mSyncAdapterInfos) {
            syncAdapterInfo = this.mSyncAdapterInfos.get(account.type + "/" + str);
        }
        return syncAdapterInfo;
    }

    public void refreshServiceCache(String str) {
        Intent intent = new Intent("android.content.SyncAdapter");
        if (str != null) {
            intent.setPackage(str);
        }
        generateServicesMap(VPackageManagerService.get().queryIntentServices(intent, null, 128, 0), this.mSyncAdapterInfos, new RegisteredServicesParser());
    }
}
