package com.lody.virtual.server.pm;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import com.lody.virtual.helper.compat.ObjectsCompat;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.server.pm.parser.PackageParserEx;
import com.lody.virtual.server.pm.parser.VPackage;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ProviderIntentResolver extends IntentResolver<VPackage.ProviderIntentInfo, ResolveInfo> {
    private int mFlags;
    private final HashMap<ComponentName, VPackage.ProviderComponent> mProviders = new HashMap<>();

    public final void addProvider(VPackage.ProviderComponent providerComponent) {
        if (this.mProviders.containsKey(providerComponent.getComponentName())) {
            VLog.w("PackageManager", "Provider " + providerComponent.getComponentName() + " already defined; ignoring", new Object[0]);
            return;
        }
        this.mProviders.put(providerComponent.getComponentName(), providerComponent);
        int size = providerComponent.intents.size();
        for (int i5 = 0; i5 < size; i5++) {
            addFilter((VPackage.ProviderIntentInfo) providerComponent.intents.get(i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.server.pm.IntentResolver
    public void dumpFilter(PrintWriter printWriter, String str, VPackage.ProviderIntentInfo providerIntentInfo) {
    }

    @Override // com.lody.virtual.server.pm.IntentResolver
    protected void dumpFilterLabel(PrintWriter printWriter, String str, Object obj, int i5) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.server.pm.IntentResolver
    public boolean isFilterStopped(VPackage.ProviderIntentInfo providerIntentInfo) {
        return false;
    }

    @Override // com.lody.virtual.server.pm.IntentResolver
    public List<ResolveInfo> queryIntent(Intent intent, String str, boolean z4, int i5) {
        this.mFlags = z4 ? 65536 : 0;
        return super.queryIntent(intent, str, z4, i5);
    }

    public List<ResolveInfo> queryIntentForPackage(Intent intent, String str, int i5, ArrayList<VPackage.ProviderComponent> arrayList, int i6) {
        boolean z4;
        if (arrayList == null) {
            return null;
        }
        this.mFlags = i5;
        if ((i5 & 65536) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList<II> arrayList3 = arrayList.get(i7).intents;
            if (arrayList3 != 0 && arrayList3.size() > 0) {
                VPackage.ProviderIntentInfo[] providerIntentInfoArr = new VPackage.ProviderIntentInfo[arrayList3.size()];
                arrayList3.toArray(providerIntentInfoArr);
                arrayList2.add(providerIntentInfoArr);
            }
        }
        return super.queryIntentFromList(intent, str, z4, arrayList2, i6);
    }

    public final void removeProvider(VPackage.ProviderComponent providerComponent) {
        this.mProviders.remove(providerComponent.getComponentName());
        int size = providerComponent.intents.size();
        for (int i5 = 0; i5 < size; i5++) {
            removeFilter((VPackage.ProviderIntentInfo) providerComponent.intents.get(i5));
        }
    }

    @Override // com.lody.virtual.server.pm.IntentResolver
    protected void sortResults(List<ResolveInfo> list) {
        Collections.sort(list, VPackageManagerService.sResolvePrioritySorter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.server.pm.IntentResolver
    @TargetApi(19)
    public boolean allowFilterResult(VPackage.ProviderIntentInfo providerIntentInfo, List<ResolveInfo> list) {
        ProviderInfo providerInfo = providerIntentInfo.provider.info;
        for (int size = list.size() - 1; size >= 0; size--) {
            ProviderInfo providerInfo2 = list.get(size).providerInfo;
            if (ObjectsCompat.equals(providerInfo2.name, providerInfo.name) && ObjectsCompat.equals(providerInfo2.packageName, providerInfo.packageName)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.server.pm.IntentResolver
    public Object filterToLabel(VPackage.ProviderIntentInfo providerIntentInfo) {
        return providerIntentInfo.provider;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.server.pm.IntentResolver
    public boolean isPackageForFilter(String str, VPackage.ProviderIntentInfo providerIntentInfo) {
        return str.equals(providerIntentInfo.provider.owner.packageName);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.server.pm.IntentResolver
    public VPackage.ProviderIntentInfo[] newArray(int i5) {
        return new VPackage.ProviderIntentInfo[i5];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.server.pm.IntentResolver
    @TargetApi(19)
    public ResolveInfo newResult(VPackage.ProviderIntentInfo providerIntentInfo, int i5, int i6) {
        VPackage.ProviderComponent providerComponent = providerIntentInfo.provider;
        if (!PackageParserEx.isEnabledLPr(providerComponent.info, this.mFlags, i6)) {
            return null;
        }
        PackageSetting packageSetting = (PackageSetting) providerComponent.owner.mExtras;
        ProviderInfo generateProviderInfo = PackageParserEx.generateProviderInfo(providerComponent, this.mFlags, packageSetting.readUserState(i6), i6, packageSetting.isRunInExtProcess());
        if (generateProviderInfo == null) {
            return null;
        }
        ResolveInfo resolveInfo = new ResolveInfo();
        resolveInfo.providerInfo = generateProviderInfo;
        if ((this.mFlags & 64) != 0) {
            resolveInfo.filter = providerIntentInfo.filter;
        }
        resolveInfo.priority = providerIntentInfo.filter.getPriority();
        resolveInfo.preferredOrder = providerComponent.owner.mPreferredOrder;
        resolveInfo.match = i5;
        resolveInfo.isDefault = providerIntentInfo.hasDefault;
        resolveInfo.labelRes = providerIntentInfo.labelRes;
        resolveInfo.nonLocalizedLabel = providerIntentInfo.nonLocalizedLabel;
        resolveInfo.icon = providerIntentInfo.icon;
        return resolveInfo;
    }

    public List<ResolveInfo> queryIntent(Intent intent, String str, int i5, int i6) {
        this.mFlags = i5;
        return super.queryIntent(intent, str, (i5 & 65536) != 0, i6);
    }
}
