package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.text.BreakIterator;
import java.util.Locale;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators;", "", "()V", "AbstractTextSegmentIterator", "CharacterTextSegmentIterator", "LineTextSegmentIterator", "PageTextSegmentIterator", "ParagraphTextSegmentIterator", "TextSegmentIterator", "WordTextSegmentIterator", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccessibilityIterators {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    @kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0004R\"\u0010\u0003\u001a\u00020\u00028\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "", "text", "Lkotlin/r2;", "initialize", "", "start", "end", "", "getRange", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "segment", "[I", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        public static final int $stable = 8;

        @p4.l
        private final int[] segment = new int[2];
        protected String text;

        @p4.m
        protected final int[] getRange(int i5, int i6) {
            if (i5 >= 0 && i6 >= 0 && i5 != i6) {
                int[] iArr = this.segment;
                iArr[0] = i5;
                iArr[1] = i6;
                return iArr;
            }
            return null;
        }

        @p4.l
        protected final String getText() {
            String str = this.text;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.l0.S("text");
            return null;
        }

        public void initialize(@p4.l String str) {
            setText(str);
        }

        protected final void setText(@p4.l String str) {
            this.text = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @kotlin.i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Ljava/util/Locale;", "locale", "Lkotlin/r2;", "onLocaleChanged", "", "text", "initialize", "", "current", "", "following", "preceding", "Ljava/text/BreakIterator;", "impl", "Ljava/text/BreakIterator;", "<init>", "(Ljava/util/Locale;)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {

        @p4.m
        private static CharacterTextSegmentIterator instance;
        private BreakIterator impl;

        @p4.l
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        @kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator$Companion;", "", "()V", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "getInstance", "locale", "Ljava/util/Locale;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
                this();
            }

            @p4.l
            public final CharacterTextSegmentIterator getInstance(@p4.l Locale locale) {
                if (CharacterTextSegmentIterator.instance == null) {
                    CharacterTextSegmentIterator.instance = new CharacterTextSegmentIterator(locale, null);
                }
                CharacterTextSegmentIterator characterTextSegmentIterator = CharacterTextSegmentIterator.instance;
                kotlin.jvm.internal.l0.n(characterTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return characterTextSegmentIterator;
            }
        }

        private CharacterTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        public /* synthetic */ CharacterTextSegmentIterator(Locale locale, kotlin.jvm.internal.w wVar) {
            this(locale);
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getCharacterInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @p4.m
        public int[] following(int i5) {
            int length = getText().length();
            if (length <= 0 || i5 >= length) {
                return null;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.l0.S("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i5)) {
                    BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.l0.S("impl");
                        breakIterator2 = null;
                    }
                    i5 = breakIterator2.following(i5);
                } else {
                    BreakIterator breakIterator3 = this.impl;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.l0.S("impl");
                        breakIterator3 = null;
                    }
                    int following = breakIterator3.following(i5);
                    if (following == -1) {
                        return null;
                    }
                    return getRange(i5, following);
                }
            } while (i5 != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(@p4.l String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                kotlin.jvm.internal.l0.S("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @p4.m
        public int[] preceding(int i5) {
            int length = getText().length();
            if (length <= 0 || i5 <= 0) {
                return null;
            }
            if (i5 > length) {
                i5 = length;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.l0.S("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i5)) {
                    BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.l0.S("impl");
                        breakIterator2 = null;
                    }
                    i5 = breakIterator2.preceding(i5);
                } else {
                    BreakIterator breakIterator3 = this.impl;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.l0.S("impl");
                        breakIterator3 = null;
                    }
                    int preceding = breakIterator3.preceding(i5);
                    if (preceding == -1) {
                        return null;
                    }
                    return getRange(preceding, i5);
                }
            } while (i5 != -1);
            return null;
        }
    }

    @StabilityInferred(parameters = 0)
    @kotlin.i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "", "lineNumber", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "getLineEdgeIndex", "", "text", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Lkotlin/r2;", "initialize", "current", "", "following", "preceding", "Landroidx/compose/ui/text/TextLayoutResult;", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {

        @p4.m
        private static LineTextSegmentIterator lineInstance;
        private TextLayoutResult layoutResult;

        @p4.l
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        @p4.l
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;

        @p4.l
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        @kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator$Companion;", "", "()V", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "lineInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "getInstance", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
                this();
            }

            @p4.l
            public final LineTextSegmentIterator getInstance() {
                if (LineTextSegmentIterator.lineInstance == null) {
                    LineTextSegmentIterator.lineInstance = new LineTextSegmentIterator(null);
                }
                LineTextSegmentIterator lineTextSegmentIterator = LineTextSegmentIterator.lineInstance;
                kotlin.jvm.internal.l0.n(lineTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return lineTextSegmentIterator;
            }
        }

        private LineTextSegmentIterator() {
        }

        public /* synthetic */ LineTextSegmentIterator(kotlin.jvm.internal.w wVar) {
            this();
        }

        private final int getLineEdgeIndex(int i5, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                kotlin.jvm.internal.l0.S("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i5);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                kotlin.jvm.internal.l0.S("layoutResult");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.getParagraphDirection(lineStart)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i5);
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                kotlin.jvm.internal.l0.S("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult5, i5, false, 2, null) - 1;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @p4.m
        public int[] following(int i5) {
            int i6;
            if (getText().length() <= 0 || i5 >= getText().length()) {
                return null;
            }
            if (i5 < 0) {
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    textLayoutResult = null;
                }
                i6 = textLayoutResult.getLineForOffset(0);
            } else {
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(i5);
                if (getLineEdgeIndex(lineForOffset, DirectionStart) == i5) {
                    i6 = lineForOffset;
                } else {
                    i6 = lineForOffset + 1;
                }
            }
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                kotlin.jvm.internal.l0.S("layoutResult");
                textLayoutResult3 = null;
            }
            if (i6 >= textLayoutResult3.getLineCount()) {
                return null;
            }
            return getRange(getLineEdgeIndex(i6, DirectionStart), getLineEdgeIndex(i6, DirectionEnd) + 1);
        }

        public final void initialize(@p4.l String str, @p4.l TextLayoutResult textLayoutResult) {
            setText(str);
            this.layoutResult = textLayoutResult;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @p4.m
        public int[] preceding(int i5) {
            int i6;
            if (getText().length() <= 0 || i5 <= 0) {
                return null;
            }
            if (i5 > getText().length()) {
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    textLayoutResult = null;
                }
                i6 = textLayoutResult.getLineForOffset(getText().length());
            } else {
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(i5);
                if (getLineEdgeIndex(lineForOffset, DirectionEnd) + 1 == i5) {
                    i6 = lineForOffset;
                } else {
                    i6 = lineForOffset - 1;
                }
            }
            if (i6 < 0) {
                return null;
            }
            return getRange(getLineEdgeIndex(i6, DirectionStart), getLineEdgeIndex(i6, DirectionEnd) + 1);
        }
    }

    @StabilityInferred(parameters = 0)
    @kotlin.i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "", "lineNumber", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "getLineEdgeIndex", "", "text", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Lkotlin/r2;", "initialize", "current", "", "following", "preceding", "Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Landroid/graphics/Rect;", "tempRect", "Landroid/graphics/Rect;", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {

        @p4.m
        private static PageTextSegmentIterator pageInstance;
        private TextLayoutResult layoutResult;
        private SemanticsNode node;

        @p4.l
        private Rect tempRect;

        @p4.l
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        @p4.l
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;

        @p4.l
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        @kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator$Companion;", "", "()V", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "pageInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "getInstance", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
                this();
            }

            @p4.l
            public final PageTextSegmentIterator getInstance() {
                if (PageTextSegmentIterator.pageInstance == null) {
                    PageTextSegmentIterator.pageInstance = new PageTextSegmentIterator(null);
                }
                PageTextSegmentIterator pageTextSegmentIterator = PageTextSegmentIterator.pageInstance;
                kotlin.jvm.internal.l0.n(pageTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return pageTextSegmentIterator;
            }
        }

        private PageTextSegmentIterator() {
            this.tempRect = new Rect();
        }

        public /* synthetic */ PageTextSegmentIterator(kotlin.jvm.internal.w wVar) {
            this();
        }

        private final int getLineEdgeIndex(int i5, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                kotlin.jvm.internal.l0.S("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i5);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                kotlin.jvm.internal.l0.S("layoutResult");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.getParagraphDirection(lineStart)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i5);
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                kotlin.jvm.internal.l0.S("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult5, i5, false, 2, null) - 1;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @p4.m
        public int[] following(int i5) {
            int L0;
            int u4;
            int lineCount;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || i5 >= getText().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    kotlin.jvm.internal.l0.S("node");
                    semanticsNode = null;
                }
                L0 = kotlin.math.d.L0(semanticsNode.getBoundsInRoot().getHeight());
                u4 = kotlin.ranges.u.u(0, i5);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(u4);
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) + L0;
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    textLayoutResult4 = null;
                }
                TextLayoutResult textLayoutResult5 = this.layoutResult;
                if (textLayoutResult5 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    textLayoutResult5 = null;
                }
                if (lineTop < textLayoutResult4.getLineTop(textLayoutResult5.getLineCount() - 1)) {
                    TextLayoutResult textLayoutResult6 = this.layoutResult;
                    if (textLayoutResult6 == null) {
                        kotlin.jvm.internal.l0.S("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult6;
                    }
                    lineCount = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    TextLayoutResult textLayoutResult7 = this.layoutResult;
                    if (textLayoutResult7 == null) {
                        kotlin.jvm.internal.l0.S("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult7;
                    }
                    lineCount = textLayoutResult.getLineCount();
                }
                return getRange(u4, getLineEdgeIndex(lineCount - 1, DirectionEnd) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        public final void initialize(@p4.l String str, @p4.l TextLayoutResult textLayoutResult, @p4.l SemanticsNode semanticsNode) {
            setText(str);
            this.layoutResult = textLayoutResult;
            this.node = semanticsNode;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @p4.m
        public int[] preceding(int i5) {
            int L0;
            int B;
            int i6;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || i5 <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    kotlin.jvm.internal.l0.S("node");
                    semanticsNode = null;
                }
                L0 = kotlin.math.d.L0(semanticsNode.getBoundsInRoot().getHeight());
                B = kotlin.ranges.u.B(getText().length(), i5);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(B);
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    kotlin.jvm.internal.l0.S("layoutResult");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) - L0;
                if (lineTop > 0.0f) {
                    TextLayoutResult textLayoutResult4 = this.layoutResult;
                    if (textLayoutResult4 == null) {
                        kotlin.jvm.internal.l0.S("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult4;
                    }
                    i6 = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    i6 = 0;
                }
                if (B == getText().length() && i6 < lineForOffset) {
                    i6++;
                }
                return getRange(getLineEdgeIndex(i6, DirectionStart), B);
            } catch (IllegalStateException unused) {
                return null;
            }
        }
    }

    @StabilityInferred(parameters = 1)
    @kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "()V", "following", "", "current", "", "isEndBoundary", "", "index", "isStartBoundary", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 0;

        @p4.l
        public static final Companion Companion = new Companion(null);

        @p4.m
        private static ParagraphTextSegmentIterator instance;

        @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator$Companion;", "", "()V", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "getInstance", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
                this();
            }

            @p4.l
            public final ParagraphTextSegmentIterator getInstance() {
                if (ParagraphTextSegmentIterator.instance == null) {
                    ParagraphTextSegmentIterator.instance = new ParagraphTextSegmentIterator(null);
                }
                ParagraphTextSegmentIterator paragraphTextSegmentIterator = ParagraphTextSegmentIterator.instance;
                kotlin.jvm.internal.l0.n(paragraphTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return paragraphTextSegmentIterator;
            }
        }

        private ParagraphTextSegmentIterator() {
        }

        public /* synthetic */ ParagraphTextSegmentIterator(kotlin.jvm.internal.w wVar) {
            this();
        }

        private final boolean isEndBoundary(int i5) {
            if (i5 > 0 && getText().charAt(i5 - 1) != '\n' && (i5 == getText().length() || getText().charAt(i5) == '\n')) {
                return true;
            }
            return false;
        }

        private final boolean isStartBoundary(int i5) {
            if (getText().charAt(i5) != '\n' && (i5 == 0 || getText().charAt(i5 - 1) == '\n')) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
        
            return null;
         */
        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int[] following(int r5) {
            /*
                r4 = this;
                java.lang.String r0 = r4.getText()
                int r0 = r0.length()
                r1 = 0
                if (r0 > 0) goto Lc
                return r1
            Lc:
                if (r5 < r0) goto Lf
                return r1
            Lf:
                if (r5 >= 0) goto L12
                r5 = 0
            L12:
                if (r5 >= r0) goto L29
                java.lang.String r2 = r4.getText()
                char r2 = r2.charAt(r5)
                r3 = 10
                if (r2 != r3) goto L29
                boolean r2 = r4.isStartBoundary(r5)
                if (r2 != 0) goto L29
                int r5 = r5 + 1
                goto L12
            L29:
                if (r5 < r0) goto L2c
                return r1
            L2c:
                int r1 = r5 + 1
            L2e:
                if (r1 >= r0) goto L39
                boolean r2 = r4.isEndBoundary(r1)
                if (r2 != 0) goto L39
                int r1 = r1 + 1
                goto L2e
            L39:
                int[] r5 = r4.getRange(r5, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.following(int):int[]");
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        
            return null;
         */
        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int[] preceding(int r4) {
            /*
                r3 = this;
                java.lang.String r0 = r3.getText()
                int r0 = r0.length()
                r1 = 0
                if (r0 > 0) goto Lc
                return r1
            Lc:
                if (r4 > 0) goto Lf
                return r1
            Lf:
                if (r4 <= r0) goto L12
                r4 = r0
            L12:
                if (r4 <= 0) goto L2b
                java.lang.String r0 = r3.getText()
                int r2 = r4 + (-1)
                char r0 = r0.charAt(r2)
                r2 = 10
                if (r0 != r2) goto L2b
                boolean r0 = r3.isEndBoundary(r4)
                if (r0 != 0) goto L2b
                int r4 = r4 + (-1)
                goto L12
            L2b:
                if (r4 > 0) goto L2e
                return r1
            L2e:
                int r0 = r4 + (-1)
            L30:
                if (r0 <= 0) goto L3b
                boolean r1 = r3.isStartBoundary(r0)
                if (r1 != 0) goto L3b
                int r0 = r0 + (-1)
                goto L30
            L3b:
                int[] r4 = r3.getRange(r0, r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.preceding(int):int[]");
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "", "following", "", "current", "", "preceding", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface TextSegmentIterator {
        @p4.m
        int[] following(int i5);

        @p4.m
        int[] preceding(int i5);
    }

    @StabilityInferred(parameters = 0)
    @kotlin.i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0016R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Ljava/util/Locale;", "locale", "Lkotlin/r2;", "onLocaleChanged", "", "index", "", "isStartBoundary", "isEndBoundary", "isLetterOrDigit", "", "text", "initialize", "current", "", "following", "preceding", "Ljava/text/BreakIterator;", "impl", "Ljava/text/BreakIterator;", "<init>", "(Ljava/util/Locale;)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {

        @p4.m
        private static WordTextSegmentIterator instance;
        private BreakIterator impl;

        @p4.l
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        @kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator$Companion;", "", "()V", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "getInstance", "locale", "Ljava/util/Locale;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
                this();
            }

            @p4.l
            public final WordTextSegmentIterator getInstance(@p4.l Locale locale) {
                if (WordTextSegmentIterator.instance == null) {
                    WordTextSegmentIterator.instance = new WordTextSegmentIterator(locale, null);
                }
                WordTextSegmentIterator wordTextSegmentIterator = WordTextSegmentIterator.instance;
                kotlin.jvm.internal.l0.n(wordTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return wordTextSegmentIterator;
            }
        }

        private WordTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        public /* synthetic */ WordTextSegmentIterator(Locale locale, kotlin.jvm.internal.w wVar) {
            this(locale);
        }

        private final boolean isEndBoundary(int i5) {
            if (i5 > 0 && isLetterOrDigit(i5 - 1) && (i5 == getText().length() || !isLetterOrDigit(i5))) {
                return true;
            }
            return false;
        }

        private final boolean isLetterOrDigit(int i5) {
            if (i5 >= 0 && i5 < getText().length()) {
                return Character.isLetterOrDigit(getText().codePointAt(i5));
            }
            return false;
        }

        private final boolean isStartBoundary(int i5) {
            if (isLetterOrDigit(i5) && (i5 == 0 || !isLetterOrDigit(i5 - 1))) {
                return true;
            }
            return false;
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getWordInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @p4.m
        public int[] following(int i5) {
            if (getText().length() <= 0 || i5 >= getText().length()) {
                return null;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            while (!isLetterOrDigit(i5) && !isStartBoundary(i5)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.l0.S("impl");
                    breakIterator = null;
                }
                i5 = breakIterator.following(i5);
                if (i5 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.l0.S("impl");
                breakIterator2 = null;
            }
            int following = breakIterator2.following(i5);
            if (following == -1 || !isEndBoundary(following)) {
                return null;
            }
            return getRange(i5, following);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(@p4.l String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                kotlin.jvm.internal.l0.S("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @p4.m
        public int[] preceding(int i5) {
            int length = getText().length();
            if (length <= 0 || i5 <= 0) {
                return null;
            }
            if (i5 > length) {
                i5 = length;
            }
            while (i5 > 0 && !isLetterOrDigit(i5 - 1) && !isEndBoundary(i5)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.l0.S("impl");
                    breakIterator = null;
                }
                i5 = breakIterator.preceding(i5);
                if (i5 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.l0.S("impl");
                breakIterator2 = null;
            }
            int preceding = breakIterator2.preceding(i5);
            if (preceding == -1 || !isStartBoundary(preceding)) {
                return null;
            }
            return getRange(preceding, i5);
        }
    }
}
