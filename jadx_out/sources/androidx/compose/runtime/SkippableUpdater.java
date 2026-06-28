package androidx.compose.runtime;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import u3.f;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\n\u001a\u00020\u00052\u001d\u0010\u0007\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u001c\u0088\u0001\u0019\u0092\u0001\u00020\u0018¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/SkippableUpdater;", "T", "", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Lkotlin/r2;", "Lkotlin/u;", "block", "update-impl", "(Landroidx/compose/runtime/Composer;Lv3/l;)V", "update", "", "toString-impl", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroidx/compose/runtime/Composer;)I", TTDownloadField.TT_HASHCODE, "other", "", "equals-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "equals", "Landroidx/compose/runtime/Composer;", "composer", "Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "runtime_release"}, k = 1, mv = {1, 8, 0})
@f
/* loaded from: classes.dex */
public final class SkippableUpdater<T> {

    @l
    private final Composer composer;

    private /* synthetic */ SkippableUpdater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ SkippableUpdater m3255boximpl(Composer composer) {
        return new SkippableUpdater(composer);
    }

    @l
    /* renamed from: constructor-impl */
    public static <T> Composer m3256constructorimpl(@l Composer composer) {
        return composer;
    }

    /* renamed from: equals-impl */
    public static boolean m3257equalsimpl(Composer composer, Object obj) {
        return (obj instanceof SkippableUpdater) && l0.g(composer, ((SkippableUpdater) obj).m3262unboximpl());
    }

    /* renamed from: equals-impl0 */
    public static final boolean m3258equalsimpl0(Composer composer, Composer composer2) {
        return l0.g(composer, composer2);
    }

    @a1
    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m3259hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: toString-impl */
    public static String m3260toStringimpl(Composer composer) {
        return "SkippableUpdater(composer=" + composer + ')';
    }

    /* renamed from: update-impl */
    public static final void m3261updateimpl(Composer composer, @l v3.l<? super Updater<T>, r2> lVar) {
        composer.startReplaceableGroup(509942095);
        lVar.invoke(Updater.m3263boximpl(Updater.m3264constructorimpl(composer)));
        composer.endReplaceableGroup();
    }

    public boolean equals(Object obj) {
        return m3257equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m3259hashCodeimpl(this.composer);
    }

    public String toString() {
        return m3260toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ Composer m3262unboximpl() {
        return this.composer;
    }
}
