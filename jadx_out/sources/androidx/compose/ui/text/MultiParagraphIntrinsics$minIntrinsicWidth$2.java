package androidx.compose.ui.text;

import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import v3.a;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$minIntrinsicWidth$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n171#2,13:155\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$minIntrinsicWidth$2\n*L\n76#1:155,13\n*E\n"})
/* loaded from: classes.dex */
final class MultiParagraphIntrinsics$minIntrinsicWidth$2 extends n0 implements a<Float> {
    final /* synthetic */ MultiParagraphIntrinsics this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiParagraphIntrinsics$minIntrinsicWidth$2(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        super(0);
        this.this$0 = multiParagraphIntrinsics;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Float invoke() {
        int G;
        ParagraphIntrinsicInfo paragraphIntrinsicInfo;
        ParagraphIntrinsics intrinsics;
        List<ParagraphIntrinsicInfo> infoList$ui_text_release = this.this$0.getInfoList$ui_text_release();
        if (infoList$ui_text_release.isEmpty()) {
            paragraphIntrinsicInfo = null;
        } else {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = infoList$ui_text_release.get(0);
            float minIntrinsicWidth = paragraphIntrinsicInfo2.getIntrinsics().getMinIntrinsicWidth();
            G = w.G(infoList$ui_text_release);
            int i5 = 1;
            if (1 <= G) {
                while (true) {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = infoList$ui_text_release.get(i5);
                    float minIntrinsicWidth2 = paragraphIntrinsicInfo3.getIntrinsics().getMinIntrinsicWidth();
                    if (Float.compare(minIntrinsicWidth, minIntrinsicWidth2) < 0) {
                        paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                        minIntrinsicWidth = minIntrinsicWidth2;
                    }
                    if (i5 == G) {
                        break;
                    }
                    i5++;
                }
            }
            paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
        return Float.valueOf((paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) ? 0.0f : intrinsics.getMinIntrinsicWidth());
    }
}
