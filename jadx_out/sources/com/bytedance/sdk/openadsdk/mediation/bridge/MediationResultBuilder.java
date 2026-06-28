package com.bytedance.sdk.openadsdk.mediation.bridge;

import com.bykv.vk.openvk.api.proto.Result;
import com.bykv.vk.openvk.api.proto.ValueSet;

/* loaded from: classes2.dex */
public class MediationResultBuilder {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5168a = false;

    /* renamed from: b, reason: collision with root package name */
    private int f5169b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f5170c = null;

    /* renamed from: d, reason: collision with root package name */
    private ValueSet f5171d = null;

    /* loaded from: classes2.dex */
    private static final class ResultImpl implements Result {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f5172a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5173b;

        /* renamed from: c, reason: collision with root package name */
        private final String f5174c;

        /* renamed from: d, reason: collision with root package name */
        private final ValueSet f5175d;

        @Override // com.bykv.vk.openvk.api.proto.Result
        public int code() {
            return this.f5173b;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public boolean isSuccess() {
            return this.f5172a;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public String message() {
            return this.f5174c;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public ValueSet values() {
            return this.f5175d;
        }

        private ResultImpl(boolean z4, int i5, String str, ValueSet valueSet) {
            this.f5172a = z4;
            this.f5173b = i5;
            this.f5174c = str;
            this.f5175d = valueSet;
        }
    }

    private MediationResultBuilder() {
    }

    public static final MediationResultBuilder create() {
        return new MediationResultBuilder();
    }

    public Result build() {
        boolean z4 = this.f5168a;
        int i5 = this.f5169b;
        String str = this.f5170c;
        ValueSet valueSet = this.f5171d;
        if (valueSet == null) {
            valueSet = MediationValueSetBuilder.create().build();
        }
        return new ResultImpl(z4, i5, str, valueSet);
    }

    public MediationResultBuilder setCode(int i5) {
        this.f5169b = i5;
        return this;
    }

    public MediationResultBuilder setMessage(String str) {
        this.f5170c = str;
        return this;
    }

    public MediationResultBuilder setSuccess(boolean z4) {
        this.f5168a = z4;
        return this;
    }

    public MediationResultBuilder setValues(ValueSet valueSet) {
        this.f5171d = valueSet;
        return this;
    }
}
