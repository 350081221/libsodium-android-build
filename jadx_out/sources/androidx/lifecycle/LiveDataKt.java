package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.i0;
import kotlin.k;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\b¨\u0006\t"}, d2 = {"T", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Lkotlin/Function1;", "Lkotlin/r2;", "onChanged", "Landroidx/lifecycle/Observer;", "observe", "lifecycle-livedata-core-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LiveDataKt {
    @l
    @k(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    @MainThread
    public static final <T> Observer<T> observe(@l LiveData<T> liveData, @l LifecycleOwner lifecycleOwner, @l final v3.l<? super T, r2> lVar) {
        Observer<T> observer = new Observer() { // from class: androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t5) {
                lVar.invoke(t5);
            }
        };
        liveData.observe(lifecycleOwner, observer);
        return observer;
    }
}
