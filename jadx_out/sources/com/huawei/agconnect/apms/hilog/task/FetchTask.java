package com.huawei.agconnect.apms.hilog.task;

import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.hgf;
import com.huawei.agconnect.apms.hilog.task.FetchTask;
import com.huawei.agconnect.apms.jih;
import com.huawei.agconnect.apms.kji;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.wvu;
import com.huawei.agconnect.apms.x1;
import com.huawei.agconnect.remoteconfig.AGConnectConfig;
import com.huawei.agconnect.remoteconfig.ConfigValues;
import com.huawei.hmf.tasks.h;
import com.huawei.hmf.tasks.i;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class FetchTask implements kji {
    public static final AgentLog bcd = AgentLogManager.getAgentLog();
    public final FetchCallback abc;

    /* loaded from: classes3.dex */
    public interface FetchCallback {
        void onReceiveTask(TaskInfo taskInfo);
    }

    public FetchTask(FetchCallback fetchCallback) {
        this.abc = fetchCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bcd(ConfigValues configValues) {
        AGConnectConfig.getInstance().apply(configValues);
        AgentLog agentLog = bcd;
        agentLog.info("FetchTask handleConfig");
        if (configValues == null) {
            agentLog.info("FetchTask config is null");
            return;
        }
        for (int i5 = 0; i5 < 10; i5++) {
            if (configValues.containKey("apms.hilog_task_" + i5)) {
                AgentLog agentLog2 = bcd;
                agentLog2.debug("FetchTask config contains " + i5);
                TaskInfo fromJson = TaskInfo.fromJson(configValues.getValueAsString("apms.hilog_task_" + i5));
                if (fromJson != null) {
                    if (fromJson.isValidateTaskTime()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis < fromJson.getTaskStartTime()) {
                            continue;
                        } else if (currentTimeMillis > fromJson.getTaskEndTime()) {
                            continue;
                        }
                    }
                    if (fromJson.isValidTask(Agent.getUserIdentifier())) {
                        int abc = jih.abc(fromJson);
                        StringBuilder abc2 = abc.abc("FetchTask taskId ");
                        abc2.append(fromJson.getTaskId());
                        abc2.append(", state ");
                        abc2.append(abc);
                        agentLog2.info(abc2.toString());
                        if (abc == 0) {
                            wvu.bcd();
                            HiLogConfig.ghi.abc(fromJson);
                            this.abc.onReceiveTask(fromJson.m6430clone());
                            return;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public void abc() {
        AgentLog agentLog = bcd;
        agentLog.info("FetchTask execute");
        if (x1.cde()) {
            HashMap hashMap = new HashMap();
            hashMap.put("apms.user_id", Agent.getUserIdentifier());
            AGConnectConfig.getInstance().setCustomAttributes(hashMap);
            AGConnectConfig.getInstance().fetch(300L).k(new i() { // from class: u1.b
                @Override // com.huawei.hmf.tasks.i
                public final void onSuccess(Object obj) {
                    FetchTask.this.abc((ConfigValues) obj);
                }
            }).h(new h() { // from class: u1.c
                @Override // com.huawei.hmf.tasks.h
                public final void onFailure(Exception exc) {
                    FetchTask.abc(exc);
                }
            });
            agentLog.debug("FetchTask execute end");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void abc(final ConfigValues configValues) {
        hgf.abc(new Runnable() { // from class: u1.a
            @Override // java.lang.Runnable
            public final void run() {
                FetchTask.this.bcd(configValues);
            }
        });
    }

    public static /* synthetic */ void abc(Exception exc) {
        AgentLog agentLog = bcd;
        StringBuilder abc = abc.abc("FetchTask fetch fail, ");
        abc.append(exc.getMessage());
        agentLog.warn(abc.toString());
    }
}
