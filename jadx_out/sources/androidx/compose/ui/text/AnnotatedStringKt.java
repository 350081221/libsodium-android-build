package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.intl.LocaleList;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.v;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\u001a \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a*\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a*\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a,\u0010\r\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a\u001c\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001aa\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012>\b\u0004\u0010\u0015\u001a8\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00028\u00000\u0010H\u0080\b\u001a\u0014\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u001a\u0014\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u001a\u0014\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u001a\u0014\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u001a?\u0010\"\u001a\u00028\u0000\"\b\b\u0000\u0010\u001d*\u00020\f*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\t2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0002\b!H\u0086\b¢\u0006\u0004\b\"\u0010#\u001aA\u0010\"\u001a\u00028\u0000\"\b\b\u0000\u0010\u001d*\u00020\f*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0002\b!H\u0086\b¢\u0006\u0004\b\"\u0010$\u001aI\u0010(\u001a\u00028\u0000\"\b\b\u0000\u0010\u001d*\u00020\f*\u00020\u001e2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0019\b\u0004\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0002\b!H\u0087\b¢\u0006\u0004\b(\u0010)\u001aA\u0010(\u001a\u00028\u0000\"\b\b\u0000\u0010\u001d*\u00020\f*\u00020\u001e2\u0006\u0010+\u001a\u00020*2\u0019\b\u0004\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0002\b!H\u0087\b¢\u0006\u0004\b(\u0010,\u001aA\u0010(\u001a\u00028\u0000\"\b\b\u0000\u0010\u001d*\u00020\f*\u00020\u001e2\u0006\u0010.\u001a\u00020-2\u0019\b\u0004\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0002\b!H\u0087\b¢\u0006\u0004\b(\u0010/\u001aD\u00101\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u000f2\u0016\u00100\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a\"\u00104\u001a\u00020\u00002\u0006\u00102\u001a\u00020%2\u0006\u00103\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u001a\u0016\u00104\u001a\u00020\u00002\u0006\u00102\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u0001\u001a\"\u00107\u001a\u00020\u00002\u0017\u00106\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002050 ¢\u0006\u0002\b!H\u0086\b\u001a(\u0010=\u001a\u00020<2\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0000\u001a(\u0010B\u001a\u00020<2\u0006\u0010>\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0006H\u0000\u001a\b\u0010C\u001a\u00020\u0000H\u0000\"\u0014\u0010D\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006F"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/ParagraphStyle;", "defaultParagraphStyle", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "normalizedParagraphStyles", "", "start", "end", "Landroidx/compose/ui/text/SpanStyle;", "getLocalSpanStyles", "getLocalParagraphStyles", "", "getLocalAnnotations", "substringWithoutParagraphStyles", "T", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "annotatedString", "paragraphStyle", "block", "mapEachParagraphStyle", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "toUpperCase", "toLowerCase", "capitalize", "decapitalize", "R", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "style", "Lkotlin/Function1;", "Lkotlin/u;", "withStyle", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/SpanStyle;Lv3/l;)Ljava/lang/Object;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/ParagraphStyle;Lv3/l;)Ljava/lang/Object;", "", TTDownloadField.TT_TAG, "annotation", "withAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;Lv3/l;)Ljava/lang/Object;", "Landroidx/compose/ui/text/TtsAnnotation;", "ttsAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/TtsAnnotation;Lv3/l;)Ljava/lang/Object;", "Landroidx/compose/ui/text/UrlAnnotation;", "urlAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/UrlAnnotation;Lv3/l;)Ljava/lang/Object;", "ranges", "filterRanges", "text", "spanStyle", "AnnotatedString", "Lkotlin/r2;", "builder", "buildAnnotatedString", "baseStart", "baseEnd", "targetStart", "targetEnd", "", "contains", "lStart", "lEnd", "rStart", "rEnd", "intersect", "emptyAnnotatedString", "EmptyAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1128:1\n33#2,6:1129\n235#2,3:1135\n33#2,4:1138\n238#2,2:1142\n38#2:1144\n240#2:1145\n151#2,3:1146\n33#2,4:1149\n154#2,2:1153\n38#2:1155\n156#2:1156\n235#2,3:1157\n33#2,4:1160\n238#2,2:1164\n38#2:1166\n240#2:1167\n151#2,3:1168\n33#2,4:1171\n154#2,2:1175\n38#2:1177\n156#2:1178\n235#2,3:1179\n33#2,4:1182\n238#2,2:1186\n38#2:1188\n240#2:1189\n151#2,3:1190\n33#2,4:1193\n154#2,2:1197\n38#2:1199\n156#2:1200\n151#2,3:1201\n33#2,4:1204\n154#2,2:1208\n38#2:1210\n156#2:1211\n235#2,3:1213\n33#2,4:1216\n238#2,2:1220\n38#2:1222\n240#2:1223\n151#2,3:1224\n33#2,4:1227\n154#2,2:1231\n38#2:1233\n156#2:1234\n1#3:1212\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n677#1:1129,6\n713#1:1135,3\n713#1:1138,4\n713#1:1142,2\n713#1:1144\n713#1:1145\n714#1:1146,3\n714#1:1149,4\n714#1:1153,2\n714#1:1155\n714#1:1156\n740#1:1157,3\n740#1:1160,4\n740#1:1164,2\n740#1:1166\n740#1:1167\n741#1:1168,3\n741#1:1171,4\n741#1:1175,2\n741#1:1177\n741#1:1178\n767#1:1179,3\n767#1:1182,4\n767#1:1186,2\n767#1:1188\n767#1:1189\n768#1:1190,3\n768#1:1193,4\n768#1:1197,2\n768#1:1199\n768#1:1200\n804#1:1201,3\n804#1:1204,4\n804#1:1208,2\n804#1:1210\n804#1:1211\n1050#1:1213,3\n1050#1:1216,4\n1050#1:1220,2\n1050#1:1222\n1050#1:1223\n1050#1:1224,3\n1050#1:1227,4\n1050#1:1231,2\n1050#1:1233\n1050#1:1234\n*E\n"})
/* loaded from: classes.dex */
public final class AnnotatedStringKt {

