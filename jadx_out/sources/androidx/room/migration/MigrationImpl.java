package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Landroidx/room/migration/MigrationImpl;", "Landroidx/room/migration/Migration;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "Lkotlin/r2;", "migrate", "Lkotlin/Function1;", "migrateCallback", "Lv3/l;", "getMigrateCallback", "()Lv3/l;", "", "startVersion", "endVersion", "<init>", "(IILv3/l;)V", "room-ktx_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class MigrationImpl extends Migration {

    @l
    private final v3.l<SupportSQLiteDatabase, r2> migrateCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public MigrationImpl(int i5, int i6, @l v3.l<? super SupportSQLiteDatabase, r2> lVar) {
        super(i5, i6);
        this.migrateCallback = lVar;
    }

    @l
    public final v3.l<SupportSQLiteDatabase, r2> getMigrateCallback() {
        return this.migrateCallback;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@l SupportSQLiteDatabase supportSQLiteDatabase) {
        this.migrateCallback.invoke(supportSQLiteDatabase);
    }
}
