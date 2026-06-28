package com.lody.virtual.client.hook.providers;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.actions.SearchIntents;
import com.lody.virtual.client.hook.base.MethodBox;
import com.lody.virtual.client.hook.secondary.ProxyBinder;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.VLog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import mirror.android.content.IContentProvider;

/* loaded from: classes3.dex */
public class ProviderHook implements InvocationHandler {
    private static final Map<String, HookFetcher> PROVIDER_MAP;
    public static final String QUERY_ARG_SQL_SELECTION = "android:query-arg-sql-selection";
    public static final String QUERY_ARG_SQL_SELECTION_ARGS = "android:query-arg-sql-selection-args";
    public static final String QUERY_ARG_SQL_SORT_ORDER = "android:query-arg-sql-sort-order";
    protected final IInterface mBase;
    protected IInterface mProxy = (IInterface) Proxy.newProxyInstance(IContentProvider.TYPE.getClassLoader(), new Class[]{IContentProvider.TYPE}, this);
    protected ProxyBinder mProxyBinder;

    /* loaded from: classes3.dex */
    public interface HookFetcher {
        ProviderHook fetch(boolean z4, IInterface iInterface);
    }

    static {
        HashMap hashMap = new HashMap();
        PROVIDER_MAP = hashMap;
        hashMap.put("settings", new HookFetcher() { // from class: com.lody.virtual.client.hook.providers.ProviderHook.1
            @Override // com.lody.virtual.client.hook.providers.ProviderHook.HookFetcher
            public ProviderHook fetch(boolean z4, IInterface iInterface) {
                return new SettingsProviderHook(iInterface);
            }
        });
        hashMap.put("downloads", new HookFetcher() { // from class: com.lody.virtual.client.hook.providers.ProviderHook.2
            @Override // com.lody.virtual.client.hook.providers.ProviderHook.HookFetcher
            public ProviderHook fetch(boolean z4, IInterface iInterface) {
                return new DownloadProviderHook(iInterface);
            }
        });
        hashMap.put("com.android.badge", new HookFetcher() { // from class: com.lody.virtual.client.hook.providers.ProviderHook.3
            @Override // com.lody.virtual.client.hook.providers.ProviderHook.HookFetcher
            public ProviderHook fetch(boolean z4, IInterface iInterface) {
                return new BadgeProviderHook(iInterface);
            }
        });
        hashMap.put("com.huawei.android.launcher.settings", new HookFetcher() { // from class: com.lody.virtual.client.hook.providers.ProviderHook.4
            @Override // com.lody.virtual.client.hook.providers.ProviderHook.HookFetcher
            public ProviderHook fetch(boolean z4, IInterface iInterface) {
                return new BadgeProviderHook(iInterface);
            }
        });
    }

    public ProviderHook(IInterface iInterface) {
        this.mBase = iInterface;
        this.mProxyBinder = new ProxyBinder(iInterface.asBinder(), this.mProxy);
    }

    public static IInterface createProxy(boolean z4, String str, IInterface iInterface) {
        IInterface proxyInterface;
        if ((iInterface instanceof Proxy) && (Proxy.getInvocationHandler(iInterface) instanceof ProviderHook)) {
            return iInterface;
        }
        HookFetcher fetchHook = fetchHook(str);
        if (fetchHook != null && (proxyInterface = fetchHook.fetch(z4, iInterface).getProxyInterface()) != null) {
            return proxyInterface;
        }
        return iInterface;
    }

    private static HookFetcher fetchHook(String str) {
        HookFetcher hookFetcher = PROVIDER_MAP.get(str);
        if (hookFetcher == null) {
            return new HookFetcher() { // from class: com.lody.virtual.client.hook.providers.ProviderHook.5
                @Override // com.lody.virtual.client.hook.providers.ProviderHook.HookFetcher
                public ProviderHook fetch(boolean z4, IInterface iInterface) {
                    if (z4) {
                        return new ExternalProviderHook(iInterface);
                    }
                    return new InternalProviderHook(iInterface);
                }
            };
        }
        return hookFetcher;
    }

