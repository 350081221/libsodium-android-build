package com.lzf.easyfloat;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.hms.actions.SearchIntents;
import com.lzf.easyfloat.utils.g;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016JK\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u0016J9\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/lzf/easyfloat/EasyFloatInitializer;", "Landroid/content/ContentProvider;", "()V", "delete", "", "uri", "Landroid/net/Uri;", "selection", "", "selectionArgs", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "insert", "values", "Landroid/content/ContentValues;", "onCreate", "", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "easyfloat_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class EasyFloatInitializer extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(@l Uri uri, @m String str, @m String[] strArr) {
        l0.p(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    @m
    public String getType(@l Uri uri) {
        l0.p(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    @m
    public Uri insert(@l Uri uri, @m ContentValues contentValues) {
        l0.p(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        g gVar = g.f9290a;
        Context context = getContext();
        l0.m(context);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
        gVar.m((Application) applicationContext);
        return true;
    }

    @Override // android.content.ContentProvider
    @m
    public Cursor query(@l Uri uri, @m String[] strArr, @m String str, @m String[] strArr2, @m String str2) {
        l0.p(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@l Uri uri, @m ContentValues contentValues, @m String str, @m String[] strArr) {
        l0.p(uri, "uri");
        return 0;
    }
}
