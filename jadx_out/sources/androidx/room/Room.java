package androidx.room;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.text.e0;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\t0\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J/\u0010\u0010\u001a\u0002H\t\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00110\u000e2\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0013J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\t0\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/room/Room;", "", "()V", "CURSOR_CONV_SUFFIX", "", "LOG_TAG", "MASTER_TABLE_NAME", "databaseBuilder", "Landroidx/room/RoomDatabase$Builder;", "T", "Landroidx/room/RoomDatabase;", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "klass", "Ljava/lang/Class;", "name", "getGeneratedImplementation", "C", "suffix", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "inMemoryDatabaseBuilder", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Room {

    @p4.l
    private static final String CURSOR_CONV_SUFFIX = "_CursorConverter";

    @p4.l
    public static final Room INSTANCE = new Room();

    @p4.l
    public static final String LOG_TAG = "ROOM";

    @p4.l
    public static final String MASTER_TABLE_NAME = "room_master_table";

    private Room() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @p4.l
    @u3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> databaseBuilder(@p4.l android.content.Context r2, @p4.l java.lang.Class<T> r3, @p4.m java.lang.String r4) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.l0.p(r3, r0)
            r0 = 1
            if (r4 == 0) goto L16
            boolean r1 = kotlin.text.v.S1(r4)
            if (r1 == 0) goto L14
            goto L16
        L14:
            r1 = 0
            goto L17
        L16:
            r1 = r0
        L17:
            r0 = r0 ^ r1
            if (r0 == 0) goto L20
            androidx.room.RoomDatabase$Builder r0 = new androidx.room.RoomDatabase$Builder
            r0.<init>(r2, r3, r4)
            return r0
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.Room.databaseBuilder(android.content.Context, java.lang.Class, java.lang.String):androidx.room.RoomDatabase$Builder");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @u3.m
    public static final <T, C> T getGeneratedImplementation(@p4.l Class<C> klass, @p4.l String suffix) {
        boolean z4;
        String h22;
        boolean z5;
        String str;
        l0.p(klass, "klass");
        l0.p(suffix, "suffix");
        Package r02 = klass.getPackage();
        l0.m(r02);
        String fullPackage = r02.getName();
        String canonicalName = klass.getCanonicalName();
        l0.m(canonicalName);
        l0.o(fullPackage, "fullPackage");
        if (fullPackage.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            l0.o(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = canonicalName;
        StringBuilder sb = new StringBuilder();
        h22 = e0.h2(str2, external.org.apache.commons.lang3.d.f15957a, '_', false, 4, null);
        sb.append(h22);
        sb.append(suffix);
        String sb2 = sb.toString();
        try {
            if (fullPackage.length() == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                str = sb2;
            } else {
                str = fullPackage + external.org.apache.commons.lang3.d.f15957a + sb2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            l0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + sb2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName());
        }
    }

    @p4.l
    @u3.m
    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(@p4.l Context context, @p4.l Class<T> klass) {
        l0.p(context, "context");
        l0.p(klass, "klass");
        return new RoomDatabase.Builder<>(context, klass, null);
    }
}
