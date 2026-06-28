package androidx.compose.ui.tooling.preview.datasource;

import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LoremIpsum$generateLoremIpsum$1 extends n0 implements a<String> {
    final /* synthetic */ int $loremIpsumMaxSize;
    final /* synthetic */ k1.f $wordsUsed;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoremIpsum$generateLoremIpsum$1(k1.f fVar, int i5) {
        super(0);
        this.$wordsUsed = fVar;
        this.$loremIpsumMaxSize = i5;
    }

    @Override // v3.a
    @m
    public final String invoke() {
        List list;
        list = LoremIpsum_androidKt.LOREM_IPSUM_SOURCE;
        k1.f fVar = this.$wordsUsed;
        int i5 = fVar.element;
        fVar.element = i5 + 1;
        return (String) list.get(i5 % this.$loremIpsumMaxSize);
    }
}
