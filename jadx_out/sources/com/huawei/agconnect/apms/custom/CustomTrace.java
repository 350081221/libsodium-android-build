package com.huawei.agconnect.apms.custom;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.collect.model.event.custom.CustomEvent;
import com.huawei.agconnect.apms.e1;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.u1;
import com.huawei.agconnect.apms.util.Session;
import com.huawei.agconnect.apms.v1;
import com.huawei.agconnect.apms.x1;
import com.huawei.agconnect.apms.yza;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CustomTrace implements u1, Parcelable {
    public static final int MAX_CUSTOM_TRACE_NAME_LENGTH = 100;
    public static final int MAX_CUSTOM_TRACE_PROPERTIES = 5;
    public static final int MAX_MEASURE_NAME_LENGTH = 100;
    public static final int MAX_PROPERTY_KEY_LENGTH = 40;
    public static final int MAX_PROPERTY_VALUE_LENGTH = 100;
    public static final String NAME_RULE = "^[\\u4e00-\\u9fa5_a-zA-Z0-9]+$";
    public String abc;
    public volatile Long bcd;
    public volatile Long cde;
    public Map<String, String> def;
    public Map<String, TraceMeasure> efg;
    public JSONArray fgh;
    public static final AgentLog ghi = AgentLogManager.getAgentLog();
    public static final Parcelable.Creator<CustomTrace> CREATOR = new abc();

    /* loaded from: classes3.dex */
    public static class abc implements Parcelable.Creator<CustomTrace> {
        @Override // android.os.Parcelable.Creator
        public CustomTrace createFromParcel(Parcel parcel) {
            return new CustomTrace(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public CustomTrace[] newArray(int i5) {
            return new CustomTrace[0];
        }
    }

    public CustomTrace(String str) {
        this.abc = str;
        this.fgh = new JSONArray();
        this.def = new ConcurrentHashMap();
        this.efg = new ConcurrentHashMap();
    }

    public static CustomTrace getInstance(String str) {
        return new CustomTrace(str);
    }

    public final boolean abc() {
        return this.bcd != null;
    }

    @Override // com.huawei.agconnect.apms.u1
    public void addNewSession(Session session) {
        if (session != null && abc() && !bcd()) {
            this.fgh.put(session.asJsonArray());
        }
    }

    public final boolean bcd() {
        return this.cde != null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void finalize() throws Throwable {
        try {
            if (abc() && !bcd()) {
                ghi.warn(String.format(Locale.ENGLISH, "customTrace '%s' is started but not stopped when it is destructed.", this.abc));
            }
        } finally {
            super.finalize();
        }
    }

    public long getMeasure(String str) {
        TraceMeasure traceMeasure;
        if (str == null || str.length() == 0 || (traceMeasure = this.efg.get(str.trim())) == null) {
            return 0L;
        }
        return traceMeasure.bcd();
    }

    public String getProperty(String str) {
        if (str == null) {
            ghi.warn("can't get a property because the property name is null.");
            return "";
        }
        return this.def.get(str.trim());
    }

    public Map<String, String> getTraceProperties() {
        return this.def;
    }

    public void incrementMeasure(String str, long j5) {
        if (Agent.isDisabled()) {
            return;
        }
        String cde = x1.cde(str);
        if (cde != null) {
            ghi.error(String.format(Locale.ENGLISH, "%s, cannot increment measure '%s'. Measure name is invalid.", cde, str));
            return;
        }
        if (!abc()) {
            ghi.warn(String.format(Locale.ENGLISH, "cannot increment measure '%s' for custom trace '%s' which has not been started.", str, this.abc));
        } else if (bcd()) {
            ghi.warn(String.format(Locale.ENGLISH, "cannot increment measure '%s' for custom trace '%s' which has been stopped.", str, this.abc));
        } else {
            abc(str.trim()).abc(j5);
        }
    }

    public void putMeasure(String str, long j5) {
        if (Agent.isDisabled()) {
            return;
        }
        String cde = x1.cde(str);
        if (cde != null) {
            ghi.error(String.format(Locale.ENGLISH, "%s, cannot set measure '%s'. Measure name is invalid.", cde, str));
            return;
        }
        if (!abc()) {
            ghi.warn(String.format(Locale.ENGLISH, "cannot set measure '%s' for custom trace '%s' which has not been started.", str, this.abc));
        } else if (bcd()) {
            ghi.warn(String.format(Locale.ENGLISH, "cannot set measure '%s' for custom trace '%s' which has been stopped.", str, this.abc));
        } else {
            abc(str.trim()).bcd(j5);
        }
    }

    public void putProperty(String str, String str2) {
        if (Agent.isDisabled()) {
            return;
        }
        if (bcd()) {
            Locale locale = Locale.ENGLISH;
            ghi.error(String.format(locale, "%s, can not set property '%s' with value '%s'.", String.format(locale, "customTrace '%s' has been stopped", this.abc), str, str2));
            return;
        }
        String abc2 = x1.abc(this.def, str);
        if (abc2 != null) {
            ghi.error(String.format(Locale.ENGLISH, "%s, can not set property '%s' with value '%s'.", abc2, str, str2));
            return;
        }
        String abc3 = x1.abc(new AbstractMap.SimpleEntry(str, str2));
        if (abc3 != null) {
            ghi.error(String.format(Locale.ENGLISH, "%s, can not set property '%s' with value '%s'.", abc3, str, str2));
        } else {
            this.def.put(str.trim(), str2.trim());
        }
    }

    public void removeProperty(String str) {
        if (Agent.isDisabled()) {
            return;
        }
        if (str == null) {
            ghi.warn("can't remove a property because the property name is null.");
        } else if (bcd()) {
            ghi.error("can't remove a property from a customTrace which has been stopped.");
        } else {
            this.def.remove(str.trim());
        }
    }

    public void start() {
        if (Agent.isDisabled()) {
            return;
        }
        String def = x1.def(this.abc);
        if (def != null) {
            ghi.error(def);
            return;
        }
        if (this.bcd != null) {
            ghi.error(String.format(Locale.ENGLISH, "customTrace '%s' has already started, should not start again.", this.abc));
            return;
        }
        v1.jkl().abc(this);
        Session session = v1.jkl().abc;
        this.fgh.put(session.asJsonArray());
        this.bcd = Long.valueOf(System.currentTimeMillis());
        if (session.isSampled()) {
            e1.cde().abc();
        }
    }

    public void stop() {
        if (Agent.isDisabled()) {
            return;
        }
        if (!abc()) {
            ghi.error(String.format(Locale.ENGLISH, "customTrace '%s' has not been started so unable to stop.", this.abc));
            return;
        }
        if (bcd()) {
            ghi.error(String.format(Locale.ENGLISH, "customTrace '%s' has already stopped, should not stop again.", this.abc));
            return;
        }
        v1.jkl().bcd(this);
        this.cde = Long.valueOf(System.currentTimeMillis());
        long longValue = this.cde.longValue() - this.bcd.longValue();
        long longValue2 = this.bcd.longValue();
        String trim = this.abc.trim();
        JSONArray jSONArray = this.fgh;
        JSONArray jSONArray2 = new JSONArray();
        for (Map.Entry<String, String> entry : this.def.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            } catch (JSONException e5) {
                AgentLog agentLog = ghi;
                StringBuilder abc2 = com.huawei.agconnect.apms.abc.abc("getPropertyArray");
                abc2.append(e5.getMessage());
                agentLog.error(abc2.toString());
            }
            jSONArray2.put(jSONObject);
        }
        JSONArray jSONArray3 = new JSONArray();
        for (Map.Entry<String, TraceMeasure> entry2 : this.efg.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.putOpt(entry2.getValue().abc(), Long.valueOf(entry2.getValue().bcd()));
            } catch (JSONException e6) {
                AgentLog agentLog2 = ghi;
                StringBuilder abc3 = com.huawei.agconnect.apms.abc.abc("getMeasureArray ");
                abc3.append(e6.getMessage());
                agentLog2.error(abc3.toString());
            }
            jSONArray3.put(jSONObject2);
        }
        yza.abc(new CustomEvent(longValue2, trim, longValue, jSONArray, jSONArray2, jSONArray3));
        if (v1.jkl().abc.isSampled()) {
            e1.cde().abc();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.abc);
        parcel.writeLong(this.bcd.longValue());
        parcel.writeLong(this.cde.longValue());
        parcel.writeMap(this.def);
        parcel.writeMap(this.efg);
        parcel.writeValue(this.fgh);
    }

    public final TraceMeasure abc(String str) {
        TraceMeasure traceMeasure = this.efg.get(str);
        if (traceMeasure != null) {
            return traceMeasure;
        }
        TraceMeasure traceMeasure2 = new TraceMeasure(str);
        this.efg.put(str, traceMeasure2);
        return traceMeasure2;
    }

    public /* synthetic */ CustomTrace(Parcel parcel, abc abcVar) {
        this.abc = parcel.readString();
        this.def = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.efg = concurrentHashMap;
        parcel.readMap(concurrentHashMap, TraceMeasure.class.getClassLoader());
        this.bcd = Long.valueOf(parcel.readLong());
        this.cde = Long.valueOf(parcel.readLong());
        this.fgh = new JSONArray();
    }
}
