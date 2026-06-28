package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontSynthesis_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import p4.l;

@StabilityInferred(parameters = 0)
@k(message = "This is not supported after downloadable fonts.")
@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001#B?\u0012\u0006\u0010\u0017\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u001c\b\u0002\u0010 \u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u001f\u0018\u00010\u001e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J*\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", "Landroid/graphics/Typeface;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getNativeTypeface", "Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher$1", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher", "", "Landroidx/compose/ui/text/font/Font;", "loadedTypefaces", "Ljava/util/Map;", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "Landroid/content/Context;", d.X, "", "Lkotlin/u0;", "necessaryStyles", "<init>", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroid/content/Context;Ljava/util/List;Landroidx/compose/ui/text/font/FontMatcher;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n235#2,3:175\n33#2,4:178\n238#2,2:182\n38#2:184\n240#2:185\n151#2,3:186\n33#2,4:189\n154#2,2:193\n38#2:195\n156#2:196\n461#2,4:197\n33#2,4:201\n465#2,3:205\n38#2:208\n468#2:209\n33#2,6:211\n1#3:210\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n*L\n66#1:175,3\n66#1:178,4\n66#1:182,2\n66#1:184\n66#1:185\n69#1:186,3\n69#1:189,4\n69#1:193,2\n69#1:195\n69#1:196\n71#1:197,4\n71#1:201,4\n71#1:205,3\n71#1:208\n71#1:209\n76#1:211,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidFontListTypeface implements AndroidTypeface {

    @l
    private final FontFamily fontFamily;

    @l
    private final FontMatcher fontMatcher$1;

    @l
    private final Map<Font, Typeface> loadedTypefaces;

    @l
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final FontMatcher fontMatcher = new FontMatcher();

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface$Companion;", "", "()V", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final FontMatcher getFontMatcher() {
            return AndroidFontListTypeface.fontMatcher;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AndroidFontListTypeface(@p4.l androidx.compose.ui.text.font.FontListFontFamily r8, @p4.l android.content.Context r9, @p4.m java.util.List<kotlin.u0<androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle>> r10, @p4.l androidx.compose.ui.text.font.FontMatcher r11) {
        /*
            r7 = this;
            r7.<init>()
            r7.fontMatcher$1 = r11
            java.util.List r11 = r8.getFonts()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            int r1 = r11.size()
            r2 = 0
            r3 = r2
        L18:
            if (r3 >= r1) goto L37
            java.lang.Object r4 = r11.get(r3)
            r5 = r4
            androidx.compose.ui.text.font.Font r5 = (androidx.compose.ui.text.font.Font) r5
            int r5 = r5.mo5601getLoadingStrategyPKNRLFQ()
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r6 = androidx.compose.ui.text.font.FontLoadingStrategy.Companion
            int r6 = r6.m5646getBlockingPKNRLFQ()
            boolean r5 = androidx.compose.ui.text.font.FontLoadingStrategy.m5641equalsimpl0(r5, r6)
            if (r5 == 0) goto L34
            r0.add(r4)
        L34:
            int r3 = r3 + 1
            goto L18
        L37:
            if (r10 == 0) goto La3
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = r10.size()
            r11.<init>(r1)
            int r1 = r10.size()
            r3 = r2
        L47:
            if (r3 >= r1) goto L71
            java.lang.Object r4 = r10.get(r3)
            kotlin.u0 r4 = (kotlin.u0) r4
            java.lang.Object r5 = r4.component1()
            androidx.compose.ui.text.font.FontWeight r5 = (androidx.compose.ui.text.font.FontWeight) r5
            java.lang.Object r4 = r4.component2()
            androidx.compose.ui.text.font.FontStyle r4 = (androidx.compose.ui.text.font.FontStyle) r4
            int r4 = r4.m5657unboximpl()
            androidx.compose.ui.text.font.FontMatcher r6 = r7.fontMatcher$1
            java.util.List r4 = r6.m5650matchFontRetOiIg(r0, r5, r4)
            java.lang.Object r4 = kotlin.collections.u.D2(r4)
            androidx.compose.ui.text.font.Font r4 = (androidx.compose.ui.text.font.Font) r4
            r11.add(r4)
            int r3 = r3 + 1
            goto L47
        L71:
            java.util.List r10 = androidx.compose.ui.util.ListUtilsKt.fastFilterNotNull(r11)
            if (r10 == 0) goto La3
            java.util.HashSet r11 = new java.util.HashSet
            int r1 = r10.size()
            r11.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r10.size()
            r1.<init>(r3)
            int r3 = r10.size()
            r4 = r2
        L8e:
            if (r4 >= r3) goto La4
            java.lang.Object r5 = r10.get(r4)
            r6 = r5
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.ui.text.font.Font) r6
            boolean r6 = r11.add(r6)
            if (r6 == 0) goto La0
            r1.add(r5)
        La0:
            int r4 = r4 + 1
            goto L8e
        La3:
            r1 = 0
        La4:
            if (r1 != 0) goto La7
            goto La8
        La7:
            r0 = r1
        La8:
            boolean r10 = r0.isEmpty()
            r10 = r10 ^ 1
            if (r10 == 0) goto Le9
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            int r11 = r0.size()
        Lb9:
            if (r2 >= r11) goto Le4
            java.lang.Object r1 = r0.get(r2)
            androidx.compose.ui.text.font.Font r1 = (androidx.compose.ui.text.font.Font) r1
            androidx.compose.ui.text.platform.AndroidTypefaceCache r3 = androidx.compose.ui.text.platform.AndroidTypefaceCache.INSTANCE     // Catch: java.lang.Exception -> Lcd
            android.graphics.Typeface r3 = r3.getOrCreate(r9, r1)     // Catch: java.lang.Exception -> Lcd
            r10.put(r1, r3)     // Catch: java.lang.Exception -> Lcd
            int r2 = r2 + 1
            goto Lb9
        Lcd:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Cannot create Typeface from "
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Le4:
            r7.loadedTypefaces = r10
            r7.fontFamily = r8
            return
        Le9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Could not match font"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidFontListTypeface.<init>(androidx.compose.ui.text.font.FontListFontFamily, android.content.Context, java.util.List, androidx.compose.ui.text.font.FontMatcher):void");
    }

    @Override // androidx.compose.ui.text.font.Typeface
    @l
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @l
    public final FontMatcher getFontMatcher() {
        return this.fontMatcher$1;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    @l
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo5786getNativeTypefacePYhJU0U(@l FontWeight fontWeight, int i5, int i6) {
        Object D2;
        D2 = e0.D2(this.fontMatcher$1.m5650matchFontRetOiIg(new ArrayList(this.loadedTypefaces.keySet()), fontWeight, i5));
        Font font = (Font) D2;
        if (font != null) {
            Typeface typeface = this.loadedTypefaces.get(font);
            if (typeface != null) {
                Object m5675synthesizeTypefaceFxwP2eA = FontSynthesis_androidKt.m5675synthesizeTypefaceFxwP2eA(i6, typeface, font, fontWeight, i5);
                l0.n(m5675synthesizeTypefaceFxwP2eA, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) m5675synthesizeTypefaceFxwP2eA;
            }
            throw new IllegalStateException("Could not load typeface".toString());
        }
        throw new IllegalStateException("Could not load font".toString());
    }

    public /* synthetic */ AndroidFontListTypeface(FontListFontFamily fontListFontFamily, Context context, List list, FontMatcher fontMatcher2, int i5, w wVar) {
        this(fontListFontFamily, context, (i5 & 4) != 0 ? null : list, (i5 & 8) != 0 ? fontMatcher : fontMatcher2);
    }
}