    @l
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, null, 6, null);

    @l
    public static final AnnotatedString AnnotatedString(@l String str, @l SpanStyle spanStyle, @m ParagraphStyle paragraphStyle) {
        List k5;
        k5 = v.k(new AnnotatedString.Range(spanStyle, 0, str.length()));
        return new AnnotatedString(str, k5, paragraphStyle == null ? w.E() : v.k(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    @l
    public static final AnnotatedString buildAnnotatedString(@l v3.l<? super AnnotatedString.Builder, r2> lVar) {
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        lVar.invoke(builder);
        return builder.toAnnotatedString();
    }

    @l
    public static final AnnotatedString capitalize(@l AnnotatedString annotatedString, @l LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new AnnotatedStringKt$capitalize$1(localeList));
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    public static final boolean contains(int i5, int i6, int i7, int i8) {
        if (i5 > i7 || i8 > i6) {
            return false;
        }
        if (i6 == i8) {
            if ((i7 == i8) != (i5 == i6)) {
                return false;
            }
        }
        return true;
    }

    @l
    public static final AnnotatedString decapitalize(@l AnnotatedString annotatedString, @l LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new AnnotatedStringKt$decapitalize$1(localeList));
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    @l
    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i5, int i6) {
        boolean z4;
        if (i5 <= i6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                AnnotatedString.Range<? extends T> range = list.get(i7);
                AnnotatedString.Range<? extends T> range2 = range;
                if (intersect(i5, i6, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i8 = 0; i8 < size2; i8++) {
                AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i8);
                arrayList2.add(new AnnotatedString.Range(range3.getItem(), Math.max(i5, range3.getStart()) - i5, Math.min(i6, range3.getEnd()) - i5, range3.getTag()));
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i5 + ") should be less than or equal to end (" + i6 + ')').toString());
    }

    public static final List<AnnotatedString.Range<? extends Object>> getLocalAnnotations(AnnotatedString annotatedString, int i5, int i6) {
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release;
        int I;
        int I2;
        if (i5 == i6 || (annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release()) == null) {
            return null;
        }
        if (i5 == 0 && i6 >= annotatedString.getText().length()) {
            return annotations$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(annotations$ui_text_release.size());
        int size = annotations$ui_text_release.size();
        for (int i7 = 0; i7 < size; i7++) {
            AnnotatedString.Range<? extends Object> range = annotations$ui_text_release.get(i7);
            AnnotatedString.Range<? extends Object> range2 = range;
            if (intersect(i5, i6, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i8);
            String tag = range3.getTag();
            Object item = range3.getItem();
            I = u.I(range3.getStart(), i5, i6);
            I2 = u.I(range3.getEnd(), i5, i6);
            arrayList2.add(new AnnotatedString.Range(item, I - i5, I2 - i5, tag));
        }
        return arrayList2;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString annotatedString, int i5, int i6) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release;
        int I;
        int I2;
        if (i5 == i6 || (paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i5 == 0 && i6 >= annotatedString.getText().length()) {
            return paragraphStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
        int size = paragraphStylesOrNull$ui_text_release.size();
        for (int i7 = 0; i7 < size; i7++) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i7);
            AnnotatedString.Range<ParagraphStyle> range2 = range;
            if (intersect(i5, i6, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i8);
            Object item = range3.getItem();
            I = u.I(range3.getStart(), i5, i6);
            I2 = u.I(range3.getEnd(), i5, i6);
            arrayList2.add(new AnnotatedString.Range(item, I - i5, I2 - i5));
        }
        return arrayList2;
    }

    public static final List<AnnotatedString.Range<SpanStyle>> getLocalSpanStyles(AnnotatedString annotatedString, int i5, int i6) {
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release;
        int I;
        int I2;
        if (i5 == i6 || (spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i5 == 0 && i6 >= annotatedString.getText().length()) {
            return spanStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
        int size = spanStylesOrNull$ui_text_release.size();
        for (int i7 = 0; i7 < size; i7++) {
            AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i7);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (intersect(i5, i6, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i8);
            Object item = range3.getItem();
            I = u.I(range3.getStart(), i5, i6);
            I2 = u.I(range3.getEnd(), i5, i6);
            arrayList2.add(new AnnotatedString.Range(item, I - i5, I2 - i5));
        }
        return arrayList2;
    }

    public static final boolean intersect(int i5, int i6, int i7, int i8) {
        if (Math.max(i5, i7) >= Math.min(i6, i8) && !contains(i5, i6, i7, i8) && !contains(i7, i8, i5, i6)) {
            return false;
        }
        return true;
    }

    @l
    public static final <T> List<T> mapEachParagraphStyle(@l AnnotatedString annotatedString, @l ParagraphStyle paragraphStyle, @l p<? super AnnotatedString, ? super AnnotatedString.Range<ParagraphStyle>, ? extends T> pVar) {
        List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles = normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(normalizedParagraphStyles.size());
        int size = normalizedParagraphStyles.size();
        for (int i5 = 0; i5 < size; i5++) {
            AnnotatedString.Range<ParagraphStyle> range = normalizedParagraphStyles.get(i5);
            arrayList.add(pVar.invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    @l
    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(@l AnnotatedString annotatedString, @l ParagraphStyle paragraphStyle) {
        int length = annotatedString.getText().length();
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release == null) {
            paragraphStylesOrNull$ui_text_release = w.E();
        }
        ArrayList arrayList = new ArrayList();
        int size = paragraphStylesOrNull$ui_text_release.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i5);
            ParagraphStyle component1 = range.component1();
            int component2 = range.component2();
            int component3 = range.component3();
            if (component2 != i6) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, i6, component2));
            }
            arrayList.add(new AnnotatedString.Range(paragraphStyle.merge(component1), component2, component3));
            i5++;
            i6 = component3;
        }
        if (i6 != length) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, i6, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i5, int i6) {
        String str;
        if (i5 != i6) {
            str = annotatedString.getText().substring(i5, i6);
            l0.o(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        return new AnnotatedString(str, getLocalSpanStyles(annotatedString, i5, i6), null, null, 12, null);
    }

    @l
    public static final AnnotatedString toLowerCase(@l AnnotatedString annotatedString, @l LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new AnnotatedStringKt$toLowerCase$1(localeList));
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    @l
    public static final AnnotatedString toUpperCase(@l AnnotatedString annotatedString, @l LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new AnnotatedStringKt$toUpperCase$1(localeList));
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    @l
    @ExperimentalTextApi
    public static final <R> R withAnnotation(@l AnnotatedString.Builder builder, @l String str, @l String str2, @l v3.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int pushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return lVar.invoke(builder);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            builder.pop(pushStringAnnotation);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    @l
    public static final <R> R withStyle(@l AnnotatedString.Builder builder, @l SpanStyle spanStyle, @l v3.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int pushStyle = builder.pushStyle(spanStyle);
        try {
            return lVar.invoke(builder);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            builder.pop(pushStyle);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    @l
    @ExperimentalTextApi
    public static final <R> R withAnnotation(@l AnnotatedString.Builder builder, @l TtsAnnotation ttsAnnotation, @l v3.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int pushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return lVar.invoke(builder);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            builder.pop(pushTtsAnnotation);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    @l
    public static final <R> R withStyle(@l AnnotatedString.Builder builder, @l ParagraphStyle paragraphStyle, @l v3.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int pushStyle = builder.pushStyle(paragraphStyle);
        try {
            return lVar.invoke(builder);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            builder.pop(pushStyle);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    @l
    public static final AnnotatedString AnnotatedString(@l String str, @l ParagraphStyle paragraphStyle) {
        List E;
        List k5;
        E = w.E();
        k5 = v.k(new AnnotatedString.Range(paragraphStyle, 0, str.length()));
        return new AnnotatedString(str, E, k5);
    }

    @l
    @ExperimentalTextApi
    public static final <R> R withAnnotation(@l AnnotatedString.Builder builder, @l UrlAnnotation urlAnnotation, @l v3.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int pushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return lVar.invoke(builder);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            builder.pop(pushUrlAnnotation);
            kotlin.jvm.internal.i0.c(1);
        }
    }
}
