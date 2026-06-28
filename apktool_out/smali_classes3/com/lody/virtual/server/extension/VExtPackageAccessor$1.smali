.class Lcom/lody/virtual/server/extension/VExtPackageAccessor$1;
.super Lcom/lody/virtual/helper/IPCHelper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/extension/VExtPackageAccessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/lody/virtual/helper/IPCHelper<",
        "Lcom/lody/virtual/IExtHelperInterface;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/helper/IPCHelper;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic getInterface()Landroid/os/IInterface;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$1;->getInterface()Lcom/lody/virtual/IExtHelperInterface;

    move-result-object v0

    return-object v0
.end method

.method public getInterface()Lcom/lody/virtual/IExtHelperInterface;
    .locals 4

    .line 2
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x3

    if-ge v1, v2, :cond_1

    .line 3
    new-instance v2, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;

    invoke-static {}, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->access$000()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const-string v3, "connect"

    invoke-virtual {v2, v3}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->methodName(Ljava/lang/String;)Lcom/lody/virtual/client/ipc/ProviderCall$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->callSafely()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v0, "_VA_|_binder_"

    .line 4
    invoke-static {v2, v0}, Lcom/lody/virtual/helper/compat/BundleCompat;->getBinder(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/lody/virtual/IExtHelperInterface$Stub;->asInterface(Landroid/os/IBinder;)Lcom/lody/virtual/IExtHelperInterface;

    move-result-object v0

    return-object v0

    .line 6
    :cond_0
    invoke-static {}, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->access$100()V

    const-wide/16 v2, 0xc8

    .line 7
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
