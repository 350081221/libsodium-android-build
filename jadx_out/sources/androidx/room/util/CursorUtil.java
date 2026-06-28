package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import external.org.apache.commons.lang3.d;
import kotlin.collections.p;
import kotlin.i0;
import kotlin.io.c;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.text.e0;
import p4.l;
import u3.h;

@h(name = "CursorUtil")
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a%\u0010\t\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\f\u001a1\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r*\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0014\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Landroid/database/Cursor;", "c", "copyAndClose", "", "name", "", "getColumnIndex", "getColumnIndexOrThrow", "cursor", "findColumnIndexBySuffix", "", "columnNames", "([Ljava/lang/String;Ljava/lang/String;)I", "R", "Lkotlin/Function1;", "block", "useCursor", "(Landroid/database/Cursor;Lv3/l;)Ljava/lang/Object;", "", "mapping", "wrapMappedColumns", "(Landroid/database/Cursor;[Ljava/lang/String;[I)Landroid/database/Cursor;", "room-runtime_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@r1({"SMAP\nCursorUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n145#1,7:185\n13644#2,3:192\n1#3:195\n*S KotlinDebug\n*F\n+ 1 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n39#1:185,7\n127#1:192,3\n*E\n"})
/* loaded from: classes2.dex */
public final class CursorUtil {
    @l
    public static final Cursor copyAndClose(@l Cursor c5) {
        l0.p(c5, "c");
        Cursor cursor = c5;
        try {
            Cursor cursor2 = cursor;
            MatrixCursor matrixCursor = new MatrixCursor(cursor2.getColumnNames(), cursor2.getCount());
            while (cursor2.moveToNext()) {
                Object[] objArr = new Object[cursor2.getColumnCount()];
                int columnCount = c5.getColumnCount();
                for (int i5 = 0; i5 < columnCount; i5++) {
                    int type = cursor2.getType(i5);
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 2) {
                                if (type != 3) {
                                    if (type == 4) {
                                        objArr[i5] = cursor2.getBlob(i5);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                } else {
                                    objArr[i5] = cursor2.getString(i5);
                                }
                            } else {
                                objArr[i5] = Double.valueOf(cursor2.getDouble(i5));
                            }
                        } else {
                            objArr[i5] = Long.valueOf(cursor2.getLong(i5));
                        }
                    } else {
                        objArr[i5] = null;
                    }
                }
                matrixCursor.addRow(objArr);
            }
            c.a(cursor, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25) {
            return -1;
        }
        if (str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        l0.o(columnNames, "columnNames");
        return findColumnIndexBySuffix(columnNames, str);
    }

    public static final int getColumnIndex(@l Cursor c5, @l String name) {
        l0.p(c5, "c");
        l0.p(name, "name");
        int columnIndex = c5.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c5.getColumnIndex('`' + name + '`');
        if (columnIndex2 < 0) {
            return findColumnIndexBySuffix(c5, name);
        }
        return columnIndex2;
    }

    public static final int getColumnIndexOrThrow(@l Cursor c5, @l String name) {
        String str;
        l0.p(c5, "c");
        l0.p(name, "name");
        int columnIndex = getColumnIndex(c5, name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = c5.getColumnNames();
            l0.o(columnNames, "c.columnNames");
            str = p.lh(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e5) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e5);
            str = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + str);
    }

    public static final <R> R useCursor(@l Cursor cursor, @l v3.l<? super Cursor, ? extends R> block) {
        l0.p(cursor, "<this>");
        l0.p(block, "block");
        Cursor cursor2 = cursor;
        try {
            R invoke = block.invoke(cursor2);
            kotlin.jvm.internal.i0.d(1);
            c.a(cursor2, null);
            kotlin.jvm.internal.i0.c(1);
            return invoke;
        } finally {
        }
    }

    @l
    public static final Cursor wrapMappedColumns(@l final Cursor cursor, @l final String[] columnNames, @l final int[] mapping) {
        boolean z4;
        l0.p(cursor, "cursor");
        l0.p(columnNames, "columnNames");
        l0.p(mapping, "mapping");
        if (columnNames.length == mapping.length) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return new CursorWrapper(cursor) { // from class: androidx.room.util.CursorUtil$wrapMappedColumns$2
                @Override // android.database.CursorWrapper, android.database.Cursor
                public int getColumnIndex(@l String columnName) {
                    boolean K1;
                    l0.p(columnName, "columnName");
                    String[] strArr = columnNames;
                    int[] iArr = mapping;
                    int length = strArr.length;
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < length) {
                        int i7 = i6 + 1;
                        K1 = e0.K1(strArr[i5], columnName, true);
                        if (K1) {
                            return iArr[i6];
                        }
                        i5++;
                        i6 = i7;
                    }
                    return super.getColumnIndex(columnName);
                }
            };
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length".toString());
    }

    @VisibleForTesting
    public static final int findColumnIndexBySuffix(@l String[] columnNames, @l String name) {
        boolean J1;
        boolean J12;
        l0.p(columnNames, "columnNames");
        l0.p(name, "name");
        String str = d.f15957a + name;
        String str2 = d.f15957a + name + '`';
        int length = columnNames.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            String str3 = columnNames[i5];
            int i7 = i6 + 1;
            if (str3.length() >= name.length() + 2) {
                J1 = e0.J1(str3, str, false, 2, null);
                if (J1) {
                    return i6;
                }
                if (str3.charAt(0) == '`') {
                    J12 = e0.J1(str3, str2, false, 2, null);
                    if (J12) {
                        return i6;
                    }
                } else {
                    continue;
                }
            }
            i5++;
            i6 = i7;
        }
        return -1;
    }
}
