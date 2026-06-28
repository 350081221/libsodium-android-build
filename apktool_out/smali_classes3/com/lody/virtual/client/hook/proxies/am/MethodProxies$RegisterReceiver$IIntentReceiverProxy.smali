.class Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver$IIntentReceiverProxy;
.super Landroid/content/IIntentReceiver$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "IIntentReceiverProxy"
.end annotation


# instance fields
.field mFilter:Landroid/content/IntentFilter;

.field mOld:Landroid/os/IInterface;


# direct methods
.method constructor <init>(Landroid/os/IInterface;Landroid/content/IntentFilter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/IIntentReceiver$Stub;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver$IIntentReceiverProxy;->mOld:Landroid/os/IInterface;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver$IIntentReceiverProxy;->mFilter:Landroid/content/IntentFilter;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method


# virtual methods
.method public performReceive(Landroid/content/Intent;ILjava/lang/String;Landroid/os/Bundle;ZZ)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    .line 5
    invoke-virtual/range {v0 .. v7}, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver$IIntentReceiverProxy;->performReceive(Landroid/content/Intent;ILjava/lang/String;Landroid/os/Bundle;ZZI)V

    return-void
.end method

.method public performReceive(Landroid/content/Intent;ILjava/lang/String;Landroid/os/Bundle;ZZI)V
    .locals 5

    .line 1
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    move-result v0

    invoke-static {v0, p1}, Lcom/lody/virtual/client/env/SpecialComponentList;->unprotectIntent(ILandroid/content/Intent;)Landroid/content/Intent;

    move-result-object p1

    .line 2
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isUpsideDownCake()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move p5, v1

    .line 3
    :cond_0
    sget-object v0, Lmirror/android/content/IIntentReceiverJB;->performReceive:Lmirror/RefMethod;

    iget-object v2, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver$IIntentReceiverProxy;->mOld:Landroid/os/IInterface;

    const/4 v3, 0x7

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v3, v1

    const/4 p1, 0x2

    aput-object p3, v3, p1

    const/4 p1, 0x3

    aput-object p4, v3, p1

    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, v3, p2

    invoke-static {p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 p2, 0x5

    aput-object p1, v3, p2

    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x6

    aput-object p1, v3, p2

    invoke-virtual {v0, v2, v3}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string p2, "VA"

    .line 4
    invoke-static {p2, p1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
