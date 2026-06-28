package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\t\u0010\rJ\u0014\u0010\t\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0014\u001a\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u001d\u0010\u0014\u001a\u00020\u00132\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0016\u0010\u0018J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00192\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00192\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¨\u0006 "}, d2 = {"Landroidx/room/EntityInsertionAdapter;", "T", "Landroidx/room/SharedSQLiteStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "statement", "entity", "Lkotlin/r2;", "bind", "(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V", "insert", "(Ljava/lang/Object;)V", "", "entities", "([Ljava/lang/Object;)V", "", "", "insertAndReturnId", "(Ljava/lang/Object;)J", "", "", "insertAndReturnIdsArray", "([Ljava/lang/Object;)[J", "insertAndReturnIdsArrayBox", "(Ljava/util/Collection;)[Ljava/lang/Long;", "([Ljava/lang/Object;)[Ljava/lang/Long;", "", "insertAndReturnIdsList", "([Ljava/lang/Object;)Ljava/util/List;", "Landroidx/room/RoomDatabase;", "database", "<init>", "(Landroidx/room/RoomDatabase;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@r1({"SMAP\nEntityInsertionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityInsertionAdapter.kt\nandroidx/room/EntityInsertionAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,229:1\n13579#2,2:230\n13644#2,3:237\n13579#2,2:240\n1855#3,2:232\n1864#3,3:234\n1855#3,2:242\n*S KotlinDebug\n*F\n+ 1 EntityInsertionAdapter.kt\nandroidx/room/EntityInsertionAdapter\n*L\n65#1:230,2\n137#1:237,3\n199#1:240,2\n82#1:232,2\n117#1:234,3\n219#1:242,2\n*E\n"})
/* loaded from: classes2.dex */
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityInsertionAdapter(@p4.l RoomDatabase database) {
        super(database);
        l0.p(database, "database");
    }

    protected abstract void bind(@p4.l SupportSQLiteStatement supportSQLiteStatement, T t5);

    public final void insert(T t5) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t5);
            acquire.executeInsert();
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(T t5) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t5);
            return acquire.executeInsert();
        } finally {
            release(acquire);
        }
    }

    @p4.l
    public final long[] insertAndReturnIdsArray(@p4.l Collection<? extends T> entities) {
        l0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i5 = 0;
            for (T t5 : entities) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    kotlin.collections.w.W();
                }
                bind(acquire, t5);
                jArr[i5] = acquire.executeInsert();
                i5 = i6;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    @p4.l
    public final Long[] insertAndReturnIdsArrayBox(@p4.l Collection<? extends T> entities) {
        l0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        Iterator<? extends T> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i5 = 0; i5 < size; i5++) {
                bind(acquire, it.next());
                lArr[i5] = Long.valueOf(acquire.executeInsert());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    @p4.l
    public final List<Long> insertAndReturnIdsList(@p4.l T[] entities) {
        List i5;
        List<Long> a5;
        l0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            i5 = kotlin.collections.v.i();
            for (T t5 : entities) {
                bind(acquire, t5);
                i5.add(Long.valueOf(acquire.executeInsert()));
            }
            a5 = kotlin.collections.v.a(i5);
            return a5;
        } finally {
            release(acquire);
        }
    }

    public final void insert(@p4.l T[] entities) {
        l0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            for (T t5 : entities) {
                bind(acquire, t5);
                acquire.executeInsert();
            }
        } finally {
            release(acquire);
        }
    }

    @p4.l
    public final long[] insertAndReturnIdsArray(@p4.l T[] entities) {
        l0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length) {
                int i7 = i6 + 1;
                bind(acquire, entities[i5]);
                jArr[i6] = acquire.executeInsert();
                i5++;
                i6 = i7;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public final Long[] insertAndReturnIdsArrayBox(@p4.l T[] entities) {
        l0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        Iterator a5 = kotlin.jvm.internal.i.a(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i5 = 0; i5 < length; i5++) {
                bind(acquire, a5.next());
                lArr[i5] = Long.valueOf(acquire.executeInsert());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    @p4.l
    public final List<Long> insertAndReturnIdsList(@p4.l Collection<? extends T> entities) {
        List i5;
        List<Long> a5;
        l0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            i5 = kotlin.collections.v.i();
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                i5.add(Long.valueOf(acquire.executeInsert()));
            }
            a5 = kotlin.collections.v.a(i5);
            return a5;
        } finally {
            release(acquire);
        }
    }

    public final void insert(@p4.l Iterable<? extends T> entities) {
        l0.p(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                acquire.executeInsert();
            }
        } finally {
            release(acquire);
        }
    }
}
