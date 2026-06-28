package com.bytedance.sdk.openadsdk.mediation.bridge.valueset;

import android.content.Context;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;

/* loaded from: classes2.dex */
public class MediationLoaderConfig {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5229a;

    private MediationLoaderConfig(ValueSet valueSet) {
        if (valueSet != null) {
            ValueSet valueSet2 = (ValueSet) valueSet.objectValue(8424, ValueSet.class);
            if (valueSet2 != null) {
                this.f5229a = valueSet2;
            } else {
                this.f5229a = valueSet;
            }
        }
    }

    private boolean a() {
        ValueSet valueSet = this.f5229a;
        return (valueSet == null || valueSet.isEmpty()) ? false : true;
    }

    public static MediationLoaderConfig create(ValueSet valueSet) {
        return new MediationLoaderConfig(valueSet);
    }

    public String getADNName() {
        return a() ? this.f5229a.stringValue(8003) : "";
    }

    public ValueSet getAdSlotValueSet() {
        if (a()) {
            return (ValueSet) this.f5229a.objectValue(8548, ValueSet.class);
        }
        return null;
    }

    public int getAdType() {
        if (a()) {
            return this.f5229a.intValue(8008);
        }
        return 0;
    }

    public String getClassName() {
        return a() ? this.f5229a.stringValue(8010) : "";
    }

    public Context getContext() {
        if (a()) {
            return (Context) this.f5229a.objectValue(8009, Context.class);
        }
        return null;
    }

    public Bridge getGMCustomAdLoader() {
        if (a()) {
            return (Bridge) this.f5229a.objectValue(8011, Bridge.class);
        }
        return null;
    }

    public ValueSet getMediationCustomServiceConfigValue() {
        if (a()) {
            return (ValueSet) this.f5229a.objectValue(8546, ValueSet.class);
        }
        return null;
    }
}
