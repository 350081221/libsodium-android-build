package androidx.compose.ui.text;

import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfo", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/text/ParagraphInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MultiParagraph$fillBoundingBoxes$1 extends n0 implements l<ParagraphInfo, r2> {
    final /* synthetic */ float[] $array;
    final /* synthetic */ k1.f $currentArrayStart;
    final /* synthetic */ k1.e $currentHeight;
    final /* synthetic */ long $range;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiParagraph$fillBoundingBoxes$1(long j5, float[] fArr, k1.f fVar, k1.e eVar) {
        super(1);
        this.$range = j5;
        this.$array = fArr;
        this.$currentArrayStart = fVar;
        this.$currentHeight = eVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(ParagraphInfo paragraphInfo) {
        invoke2(paragraphInfo);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l ParagraphInfo paragraphInfo) {
        long j5 = this.$range;
        float[] fArr = this.$array;
        k1.f fVar = this.$currentArrayStart;
        k1.e eVar = this.$currentHeight;
        long TextRange = TextRangeKt.TextRange(paragraphInfo.toLocalIndex(paragraphInfo.getStartIndex() > TextRange.m5543getMinimpl(j5) ? paragraphInfo.getStartIndex() : TextRange.m5543getMinimpl(j5)), paragraphInfo.toLocalIndex(paragraphInfo.getEndIndex() < TextRange.m5542getMaximpl(j5) ? paragraphInfo.getEndIndex() : TextRange.m5542getMaximpl(j5)));
        paragraphInfo.getParagraph().mo5391fillBoundingBoxes8ffj60Q(TextRange, fArr, fVar.element);
        int m5541getLengthimpl = fVar.element + (TextRange.m5541getLengthimpl(TextRange) * 4);
        for (int i5 = fVar.element; i5 < m5541getLengthimpl; i5 += 4) {
            int i6 = i5 + 1;
            float f5 = fArr[i6];
            float f6 = eVar.element;
            fArr[i6] = f5 + f6;
            int i7 = i5 + 3;
            fArr[i7] = fArr[i7] + f6;
        }
        fVar.element = m5541getLengthimpl;
        eVar.element += paragraphInfo.getParagraph().getHeight();
    }
}
