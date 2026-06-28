.class public Lcom/lody/virtual/client/stub/ShadowPendingService;
.super Landroid/app/Service;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x0

    .line 5
    :try_start_0
    invoke-static {p1, p2}, Lcom/lody/virtual/helper/utils/ComponentUtils;->parseIntentSenderInfo(Landroid/content/Intent;Z)Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    :goto_0
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget p2, p1, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->userId:I

    .line 18
    .line 19
    const/4 p3, -0x1

    .line 20
    if-eq p2, p3, :cond_0

    .line 21
    .line 22
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iget-object p3, p1, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->intent:Landroid/content/Intent;

    .line 27
    .line 28
    iget p1, p1, Lcom/lody/virtual/helper/utils/ComponentUtils$IntentSenderInfo;->userId:I

    .line 29
    .line 30
    invoke-virtual {p2, p0, p3, p1}, Lcom/lody/virtual/client/ipc/VActivityManager;->startService(Landroid/content/Context;Landroid/content/Intent;I)Landroid/content/ComponentName;

    .line 31
    .line 32
    .line 33
    :cond_0
    const/4 p1, 0x2

    .line 34
    return p1
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
.end method
