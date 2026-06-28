package com.bytedance.tools;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.tools.b.b;
import com.bytedance.tools.d.d;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes2.dex */
public class ToolsProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Context f6267a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(OpenStreetMapTileProviderConstants.ONE_MINUTE);
            } catch (InterruptedException e5) {
                Log.w("TT_TOOLS", e5);
            }
            while (!ToolsProvider.this.c()) {
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException e6) {
                    Log.w("TT_TOOLS", e6);
                }
            }
            Log.d("TT_TOOLS", "init tool finished!");
        }
    }

    private void a() {
        try {
            if (getClass().getClassLoader().loadClass("com.ss.android.agilelogger.ALog") == null) {
                return;
            }
            new Thread(new a()).start();
        } catch (ClassNotFoundException e5) {
            Log.w("TT_TOOLS", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        if (d.d(getContext())) {
            b.c(getContext());
            return true;
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        a();
        f6267a = getContext().getApplicationContext();
        return false;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
