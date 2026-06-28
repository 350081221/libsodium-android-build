package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Landroid/database/sqlite/SQLiteDatabase;", "", "exclusive", "Lkotlin/Function1;", "Lkotlin/u;", "body", "transaction", "(Landroid/database/sqlite/SQLiteDatabase;ZLv3/l;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(@l SQLiteDatabase sQLiteDatabase, boolean z4, @l v3.l<? super SQLiteDatabase, ? extends T> lVar) {
        if (z4) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T invoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            kotlin.jvm.internal.i0.d(1);
            sQLiteDatabase.endTransaction();
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static /* synthetic */ Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z4, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        if (z4) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object invoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            kotlin.jvm.internal.i0.d(1);
            sQLiteDatabase.endTransaction();
            kotlin.jvm.internal.i0.c(1);
        }
    }
}
