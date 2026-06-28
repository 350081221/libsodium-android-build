package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.sequences.m;
import kotlin.sequences.s;
import kotlin.sequences.u;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fB\t\b\u0016¢\u0006\u0004\b\u000b\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/tooling/preview/datasource/LoremIpsum;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "", "words", "generateLoremIpsum", "I", "Lkotlin/sequences/m;", "getValues", "()Lkotlin/sequences/m;", "values", "<init>", "(I)V", "()V", "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class LoremIpsum implements PreviewParameterProvider<String> {
    public static final int $stable = 0;
    private final int words;

    public LoremIpsum(int i5) {
        this.words = i5;
    }

    private final String generateLoremIpsum(int i5) {
        List list;
        m m5;
        m Y2;
        String e12;
        k1.f fVar = new k1.f();
        list = LoremIpsum_androidKt.LOREM_IPSUM_SOURCE;
        m5 = s.m(new LoremIpsum$generateLoremIpsum$1(fVar, list.size()));
        Y2 = u.Y2(m5, i5);
        e12 = u.e1(Y2, " ", null, null, 0, null, null, 62, null);
        return e12;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @l
    public m<String> getValues() {
        m<String> q5;
        q5 = s.q(generateLoremIpsum(this.words));
        return q5;
    }

    public LoremIpsum() {
        this(500);
    }
}
