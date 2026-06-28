package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/DeadKeyCombiner;", "", "()V", "deadKeyCode", "", "Ljava/lang/Integer;", "consume", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "consume-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Integer;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDeadKeyCombiner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeadKeyCombiner.android.kt\nandroidx/compose/foundation/text/DeadKeyCombiner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes.dex */
public final class DeadKeyCombiner {
    public static final int $stable = 8;

    @m
    private Integer deadKeyCode;

    @m
    /* renamed from: consume-ZmokQxo, reason: not valid java name */
    public final Integer m849consumeZmokQxo(@l KeyEvent keyEvent) {
        boolean z4;
        int m4738getUtf16CodePointZmokQxo = KeyEvent_androidKt.m4738getUtf16CodePointZmokQxo(keyEvent);
        Integer num = null;
        if ((Integer.MIN_VALUE & m4738getUtf16CodePointZmokQxo) != 0) {
            this.deadKeyCode = Integer.valueOf(m4738getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
            return null;
        }
        Integer num2 = this.deadKeyCode;
        if (num2 != null) {
            this.deadKeyCode = null;
            Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num2.intValue(), m4738getUtf16CodePointZmokQxo));
            if (valueOf.intValue() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                num = valueOf;
            }
            if (num == null) {
                return Integer.valueOf(m4738getUtf16CodePointZmokQxo);
            }
            return num;
        }
        return Integer.valueOf(m4738getUtf16CodePointZmokQxo);
    }
}
