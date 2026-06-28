package androidx.room.util;

import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import u3.e;
import u3.h;

@h(name = "StringUtil")
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\"\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ljava/lang/StringBuilder;", "newStringBuilder", "builder", "", "count", "Lkotlin/r2;", "appendPlaceholders", "", "input", "", "splitToIntList", "joinIntoString", "", "EMPTY_STRING_ARRAY", "[Ljava/lang/String;", "getEMPTY_STRING_ARRAY$annotations", "()V", "room-runtime_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@r1({"SMAP\nStringUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringUtil.kt\nandroidx/room/util/StringUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1603#2,9:87\n1855#2:96\n1856#2:98\n1612#2:99\n1#3:97\n*S KotlinDebug\n*F\n+ 1 StringUtil.kt\nandroidx/room/util/StringUtil\n*L\n66#1:87,9\n66#1:96\n66#1:98\n66#1:99\n66#1:97\n*E\n"})
/* loaded from: classes2.dex */
public final class StringUtil {

    @l
    @e
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static final void appendPlaceholders(@l StringBuilder builder, int i5) {
        l0.p(builder, "builder");
        for (int i6 = 0; i6 < i5; i6++) {
            builder.append("?");
            if (i6 < i5 - 1) {
                builder.append(",");
            }
        }
    }

    public static /* synthetic */ void getEMPTY_STRING_ARRAY$annotations() {
    }

    @m
    public static final String joinIntoString(@m List<Integer> list) {
        String j32;
        if (list == null) {
            return null;
        }
        j32 = e0.j3(list, ",", null, null, 0, null, null, 62, null);
        return j32;
    }

    @l
    public static final StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:
    
        r8 = kotlin.text.f0.Q4(r8, new char[]{','}, false, 0, 6, null);
     */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<java.lang.Integer> splitToIntList(@p4.m java.lang.String r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L46
            r1 = 1
            char[] r3 = new char[r1]
            r1 = 0
            r2 = 44
            r3[r1] = r2
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r8
            java.util.List r8 = kotlin.text.v.Q4(r2, r3, r4, r5, r6, r7)
            if (r8 == 0) goto L46
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L21:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L36
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L36
            goto L3f
        L36:
            r2 = move-exception
            java.lang.String r3 = "ROOM"
            java.lang.String r4 = "Malformed integer list"
            android.util.Log.e(r3, r4, r2)
            r2 = r0
        L3f:
            if (r2 == 0) goto L21
            r1.add(r2)
            goto L21
        L45:
            r0 = r1
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.StringUtil.splitToIntList(java.lang.String):java.util.List");
    }
}
