package androidx.room;

import androidx.room.AutoClosingRoomOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
@i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "invoke", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1<T> extends n0 implements v3.l<SupportSQLiteDatabase, T> {
    final /* synthetic */ v3.l<SupportSQLiteStatement, T> $block;
    final /* synthetic */ AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1(AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement autoClosingSupportSqliteStatement, v3.l<? super SupportSQLiteStatement, ? extends T> lVar) {
        super(1);
        this.this$0 = autoClosingSupportSqliteStatement;
        this.$block = lVar;
    }

    @Override // v3.l
    public final T invoke(@p4.l SupportSQLiteDatabase db) {
        String str;
        l0.p(db, "db");
        str = this.this$0.sql;
        SupportSQLiteStatement compileStatement = db.compileStatement(str);
        this.this$0.doBinds(compileStatement);
        return this.$block.invoke(compileStatement);
    }
}
