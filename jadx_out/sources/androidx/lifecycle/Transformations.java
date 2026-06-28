package androidx.lifecycle;

import androidx.annotation.CheckResult;
import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.m;
import p4.l;

@i0(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aB\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\u0010\u0005\u001a\u0018\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u00040\u0003H\u0007\u001a8\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0007\u001aJ\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022$\u0010\u0005\u001a \u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0002¢\u0006\u0002\b\u00040\u0003H\u0007\u001a>\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007H\u0007\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¨\u0006\f"}, d2 = {"X", "Y", "Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "Lu3/n;", "transform", "map", "Landroidx/arch/core/util/Function;", "mapFunction", "switchMap", "switchMapFunction", "distinctUntilChanged", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0})
@u3.h(name = "Transformations")
/* loaded from: classes2.dex */
public final class Transformations {
    @u3.h(name = "distinctUntilChanged")
    @l
    @CheckResult
    @MainThread
    public static final <X> LiveData<X> distinctUntilChanged(@l LiveData<X> liveData) {
        l0.p(liveData, "<this>");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        k1.a aVar = new k1.a();
        aVar.element = true;
        if (liveData.isInitialized()) {
            mediatorLiveData.setValue(liveData.getValue());
            aVar.element = false;
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$distinctUntilChanged$1(mediatorLiveData, aVar)));
        return mediatorLiveData;
    }

    @u3.h(name = "map")
    @l
    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> map(@l LiveData<X> liveData, @l v3.l<X, Y> transform) {
        l0.p(liveData, "<this>");
        l0.p(transform, "transform");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        if (liveData.isInitialized()) {
            mediatorLiveData.setValue(transform.invoke(liveData.getValue()));
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$map$1(mediatorLiveData, transform)));
        return mediatorLiveData;
    }

    @u3.h(name = "switchMap")
    @l
    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> switchMap(@l LiveData<X> liveData, @l v3.l<X, LiveData<Y>> transform) {
        LiveData<Y> invoke;
        l0.p(liveData, "<this>");
        l0.p(transform, "transform");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        k1.h hVar = new k1.h();
        if (liveData.isInitialized() && (invoke = transform.invoke(liveData.getValue())) != null && invoke.isInitialized()) {
            mediatorLiveData.setValue(invoke.getValue());
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$1(transform, hVar, mediatorLiveData)));
        return mediatorLiveData;
    }

    @u3.h(name = "map")
    @k(level = m.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @CheckResult
    @MainThread
    public static final /* synthetic */ LiveData map(LiveData liveData, Function mapFunction) {
        l0.p(liveData, "<this>");
        l0.p(mapFunction, "mapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$map$2(mediatorLiveData, mapFunction)));
        return mediatorLiveData;
    }

    @u3.h(name = "switchMap")
    @k(level = m.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @CheckResult
    @MainThread
    public static final /* synthetic */ LiveData switchMap(LiveData liveData, final Function switchMapFunction) {
        l0.p(liveData, "<this>");
        l0.p(switchMapFunction, "switchMapFunction");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer<Object>() { // from class: androidx.lifecycle.Transformations$switchMap$2

            @p4.m
            private LiveData<Object> liveData;

            @p4.m
            public final LiveData<Object> getLiveData() {
                return this.liveData;
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Object obj) {
                LiveData<Object> apply = switchMapFunction.apply(obj);
                LiveData<Object> liveData2 = this.liveData;
                if (liveData2 == apply) {
                    return;
                }
                if (liveData2 != null) {
                    MediatorLiveData<Object> mediatorLiveData2 = mediatorLiveData;
                    l0.m(liveData2);
                    mediatorLiveData2.removeSource(liveData2);
                }
                this.liveData = apply;
                if (apply != null) {
                    MediatorLiveData<Object> mediatorLiveData3 = mediatorLiveData;
                    l0.m(apply);
                    mediatorLiveData3.addSource(apply, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$2$onChanged$1(mediatorLiveData)));
                }
            }

            public final void setLiveData(@p4.m LiveData<Object> liveData2) {
                this.liveData = liveData2;
            }
        });
        return mediatorLiveData;
    }
}
