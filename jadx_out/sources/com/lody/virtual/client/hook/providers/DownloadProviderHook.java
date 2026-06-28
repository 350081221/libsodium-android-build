package com.lody.virtual.client.hook.providers;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.MethodBox;
import com.lody.virtual.helper.utils.VLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes3.dex */
class DownloadProviderHook extends ExternalProviderHook {
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_FILE_NAME_HINT = "hint";
    public static final String COLUMN_IS_VISIBLE_IN_DOWNLOADS_UI = "is_visible_in_downloads_ui";
    private static final String COLUMN_NOTIFICATION_CLASS = "notificationclass";
    private static final String COLUMN_NOTIFICATION_PACKAGE = "notificationpackage";
    public static final String COLUMN_VISIBILITY = "visibility";
    private static final String TAG = "DownloadProviderHook";

    /* JADX INFO: Access modifiers changed from: package-private */
    public DownloadProviderHook(IInterface iInterface) {
        super(iInterface);
    }

    @Override // com.lody.virtual.client.hook.providers.ProviderHook
    public Uri insert(MethodBox methodBox, Uri uri, ContentValues contentValues) throws InvocationTargetException {
        VLog.e("DownloadManager", "insert: " + contentValues);
        String asString = contentValues.getAsString(COLUMN_NOTIFICATION_PACKAGE);
        VLog.e("DownloadManager", "notificationPkg: " + asString);
        if (asString == null) {
            return (Uri) methodBox.call();
        }
        contentValues.put(COLUMN_NOTIFICATION_PACKAGE, VirtualCore.get().getHostPkg());
        contentValues.put("visibility", (Integer) 1);
        contentValues.put(COLUMN_FILE_NAME_HINT, contentValues.getAsString(COLUMN_FILE_NAME_HINT).replace(asString, VirtualCore.get().getHostPkg()));
        return super.insert(methodBox, uri, contentValues);
    }

    @Override // com.lody.virtual.client.hook.providers.ProviderHook, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object... objArr) throws Throwable {
        VLog.e("DownloadManager", "call " + method.getName() + " -> " + Arrays.toString(objArr));
        return super.invoke(obj, method, objArr);
    }

    @Override // com.lody.virtual.client.hook.providers.ProviderHook
    public Cursor query(MethodBox methodBox, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Bundle bundle) throws InvocationTargetException {
        VLog.e(TAG, "query : selection: " + str + ", args: " + Arrays.toString(strArr2));
        return super.query(methodBox, uri, strArr, str, strArr2, str2, bundle);
    }
}
