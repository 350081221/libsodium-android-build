package org.greenrobot.greendao.internal;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes4.dex */
public final class b implements Cursor {

    /* renamed from: a, reason: collision with root package name */
    private final CursorWindow f21371a;

    /* renamed from: b, reason: collision with root package name */
    private int f21372b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21373c;

    public b(CursorWindow cursorWindow) {
        this.f21371a = cursorWindow;
        this.f21373c = cursorWindow.getNumRows();
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i5, CharArrayBuffer charArrayBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void deactivate() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i5) {
        return this.f21371a.getBlob(this.f21372b, i5);
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public String getColumnName(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public String[] getColumnNames() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public int getCount() {
        return this.f21371a.getNumRows();
    }

    @Override // android.database.Cursor
    public double getDouble(int i5) {
        return this.f21371a.getDouble(this.f21372b, i5);
    }

    @Override // android.database.Cursor
    public Bundle getExtras() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public float getFloat(int i5) {
        return this.f21371a.getFloat(this.f21372b, i5);
    }

    @Override // android.database.Cursor
    public int getInt(int i5) {
        return this.f21371a.getInt(this.f21372b, i5);
    }

    @Override // android.database.Cursor
    public long getLong(int i5) {
        return this.f21371a.getLong(this.f21372b, i5);
    }

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.f21372b;
    }

    @Override // android.database.Cursor
    public short getShort(int i5) {
        return this.f21371a.getShort(this.f21372b, i5);
    }

    @Override // android.database.Cursor
    public String getString(int i5) {
        return this.f21371a.getString(this.f21372b, i5);
    }

    @Override // android.database.Cursor
    public int getType(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return this.f21372b == 0;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        return this.f21372b == this.f21373c - 1;
    }

    @Override // android.database.Cursor
    public boolean isNull(int i5) {
        return this.f21371a.isNull(this.f21372b, i5);
    }

    @Override // android.database.Cursor
    public boolean move(int i5) {
        return moveToPosition(this.f21372b + i5);
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        this.f21372b = 0;
        if (this.f21373c <= 0) {
            return false;
        }
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        int i5 = this.f21373c;
        if (i5 > 0) {
            this.f21372b = i5 - 1;
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        int i5 = this.f21372b;
        if (i5 < this.f21373c - 1) {
            this.f21372b = i5 + 1;
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i5) {
        if (i5 >= 0 && i5 < this.f21373c) {
            this.f21372b = i5;
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        int i5 = this.f21372b;
        if (i5 > 0) {
            this.f21372b = i5 - 1;
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean requery() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        throw new UnsupportedOperationException();
    }
}
