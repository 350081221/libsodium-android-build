package com.huawei.agconnect.apms.collect.model.event.custom;

import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import com.huawei.agconnect.apms.gfe;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class CustomHttpEvent extends HttpEvent {
    public JSONArray attributeArray;

    public CustomHttpEvent(gfe gfeVar, JSONArray jSONArray, JSONArray jSONArray2) {
        super(gfeVar);
        this.eventName = EventType.CUSTOM_HTTP;
        this.attributeArray = jSONArray2;
        this.runtimeEnvInformation.setSessionArray(jSONArray);
    }

    @Override // com.huawei.agconnect.apms.collect.model.event.network.HttpEvent, com.huawei.agconnect.apms.collect.model.event.Event, com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray asJsonArray = super.asJsonArray();
        asJsonArray.put(this.attributeArray);
        return asJsonArray;
    }
}