    public Bundle call(MethodBox methodBox, String str, String str2, Bundle bundle) throws InvocationTargetException {
        Object[] objArr = methodBox.args;
        int callIndex = getCallIndex(methodBox);
        objArr[callIndex] = str;
        objArr[callIndex + 1] = str2;
        objArr[callIndex + 2] = bundle;
        return (Bundle) methodBox.call();
    }

    public int getCallIndex(MethodBox methodBox) {
        return methodBox.args.length - 3;
    }

    public IInterface getProxyInterface() {
        return this.mProxy;
    }

    public Uri insert(MethodBox methodBox, Uri uri, ContentValues contentValues) throws InvocationTargetException {
        Object[] objArr = methodBox.args;
        int index = MethodParameterUtils.getIndex(objArr, Uri.class);
        objArr[index] = uri;
        objArr[index + 1] = contentValues;
        return (Uri) methodBox.call();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object... objArr) throws Throwable {
        String str;
        Bundle bundle;
        String str2;
        try {
            processArgs(method, objArr);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        MethodBox methodBox = new MethodBox(method, this.mBase, objArr);
        try {
            String name = method.getName();
            if (NotificationCompat.CATEGORY_CALL.equals(name)) {
                int callIndex = getCallIndex(methodBox);
                return call(methodBox, (String) objArr[callIndex], (String) objArr[callIndex + 1], (Bundle) objArr[callIndex + 2]);
            }
            if ("insert".equals(name)) {
                int index = MethodParameterUtils.getIndex(objArr, Uri.class);
                return insert(methodBox, (Uri) objArr[index], (ContentValues) objArr[index + 1]);
            }
            if (SearchIntents.EXTRA_QUERY.equals(name)) {
                int index2 = MethodParameterUtils.getIndex(objArr, Uri.class);
                Uri uri = (Uri) objArr[index2];
                String[] strArr = (String[]) objArr[index2 + 1];
                String[] strArr2 = null;
                if (BuildCompat.isOreo()) {
                    Bundle bundle2 = (Bundle) objArr[index2 + 2];
                    if (bundle2 != null) {
                        str = bundle2.getString(QUERY_ARG_SQL_SELECTION);
                        strArr2 = bundle2.getStringArray(QUERY_ARG_SQL_SELECTION_ARGS);
                        str2 = bundle2.getString(QUERY_ARG_SQL_SORT_ORDER);
                        bundle = bundle2;
                    } else {
                        bundle = bundle2;
                        str = null;
                        str2 = null;
                    }
                } else {
                    str = (String) objArr[index2 + 2];
                    bundle = null;
                    strArr2 = (String[]) objArr[index2 + 3];
                    str2 = (String) objArr[index2 + 4];
                }
                return query(methodBox, uri, strArr, str, strArr2, str2, bundle);
            }
            if ("asBinder".equals(name)) {
                return this.mProxyBinder;
            }
            return methodBox.call();
        } catch (Throwable th2) {
            VLog.w("ProviderHook", "call: %s (%s) with error", method.getName(), Arrays.toString(objArr));
            if (th2 instanceof InvocationTargetException) {
                throw th2.getCause();
            }
            throw th2;
        }
    }

    protected void processArgs(Method method, Object... objArr) {
    }

    public Cursor query(MethodBox methodBox, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Bundle bundle) throws InvocationTargetException {
        Object[] objArr = methodBox.args;
        int index = MethodParameterUtils.getIndex(objArr, Uri.class);
        objArr[index] = uri;
        objArr[index + 1] = strArr;
        if (BuildCompat.isOreo()) {
            if (bundle != null) {
                bundle.putString(QUERY_ARG_SQL_SELECTION, str);
                bundle.putStringArray(QUERY_ARG_SQL_SELECTION_ARGS, strArr2);
                bundle.putString(QUERY_ARG_SQL_SORT_ORDER, str2);
            }
        } else {
            objArr[index + 2] = str;
            objArr[index + 3] = strArr2;
            objArr[index + 4] = str2;
        }
        return (Cursor) methodBox.call();
    }
}
