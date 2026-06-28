package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0001\nB#\b\u0004\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tR,\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/AlignmentLine;", "", "Lkotlin/Function2;", "", "merger", "Lv3/p;", "getMerger$ui_release", "()Lv3/p;", "<init>", "(Lv3/p;)V", "Companion", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "Landroidx/compose/ui/layout/VerticalAlignmentLine;", "ui_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public abstract class AlignmentLine {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int Unspecified = Integer.MIN_VALUE;

    @l
    private final p<Integer, Integer, Integer> merger;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/AlignmentLine$Companion;", "", "()V", "Unspecified", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLine(p<? super Integer, ? super Integer, Integer> pVar) {
        this.merger = pVar;
    }

    public /* synthetic */ AlignmentLine(p pVar, w wVar) {
        this(pVar);
    }

    @l
    public final p<Integer, Integer, Integer> getMerger$ui_release() {
        return this.merger;
    }
}
