package androidx.compose.ui.text;

import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001e\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\b\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a<\u0010\u0010\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001e\u0010\u0012\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u0003H\u0000\u001a-\u0010\u0015\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u000bH\u0082\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"", "Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfoList", "", "index", "findParagraphByIndex", "", "y", "findParagraphByY", "Landroidx/compose/ui/text/TextRange;", "range", "Lkotlin/Function1;", "Lkotlin/r2;", "action", "findParagraphsByRange-Sb-Bc2M", "(Ljava/util/List;JLv3/l;)V", "findParagraphsByRange", "lineIndex", "findParagraphByLineIndex", "T", "comparison", "fastBinarySearch", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n1#1,1055:1\n924#1,16:1056\n924#1,16:1072\n924#1,16:1088\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n860#1:1056,16\n880#1:1072,16\n914#1:1088,16\n*E\n"})
/* loaded from: classes.dex */
public final class MultiParagraphKt {
    private static final <T> int fastBinarySearch(List<? extends T> list, l<? super T, Integer> lVar) {
        int size = list.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            int intValue = lVar.invoke(list.get(i6)).intValue();
            if (intValue < 0) {
                i5 = i6 + 1;
            } else if (intValue > 0) {
                size = i6 - 1;
            } else {
                return i6;
            }
        }
        return -(i5 + 1);
    }

    public static final int findParagraphByIndex(@p4.l List<ParagraphInfo> list, int i5) {
        char c5;
        int size = list.size() - 1;
        int i6 = 0;
        while (i6 <= size) {
            int i7 = (i6 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i7);
            if (paragraphInfo.getStartIndex() > i5) {
                c5 = 1;
            } else if (paragraphInfo.getEndIndex() <= i5) {
                c5 = 65535;
            } else {
                c5 = 0;
            }
            if (c5 < 0) {
                i6 = i7 + 1;
            } else if (c5 > 0) {
                size = i7 - 1;
            } else {
                return i7;
            }
        }
        return -(i6 + 1);
    }

    public static final int findParagraphByLineIndex(@p4.l List<ParagraphInfo> list, int i5) {
        char c5;
        int size = list.size() - 1;
        int i6 = 0;
        while (i6 <= size) {
            int i7 = (i6 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i7);
            if (paragraphInfo.getStartLineIndex() > i5) {
                c5 = 1;
            } else if (paragraphInfo.getEndLineIndex() <= i5) {
                c5 = 65535;
            } else {
                c5 = 0;
            }
            if (c5 < 0) {
                i6 = i7 + 1;
            } else if (c5 > 0) {
                size = i7 - 1;
            } else {
                return i7;
            }
        }
        return -(i6 + 1);
    }

    public static final int findParagraphByY(@p4.l List<ParagraphInfo> list, float f5) {
        char c5;
        int size = list.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i6);
            if (paragraphInfo.getTop() > f5) {
                c5 = 1;
            } else if (paragraphInfo.getBottom() <= f5) {
                c5 = 65535;
            } else {
                c5 = 0;
            }
            if (c5 < 0) {
                i5 = i6 + 1;
            } else if (c5 > 0) {
                size = i6 - 1;
            } else {
                return i6;
            }
        }
        return -(i5 + 1);
    }

    /* renamed from: findParagraphsByRange-Sb-Bc2M, reason: not valid java name */
    public static final void m5427findParagraphsByRangeSbBc2M(@p4.l List<ParagraphInfo> list, long j5, @p4.l l<? super ParagraphInfo, r2> lVar) {
        int size = list.size();
        for (int findParagraphByIndex = findParagraphByIndex(list, TextRange.m5543getMinimpl(j5)); findParagraphByIndex < size; findParagraphByIndex++) {
            ParagraphInfo paragraphInfo = list.get(findParagraphByIndex);
            if (paragraphInfo.getStartIndex() < TextRange.m5542getMaximpl(j5)) {
                if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                    lVar.invoke(paragraphInfo);
                }
            } else {
                return;
            }
        }
    }
}
