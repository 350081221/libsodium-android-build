package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.i0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;

@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2 extends h0 implements v3.l<SupportSQLiteDatabase, Boolean> {
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2();

    AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2() {
        super(1, SupportSQLiteDatabase.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
    }

    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l SupportSQLiteDatabase p02) {
        l0.p(p02, "p0");
        return Boolean.valueOf(p02.yieldIfContendedSafely());
    }
}
