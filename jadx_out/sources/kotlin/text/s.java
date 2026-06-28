package kotlin.text;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000>\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0082\b\u001a\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\u0012\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0002¨\u0006\u0014"}, d2 = {"fromInt", "", "T", "Lkotlin/text/FlagEnum;", "", t0.b.f22420d, "", "findNext", "Lkotlin/text/MatchResult;", "Ljava/util/regex/Matcher;", TypedValues.TransitionType.S_FROM, "input", "", "matchEntire", "range", "Lkotlin/ranges/IntRange;", "Ljava/util/regex/MatchResult;", "groupIndex", "toInt", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,396:1\n1789#2,3:397\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:397,3\n*E\n"})
/* loaded from: classes4.dex */
public final class s {

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "Lkotlin/text/FlagEnum;", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Enum;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,396:1\n*E\n"})
    /* loaded from: classes4.dex */
    static final class a<T> extends kotlin.jvm.internal.n0 implements v3.l<T, Boolean> {
        final /* synthetic */ int $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i5) {
            super(1);
            this.$value = i5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v3.l
        @p4.l
        public final Boolean invoke(Enum r32) {
            i iVar = (i) r32;
            return Boolean.valueOf((this.$value & iVar.getMask()) == iVar.getValue());
        }
    }

    public static final /* synthetic */ p a(Matcher matcher, int i5, CharSequence charSequence) {
        return f(matcher, i5, charSequence);
    }

    public static final /* synthetic */ kotlin.ranges.l c(MatchResult matchResult) {
        return i(matchResult);
    }

    public static final /* synthetic */ kotlin.ranges.l d(MatchResult matchResult, int i5) {
        return j(matchResult, i5);
    }

    public static final p f(Matcher matcher, int i5, CharSequence charSequence) {
        if (matcher.find(i5)) {
            return new q(matcher, charSequence);
        }
        return null;
    }

    private static final /* synthetic */ <T extends Enum<T> & i> Set<T> g(int i5) {
        kotlin.jvm.internal.l0.y(4, "T");
        EnumSet fromInt$lambda$1 = EnumSet.allOf(Enum.class);
        kotlin.jvm.internal.l0.o(fromInt$lambda$1, "fromInt$lambda$1");
        kotlin.jvm.internal.l0.w();
        kotlin.collections.b0.N0(fromInt$lambda$1, new a(i5));
        Set<T> unmodifiableSet = Collections.unmodifiableSet(fromInt$lambda$1);
        kotlin.jvm.internal.l0.o(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        return unmodifiableSet;
    }

    public static final p h(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new q(matcher, charSequence);
        }
        return null;
    }

    public static final kotlin.ranges.l i(MatchResult matchResult) {
        kotlin.ranges.l W1;
        W1 = kotlin.ranges.u.W1(matchResult.start(), matchResult.end());
        return W1;
    }

    public static final kotlin.ranges.l j(MatchResult matchResult, int i5) {
        kotlin.ranges.l W1;
        W1 = kotlin.ranges.u.W1(matchResult.start(i5), matchResult.end(i5));
        return W1;
    }

    public static final int k(Iterable<? extends i> iterable) {
        Iterator<? extends i> it = iterable.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 |= it.next().getValue();
        }
        return i5;
    }
}
