package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.State;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0002\u001a\u00020\u00038G¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily;", "", "canLoadSynchronously", "", "(Z)V", "getCanLoadSynchronously$annotations", "()V", "getCanLoadSynchronously", "()Z", "Companion", "Resolver", "Landroidx/compose/ui/text/font/FileBasedFontFamily;", "Landroidx/compose/ui/text/font/LoadedFontFamily;", "Landroidx/compose/ui/text/font/SystemFontFamily;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public abstract class FontFamily {
    public static final int $stable = 0;
    private final boolean canLoadSynchronously;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final SystemFontFamily Default = new DefaultFontFamily();

    @l
    private static final GenericFontFamily SansSerif = new GenericFontFamily("sans-serif", "FontFamily.SansSerif");

    @l
    private static final GenericFontFamily Serif = new GenericFontFamily("serif", "FontFamily.Serif");

    @l
    private static final GenericFontFamily Monospace = new GenericFontFamily("monospace", "FontFamily.Monospace");

    @l
    private static final GenericFontFamily Cursive = new GenericFontFamily("cursive", "FontFamily.Cursive");

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily$Companion;", "", "()V", "Cursive", "Landroidx/compose/ui/text/font/GenericFontFamily;", "getCursive", "()Landroidx/compose/ui/text/font/GenericFontFamily;", "Default", "Landroidx/compose/ui/text/font/SystemFontFamily;", "getDefault", "()Landroidx/compose/ui/text/font/SystemFontFamily;", "Monospace", "getMonospace", "SansSerif", "getSansSerif", "Serif", "getSerif", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final GenericFontFamily getCursive() {
            return FontFamily.Cursive;
        }

        @l
        public final SystemFontFamily getDefault() {
            return FontFamily.Default;
        }

        @l
        public final GenericFontFamily getMonospace() {
            return FontFamily.Monospace;
        }

        @l
        public final GenericFontFamily getSansSerif() {
            return FontFamily.SansSerif;
        }

        @l
        public final GenericFontFamily getSerif() {
            return FontFamily.Serif;
        }
    }

    @i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006JB\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0011ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily$Resolver;", "", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "Lkotlin/r2;", "preload", "(Landroidx/compose/ui/text/font/FontFamily;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/runtime/State;", "resolve-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "resolve", "Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public interface Resolver {
        /* renamed from: resolve-DPcqOEQ$default, reason: not valid java name */
        static /* synthetic */ State m5628resolveDPcqOEQ$default(Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i5, int i6, int i7, Object obj) {
            if (obj == null) {
                if ((i7 & 1) != 0) {
                    fontFamily = null;
                }
                if ((i7 & 2) != 0) {
                    fontWeight = FontWeight.Companion.getNormal();
                }
                if ((i7 & 4) != 0) {
                    i5 = FontStyle.Companion.m5661getNormal_LCdwA();
                }
                if ((i7 & 8) != 0) {
                    i6 = FontSynthesis.Companion.m5671getAllGVVA2EU();
                }
                return resolver.mo5629resolveDPcqOEQ(fontFamily, fontWeight, i5, i6);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
        }

        @m
        Object preload(@l FontFamily fontFamily, @l d<? super r2> dVar);

        @l
        /* renamed from: resolve-DPcqOEQ, reason: not valid java name */
        State<Object> mo5629resolveDPcqOEQ(@m FontFamily fontFamily, @l FontWeight fontWeight, int i5, int i6);
    }

    private FontFamily(boolean z4) {
        this.canLoadSynchronously = z4;
    }

    public /* synthetic */ FontFamily(boolean z4, w wVar) {
        this(z4);
    }

    public static /* synthetic */ void getCanLoadSynchronously$annotations() {
    }

    @k(level = kotlin.m.ERROR, message = "Unused property that has no meaning. Do not use.")
    public final boolean getCanLoadSynchronously() {
        return this.canLoadSynchronously;
    }
}
