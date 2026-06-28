package com.bykv.a.a.a.a;

import com.bykv.vk.openvk.api.proto.Result;
import com.bykv.vk.openvk.api.proto.ValueSet;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3098a = false;

    /* renamed from: b, reason: collision with root package name */
    private int f3099b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f3100c = null;

    /* renamed from: d, reason: collision with root package name */
    private ValueSet f3101d = null;

    /* loaded from: classes2.dex */
    private static final class b implements Result {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f3102a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3103b;

        /* renamed from: c, reason: collision with root package name */
        private final String f3104c;

        /* renamed from: d, reason: collision with root package name */
        private final ValueSet f3105d;

        @Override // com.bykv.vk.openvk.api.proto.Result
        public int code() {
            return this.f3103b;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public boolean isSuccess() {
            return this.f3102a;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public String message() {
            return this.f3104c;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public ValueSet values() {
            return this.f3105d;
        }

        private b(boolean z4, int i5, String str, ValueSet valueSet) {
            this.f3102a = z4;
            this.f3103b = i5;
            this.f3104c = str;
            this.f3105d = valueSet;
        }
    }

    private a() {
    }

    public static final a a() {
        return new a();
    }

    public a b(int i5) {
        this.f3099b = i5;
        return this;
    }

    public a c(ValueSet valueSet) {
        this.f3101d = valueSet;
        return this;
    }

    public a d(String str) {
        this.f3100c = str;
        return this;
    }

    public a e(boolean z4) {
        this.f3098a = z4;
        return this;
    }

    public Result f() {
        boolean z4 = this.f3098a;
        int i5 = this.f3099b;
        String str = this.f3100c;
        ValueSet valueSet = this.f3101d;
        if (valueSet == null) {
            valueSet = com.bykv.a.a.a.a.b.a().k();
        }
        return new b(z4, i5, str, valueSet);
    }
}
