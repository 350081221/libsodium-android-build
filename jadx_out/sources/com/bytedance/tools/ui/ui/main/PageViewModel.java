package com.bytedance.tools.ui.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

/* loaded from: classes2.dex */
public class PageViewModel extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private MutableLiveData<Integer> f6402a;

    /* renamed from: b, reason: collision with root package name */
    private LiveData<String> f6403b;

    /* loaded from: classes2.dex */
    class a implements Function<Integer, String> {
        a() {
        }

        @Override // androidx.arch.core.util.Function
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(Integer num) {
            return "Hello world from section: " + num;
        }
    }

    public PageViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.f6402a = mutableLiveData;
        this.f6403b = Transformations.map(mutableLiveData, new a());
    }
}
