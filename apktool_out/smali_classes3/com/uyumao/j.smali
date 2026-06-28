.class public Lcom/uyumao/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/uyumao/j$a;
    }
.end annotation


# static fields
.field public static a:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized a()Lcom/uyumao/i;
    .locals 11

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    new-instance v1, Landroid/content/IntentFilter;

    .line 4
    .line 5
    const-string v2, "android.intent.action.BATTERY_CHANGED"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object v2, Lcom/uyumao/j;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {v2, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "level"

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const-string v4, "voltage"

    .line 24
    .line 25
    invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const-string v5, "temperature"

    .line 30
    .line 31
    invoke-virtual {v1, v5, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    const-string v6, "status"

    .line 36
    .line 37
    invoke-virtual {v1, v6, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    const/4 v7, -0x1

    .line 42
    const/4 v8, 0x2

    .line 43
    const/4 v9, 0x1

    .line 44
    if-eq v6, v9, :cond_3

    .line 45
    .line 46
    if-eq v6, v8, :cond_2

    .line 47
    .line 48
    const/4 v10, 0x3

    .line 49
    if-eq v6, v10, :cond_1

    .line 50
    .line 51
    const/4 v10, 0x4

    .line 52
    if-eq v6, v10, :cond_1

    .line 53
    .line 54
    const/4 v10, 0x5

    .line 55
    if-eq v6, v10, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move v7, v8

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move v7, v3

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move v7, v9

    .line 63
    :cond_3
    :goto_0
    const-string v6, "plugged"

    .line 64
    .line 65
    invoke-virtual {v1, v6, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eq v1, v9, :cond_5

    .line 70
    .line 71
    if-eq v1, v8, :cond_4

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    move v3, v8

    .line 75
    goto :goto_1

    .line 76
    :cond_5
    move v3, v9

    .line 77
    :goto_1
    new-instance v1, Lcom/uyumao/i;

    .line 78
    .line 79
    invoke-direct {v1}, Lcom/uyumao/i;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 80
    .line 81
    .line 82
    :try_start_1
    iput v2, v1, Lcom/uyumao/i;->a:I

    .line 83
    .line 84
    iput v4, v1, Lcom/uyumao/i;->b:I

    .line 85
    .line 86
    iput v7, v1, Lcom/uyumao/i;->d:I

    .line 87
    .line 88
    iput v5, v1, Lcom/uyumao/i;->c:I

    .line 89
    .line 90
    iput v3, v1, Lcom/uyumao/i;->e:I

    .line 91
    .line 92
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 93
    .line 94
    .line 95
    move-result-wide v2

    .line 96
    iput-wide v2, v1, Lcom/uyumao/i;->f:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    :catchall_0
    move-object v0, v1

    .line 99
    :catchall_1
    monitor-exit p0

    .line 100
    return-object v0
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method
