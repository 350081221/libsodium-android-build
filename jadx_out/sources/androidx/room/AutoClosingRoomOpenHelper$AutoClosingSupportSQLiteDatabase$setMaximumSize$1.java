package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "invoke", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$1 extends n0 implements v3.l<SupportSQLiteDatabase, Long> {
    final /* synthetic */ long $numBytes;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$1(long j5) {
        super(1);
        this.$numBytes = j5;
    }

    @Override // v3.l
    @p4.l
    public final Long invoke(@p4.l SupportSQLiteDatabase db) {
        l0.p(db, "db");
        return Long.valueOf(db.setMaximumSize(this.$numBytes));
    }
}
