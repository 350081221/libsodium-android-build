package com.lody.virtual.helper.utils;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.lody.virtual.GmsSupport;
import com.lody.virtual.client.NativeEngine;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.env.SpecialComponentList;
import com.lody.virtual.client.ipc.VPackageManager;
import com.lody.virtual.client.stub.ContentProviderProxy;
import com.lody.virtual.client.stub.ShadowPendingActivity;
import com.lody.virtual.client.stub.ShadowPendingReceiver;
import com.lody.virtual.client.stub.ShadowPendingService;
import com.lody.virtual.helper.compat.ObjectsCompat;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.remote.BroadcastIntentData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public class ComponentUtils {

    /* loaded from: classes3.dex */
    public static class IntentSenderInfo {
        public Bundle base;
        public IBinder callerActivity;
        public Bundle fillIn;
        public Intent intent;
        public Bundle options;
        public String originalType;
        public String targetPkg;
        public String type;
        public int userId;
    }

    public static String getComponentAction(ActivityInfo activityInfo) {
        return getComponentAction(activityInfo.packageName, activityInfo.name);
    }

    public static String getProcessName(ComponentInfo componentInfo) {
        String str = componentInfo.processName;
        if (str == null) {
            String str2 = componentInfo.packageName;
            componentInfo.processName = str2;
            return str2;
        }
        return str;
    }

    public static Intent getProxyIntentSenderIntent(int i5, int i6, String str, Intent intent) {
        String str2;
        if (i6 == 3) {
            VLog.printStackTrace("Unsupported IntentSender type: " + i6);
            return null;
        }
        Intent cloneFilter = intent.cloneFilter();
        cloneFilter.setSourceBounds(intent.getSourceBounds());
        cloneFilter.setClipData(intent.getClipData());
        cloneFilter.addFlags(3 & intent.getFlags());
        cloneFilter.addFlags(intent.getFlags() & 64);
        cloneFilter.addFlags(intent.getFlags() & 128);
        String type = cloneFilter.getType();
        ComponentName component = cloneFilter.getComponent();
        if (type == null) {
            str2 = str;
        } else {
            str2 = type + ":" + str;
        }
        if (component != null) {
            str2 = str2 + ":" + component.flattenToString();
        }
        cloneFilter.setDataAndType(cloneFilter.getData(), str2);
        if (i6 == 2) {
            cloneFilter.setComponent(new ComponentName(VirtualCore.getConfig().getMainPackageName(), ShadowPendingActivity.class.getName()));
        } else if (i6 == 4) {
            cloneFilter.setComponent(new ComponentName(VirtualCore.getConfig().getMainPackageName(), ShadowPendingService.class.getName()));
        } else {
            cloneFilter.setComponent(new ComponentName(VirtualCore.getConfig().getMainPackageName(), ShadowPendingReceiver.class.getName()));
        }
        Intent intent2 = new Intent();
        intent2.putExtra("_VA_|_user_id_", i5);
        intent2.putExtra("_VA_|_intent_", intent);
        intent2.putExtra("_VA_|_target_pkg_", str);
        intent2.putExtra("_VA_|_original_type_", type);
        intent2.putExtra("_VA_|_type_", str2);
        cloneFilter.setPackage(null);
        cloneFilter.setSelector(intent2);
        return cloneFilter;
    }

    public static String getTaskAffinity(ActivityInfo activityInfo) {
        if (activityInfo.launchMode == 3) {
            return "-SingleInstance-" + activityInfo.packageName + "/" + activityInfo.name;
        }
        String str = activityInfo.taskAffinity;
        if (str == null && activityInfo.applicationInfo.taskAffinity == null) {
            return activityInfo.packageName;
        }
        if (str != null) {
            return str;
        }
        return activityInfo.applicationInfo.taskAffinity;
    }

    public static boolean intentFilterEquals(Intent intent, Intent intent2) {
        if (intent != null && intent2 != null) {
            if (!ObjectsCompat.equals(intent.getAction(), intent2.getAction()) || !ObjectsCompat.equals(intent.getData(), intent2.getData()) || !ObjectsCompat.equals(intent.getType(), intent2.getType())) {
                return false;
            }
            String str = intent.getPackage();
            if (str == null && intent.getComponent() != null) {
                str = intent.getComponent().getPackageName();
            }
            String str2 = intent2.getPackage();
            if (str2 == null && intent2.getComponent() != null) {
                str2 = intent2.getComponent().getPackageName();
            }
            if (!ObjectsCompat.equals(str, str2) || !ObjectsCompat.equals(intent.getComponent(), intent2.getComponent()) || !ObjectsCompat.equals(intent.getCategories(), intent2.getCategories())) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean isSameComponent(ComponentInfo componentInfo, ComponentInfo componentInfo2) {
        if (componentInfo == null || componentInfo2 == null) {
            return false;
        }
        String str = componentInfo.packageName + "";
        String str2 = componentInfo2.packageName + "";
        String str3 = componentInfo.name + "";
        String str4 = componentInfo2.name + "";
        if (!str.equals(str2) || !str3.equals(str4)) {
            return false;
        }
        return true;
    }

    public static boolean isSystemApp(ApplicationInfo applicationInfo) {
        if (applicationInfo == null || GmsSupport.isGoogleAppOrService(applicationInfo.packageName)) {
            return false;
        }
        if (SpecialComponentList.isSpecSystemPackage(applicationInfo.packageName) || applicationInfo.uid < 10000) {
            return true;
        }
        int i5 = applicationInfo.flags;
        if ((i5 & 1) == 0 && (i5 & 128) == 0) {
            return false;
        }
        return true;
    }

    public static void parcelActivityIntentSender(Intent intent, IBinder iBinder, Bundle bundle) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent.getExtras().clear();
            intent.putExtra("_VA_|_fill_in_", extras);
        }
        if (bundle != null) {
            intent.putExtra("_VA_|_options_", bundle);
        }
        mirror.android.content.Intent.putExtra.call(intent, "_VA_|_caller_activity_", iBinder);
    }

    public static IntentSenderInfo parseIntentSenderInfo(Intent intent, boolean z4) {
        Intent selector = intent.getSelector();
        if (selector == null) {
            return null;
        }
        IntentSenderInfo intentSenderInfo = new IntentSenderInfo();
        intentSenderInfo.userId = selector.getIntExtra("_VA_|_user_id_", -1);
        intentSenderInfo.targetPkg = selector.getStringExtra("_VA_|_target_pkg_");
        intentSenderInfo.originalType = selector.getStringExtra("_VA_|_original_type_");
        intentSenderInfo.type = selector.getStringExtra("_VA_|_type_");
        intentSenderInfo.fillIn = intent.getExtras();
        Intent intent2 = (Intent) selector.getParcelableExtra("_VA_|_intent_");
        intentSenderInfo.base = intent2.getExtras();
        Intent cloneFilter = intent.cloneFilter();
        cloneFilter.setComponent(intent2.getComponent());
        cloneFilter.setPackage(intent2.getPackage());
        cloneFilter.setSelector(intent2.getSelector());
        cloneFilter.setFlags(intent2.getFlags());
        if (TextUtils.equals(intentSenderInfo.type, intent.getType())) {
            cloneFilter.setDataAndType(intent2.getData(), intentSenderInfo.originalType);
        }
        if (intent2.getClipData() == null && intent.getClipData() != null) {
            cloneFilter.setClipData(intent.getClipData());
            if ((intent.getFlags() & 268435456) != 0) {
                cloneFilter.addFlags(268435456);
            }
        }
        if (z4) {
            intentSenderInfo.callerActivity = mirror.android.content.Intent.getIBinderExtra.call(intent, "_VA_|_caller_activity_");
            intentSenderInfo.options = intent.getBundleExtra("_VA_|_options_");
            intentSenderInfo.fillIn = intent.getBundleExtra("_VA_|_fill_in_");
        }
        cloneFilter.putExtra("_VA_|_fill_in_", intentSenderInfo.fillIn);
        cloneFilter.putExtra("_VA_|_base_", intentSenderInfo.base);
        intentSenderInfo.intent = cloneFilter;
        return intentSenderInfo;
    }

    public static Intent processOutsideIntent(int i5, boolean z4, Intent intent) {
        ClipData.Item itemAt;
        Uri uri;
        Uri processOutsideUri;
        Uri data = intent.getData();
        if (data != null) {
            intent.setDataAndType(processOutsideUri(i5, z4, data), intent.getType());
        }
        if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            if (clipData.getItemCount() >= 0 && (uri = (itemAt = clipData.getItemAt(0)).getUri()) != null && (processOutsideUri = processOutsideUri(i5, z4, uri)) != uri) {
                ClipData clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(itemAt.getText(), itemAt.getHtmlText(), itemAt.getIntent(), processOutsideUri));
                for (int i6 = 1; i6 < clipData.getItemCount(); i6++) {
                    ClipData.Item itemAt2 = clipData.getItemAt(i6);
                    Uri uri2 = itemAt2.getUri();
                    if (uri2 != null) {
                        uri2 = processOutsideUri(i5, z4, uri2);
                    }
                    clipData2.addItem(new ClipData.Item(itemAt2.getText(), itemAt2.getHtmlText(), itemAt2.getIntent(), uri2));
                }
                intent.setClipData(clipData2);
            }
        }
        if (intent.hasExtra("output")) {
            Object parcelableExtra = intent.getParcelableExtra("output");
            if (parcelableExtra instanceof Uri) {
                intent.putExtra("output", processOutsideUri(i5, z4, (Uri) parcelableExtra));
            } else if (parcelableExtra instanceof ArrayList) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) parcelableExtra).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!(next instanceof Uri)) {
                        break;
                    }
                    arrayList.add(processOutsideUri(i5, z4, (Uri) next));
                }
                if (!arrayList.isEmpty()) {
                    intent.putExtra("output", arrayList);
                }
            }
        }
        if (intent.hasExtra("android.intent.extra.STREAM")) {
            Object parcelableExtra2 = intent.getParcelableExtra("android.intent.extra.STREAM");
            if (parcelableExtra2 instanceof Uri) {
                intent.putExtra("android.intent.extra.STREAM", processOutsideUri(i5, z4, (Uri) parcelableExtra2));
            } else if (parcelableExtra2 instanceof ArrayList) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = ((ArrayList) parcelableExtra2).iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (!(next2 instanceof Uri)) {
                        break;
                    }
                    arrayList2.add(processOutsideUri(i5, z4, (Uri) next2));
                }
                if (!arrayList2.isEmpty()) {
                    intent.putExtra("android.intent.extra.STREAM", arrayList2);
                }
            }
        }
        return intent;
    }

    public static Uri processOutsideUri(int i5, boolean z4, Uri uri) {
        if (TextUtils.equals(uri.getScheme(), "file")) {
            return Uri.fromFile(new File(NativeEngine.reverseRedirectedPath(uri.getPath())));
        }
        if (!TextUtils.equals(uri.getScheme(), "content")) {
            return uri;
        }
        String authority = uri.getAuthority();
        if (authority != null && !"media".equals(authority)) {
            ProviderInfo resolveContentProvider = VirtualCore.get().getHostPackageManager().resolveContentProvider(authority, 0L);
            if (resolveContentProvider == null) {
                resolveContentProvider = VPackageManager.get().resolveContentProvider(authority, 0, VUserHandle.myUserId());
            }
            if (resolveContentProvider == null) {
                return uri;
            }
            return ContentProviderProxy.buildProxyUri(i5, z4, authority, uri);
        }
        return uri;
    }

    public static Intent proxyBroadcastIntent(Intent intent, int i5) {
        if (intent.getAction() != null && VirtualCore.getConfig().isUnProtectAction(intent.getAction())) {
            return intent;
        }
        Intent intent2 = new Intent();
        intent2.setDataAndType(intent.getData(), intent.getType());
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            Iterator<String> it = categories.iterator();
            while (it.hasNext()) {
                intent2.addCategory(it.next());
            }
        }
        ComponentName component = intent.getComponent();
        String str = intent.getPackage();
        if (component != null) {
            intent2.setAction(getComponentAction(component));
            if (str == null) {
                str = component.getPackageName();
            }
        } else {
            intent2.setAction(SpecialComponentList.protectAction(intent.getAction()));
        }
        new BroadcastIntentData(i5, intent, str).saveIntent(intent2);
        return intent2;
    }

    public static ComponentName toComponentName(ComponentInfo componentInfo) {
        return new ComponentName(componentInfo.packageName, componentInfo.name);
    }

    public static void unpackFillIn(Intent intent, ClassLoader classLoader) {
        intent.setExtrasClassLoader(classLoader);
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                Bundle bundle = extras.getBundle("_VA_|_fill_in_");
                Bundle bundle2 = extras.getBundle("_VA_|_base_");
                if (bundle != null || bundle2 != null) {
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    if (bundle2 != null) {
                        bundle2.setClassLoader(classLoader);
                    }
                    if (bundle != null && bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    if (bundle == null) {
                        bundle = bundle2;
                    }
                    intent.replaceExtras(bundle);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static String getComponentAction(ComponentName componentName) {
        return getComponentAction(componentName.getPackageName(), componentName.getClassName());
    }

    public static String getComponentAction(String str, String str2) {
        return String.format("_VA_%s_%s_%s", VirtualCore.get().getHostPkg(), str, str2);
    }
}
