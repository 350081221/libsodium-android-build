package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import u3.h;

@i0(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\t"}, d2 = {"", "startVersion", "endVersion", "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Lkotlin/r2;", "migrate", "Landroidx/room/migration/Migration;", "Migration", "room-ktx_release"}, k = 2, mv = {1, 8, 0})
@h(name = "MigrationKt")
/* loaded from: classes2.dex */
public final class MigrationKt {
    @l
    public static final Migration Migration(int i5, int i6, @l v3.l<? super SupportSQLiteDatabase, r2> lVar) {
        return new MigrationImpl(i5, i6, lVar);
    }
}
