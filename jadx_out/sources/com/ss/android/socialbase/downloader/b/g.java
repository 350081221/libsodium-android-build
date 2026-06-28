package com.ss.android.socialbase.downloader.b;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.ss.android.socialbase.downloader.i.i;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f10479a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10480b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f10481c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f10482d;

    /* renamed from: e, reason: collision with root package name */
    private SQLiteStatement f10483e;

    /* renamed from: f, reason: collision with root package name */
    private SQLiteStatement f10484f;

    /* renamed from: g, reason: collision with root package name */
    private SQLiteStatement f10485g;

    /* renamed from: h, reason: collision with root package name */
    private SQLiteStatement f10486h;

    public g(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2) {
        this.f10479a = sQLiteDatabase;
        this.f10480b = str;
        this.f10481c = strArr;
        this.f10482d = strArr2;
    }

    public SQLiteStatement a() {
        if (this.f10483e == null) {
            SQLiteStatement compileStatement = this.f10479a.compileStatement(i.a("INSERT INTO ", this.f10480b, this.f10481c));
            synchronized (this) {
                if (this.f10483e == null) {
                    this.f10483e = compileStatement;
                }
            }
            if (this.f10483e != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f10483e;
    }

    public SQLiteStatement b() {
        if (this.f10485g == null) {
            SQLiteStatement compileStatement = this.f10479a.compileStatement(i.a(this.f10480b, this.f10482d));
            synchronized (this) {
                if (this.f10485g == null) {
                    this.f10485g = compileStatement;
                }
            }
            if (this.f10485g != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f10485g;
    }

    public SQLiteStatement c() {
        if (this.f10484f == null) {
            SQLiteStatement compileStatement = this.f10479a.compileStatement(i.a(this.f10480b, this.f10481c, this.f10482d));
            synchronized (this) {
                if (this.f10484f == null) {
                    this.f10484f = compileStatement;
                }
            }
            if (this.f10484f != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f10484f;
    }

    public SQLiteStatement d() {
        if (this.f10486h == null) {
            SQLiteStatement compileStatement = this.f10479a.compileStatement(i.b(this.f10480b, this.f10481c, this.f10482d));
            synchronized (this) {
                if (this.f10486h == null) {
                    this.f10486h = compileStatement;
                }
            }
            if (this.f10486h != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f10486h;
    }
}
