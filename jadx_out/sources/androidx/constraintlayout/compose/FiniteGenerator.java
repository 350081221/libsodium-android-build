package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0010j\b\u0012\u0004\u0012\u00020\u0007`\u0011J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/constraintlayout/compose/FiniteGenerator;", "Landroidx/constraintlayout/compose/GeneratedValue;", TypedValues.TransitionType.S_FROM, "", TypedValues.TransitionType.S_TO, "step", "prefix", "", "postfix", "(FFFLjava/lang/String;Ljava/lang/String;)V", "current", "initial", "max", "stop", "", "array", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", b.f22420d, "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FiniteGenerator implements GeneratedValue {
    private float current;
    private float initial;
    private float max;

    @l
    private String postfix;

    @l
    private String prefix;
    private float step;
    private boolean stop;

    public FiniteGenerator(float f5, float f6, float f7, @l String prefix, @l String postfix) {
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        this.step = f7;
        this.prefix = prefix;
        this.postfix = postfix;
        this.current = f5;
        this.initial = f5;
        this.max = f6;
    }

    @l
    public final ArrayList<String> array() {
        ArrayList<String> arrayList = new ArrayList<>();
        float f5 = this.initial;
        int i5 = (int) f5;
        int i6 = (int) f5;
        int i7 = (int) this.max;
        if (i6 <= i7) {
            while (true) {
                int i8 = i6 + 1;
                arrayList.add(this.prefix + i5 + this.postfix);
                i5 += (int) this.step;
                if (i6 == i7) {
                    break;
                }
                i6 = i8;
            }
        }
        return arrayList;
    }

    @Override // androidx.constraintlayout.compose.GeneratedValue
    public float value() {
        float f5 = this.current;
        if (f5 >= this.max) {
            this.stop = true;
        }
        if (!this.stop) {
            this.current = f5 + this.step;
        }
        return this.current;
    }

    public /* synthetic */ FiniteGenerator(float f5, float f6, float f7, String str, String str2, int i5, w wVar) {
        this(f5, f6, (i5 & 4) != 0 ? 1.0f : f7, (i5 & 8) != 0 ? "" : str, (i5 & 16) != 0 ? "" : str2);
    }
}
