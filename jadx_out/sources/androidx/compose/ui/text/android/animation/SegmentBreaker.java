package androidx.compose.ui.text.android.animation;

import android.text.Layout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.android.LayoutCompatKt;
import androidx.compose.ui.text.android.LayoutHelper;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.collections.e0;
import kotlin.collections.v;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/android/animation/SegmentBreaker;", "", "()V", "breakInWords", "", "", "layoutHelper", "Landroidx/compose/ui/text/android/LayoutHelper;", "breakOffsets", "segmentType", "Landroidx/compose/ui/text/android/animation/SegmentType;", "breakSegmentWithChar", "Landroidx/compose/ui/text/android/animation/Segment;", "dropSpaces", "", "breakSegmentWithDocument", "breakSegmentWithLine", "breakSegmentWithParagraph", "breakSegmentWithWord", "breakSegments", "breakWithBreakIterator", "text", "", "breaker", "Ljava/text/BreakIterator;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSegmentBreaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n+ 2 ListUtils.kt\nandroidx/compose/ui/text/android/ListUtilsKt\n*L\n1#1,308:1\n33#2,6:309\n74#2,11:315\n74#2,11:326\n*S KotlinDebug\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n*L\n61#1:309,6\n221#1:315,11\n270#1:326,11\n*E\n"})
/* loaded from: classes.dex */
public final class SegmentBreaker {
    public static final int $stable = 0;

