package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B.\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR+\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\b\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "Landroidx/lifecycle/ViewModel;", "T", "", "Ljava/lang/Class;", "clazz", "Ljava/lang/Class;", "getClazz$lifecycle_viewmodel_release", "()Ljava/lang/Class;", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/u;", "initializer", "Lv3/l;", "getInitializer$lifecycle_viewmodel_release", "()Lv3/l;", "<init>", "(Ljava/lang/Class;Lv3/l;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ViewModelInitializer<T extends ViewModel> {

    @l
    private final Class<T> clazz;

    @l
    private final v3.l<CreationExtras, T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelInitializer(@l Class<T> clazz, @l v3.l<? super CreationExtras, ? extends T> initializer) {
        l0.p(clazz, "clazz");
        l0.p(initializer, "initializer");
        this.clazz = clazz;
        this.initializer = initializer;
    }

    @l
    public final Class<T> getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    @l
    public final v3.l<CreationExtras, T> getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }
}
