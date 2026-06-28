package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Path;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfo", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/text/ParagraphInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MultiParagraph$getPathForRange$2 extends n0 implements l<ParagraphInfo, r2> {
    final /* synthetic */ int $end;
    final /* synthetic */ Path $path;
    final /* synthetic */ int $start;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiParagraph$getPathForRange$2(Path path, int i5, int i6) {
        super(1);
        this.$path = path;
        this.$start = i5;
        this.$end = i6;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(ParagraphInfo paragraphInfo) {
        invoke2(paragraphInfo);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l ParagraphInfo paragraphInfo) {
        Path.m4003addPathUv8p0NA$default(this.$path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(this.$start), paragraphInfo.toLocalIndex(this.$end))), 0L, 2, null);
    }
}
