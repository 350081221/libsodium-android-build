package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.i0;
import kotlin.jvm.internal.n0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/sqlite/db/SupportSQLiteStatement;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SharedSQLiteStatement$stmt$2 extends n0 implements v3.a<SupportSQLiteStatement> {
    final /* synthetic */ SharedSQLiteStatement this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSQLiteStatement$stmt$2(SharedSQLiteStatement sharedSQLiteStatement) {
        super(0);
        this.this$0 = sharedSQLiteStatement;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final SupportSQLiteStatement invoke() {
        SupportSQLiteStatement createNewStatement;
        createNewStatement = this.this$0.createNewStatement();
        return createNewStatement;
    }
}
