package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "obj", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1 extends n0 implements v3.l<SupportSQLiteDatabase, String> {
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1();

    AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1() {
        super(1);
    }

    @Override // v3.l
    @p4.m
    public final String invoke(@p4.l SupportSQLiteDatabase obj) {
        l0.p(obj, "obj");
        return obj.getPath();
    }
}
