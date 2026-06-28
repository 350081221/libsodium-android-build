.class public Lcom/lody/virtual/os/VBinder;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getBaseCallingUid()I
    .locals 1

    invoke-static {}, Lcom/lody/virtual/os/VBinder;->getCallingUid()I

    move-result v0

    invoke-static {v0}, Lcom/lody/virtual/os/VUserHandle;->getAppId(I)I

    move-result v0

    return v0
.end method

.method public static getCallingPid()I
    .locals 1

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v0

    return v0
.end method

.method public static getCallingUid()I
    .locals 2

    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    move-result-object v0

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/ipc/VActivityManager;->getUidByPid(I)I

    move-result v0

    return v0
.end method

.method public static getCallingUserHandle()Lcom/lody/virtual/os/VUserHandle;
    .locals 1

    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserHandle()Lcom/lody/virtual/os/VUserHandle;

    move-result-object v0

    return-object v0
.end method
