.class public Lcom/lody/virtual/client/hook/proxies/am/MethodProxies;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$PublishService;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$CheckPermissionForDevice;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$UpdateServiceGroup;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$SetActivityLocusContext;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$SetPictureInPictureParams;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$OverridePendingTransition;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetPackageProcessState;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$isUserRunning;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$CheckGrantUriPermission;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GrantUriPermission;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetActivityClassForToken;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$BroadcastIntent;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$BroadcastIntentWithFeature;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StartNextMatchingActivity;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StartActivityWithConfig;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StopServiceToken;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$SetTaskDescription;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetContentProvider;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiverWithFeature;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetPersistedUriPermissions;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetTasks;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$HandleIncomingUser;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StartActivityAsCaller;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$CheckPermissionWithToken;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$CheckPermission;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StartActivityAsUser;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$KillBackgroundProcesses;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$KillApplicationProcess;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$KillApplication;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetCurrentUserId;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetCurrentUser;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetCallingActivity;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$SetPackageAskScreenCompat;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetRunningAppProcesses;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StartActivityAndWait;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$UnbindService;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StopService;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$PeekService;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$BindServiceInstance;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$BindIsolatedService;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$BindService;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StartService;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetAppTasks;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StartActivityIntentSender;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetIntentForIntentSender;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$IsBackgroundRestricted;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetUidForIntentSender;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$UpdateDeviceOwner;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$ClearApplicationUserData;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$SetServiceForeground;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GrantUriPermissionFromOwner;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetServices;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$PublishContentProviders;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetPackageForIntentSender;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetCallingPackage;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$ShouldUpRecreateTask;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StartActivities;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StartActivity;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetIntentSenderWithSourceToken;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetIntentSender;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetIntentSenderWithFeature;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetPackageAskScreenCompat;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$UnstableProviderDied;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StartVoiceActivity;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetContentProviderExternal;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetPackageForToken;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$AddPackageDependency;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$CrashApplication;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$ForceStopPackage;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$GetRecentTasks;,
        Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$FinishReceiver;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
