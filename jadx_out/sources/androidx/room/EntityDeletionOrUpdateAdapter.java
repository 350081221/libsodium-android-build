package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H$J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u001d\u0010\u0010\u001a\u00020\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0010\u0010\u0012¨\u0006\u0017"}, d2 = {"Landroidx/room/EntityDeletionOrUpdateAdapter;", "T", "Landroidx/room/SharedSQLiteStatement;", "", "createQuery", "Landroidx/sqlite/db/SupportSQLiteStatement;", "statement", "entity", "Lkotlin/r2;", "bind", "(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V", "", "handle", "(Ljava/lang/Object;)I", "", "entities", "handleMultiple", "", "([Ljava/lang/Object;)I", "Landroidx/room/RoomDatabase;", "database", "<init>", "(Landroidx/room/RoomDatabase;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@r1({"SMAP\nEntityDeletionOrUpdateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityDeletionOrUpdateAdapter.kt\nandroidx/room/EntityDeletionOrUpdateAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,107:1\n1855#2,2:108\n13579#3,2:110\n*S KotlinDebug\n*F\n+ 1 EntityDeletionOrUpdateAdapter.kt\nandroidx/room/EntityDeletionOrUpdateAdapter\n*L\n77#1:108,2\n97#1:110,2\n*E\n"})
/* loaded from: classes2.dex */
public abstract class EntityDeletionOrUpdateAdapter<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityDeletionOrUpdateAdapter(@p4.l RoomDatabase database) {
        super(database);
        l0.p(database, "database");
    }

    protected abstract void bind(@p4.l SupportSQLiteStatement supportSQLiteStatement, T t5);

    @Override // androidx.room.SharedSQLiteStatement
    @p4.l
    protected abstract String createQuery();

    public final int handle(T t5) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t5);
            return acquire.executeUpdateDelete();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(@p4.l Iterable<? extends T> entities) {
        l0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                bind(acquire, it.next());
                i5 += acquire.executeUpdateDelete();
            }
            return i5;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(@p4.l T[] entities) {
        l0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            int i5 = 0;
            for (T t5 : entities) {
                bind(acquire, t5);
                i5 += acquire.executeUpdateDelete();
            }
            return i5;
        } finally {
            release(acquire);
        }
    }
}
