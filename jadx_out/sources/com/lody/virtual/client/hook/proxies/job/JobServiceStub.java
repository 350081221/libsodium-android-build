package com.lody.virtual.client.hook.proxies.job;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobWorkItem;
import android.os.Build;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.client.ipc.VJobScheduler;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.compat.JobWorkItemCompat;
import com.lody.virtual.helper.utils.ArrayUtils;
import com.lody.virtual.os.VUserHandle;
import java.lang.reflect.Method;
import java.util.List;
import mirror.android.app.job.IJobScheduler;
import mirror.android.content.pm.ParceledListSlice;

@TargetApi(21)
/* loaded from: classes3.dex */
public class JobServiceStub extends BinderInvocationProxy {

    /* loaded from: classes3.dex */
    private class ScheduleAsPackage extends MethodProxy {
        private ScheduleAsPackage() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            int indexOf = ArrayUtils.indexOf(objArr, JobInfo.class, 0);
            if (indexOf >= 0) {
                JobInfo jobInfo = (JobInfo) objArr[indexOf];
                if (isAppPkg((String) objArr[indexOf + 1])) {
                    return Integer.valueOf(VJobScheduler.get().schedule(jobInfo));
                }
                return 1;
            }
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "scheduleAsPackage";
        }
    }

    /* loaded from: classes3.dex */
    private class cancel extends MethodProxy {
        private cancel() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            VJobScheduler.get().cancel(((Integer) MethodParameterUtils.getFirstParam(objArr, Integer.class)).intValue());
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "cancel";
        }
    }

    /* loaded from: classes3.dex */
    private class cancelAll extends MethodProxy {
        private cancelAll() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            VJobScheduler.get().cancelAll();
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "cancelAll";
        }
    }

    @TargetApi(26)
    /* loaded from: classes3.dex */
    private class enqueue extends MethodProxy {
        private enqueue() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            char c5 = 1;
            char c6 = 2;
            if (objArr.length <= 2) {
                c6 = 1;
                c5 = 0;
            }
            return Integer.valueOf(VJobScheduler.get().enqueue((JobInfo) objArr[c5], JobWorkItemCompat.redirect(VUserHandle.myUserId(), (JobWorkItem) objArr[c6], MethodProxy.getAppPkg())));
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "enqueue";
        }
    }

    /* loaded from: classes3.dex */
    private class getAllPendingJobs extends MethodProxy {
        private getAllPendingJobs() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            List<JobInfo> allPendingJobs = VJobScheduler.get().getAllPendingJobs();
            if (allPendingJobs == null) {
                return null;
            }
            if (BuildCompat.isQ()) {
                return ParceledListSlice.ctorQ.newInstance(allPendingJobs);
            }
            return allPendingJobs;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getAllPendingJobs";
        }
    }

    /* loaded from: classes3.dex */
    private class getPendingJob extends MethodProxy {
        private getPendingJob() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return VJobScheduler.get().getPendingJob(((Integer) MethodParameterUtils.getFirstParam(objArr, Integer.class)).intValue());
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getPendingJob";
        }
    }

    /* loaded from: classes3.dex */
    private class schedule extends MethodProxy {
        private schedule() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Integer.valueOf(VJobScheduler.get().schedule((JobInfo) MethodParameterUtils.getFirstParam(objArr, JobInfo.class)));
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "schedule";
        }
    }

    public JobServiceStub() {
        super(IJobScheduler.Stub.asInterface, "jobscheduler");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new schedule());
        addMethodProxy(new ScheduleAsPackage());
        addMethodProxy(new getAllPendingJobs());
        addMethodProxy(new cancelAll());
        addMethodProxy(new cancel());
        int i5 = Build.VERSION.SDK_INT;
        addMethodProxy(new getPendingJob());
        if (i5 >= 26) {
            addMethodProxy(new enqueue());
        }
    }
}
