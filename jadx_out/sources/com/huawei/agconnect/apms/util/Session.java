package com.huawei.agconnect.apms.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.agconnect.apms.collect.type.CollectableArray;
import com.huawei.agconnect.apms.ghi;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.t1;
import com.huawei.agconnect.apms.uvw;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class Session extends CollectableArray implements Parcelable {
    public boolean sampled;
    public String sessionId;
    public long sessionTime;
    public static final AgentLog LOG = AgentLogManager.getAgentLog();
    public static final Parcelable.Creator<Session> CREATOR = new abc();

    /* loaded from: classes3.dex */
    public static class abc implements Parcelable.Creator<Session> {
        @Override // android.os.Parcelable.Creator
        public Session createFromParcel(Parcel parcel) {
            return new Session(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public Session[] newArray(int i5) {
            return new Session[0];
        }
    }

    public /* synthetic */ Session(Parcel parcel, abc abcVar) {
        this(parcel);
    }

    public static Session getInstance() {
        String str;
        String replaceAll = UUID.randomUUID().toString().replaceAll("-", "");
        Session session = new Session(replaceAll);
        AgentLog agentLog = LOG;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[2];
        if (session.sampled) {
            str = "sampled";
        } else {
            str = "Non sampled";
        }
        objArr[0] = str;
        objArr[1] = replaceAll;
        agentLog.debug(String.format(locale, "Creating a new %s Session: %s", objArr));
        return session;
    }

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(t1.abc(this.sessionId));
        jSONArray.put(t1.abc(Boolean.valueOf(this.sampled)));
        return jSONArray;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isExpired() {
        if (TimeUnit.MINUTES.toMinutes(this.sessionTime - System.currentTimeMillis()) > uvw.bcd().efg) {
            return true;
        }
        return false;
    }

    public boolean isSampled() {
        return this.sampled;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.sessionId);
        parcel.writeLong(this.sessionTime);
    }

    public Session(String str) {
        this.sessionId = str;
        this.sessionTime = System.currentTimeMillis();
        double random = Math.random();
        float f5 = ghi.def().abc.getFloat("sessions_sampling_percentage", 1.0f) / 100.0f;
        this.sampled = random < ((double) ((0.0f > f5 ? 1 : (0.0f == f5 ? 0 : -1)) <= 0 && (f5 > 1.0f ? 1 : (f5 == 1.0f ? 0 : -1)) <= 0 ? f5 : 0.0f));
    }

    public Session(Parcel parcel) {
        this.sessionId = parcel.readString();
        this.sessionTime = parcel.readLong();
    }
}
