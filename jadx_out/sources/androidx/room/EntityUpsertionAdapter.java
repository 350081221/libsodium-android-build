package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import androidx.annotation.RestrictTo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.text.f0;

@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\u00020\u00052\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n¢\u0006\u0004\b\b\u0010\fJ\u0014\u0010\b\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0012\u001a\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J%\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0018\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/room/EntityUpsertionAdapter;", "T", "", "Landroid/database/sqlite/SQLiteConstraintException;", "ex", "Lkotlin/r2;", "checkUniquenessException", "entity", "upsert", "(Ljava/lang/Object;)V", "", "entities", "([Ljava/lang/Object;)V", "", "", "upsertAndReturnId", "(Ljava/lang/Object;)J", "", "upsertAndReturnIdsArray", "([Ljava/lang/Object;)[J", "", "", "upsertAndReturnIdsList", "([Ljava/lang/Object;)Ljava/util/List;", "upsertAndReturnIdsArrayBox", "([Ljava/lang/Object;)[Ljava/lang/Long;", "(Ljava/util/Collection;)[Ljava/lang/Long;", "Landroidx/room/EntityInsertionAdapter;", "insertionAdapter", "Landroidx/room/EntityInsertionAdapter;", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "updateAdapter", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "<init>", "(Landroidx/room/EntityInsertionAdapter;Landroidx/room/EntityDeletionOrUpdateAdapter;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@r1({"SMAP\nEntityUpsertionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityUpsertionAdapter.kt\nandroidx/room/EntityUpsertionAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n13579#2,2:225\n13579#2,2:229\n1855#3,2:227\n1855#3,2:231\n*S KotlinDebug\n*F\n+ 1 EntityUpsertionAdapter.kt\nandroidx/room/EntityUpsertionAdapter\n*L\n78#1:225,2\n151#1:229,2\n89#1:227,2\n165#1:231,2\n*E\n"})
/* loaded from: classes2.dex */
public final class EntityUpsertionAdapter<T> {

    @p4.l
    private final EntityInsertionAdapter<T> insertionAdapter;

    @p4.l
    private final EntityDeletionOrUpdateAdapter<T> updateAdapter;

    public EntityUpsertionAdapter(@p4.l EntityInsertionAdapter<T> insertionAdapter, @p4.l EntityDeletionOrUpdateAdapter<T> updateAdapter) {
        l0.p(insertionAdapter, "insertionAdapter");
        l0.p(updateAdapter, "updateAdapter");
        this.insertionAdapter = insertionAdapter;
        this.updateAdapter = updateAdapter;
    }

    private final void checkUniquenessException(SQLiteConstraintException sQLiteConstraintException) {
        boolean Q2;
        boolean T2;
        boolean T22;
        String message = sQLiteConstraintException.getMessage();
        if (message != null) {
            boolean z4 = true;
            Q2 = f0.Q2(message, "unique", true);
            if (!Q2) {
                T2 = f0.T2(message, "2067", false, 2, null);
                if (!T2) {
                    T22 = f0.T2(message, "1555", false, 2, null);
                    if (!T22) {
                        z4 = false;
                    }
                }
            }
            if (z4) {
                return;
            } else {
                throw sQLiteConstraintException;
            }
        }
        throw sQLiteConstraintException;
    }

    public final void upsert(T t5) {
        try {
            this.insertionAdapter.insert((EntityInsertionAdapter<T>) t5);
        } catch (SQLiteConstraintException e5) {
            checkUniquenessException(e5);
            this.updateAdapter.handle(t5);
        }
    }

    public final long upsertAndReturnId(T t5) {
        try {
            return this.insertionAdapter.insertAndReturnId(t5);
        } catch (SQLiteConstraintException e5) {
            checkUniquenessException(e5);
            this.updateAdapter.handle(t5);
            return -1L;
        }
    }

    @p4.l
    public final long[] upsertAndReturnIdsArray(@p4.l T[] entities) {
        long j5;
        l0.p(entities, "entities");
        int length = entities.length;
        long[] jArr = new long[length];
        for (int i5 = 0; i5 < length; i5++) {
            try {
                j5 = this.insertionAdapter.insertAndReturnId(entities[i5]);
            } catch (SQLiteConstraintException e5) {
                checkUniquenessException(e5);
                this.updateAdapter.handle(entities[i5]);
                j5 = -1;
            }
            jArr[i5] = j5;
        }
        return jArr;
    }

    @p4.l
    public final Long[] upsertAndReturnIdsArrayBox(@p4.l T[] entities) {
        long j5;
        l0.p(entities, "entities");
        int length = entities.length;
        Long[] lArr = new Long[length];
        for (int i5 = 0; i5 < length; i5++) {
            try {
                j5 = this.insertionAdapter.insertAndReturnId(entities[i5]);
            } catch (SQLiteConstraintException e5) {
                checkUniquenessException(e5);
                this.updateAdapter.handle(entities[i5]);
                j5 = -1;
            }
            lArr[i5] = Long.valueOf(j5);
        }
        return lArr;
    }

    @p4.l
    public final List<Long> upsertAndReturnIdsList(@p4.l T[] entities) {
        List i5;
        List<Long> a5;
        l0.p(entities, "entities");
        i5 = kotlin.collections.v.i();
        for (T t5 : entities) {
            try {
                i5.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t5)));
            } catch (SQLiteConstraintException e5) {
                checkUniquenessException(e5);
                this.updateAdapter.handle(t5);
                i5.add(-1L);
            }
        }
        a5 = kotlin.collections.v.a(i5);
        return a5;
    }

    public final void upsert(@p4.l T[] entities) {
        l0.p(entities, "entities");
        for (T t5 : entities) {
            try {
                this.insertionAdapter.insert((EntityInsertionAdapter<T>) t5);
            } catch (SQLiteConstraintException e5) {
                checkUniquenessException(e5);
                this.updateAdapter.handle(t5);
            }
        }
    }

    @p4.l
    public final long[] upsertAndReturnIdsArray(@p4.l Collection<? extends T> entities) {
        long j5;
        l0.p(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        long[] jArr = new long[size];
        for (int i5 = 0; i5 < size; i5++) {
            T next = it.next();
            try {
                j5 = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e5) {
                checkUniquenessException(e5);
                this.updateAdapter.handle(next);
                j5 = -1;
            }
            jArr[i5] = j5;
        }
        return jArr;
    }

    @p4.l
    public final Long[] upsertAndReturnIdsArrayBox(@p4.l Collection<? extends T> entities) {
        long j5;
        l0.p(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        Long[] lArr = new Long[size];
        for (int i5 = 0; i5 < size; i5++) {
            T next = it.next();
            try {
                j5 = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e5) {
                checkUniquenessException(e5);
                this.updateAdapter.handle(next);
                j5 = -1;
            }
            lArr[i5] = Long.valueOf(j5);
        }
        return lArr;
    }

    public final void upsert(@p4.l Iterable<? extends T> entities) {
        l0.p(entities, "entities");
        for (T t5 : entities) {
            try {
                this.insertionAdapter.insert((EntityInsertionAdapter<T>) t5);
            } catch (SQLiteConstraintException e5) {
                checkUniquenessException(e5);
                this.updateAdapter.handle(t5);
            }
        }
    }

    @p4.l
    public final List<Long> upsertAndReturnIdsList(@p4.l Collection<? extends T> entities) {
        List i5;
        List<Long> a5;
        l0.p(entities, "entities");
        i5 = kotlin.collections.v.i();
        for (T t5 : entities) {
            try {
                i5.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t5)));
            } catch (SQLiteConstraintException e5) {
                checkUniquenessException(e5);
                this.updateAdapter.handle(t5);
                i5.add(-1L);
            }
        }
        a5 = kotlin.collections.v.a(i5);
        return a5;
    }
}
