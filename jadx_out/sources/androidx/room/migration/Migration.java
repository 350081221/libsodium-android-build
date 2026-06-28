package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.i0;
import p4.l;
import u3.e;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Landroidx/room/migration/Migration;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "Lkotlin/r2;", "migrate", "", "startVersion", "I", "endVersion", "<init>", "(II)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class Migration {

    @e
    public final int endVersion;

    @e
    public final int startVersion;

    public Migration(int i5, int i6) {
        this.startVersion = i5;
        this.endVersion = i6;
    }

    public abstract void migrate(@l SupportSQLiteDatabase supportSQLiteDatabase);
}