    @l
    public static final SegmentBreaker INSTANCE = new SegmentBreaker();

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentType.values().length];
            try {
                iArr[SegmentType.Document.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentType.Paragraph.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentType.Line.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SegmentType.Word.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SegmentType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SegmentBreaker() {
    }

    private final List<Integer> breakInWords(LayoutHelper layoutHelper) {
        List<Integer> S5;
        List<Integer> breakWithBreakIterator = breakWithBreakIterator(layoutHelper.getLayout().getText(), BreakIterator.getLineInstance(Locale.getDefault()));
        TreeSet treeSet = new TreeSet();
        int size = breakWithBreakIterator.size();
        for (int i5 = 0; i5 < size; i5++) {
            treeSet.add(Integer.valueOf(breakWithBreakIterator.get(i5).intValue()));
        }
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i6 = 0; i6 < paragraphCount; i6++) {
            Bidi analyzeBidi = layoutHelper.analyzeBidi(i6);
            if (analyzeBidi != null) {
                int paragraphStart = layoutHelper.getParagraphStart(i6);
                int runCount = analyzeBidi.getRunCount();
                for (int i7 = 0; i7 < runCount; i7++) {
                    treeSet.add(Integer.valueOf(analyzeBidi.getRunStart(i7) + paragraphStart));
                }
            }
        }
        S5 = e0.S5(treeSet);
        return S5;
    }

    private final List<Segment> breakSegmentWithChar(LayoutHelper layoutHelper, boolean z4) {
        int G;
        boolean z5;
        boolean z6;
        int i5;
        ArrayList arrayList = new ArrayList();
        List<Integer> breakOffsets = breakOffsets(layoutHelper, SegmentType.Character);
        if (breakOffsets.size() != 0) {
            boolean z7 = true;
            if (breakOffsets.size() != 1) {
                ArrayList arrayList2 = new ArrayList();
                boolean z8 = false;
                Integer num = breakOffsets.get(0);
                G = w.G(breakOffsets);
                int i6 = 0;
                while (i6 < G) {
                    i6++;
                    Integer num2 = breakOffsets.get(i6);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    Layout layout = layoutHelper.getLayout();
                    if (z4 && intValue == intValue2 + 1 && layoutHelper.isLineEndSpace(layout.getText().charAt(intValue2))) {
                        i5 = G;
                    } else {
                        int lineForOffset = LayoutCompatKt.getLineForOffset(layout, intValue2, z8);
                        if (layout.getParagraphDirection(lineForOffset) == -1) {
                            z5 = z7;
                        } else {
                            z5 = z8;
                        }
                        boolean isRtlCharAt = layout.isRtlCharAt(intValue2);
                        if (isRtlCharAt != z5) {
                            z7 = z8;
                        }
                        int ceil = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue2, z7, z8));
                        if (isRtlCharAt == z5) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        i5 = G;
                        int ceil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue, z6, true));
                        arrayList.add(new Segment(intValue2, intValue, Math.min(ceil, ceil2), layout.getLineTop(lineForOffset), Math.max(ceil, ceil2), layout.getLineBottom(lineForOffset)));
                    }
                    arrayList2.add(r2.f19517a);
                    num = num2;
                    G = i5;
                    z7 = true;
                    z8 = false;
                }
                return arrayList;
            }
        }
        w.E();
        return arrayList;
    }

    private final List<Segment> breakSegmentWithDocument(LayoutHelper layoutHelper) {
        List<Segment> k5;
        k5 = v.k(new Segment(0, layoutHelper.getLayout().getText().length(), 0, 0, layoutHelper.getLayout().getWidth(), layoutHelper.getLayout().getHeight()));
        return k5;
    }

    private final List<Segment> breakSegmentWithLine(LayoutHelper layoutHelper, boolean z4) {
        int i5;
        int width;
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int lineCount = layoutHelper.getLayout().getLineCount();
        for (int i6 = 0; i6 < lineCount; i6++) {
            int lineStart = layout.getLineStart(i6);
            int lineEnd = layout.getLineEnd(i6);
            if (z4) {
                i5 = (int) Math.ceil(layout.getLineLeft(i6));
            } else {
                i5 = 0;
            }
            int lineTop = layout.getLineTop(i6);
            if (z4) {
                width = (int) Math.ceil(layout.getLineRight(i6));
            } else {
                width = layout.getWidth();
            }
            arrayList.add(new Segment(lineStart, lineEnd, i5, lineTop, width, layout.getLineBottom(i6)));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithParagraph(LayoutHelper layoutHelper) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i5 = 0; i5 < paragraphCount; i5++) {
            int paragraphStart = layoutHelper.getParagraphStart(i5);
            int paragraphEnd = layoutHelper.getParagraphEnd(i5);
            arrayList.add(new Segment(paragraphStart, paragraphEnd, 0, layout.getLineTop(LayoutCompatKt.getLineForOffset(layout, paragraphStart, false)), layout.getWidth(), layout.getLineBottom(LayoutCompatKt.getLineForOffset(layout, paragraphEnd, true))));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithWord(LayoutHelper layoutHelper, boolean z4) {
        List<Segment> E;
        int G;
        boolean z5;
        boolean z6;
        int i5;
        Layout layout = layoutHelper.getLayout();
        int ceil = (int) Math.ceil(layout.getPaint().measureText(" "));
        List<Integer> breakOffsets = breakOffsets(layoutHelper, SegmentType.Word);
        if (breakOffsets.size() != 0) {
            boolean z7 = true;
            if (breakOffsets.size() != 1) {
                ArrayList arrayList = new ArrayList();
                boolean z8 = false;
                Integer num = breakOffsets.get(0);
                G = w.G(breakOffsets);
                int i6 = 0;
                while (i6 < G) {
                    i6++;
                    Integer num2 = breakOffsets.get(i6);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    int lineForOffset = LayoutCompatKt.getLineForOffset(layout, intValue2, z8);
                    if (layout.getParagraphDirection(lineForOffset) == -1) {
                        z5 = z7;
                    } else {
                        z5 = z8;
                    }
                    boolean isRtlCharAt = layout.isRtlCharAt(intValue2);
                    if (isRtlCharAt != z5) {
                        z7 = z8;
                    }
                    int ceil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue2, z7, z8));
                    if (isRtlCharAt == z5) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    int i7 = G;
                    int ceil3 = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue, z6, true));
                    int min = Math.min(ceil2, ceil3);
                    int max = Math.max(ceil2, ceil3);
                    if (z4 && intValue != 0 && layout.getText().charAt(intValue - 1) == ' ') {
                        i5 = lineForOffset;
                        if (layout.getLineEnd(i5) != intValue) {
                            if (isRtlCharAt) {
                                min += ceil;
                            } else {
                                max -= ceil;
                            }
                        }
                    } else {
                        i5 = lineForOffset;
                    }
                    arrayList.add(new Segment(intValue2, intValue, min, layout.getLineTop(i5), max, layout.getLineBottom(i5)));
                    num = num2;
                    G = i7;
                    z7 = true;
                    z8 = false;
                }
                return arrayList;
            }
        }
        E = w.E();
        return E;
    }

    private final List<Integer> breakWithBreakIterator(CharSequence charSequence, BreakIterator breakIterator) {
        List<Integer> P;
        CharSequenceCharacterIterator charSequenceCharacterIterator = new CharSequenceCharacterIterator(charSequence, 0, charSequence.length());
        P = w.P(0);
        breakIterator.setText(charSequenceCharacterIterator);
        while (breakIterator.next() != -1) {
            P.add(Integer.valueOf(breakIterator.current()));
        }
        return P;
    }

    @l
    public final List<Integer> breakOffsets(@l LayoutHelper layoutHelper, @l SegmentType segmentType) {
        List<Integer> L;
        List<Integer> P;
        List<Integer> P2;
        Layout layout = layoutHelper.getLayout();
        CharSequence text = layout.getText();
        int i5 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        int i6 = 0;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 == 5) {
                            return breakWithBreakIterator(text, BreakIterator.getCharacterInstance(Locale.getDefault()));
                        }
                        throw new j0();
                    }
                    return breakInWords(layoutHelper);
                }
                P2 = w.P(0);
                int lineCount = layout.getLineCount();
                while (i6 < lineCount) {
                    P2.add(Integer.valueOf(layout.getLineEnd(i6)));
                    i6++;
                }
                return P2;
            }
            P = w.P(0);
            int paragraphCount = layoutHelper.getParagraphCount();
            while (i6 < paragraphCount) {
                P.add(Integer.valueOf(layoutHelper.getParagraphEnd(i6)));
                i6++;
            }
            return P;
        }
        L = w.L(0, Integer.valueOf(text.length()));
        return L;
    }

    @l
    public final List<Segment> breakSegments(@l LayoutHelper layoutHelper, @l SegmentType segmentType, boolean z4) {
        int i5 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 == 5) {
                            return breakSegmentWithChar(layoutHelper, z4);
                        }
                        throw new j0();
                    }
                    return breakSegmentWithWord(layoutHelper, z4);
                }
                return breakSegmentWithLine(layoutHelper, z4);
            }
            return breakSegmentWithParagraph(layoutHelper);
        }
        return breakSegmentWithDocument(layoutHelper);
    }
}
