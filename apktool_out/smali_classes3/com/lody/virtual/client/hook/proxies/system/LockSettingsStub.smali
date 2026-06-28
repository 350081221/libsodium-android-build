.class public Lcom/lody/virtual/client/hook/proxies/system/LockSettingsStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/system/LockSettingsStub$EmptyLockSettings;
    }
.end annotation


# static fields
.field private static final SERVICE_NAME:Ljava/lang/String; = "lock_settings"


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Lcom/lody/virtual/client/hook/proxies/system/LockSettingsStub$EmptyLockSettings;

    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/system/LockSettingsStub$EmptyLockSettings;-><init>()V

    const-string v1, "lock_settings"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public inject()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    sget-object v0, Lmirror/android/os/ServiceManager;->checkService:Lmirror/RefStaticMethod;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const-string v3, "lock_settings"

    .line 8
    .line 9
    aput-object v3, v1, v2

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;->inject()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method protected onBindMethods()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 5
    .line 6
    const-string v1, "getRecoveryStatus"

    .line 7
    .line 8
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
