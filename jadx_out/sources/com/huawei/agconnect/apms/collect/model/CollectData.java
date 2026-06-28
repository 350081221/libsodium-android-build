package com.huawei.agconnect.apms.collect.model;

import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.collect.model.basic.ApplicationInformation;
import com.huawei.agconnect.apms.collect.model.basic.DeviceInformation;
import com.huawei.agconnect.apms.collect.model.basic.PlatformInformation;
import com.huawei.agconnect.apms.collect.model.basic.UserSettingsInformation;
import com.huawei.agconnect.apms.collect.model.event.Events;
import com.huawei.agconnect.apms.collect.model.event.custom.CustomEvent;
import com.huawei.agconnect.apms.collect.model.event.custom.CustomHttpEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.ActivityLoadEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.ActivityRenderEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.ApplicationStartEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.ForeAndBackgroundEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.PageLoadEvent;
import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import com.huawei.agconnect.apms.collect.model.event.resource.CPUMemoryEvent;
import com.huawei.agconnect.apms.collect.type.CollectableArray;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.util.NamedThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class CollectData extends CollectableArray {
    public static final AgentLog LOG = AgentLogManager.getAgentLog();
    public Events<ActivityLoadEvent> activityLoadEvents;
    public Events<ActivityRenderEvent> activityRenderEvents;
    public Events<ApplicationStartEvent> appStartEvents;
    public ApplicationInformation applicationInformation;
    public Events<CPUMemoryEvent> cpuMemoryEvents;
    public Events<CustomEvent> customEvents;
    public Events<CustomHttpEvent> customHttpEvents;
    public DeviceInformation deviceInformation;
    public final ExecutorService executor;
    public Events<ForeAndBackgroundEvent> foreAndBackgroundEvents;
    public Events<HttpEvent> httpEvents;
    public boolean isValid;
    public Events<PageLoadEvent> pageLoadEvents;
    public PlatformInformation platformInformation;
    public UserSettingsInformation userSettingsInformation;

    public CollectData() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("CollectData"));
        this.executor = newSingleThreadExecutor;
        this.isValid = false;
        newSingleThreadExecutor.execute(new Runnable() { // from class: com.huawei.agconnect.apms.collect.model.CollectData.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    CollectData.this.deviceInformation = Agent.getDeviceInformation();
                } catch (Throwable th) {
                    abc.abc(th, abc.abc("failed to get DeviceInformation: "), CollectData.LOG);
                }
                try {
                    CollectData.this.platformInformation = Agent.getPlatformInformation();
                } catch (Throwable th2) {
                    abc.abc(th2, abc.abc("failed to get PlatformInformation: "), CollectData.LOG);
                }
                try {
                    CollectData.this.userSettingsInformation = Agent.getUserSettingsInformation();
                } catch (Throwable th3) {
                    abc.abc(th3, abc.abc("failed to get SettingsInformation: "), CollectData.LOG);
                }
                CollectData.this.applicationInformation = Agent.getApplicationInformation();
            }
        });
        this.appStartEvents = new Events<>();
        this.activityLoadEvents = new Events<>();
        this.pageLoadEvents = new Events<>();
        this.activityRenderEvents = new Events<>();
        this.httpEvents = new Events<>();
        this.foreAndBackgroundEvents = new Events<>();
        this.customEvents = new Events<>();
        this.customHttpEvents = new Events<>();
        this.cpuMemoryEvents = new Events<>();
    }

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        DeviceInformation deviceInformation = this.deviceInformation;
        if (deviceInformation != null) {
            jSONArray.put(deviceInformation.asJsonArray());
        }
        PlatformInformation platformInformation = this.platformInformation;
        if (platformInformation != null) {
            jSONArray.put(platformInformation.asJsonArray());
        }
        UserSettingsInformation userSettingsInformation = this.userSettingsInformation;
        if (userSettingsInformation != null) {
            jSONArray.put(userSettingsInformation.asJsonArray());
        }
        ApplicationInformation applicationInformation = this.applicationInformation;
        if (applicationInformation != null) {
            jSONArray.put(applicationInformation.asJsonArray());
        }
        jSONArray.put(this.appStartEvents.asJsonArray());
        jSONArray.put(this.activityLoadEvents.asJsonArray());
        jSONArray.put(this.activityRenderEvents.asJsonArray());
        jSONArray.put(this.httpEvents.asJsonArray());
        jSONArray.put(this.foreAndBackgroundEvents.asJsonArray());
        jSONArray.put(this.customEvents.asJsonArray());
        jSONArray.put(this.customHttpEvents.asJsonArray());
        jSONArray.put(this.cpuMemoryEvents.asJsonArray());
        return jSONArray;
    }

    public Events<ActivityLoadEvent> getActivityLoadEvents() {
        return this.activityLoadEvents;
    }

    public Events<ActivityRenderEvent> getActivityRenderEvents() {
        return this.activityRenderEvents;
    }

    public Events<ApplicationStartEvent> getAppStartEvents() {
        return this.appStartEvents;
    }

    public ApplicationInformation getApplicationInformation() {
        return this.applicationInformation;
    }

    public Events<CPUMemoryEvent> getCpuMemoryEvents() {
        return this.cpuMemoryEvents;
    }

    public Events<CustomEvent> getCustomEvents() {
        return this.customEvents;
    }

    public Events<CustomHttpEvent> getCustomHttpEvents() {
        return this.customHttpEvents;
    }

    public DeviceInformation getDeviceInformation() {
        return this.deviceInformation;
    }

    public int getEventCount() {
        return this.pageLoadEvents.count() + this.cpuMemoryEvents.count() + this.customHttpEvents.count() + this.customEvents.count() + this.foreAndBackgroundEvents.count() + this.httpEvents.count() + this.activityRenderEvents.count() + this.activityLoadEvents.count() + this.appStartEvents.count();
    }

    public Events<ForeAndBackgroundEvent> getForeAndBackgroundEvents() {
        return this.foreAndBackgroundEvents;
    }

    public Events<HttpEvent> getHttpEvents() {
        return this.httpEvents;
    }

    public Events<PageLoadEvent> getPageLoadEvents() {
        return this.pageLoadEvents;
    }

    public PlatformInformation getPlatformInformation() {
        return this.platformInformation;
    }

    public UserSettingsInformation getUserSettingsInformation() {
        return this.userSettingsInformation;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public void reset() {
        this.appStartEvents.clear();
        this.activityLoadEvents.clear();
        this.pageLoadEvents.clear();
        this.activityRenderEvents.clear();
        this.httpEvents.clear();
        this.foreAndBackgroundEvents.clear();
        this.customEvents.clear();
        this.customHttpEvents.clear();
        this.cpuMemoryEvents.clear();
    }

    public void setValid(boolean z4) {
        this.isValid = z4;
    }

    public void shutDownCollectData() {
        ExecutorService executorService = this.executor;
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
    }
}
