package com.lody.virtual.client.hook.proxies.shortcut;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import android.util.ArraySet;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgAndLastUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstUserIdMethodProxy;
import com.lody.virtual.helper.compat.ParceledListSliceCompat;
import com.lody.virtual.helper.utils.BitmapUtils;
import com.lody.virtual.helper.utils.Reflect;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import mirror.android.content.pm.IShortcutService;
import mirror.android.content.pm.ParceledListSlice;
import mirror.com.android.internal.infra.AndroidFuture;

@TargetApi(25)
/* loaded from: classes3.dex */
public class ShortcutServiceStub extends BinderInvocationProxy {

    /* loaded from: classes3.dex */
    static class UnWrapperShortcutInfo extends ReplaceCallingPkgAndLastUserIdMethodProxy {
        public UnWrapperShortcutInfo(String str) {
            super(str);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            Object call = super.call(obj, method, objArr);
            if (call != null) {
                ArrayList arrayList = new ArrayList();
                if (!MethodProxy.getConfig().isAllowCreateShortcut()) {
                    return ParceledListSliceCompat.create(arrayList);
                }
                List<?> call2 = ParceledListSlice.getList.call(call, new Object[0]);
                if (call2 != null) {
                    for (int size = call2.size() - 1; size >= 0; size--) {
                        Object obj2 = call2.get(size);
                        if (obj2 instanceof ShortcutInfo) {
                            ShortcutInfo unWrapper = ShortcutServiceStub.unWrapper(VClient.get().getCurrentApplication(), (ShortcutInfo) obj2, MethodProxy.getAppPkg(), MethodProxy.getAppUserId());
                            if (unWrapper != null) {
                                arrayList.add(unWrapper);
                            }
                        }
                    }
                }
                return ParceledListSliceCompat.create(arrayList);
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    static class WrapperShortcutInfo extends ReplaceCallingPkgAndLastUserIdMethodProxy {
        private Object defValue;
        private int infoIndex;

        public WrapperShortcutInfo(String str, int i5, Object obj) {
            super(str);
            this.infoIndex = i5;
            this.defValue = obj;
        }

        private Object wrapperResult(Object obj, Method method) {
            if (method.getReturnType() == AndroidFuture.class) {
                Object newInstance = AndroidFuture.ctor.newInstance();
                AndroidFuture.complete.call(newInstance, obj);
                return newInstance;
            }
            return obj;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (!MethodProxy.getConfig().isAllowCreateShortcut()) {
                return wrapperResult(this.defValue, method);
            }
            int i5 = this.infoIndex;
            Object obj2 = objArr[i5];
            if (obj2 != null) {
                if (obj2 instanceof ShortcutInfo) {
                    objArr[i5] = ShortcutServiceStub.wrapper(VClient.get().getCurrentApplication(), (ShortcutInfo) obj2, MethodProxy.getAppPkg(), MethodProxy.getAppUserId());
                } else {
                    ArrayList arrayList = new ArrayList();
                    try {
                        List<?> call = ParceledListSlice.getList.call(obj2, new Object[0]);
                        if (call != null) {
                            for (int size = call.size() - 1; size >= 0; size--) {
                                Object obj3 = call.get(size);
                                if (obj3 instanceof ShortcutInfo) {
                                    ShortcutInfo unWrapper = ShortcutServiceStub.unWrapper(VClient.get().getCurrentApplication(), (ShortcutInfo) obj3, MethodProxy.getAppPkg(), MethodProxy.getAppUserId());
                                    if (unWrapper != null) {
                                        arrayList.add(unWrapper);
                                    }
                                }
                            }
                        }
                        objArr[this.infoIndex] = ParceledListSliceCompat.create(arrayList);
                    } catch (Throwable unused) {
                        return wrapperResult(this.defValue, method);
                    }
                }
                return method.invoke(obj, objArr);
            }
            return wrapperResult(this.defValue, method);
        }
    }

    public ShortcutServiceStub() {
        super(IShortcutService.Stub.TYPE, "shortcut");
    }

    private static <T> String setToString(Set<T> set) {
        if (set == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = set.iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(",");
            }
            sb.append(it.next());
        }
        return sb.toString();
    }

    @TargetApi(23)
    private static Set<String> toSet(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(",");
        ArraySet arraySet = new ArraySet();
        for (String str2 : split) {
            arraySet.add(str2);
        }
        return arraySet;
    }

    static ShortcutInfo unWrapper(Context context, ShortcutInfo shortcutInfo, String str, int i5) throws URISyntaxException {
        Intent intent;
        String id;
        CharSequence longLabel;
        CharSequence shortLabel;
        ShortcutInfo build;
        CharSequence shortLabel2;
        CharSequence longLabel2;
        intent = shortcutInfo.getIntent();
        Intent intent2 = null;
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("_VA_|_pkg_");
        int intExtra = intent.getIntExtra("_VA_|_user_id_", 0);
        if (!TextUtils.equals(stringExtra, str) || intExtra != i5) {
            return null;
        }
        id = shortcutInfo.getId();
        String substring = id.substring(id.indexOf("/") + 1);
        Icon icon = (Icon) Reflect.on(shortcutInfo).opt("mIcon");
        String stringExtra2 = intent.getStringExtra("_VA_|_uri_");
        if (!TextUtils.isEmpty(stringExtra2)) {
            intent2 = Intent.parseUri(stringExtra2, 0);
        }
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("_VA_|activity");
        String stringExtra3 = intent.getStringExtra("_VA_|categories");
        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(context, substring);
        if (icon != null) {
            builder.setIcon(icon);
        }
        longLabel = shortcutInfo.getLongLabel();
        if (longLabel != null) {
            longLabel2 = shortcutInfo.getLongLabel();
            builder.setLongLabel(longLabel2);
        }
        shortLabel = shortcutInfo.getShortLabel();
        if (shortLabel != null) {
            shortLabel2 = shortcutInfo.getShortLabel();
            builder.setShortLabel(shortLabel2);
        }
        if (componentName != null) {
            builder.setActivity(componentName);
        }
        if (intent2 != null) {
            builder.setIntent(intent2);
        }
        Set<String> set = toSet(stringExtra3);
        if (set != null) {
            builder.setCategories(set);
        }
        build = builder.build();
        return build;
    }

    static ShortcutInfo wrapper(Context context, ShortcutInfo shortcutInfo, String str, int i5) {
        Bitmap drawableToBitmap;
        Intent intent;
        Set categories;
        ComponentName activity;
        String id;
        CharSequence longLabel;
        CharSequence shortLabel;
        ShortcutInfo build;
        CharSequence shortLabel2;
        CharSequence longLabel2;
        Icon icon = (Icon) Reflect.on(shortcutInfo).opt("mIcon");
        if (icon != null) {
            drawableToBitmap = BitmapUtils.drawableToBitmap(icon.loadDrawable(context));
        } else {
            drawableToBitmap = BitmapUtils.drawableToBitmap(context.getApplicationInfo().loadIcon(VirtualCore.get().getPackageManager()));
        }
        VirtualCore virtualCore = VirtualCore.get();
        intent = shortcutInfo.getIntent();
        Intent wrapperShortcutIntent = virtualCore.wrapperShortcutIntent(intent, null, str, i5);
        categories = shortcutInfo.getCategories();
        wrapperShortcutIntent.putExtra("_VA_|categories", setToString(categories));
        activity = shortcutInfo.getActivity();
        wrapperShortcutIntent.putExtra("_VA_|activity", activity);
        Context context2 = VirtualCore.get().getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("@");
        sb.append(i5);
        sb.append("/");
        id = shortcutInfo.getId();
        sb.append(id);
        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(context2, sb.toString());
        longLabel = shortcutInfo.getLongLabel();
        if (longLabel != null) {
            longLabel2 = shortcutInfo.getLongLabel();
            builder.setLongLabel(longLabel2);
        }
        shortLabel = shortcutInfo.getShortLabel();
        if (shortLabel != null) {
            shortLabel2 = shortcutInfo.getShortLabel();
            builder.setShortLabel(shortLabel2);
        }
        builder.setIcon(Icon.createWithBitmap(drawableToBitmap));
        builder.setIntent(wrapperShortcutIntent);
        build = builder.build();
        return build;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("disableShortcuts"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("enableShortcuts"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("getRemainingCallCount"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("getRateLimitResetTime"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("getIconMaxDimensions"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("getMaxShortcutCountPerActivity"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("reportShortcutUsed"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("onApplicationActive"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("hasShortcutHostPermission"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("removeAllDynamicShortcuts"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("removeDynamicShortcuts"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("getShortcuts"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("removeLongLivedShortcuts"));
        addMethodProxy(new WrapperShortcutInfo("pushDynamicShortcut", 1, null));
        Boolean bool = Boolean.FALSE;
        addMethodProxy(new WrapperShortcutInfo("requestPinShortcut", 1, bool));
        addMethodProxy(new UnWrapperShortcutInfo("getPinnedShortcuts"));
        addMethodProxy(new WrapperShortcutInfo("addDynamicShortcuts", 1, bool));
        addMethodProxy(new WrapperShortcutInfo("setDynamicShortcuts", 1, bool));
        addMethodProxy(new UnWrapperShortcutInfo("getDynamicShortcuts"));
        addMethodProxy(new WrapperShortcutInfo("createShortcutResultIntent", 1, null));
        addMethodProxy(new WrapperShortcutInfo("updateShortcuts", 1, bool));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("getManifestShortcuts") { // from class: com.lody.virtual.client.hook.proxies.shortcut.ShortcutServiceStub.1
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) {
                return ParceledListSliceCompat.create(new ArrayList());
            }
        });
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("isRequestPinItemSupported"));
    }
}
