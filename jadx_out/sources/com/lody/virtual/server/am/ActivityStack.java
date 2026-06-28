package com.lody.virtual.server.am;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.SharedLibraryInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.lody.virtual.client.IVClient;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.stub.BridgeActivity;
import com.lody.virtual.client.stub.StubManifest;
import com.lody.virtual.helper.collection.SparseArray;
import com.lody.virtual.helper.compat.ObjectsCompat;
import com.lody.virtual.helper.utils.ArrayUtils;
import com.lody.virtual.helper.utils.ClassUtils;
import com.lody.virtual.helper.utils.ComponentUtils;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.remote.AppTaskInfo;
import com.lody.virtual.remote.ShadowActivityInfo;
import com.lody.virtual.server.pm.PackageCacheManager;
import com.lody.virtual.server.pm.parser.PackageParserEx;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import mirror.android.app.ActivityManagerNative;
import mirror.android.app.IActivityManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ActivityStack {
    private static final String TAG = "ActivityStack";
    private static final boolean sTrace = true;
    private final VActivityManagerService mService;
    private final Set<ActivityRecord> mPendingLaunchActivities = Collections.synchronizedSet(new HashSet());
    private final SparseArray<TaskRecord> mHistory = new SparseArray<>();
    private final ActivityManager mAM = (ActivityManager) VirtualCore.get().getContext().getSystemService("activity");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.lody.virtual.server.am.ActivityStack$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$lody$virtual$server$am$ClearTaskAction;

        static {
            int[] iArr = new int[ClearTaskAction.values().length];
            $SwitchMap$com$lody$virtual$server$am$ClearTaskAction = iArr;
            try {
                iArr[ClearTaskAction.TASK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$lody$virtual$server$am$ClearTaskAction[ClearTaskAction.ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$lody$virtual$server$am$ClearTaskAction[ClearTaskAction.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityStack(VActivityManagerService vActivityManagerService) {
        this.mService = vActivityManagerService;
    }

    private static String activityInfoFlagsToString(int i5) {
        StringBuilder sb = new StringBuilder();
        if (containFlags(i5, 1)) {
            sb.append("FLAG_MULTIPROCESS | ");
            i5 = removeFlags(i5, 1);
        }
        if (containFlags(i5, 1048576)) {
            sb.append("FLAG_VISIBLE_TO_INSTANT_APP | ");
            i5 = removeFlags(i5, 1048576);
        }
        if (containFlags(i5, 2)) {
            sb.append("FLAG_FINISH_ON_TASK_LAUNCH | ");
            i5 = removeFlags(i5, 2);
        }
        if (containFlags(i5, 4)) {
            sb.append("FLAG_CLEAR_TASK_ON_LAUNCH | ");
            i5 = removeFlags(i5, 4);
        }
        if (containFlags(i5, 8)) {
            sb.append("FLAG_ALWAYS_RETAIN_TASK_STATE | ");
            i5 = removeFlags(i5, 8);
        }
        if (containFlags(i5, 16)) {
            sb.append("FLAG_STATE_NOT_NEEDED | ");
            i5 = removeFlags(i5, 16);
        }
        if (containFlags(i5, 64)) {
            sb.append("FLAG_ALLOW_TASK_REPARENTING | ");
            i5 = removeFlags(i5, 64);
        }
        if (containFlags(i5, 128)) {
            sb.append("FLAG_NO_HISTORY | ");
            i5 = removeFlags(i5, 128);
        }
        if (containFlags(i5, 256)) {
            sb.append("FLAG_FINISH_ON_CLOSE_SYSTEM_DIALOGS | ");
            i5 = removeFlags(i5, 256);
        }
        if (containFlags(i5, 512)) {
            sb.append("FLAG_HARDWARE_ACCELERATED | ");
            i5 = removeFlags(i5, 512);
        }
        if (containFlags(i5, 1073741824)) {
            sb.append("FLAG_SINGLE_USER | ");
            i5 = removeFlags(i5, 1073741824);
        }
        if (containFlags(i5, 32)) {
            sb.append("FLAG_EXCLUDE_FROM_RECENTS | ");
            i5 = removeFlags(i5, 32);
        }
        if (i5 != 0) {
            sb.append("0x");
            sb.append(Integer.toHexString(i5));
        } else if (sb.length() > 2) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.toString();
    }

    private static String activityInfoToString(ActivityInfo activityInfo) {
        return "launchMode: " + launchModeToString(activityInfo.launchMode) + "\ndocumentLaunchMode: " + documentLaunchModeToString(activityInfo.documentLaunchMode) + "\naffinity: " + activityInfo.taskAffinity + "\nflags: " + activityInfoFlagsToString(activityInfo.flags);
    }

    private static String componentInfoToString(ComponentInfo componentInfo) {
        return componentInfo.packageName + "/" + componentInfo.name;
    }

    private static boolean containFlags(int i5, int i6) {
        return (i5 & i6) != 0;
    }

    private static boolean containFlags(Intent intent, int i5) {
        return (intent.getFlags() & i5) != 0;
    }

    private void deliverNewIntentLocked(ActivityRecord activityRecord, ActivityRecord activityRecord2, Intent intent) {
        String str;
        ProcessRecord processRecord;
        IVClient iVClient;
        if (activityRecord2 == null) {
            return;
        }
        if (activityRecord != null) {
            str = activityRecord.component.getPackageName();
        } else {
            str = SharedLibraryInfo.PLATFORM_PACKAGE_NAME;
        }
        if (activityRecord2.started && (processRecord = activityRecord2.process) != null && (iVClient = processRecord.client) != null) {
            try {
                iVClient.scheduleNewIntent(str, activityRecord2.token, intent);
                return;
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return;
            }
        }
        activityRecord2.pendingNewIntent = new PendingNewIntent(str, intent);
    }

    private static String documentLaunchModeToString(int i5) {
        return i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? "unknown" : "never" : "always" : "intoExisting" : "none";
    }

    private ActivityRecord findActivityByComponentName(TaskRecord taskRecord, ComponentName componentName) {
        synchronized (taskRecord.activities) {
            for (int size = taskRecord.activities.size() - 1; size >= 0; size--) {
                ActivityRecord activityRecord = taskRecord.activities.get(size);
                if (!activityRecord.marked && activityRecord.component.equals(componentName)) {
                    return activityRecord;
                }
            }
            return null;
        }
    }

    private ActivityRecord findActivityByToken(int i5, IBinder iBinder) {
        ActivityRecord activityRecord = null;
        if (iBinder != null) {
            for (int i6 = 0; i6 < this.mHistory.size(); i6++) {
                TaskRecord valueAt = this.mHistory.valueAt(i6);
                if (valueAt.userId == i5) {
                    synchronized (valueAt.activities) {
                        for (ActivityRecord activityRecord2 : valueAt.activities) {
                            if (activityRecord2.token == iBinder) {
                                activityRecord = activityRecord2;
                            }
                        }
                    }
                }
            }
        }
        return activityRecord;
    }

    private TaskRecord findTaskByAffinityLocked(int i5, String str) {
        for (int i6 = 0; i6 < this.mHistory.size(); i6++) {
            TaskRecord valueAt = this.mHistory.valueAt(i6);
            if (i5 == valueAt.userId && str.equals(valueAt.affinity) && !valueAt.isFinishing()) {
                return valueAt;
            }
        }
        return null;
    }

    private TaskRecord findTaskByComponentLocked(int i5, ComponentName componentName) {
        for (int i6 = 0; i6 < this.mHistory.size(); i6++) {
            TaskRecord valueAt = this.mHistory.valueAt(i6);
            if (i5 == valueAt.userId) {
                synchronized (valueAt.activities) {
                    for (ActivityRecord activityRecord : valueAt.activities) {
                        if (!activityRecord.marked && activityRecord.component.equals(componentName)) {
                            return valueAt;
                        }
                    }
                }
            }
        }
        return null;
    }

    private TaskRecord findTaskByIntentLocked(int i5, Intent intent) {
        for (int i6 = 0; i6 < this.mHistory.size(); i6++) {
            TaskRecord valueAt = this.mHistory.valueAt(i6);
            if (i5 == valueAt.userId && valueAt.taskRoot != null && ObjectsCompat.equals(intent.getComponent(), valueAt.taskRoot.getComponent())) {
                return valueAt;
            }
        }
        return null;
    }

    private void finishMarkedActivity() {
        IVClient iVClient;
        synchronized (this.mHistory) {
            int size = this.mHistory.size();
            while (true) {
                int i5 = size - 1;
                if (size > 0) {
                    TaskRecord valueAt = this.mHistory.valueAt(i5);
                    synchronized (valueAt.activities) {
                        Iterator<ActivityRecord> it = valueAt.activities.iterator();
                        while (it.hasNext()) {
                            ActivityRecord next = it.next();
                            if (next.marked && next.started) {
                                try {
                                    ProcessRecord processRecord = next.process;
                                    if (processRecord != null && (iVClient = processRecord.client) != null) {
                                        iVClient.finishActivity(next.token);
                                    }
                                    it.remove();
                                } catch (RemoteException e5) {
                                    e5.printStackTrace();
                                }
                            }
                        }
                    }
                    size = i5;
                }
            }
        }
    }

    private ActivityRecord getCallingRecordLocked(int i5, IBinder iBinder) {
        ActivityRecord findActivityByToken = findActivityByToken(i5, iBinder);
        if (findActivityByToken == null) {
            return null;
        }
        return findActivityByToken(i5, findActivityByToken.resultTo);
    }

    private Intent getStartShadowActivityIntentInner(Intent intent, boolean z4, int i5, int i6, ActivityRecord activityRecord, ActivityInfo activityInfo) {
        TaskRecord taskRecord;
        Intent intent2 = new Intent(intent);
        Intent intent3 = new Intent();
        if (activityInfo.screenOrientation == 3 && (taskRecord = activityRecord.task) != null && taskRecord.getTopActivityRecord() != null) {
            activityInfo.screenOrientation = activityRecord.task.getTopActivityRecord().info.screenOrientation;
        }
        intent3.setClassName(StubManifest.getStubPackageName(z4), selectShadowActivity(i5, activityInfo));
        ComponentName component = intent2.getComponent();
        if (component == null) {
            component = ComponentUtils.toComponentName(activityInfo);
        }
        intent3.setType(component.flattenToString());
        new ShadowActivityInfo(intent2, activityInfo, i6, activityRecord).saveToIntent(intent3);
        return intent3;
    }

    private static String launchModeToString(int i5) {
        return i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? "unknown" : "singleInstance" : "singleTask" : "singleTop" : "standard";
    }

    private ActivityRecord newActivityRecord(int i5, Intent intent, ActivityInfo activityInfo, IBinder iBinder) {
        return new ActivityRecord(i5, intent, activityInfo, iBinder);
    }

    private void optimizeTasksLocked() {
        boolean z4;
        List<ActivityManager.RecentTaskInfo> recentTasksEx = VirtualCore.get().getRecentTasksEx(Integer.MAX_VALUE, 3);
        int size = this.mHistory.size();
        while (true) {
            int i5 = size - 1;
            if (size > 0) {
                TaskRecord valueAt = this.mHistory.valueAt(i5);
                ListIterator<ActivityManager.RecentTaskInfo> listIterator = recentTasksEx.listIterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (listIterator.next().id == valueAt.taskId) {
                            listIterator.remove();
                            z4 = true;
                            break;
                        }
                    } else {
                        z4 = false;
                        break;
                    }
                }
                if (!z4) {
                    this.mHistory.removeAt(i5);
                }
                size = i5;
            } else {
                return;
            }
        }
    }

    private static String parseIntentFlagsToString(Intent intent) {
        int flags = intent.getFlags();
        if (flags == 0) {
            return "0x0";
        }
        StringBuilder sb = new StringBuilder();
        if (containFlags(flags, 268435456)) {
            sb.append("FLAG_ACTIVITY_NEW_TASK | ");
            flags = removeFlags(flags, 268435456);
        }
        if (containFlags(flags, 32768)) {
            sb.append("FLAG_ACTIVITY_CLEAR_TASK | ");
            flags = removeFlags(flags, 32768);
        }
        if (containFlags(flags, PackageParserEx.GET_SIGNING_CERTIFICATES)) {
            sb.append("FLAG_ACTIVITY_MULTIPLE_TASK | ");
            flags = removeFlags(flags, PackageParserEx.GET_SIGNING_CERTIFICATES);
        }
        if (containFlags(flags, 131072)) {
            sb.append("FLAG_ACTIVITY_REORDER_TO_FRONT | ");
            flags = removeFlags(flags, 131072);
        }
        if (containFlags(flags, 131072)) {
            sb.append("FLAG_ACTIVITY_REORDER_TO_FRONT | ");
            flags = removeFlags(flags, 131072);
        }
        if (containFlags(flags, 536870912)) {
            sb.append("FLAG_ACTIVITY_SINGLE_TOP | ");
            flags = removeFlags(flags, 536870912);
        }
        if (containFlags(flags, PackageParserEx.GET_SIGNING_CERTIFICATES)) {
            sb.append("FLAG_ACTIVITY_MULTIPLE_TASK | ");
            flags = removeFlags(flags, PackageParserEx.GET_SIGNING_CERTIFICATES);
        }
        if (containFlags(flags, 33554432)) {
            sb.append("FLAG_ACTIVITY_FORWARD_RESULT | ");
            flags = removeFlags(flags, 33554432);
        }
        if (containFlags(flags, 16384)) {
            sb.append("FLAG_ACTIVITY_TASK_ON_HOME | ");
            flags = removeFlags(flags, 16384);
        }
        if (containFlags(flags, 67108864)) {
            sb.append("FLAG_ACTIVITY_CLEAR_TOP | ");
            flags = removeFlags(flags, 67108864);
        }
        if (containFlags(flags, 262144)) {
            sb.append("FLAG_ACTIVITY_NO_USER_ACTION | ");
            flags = removeFlags(flags, 262144);
        }
        if (containFlags(flags, 8192)) {
            sb.append("FLAG_ACTIVITY_RETAIN_IN_RECENTS | ");
            flags = removeFlags(flags, 8192);
        }
        if (flags != 0) {
            sb.append("0x");
            sb.append(Integer.toHexString(flags));
        } else if (sb.length() >= 2) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.toString();
    }

    private int realStartActivityLocked(IInterface iInterface, IBinder iBinder, Intent intent, String str, int i5, Bundle bundle) {
        Class<?>[] paramList = IActivityManager.startActivity.paramList();
        Object[] objArr = new Object[paramList.length];
        objArr[0] = iInterface;
        int protoIndexOf = ArrayUtils.protoIndexOf(paramList, Intent.class);
        int protoIndexOf2 = ArrayUtils.protoIndexOf(paramList, IBinder.class, 2);
        int protoIndexOf3 = ArrayUtils.protoIndexOf(paramList, Bundle.class);
        int i6 = protoIndexOf + 1;
        objArr[protoIndexOf] = intent;
        objArr[protoIndexOf2] = iBinder;
        objArr[protoIndexOf2 + 1] = str;
        objArr[protoIndexOf2 + 2] = Integer.valueOf(i5);
        if (protoIndexOf3 != -1) {
            objArr[protoIndexOf3] = bundle;
        }
        objArr[i6] = intent.getType();
        objArr[protoIndexOf - 1] = VirtualCore.get().getHostPkg();
        ClassUtils.fixArgs(paramList, objArr);
        try {
            return IActivityManager.startActivity.call(ActivityManagerNative.getDefault.call(new Object[0]), objArr).intValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    private static int removeFlags(int i5, int i6) {
        return i5 & (~i6);
    }

    private static void removeFlags(Intent intent, int i5) {
        intent.setFlags((~i5) & intent.getFlags());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String selectShadowActivity(int r9, android.content.pm.ActivityInfo r10) {
        /*
            r8 = this;
            r0 = 0
            mirror.RefStaticObject<int[]> r1 = mirror.com.android.internal.R_Hide.styleable.Window     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L47
            int[] r1 = (int[]) r1     // Catch: java.lang.Throwable -> L47
            mirror.RefStaticInt r2 = mirror.com.android.internal.R_Hide.styleable.Window_windowIsTranslucent     // Catch: java.lang.Throwable -> L47
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L47
            mirror.RefStaticInt r3 = mirror.com.android.internal.R_Hide.styleable.Window_windowIsFloating     // Catch: java.lang.Throwable -> L47
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L47
            mirror.RefStaticInt r4 = mirror.com.android.internal.R_Hide.styleable.Window_windowShowWallpaper     // Catch: java.lang.Throwable -> L47
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L47
            com.lody.virtual.server.am.AttributeCache r5 = com.lody.virtual.server.am.AttributeCache.instance()     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = r10.packageName     // Catch: java.lang.Throwable -> L47
            int r7 = r10.theme     // Catch: java.lang.Throwable -> L47
            com.lody.virtual.server.am.AttributeCache$Entry r1 = r5.get(r6, r7, r1)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L43
            android.content.res.TypedArray r5 = r1.array     // Catch: java.lang.Throwable -> L47
            if (r5 == 0) goto L43
            boolean r4 = r5.getBoolean(r4, r0)     // Catch: java.lang.Throwable -> L47
            android.content.res.TypedArray r5 = r1.array     // Catch: java.lang.Throwable -> L40
            boolean r2 = r5.getBoolean(r2, r0)     // Catch: java.lang.Throwable -> L40
            android.content.res.TypedArray r1 = r1.array     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.getBoolean(r3, r0)     // Catch: java.lang.Throwable -> L3e
            goto L4e
        L3e:
            r1 = move-exception
            goto L4a
        L40:
            r1 = move-exception
            r2 = r0
            goto L4a
        L43:
            r1 = r0
            r2 = r1
            r4 = r2
            goto L4e
        L47:
            r1 = move-exception
            r2 = r0
            r4 = r2
        L4a:
            r1.printStackTrace()
            r1 = r0
        L4e:
            if (r1 != 0) goto L54
            if (r2 != 0) goto L54
            if (r4 == 0) goto L55
        L54:
            r0 = 1
        L55:
            if (r0 == 0) goto L5c
            java.lang.String r9 = com.lody.virtual.client.stub.StubManifest.getStubDialogName(r9, r10)
            return r9
        L5c:
            java.lang.String r9 = com.lody.virtual.client.stub.StubManifest.getStubActivityName(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.am.ActivityStack.selectShadowActivity(int, android.content.pm.ActivityInfo):java.lang.String");
    }

    private void startActivity(Intent intent, Bundle bundle, boolean z4) {
        ComponentName component = intent.getComponent();
        boolean z5 = true;
        if (component == null || VirtualCore.get().isAppInstalled(component.getPackageName()) ? !z4 || VirtualCore.get().isSharedUserId() : component.getPackageName().equals(StubManifest.PACKAGE_NAME) || component.getPackageName().equals(StubManifest.EXT_PACKAGE_NAME)) {
            z5 = false;
        }
        if (z5) {
            Intent intent2 = new Intent(VirtualCore.get().getContext(), (Class<?>) BridgeActivity.class);
            intent2.setFlags(268435456);
            intent2.putExtra("_VA_|_intent_", intent);
            intent2.putExtra("_VA_|_bundle_", bundle);
            VirtualCore.get().getContext().startActivity(intent2);
            return;
        }
        VirtualCore.get().getContext().startActivity(intent, bundle);
    }

    private int startActivityFromSourceTask(ProcessRecord processRecord, IBinder iBinder, Intent intent, String str, int i5, Bundle bundle) {
        return realStartActivityLocked(processRecord.appThread, iBinder, intent, str, i5, bundle);
    }

    private int startActivityInNewTaskLocked(int i5, int i6, Intent intent, ActivityInfo activityInfo, Bundle bundle) {
        ActivityRecord newActivityRecord = newActivityRecord(i6, intent, activityInfo, null);
        newActivityRecord.options = bundle;
        Intent startActivityProcess = startActivityProcess(i6, newActivityRecord, intent, activityInfo);
        if (startActivityProcess == null) {
            return -1;
        }
        startActivityProcess.addFlags(i5);
        startActivityProcess.addFlags(268435456);
        startActivityProcess.addFlags(PackageParserEx.GET_SIGNING_CERTIFICATES);
        startActivityProcess.addFlags(2097152);
        startActivityProcess.addFlags(524288);
        startActivity(startActivityProcess, bundle, PackageCacheManager.getSetting(activityInfo.packageName).isRunInExtProcess());
        return 0;
    }

    private Intent startActivityProcess(int i5, ActivityRecord activityRecord, Intent intent, ActivityInfo activityInfo) {
        ProcessRecord startProcessIfNeeded = this.mService.startProcessIfNeeded(activityInfo.processName, i5, activityInfo.packageName, -1);
        if (startProcessIfNeeded == null) {
            return null;
        }
        return getStartShadowActivityIntentInner(intent, startProcessIfNeeded.isExt, startProcessIfNeeded.vpid, i5, activityRecord, activityInfo);
    }

    public boolean finishActivityAffinity(int i5, IBinder iBinder) {
        synchronized (this.mHistory) {
            ActivityRecord findActivityByToken = findActivityByToken(i5, iBinder);
            if (findActivityByToken == null) {
                return false;
            }
            String taskAffinity = ComponentUtils.getTaskAffinity(findActivityByToken.info);
            synchronized (findActivityByToken.task.activities) {
                for (int indexOf = findActivityByToken.task.activities.indexOf(findActivityByToken); indexOf >= 0; indexOf--) {
                    ActivityRecord activityRecord = findActivityByToken.task.activities.get(indexOf);
                    if (!ComponentUtils.getTaskAffinity(activityRecord.info).equals(taskAffinity)) {
                        break;
                    }
                    activityRecord.marked = true;
                }
            }
            finishMarkedActivity();
            return false;
        }
    }

    public void finishAllActivities(ProcessRecord processRecord) {
        synchronized (this.mHistory) {
            int size = this.mHistory.size();
            while (true) {
                int i5 = size - 1;
                if (size > 0) {
                    TaskRecord valueAt = this.mHistory.valueAt(i5);
                    synchronized (valueAt.activities) {
                        for (ActivityRecord activityRecord : valueAt.activities) {
                            if (activityRecord.process.pid == processRecord.pid) {
                                activityRecord.marked = true;
                            }
                        }
                    }
                    size = i5;
                }
            }
        }
        finishMarkedActivity();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentName getActivityClassForToken(int i5, IBinder iBinder) {
        synchronized (this.mHistory) {
            ActivityRecord findActivityByToken = findActivityByToken(i5, iBinder);
            if (findActivityByToken != null) {
                return findActivityByToken.component;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentName getCallingActivity(int i5, IBinder iBinder) {
        ActivityRecord callingRecordLocked = getCallingRecordLocked(i5, iBinder);
        if (callingRecordLocked != null) {
            return callingRecordLocked.component;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getCallingPackage(int i5, IBinder iBinder) {
        ActivityRecord callingRecordLocked = getCallingRecordLocked(i5, iBinder);
        if (callingRecordLocked != null) {
            return callingRecordLocked.info.packageName;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getPackageForToken(int i5, IBinder iBinder) {
        synchronized (this.mHistory) {
            ActivityRecord findActivityByToken = findActivityByToken(i5, iBinder);
            if (findActivityByToken != null) {
                return findActivityByToken.info.packageName;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppTaskInfo getTaskInfo(int i5) {
        synchronized (this.mHistory) {
            TaskRecord taskRecord = this.mHistory.get(i5);
            if (taskRecord != null) {
                return taskRecord.getAppTaskInfo();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onActivityCreated(ProcessRecord processRecord, IBinder iBinder, int i5, ActivityRecord activityRecord) {
        VLog.e(TAG, "onActivityCreated " + activityRecord.info + " taskId: " + i5);
        synchronized (this.mHistory) {
            this.mPendingLaunchActivities.remove(activityRecord);
            optimizeTasksLocked();
            TaskRecord taskRecord = this.mHistory.get(i5);
            if (taskRecord == null && (taskRecord = activityRecord.task) == null) {
                taskRecord = new TaskRecord(i5, processRecord.userId, ComponentUtils.getTaskAffinity(activityRecord.info), activityRecord.intent);
                this.mHistory.put(i5, taskRecord);
            }
            TaskRecord taskRecord2 = activityRecord.task;
            if (taskRecord2 != null && taskRecord2 != taskRecord) {
                synchronized (taskRecord2.activities) {
                    activityRecord.task.activities.remove(activityRecord);
                }
            }
            activityRecord.task = taskRecord;
            synchronized (taskRecord.activities) {
                taskRecord.activities.remove(activityRecord);
            }
            ClearTaskAction clearTaskAction = activityRecord.pendingClearAction;
            ClearTaskAction clearTaskAction2 = ClearTaskAction.NONE;
            if (clearTaskAction != clearTaskAction2) {
                performClearTaskLocked(taskRecord, activityRecord.component, clearTaskAction, false);
                activityRecord.pendingClearAction = clearTaskAction2;
            }
            activityRecord.init(taskRecord, processRecord, iBinder);
            taskRecord.activities.add(activityRecord);
            PendingNewIntent pendingNewIntent = activityRecord.pendingNewIntent;
            if (pendingNewIntent != null) {
                try {
                    activityRecord.process.client.scheduleNewIntent(pendingNewIntent.creator, activityRecord.token, pendingNewIntent.intent);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
                activityRecord.pendingNewIntent = null;
            }
            finishMarkedActivity();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityRecord onActivityDestroyed(int i5, IBinder iBinder) {
        ActivityRecord findActivityByToken;
        synchronized (this.mHistory) {
            optimizeTasksLocked();
            findActivityByToken = findActivityByToken(i5, iBinder);
            if (findActivityByToken != null) {
                VLog.e(TAG, "onActivityDestroyed " + findActivityByToken.info + " taskId: " + findActivityByToken.task.taskId);
                findActivityByToken.marked = true;
                synchronized (findActivityByToken.task.activities) {
                    findActivityByToken.task.activities.remove(findActivityByToken);
                }
            }
        }
        return findActivityByToken;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onActivityFinish(int i5, IBinder iBinder) {
        synchronized (this.mHistory) {
            ActivityRecord findActivityByToken = findActivityByToken(i5, iBinder);
            if (findActivityByToken != null) {
                findActivityByToken.marked = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onActivityResumed(int i5, IBinder iBinder) {
        synchronized (this.mHistory) {
            optimizeTasksLocked();
            ActivityRecord findActivityByToken = findActivityByToken(i5, iBinder);
            if (findActivityByToken != null) {
                synchronized (findActivityByToken.task.activities) {
                    findActivityByToken.task.activities.remove(findActivityByToken);
                    findActivityByToken.task.activities.add(findActivityByToken);
                }
            }
        }
    }

    boolean performClearTaskLocked(TaskRecord taskRecord, ComponentName componentName, ClearTaskAction clearTaskAction, boolean z4) {
        boolean z5;
        synchronized (taskRecord.activities) {
            int i5 = AnonymousClass1.$SwitchMap$com$lody$virtual$server$am$ClearTaskAction[clearTaskAction.ordinal()];
            z5 = true;
            boolean z6 = false;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        int size = taskRecord.activities.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                if (taskRecord.activities.get(size).component.equals(componentName)) {
                                    break;
                                }
                                size--;
                            } else {
                                size = -1;
                                break;
                            }
                        }
                        if (size >= 0) {
                            if (z4) {
                                size++;
                            }
                            while (size < taskRecord.activities.size()) {
                                taskRecord.activities.get(size).marked = true;
                                size++;
                            }
                        }
                    }
                } else {
                    ActivityRecord findActivityByComponentName = findActivityByComponentName(taskRecord, componentName);
                    if (findActivityByComponentName != null) {
                        findActivityByComponentName.marked = true;
                    }
                }
            }
            Iterator<ActivityRecord> it = taskRecord.activities.iterator();
            while (it.hasNext()) {
                it.next().marked = true;
                z6 = true;
            }
            z5 = z6;
        }
        return z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void processDied(ProcessRecord processRecord) {
        ProcessRecord processRecord2;
        synchronized (this.mHistory) {
            optimizeTasksLocked();
            int size = this.mHistory.size();
            while (true) {
                int i5 = size - 1;
                if (size > 0) {
                    TaskRecord valueAt = this.mHistory.valueAt(i5);
                    synchronized (valueAt.activities) {
                        Iterator<ActivityRecord> it = valueAt.activities.iterator();
                        while (it.hasNext()) {
                            ActivityRecord next = it.next();
                            if (next.started && ((processRecord2 = next.process) == null || processRecord2.pid == processRecord.pid)) {
                                it.remove();
                                if (valueAt.activities.isEmpty()) {
                                    this.mHistory.remove(valueAt.taskId);
                                }
                            }
                        }
                    }
                    size = i5;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int startActivitiesLocked(int i5, Intent[] intentArr, ActivityInfo[] activityInfoArr, IBinder iBinder, Bundle bundle) {
        for (int i6 = 0; i6 < intentArr.length; i6++) {
            startActivityLocked(i5, intentArr[i6], activityInfoArr[i6], iBinder, bundle, null, 0);
        }
        return 0;
    }

    public int startActivityFromHistoryLocked(Intent intent) {
        boolean z4;
        VLog.e(TAG, "startActivityFromHistory: " + intent);
        synchronized (this.mHistory) {
            ActivityRecord activityRecord = (ActivityRecord) new ShadowActivityInfo(intent).virtualToken;
            if (activityRecord != null && this.mPendingLaunchActivities.contains(activityRecord)) {
                if (activityRecord.task == null) {
                    ComponentName component = intent.getComponent();
                    if (component != null) {
                        z4 = VirtualCore.get().isRunInExtProcess(component.getPackageName());
                    } else {
                        z4 = false;
                    }
                    startActivity(intent, null, z4);
                    return 0;
                }
                ActivityRecord findActivityByToken = findActivityByToken(activityRecord.userId, activityRecord.resultTo);
                if (findActivityByToken == null || findActivityByToken.task != activityRecord.task) {
                    findActivityByToken = activityRecord.task.getTopActivityRecord();
                }
                return startActivityFromSourceTask(findActivityByToken.process, findActivityByToken.token, intent, activityRecord.resultWho, activityRecord.requestCode, activityRecord.options);
            }
            VLog.e(TAG, "record not in pending list.");
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int startActivityLocked(int r24, android.content.Intent r25, android.content.pm.ActivityInfo r26, android.os.IBinder r27, android.os.Bundle r28, java.lang.String r29, int r30) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.am.ActivityStack.startActivityLocked(int, android.content.Intent, android.content.pm.ActivityInfo, android.os.IBinder, android.os.Bundle, java.lang.String, int):int");
    }
}
