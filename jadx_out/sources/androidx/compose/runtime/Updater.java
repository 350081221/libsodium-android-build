package androidx.compose.runtime;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import t0.b;
import u3.f;
import v3.p;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b)\u0010*JH\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032.\b\b\u0010\n\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0086\b¢\u0006\u0004\b\u000b\u0010\fJI\u0010\r\u001a\u00020\b\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u0004\u001a\u00028\u00012,\u0010\n\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\u000fJH\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032.\b\b\u0010\n\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0086\b¢\u0006\u0004\b\u0010\u0010\fJI\u0010\u0011\u001a\u00020\b\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u0004\u001a\u00028\u00012,\u0010\n\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u0010\u0010\u000fJ&\u0010\u0015\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\t¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0017\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\t¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010#\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010%\u001a\u00020$8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b%\u0010&\u0012\u0004\b'\u0010(\u0088\u0001%\u0092\u0001\u00020$¨\u0006+"}, d2 = {"Landroidx/compose/runtime/Updater;", "T", "", "", b.f22420d, "Lkotlin/Function2;", "Lkotlin/v0;", "name", "Lkotlin/r2;", "Lkotlin/u;", "block", "set-impl", "(Landroidx/compose/runtime/Composer;ILv3/p;)V", "set", "V", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V", "update-impl", "update", "Lkotlin/Function1;", "init-impl", "(Landroidx/compose/runtime/Composer;Lv3/l;)V", "init", "reconcile-impl", "reconcile", "", "toString-impl", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "toString", "hashCode-impl", "(Landroidx/compose/runtime/Composer;)I", TTDownloadField.TT_HASHCODE, "other", "", "equals-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "equals", "Landroidx/compose/runtime/Composer;", "composer", "Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "runtime_release"}, k = 1, mv = {1, 8, 0})
@f
/* loaded from: classes.dex */
public final class Updater<T> {

    @l
    private final Composer composer;

    private /* synthetic */ Updater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Updater m3263boximpl(Composer composer) {
        return new Updater(composer);
    }

    @l
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m3264constructorimpl(@l Composer composer) {
        return composer;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3265equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && l0.g(composer, ((Updater) obj).m3275unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3266equalsimpl0(Composer composer, Composer composer2) {
        return l0.g(composer, composer2);
    }

    @a1
    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3267hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: init-impl, reason: not valid java name */
    public static final void m3268initimpl(Composer composer, @l v3.l<? super T, r2> lVar) {
        if (composer.getInserting()) {
            composer.apply(r2.f19517a, new Updater$init$1(lVar));
        }
    }

    /* renamed from: reconcile-impl, reason: not valid java name */
    public static final void m3269reconcileimpl(Composer composer, @l v3.l<? super T, r2> lVar) {
        composer.apply(r2.f19517a, new Updater$reconcile$1(lVar));
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m3270setimpl(Composer composer, int i5, @l p<? super T, ? super Integer, r2> pVar) {
        if (composer.getInserting() || !l0.g(composer.rememberedValue(), Integer.valueOf(i5))) {
            composer.updateRememberedValue(Integer.valueOf(i5));
            composer.apply(Integer.valueOf(i5), pVar);
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3272toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m3273updateimpl(Composer composer, int i5, @l p<? super T, ? super Integer, r2> pVar) {
        boolean inserting = composer.getInserting();
        if (inserting || !l0.g(composer.rememberedValue(), Integer.valueOf(i5))) {
            composer.updateRememberedValue(Integer.valueOf(i5));
            if (inserting) {
                return;
            }
            composer.apply(Integer.valueOf(i5), pVar);
        }
    }

    public boolean equals(Object obj) {
        return m3265equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m3267hashCodeimpl(this.composer);
    }

    public String toString() {
        return m3272toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Composer m3275unboximpl() {
        return this.composer;
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final <V> void m3271setimpl(Composer composer, V v4, @l p<? super T, ? super V, r2> pVar) {
        if (composer.getInserting() || !l0.g(composer.rememberedValue(), v4)) {
            composer.updateRememberedValue(v4);
            composer.apply(v4, pVar);
        }
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final <V> void m3274updateimpl(Composer composer, V v4, @l p<? super T, ? super V, r2> pVar) {
        boolean inserting = composer.getInserting();
        if (inserting || !l0.g(composer.rememberedValue(), v4)) {
            composer.updateRememberedValue(v4);
            if (inserting) {
                return;
            }
            composer.apply(v4, pVar);
        }
    }
}
