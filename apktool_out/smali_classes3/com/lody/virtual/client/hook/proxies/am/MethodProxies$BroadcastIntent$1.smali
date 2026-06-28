.class Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$BroadcastIntent$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$BroadcastIntent;->handleIntent(Landroid/content/Intent;)Landroid/content/Intent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$BroadcastIntent;

.field final synthetic val$receiverInfo:Landroid/content/pm/ActivityInfo;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$BroadcastIntent;Landroid/content/pm/ActivityInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$BroadcastIntent$1;->this$0:Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$BroadcastIntent;

    iput-object p2, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$BroadcastIntent$1;->val$receiverInfo:Landroid/content/pm/ActivityInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Landroid/content/pm/ProviderInfo;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/pm/ProviderInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$BroadcastIntent$1;->val$receiverInfo:Landroid/content/pm/ActivityInfo;

    .line 7
    .line 8
    iget-object v2, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 9
    .line 10
    iput-object v2, v0, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 11
    .line 12
    iget-object v2, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v2, v0, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->processName:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v1, v0, Landroid/content/pm/ProviderInfo;->processName:Ljava/lang/String;

    .line 19
    .line 20
    const-string v1, "_VA_START_PROCESS"

    .line 21
    .line 22
    iput-object v1, v0, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v1, v2, v0}, Lcom/lody/virtual/client/ipc/VActivityManager;->acquireProviderClient(ILandroid/content/pm/ProviderInfo;)Landroid/os/IInterface;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception v0

    .line 37
    const-string v1, "VA"

    .line 38
    .line 39
    invoke-static {v1, v0}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method
