.class Lcom/umeng/commonsdk/internal/utils/c$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/commonsdk/internal/utils/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/umeng/commonsdk/internal/utils/c;


# direct methods
.method constructor <init>(Lcom/umeng/commonsdk/internal/utils/c;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/commonsdk/internal/utils/c$1;->a:Lcom/umeng/commonsdk/internal/utils/c;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    .line 1
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "android.intent.action.BATTERY_CHANGED"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_6

    .line 12
    .line 13
    const-string v0, "MobclickRT"

    .line 14
    .line 15
    const-string v1, "ACTION_BATTERY_CHANGED\uff1abattery info cc."

    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "level"

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const-string v2, "voltage"

    .line 28
    .line 29
    invoke-virtual {p2, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const-string v3, "temperature"

    .line 34
    .line 35
    invoke-virtual {p2, v3, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const-string v4, "status"

    .line 40
    .line 41
    invoke-virtual {p2, v4, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const/4 v5, -0x1

    .line 46
    const/4 v6, 0x2

    .line 47
    const/4 v7, 0x1

    .line 48
    if-eq v4, v7, :cond_3

    .line 49
    .line 50
    if-eq v4, v6, :cond_2

    .line 51
    .line 52
    const/4 v8, 0x4

    .line 53
    if-eq v4, v8, :cond_1

    .line 54
    .line 55
    const/4 v8, 0x5

    .line 56
    if-eq v4, v8, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v5, v6

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move v5, v1

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move v5, v7

    .line 64
    :cond_3
    :goto_0
    const-string v4, "plugged"

    .line 65
    .line 66
    invoke-virtual {p2, v4, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-eq p2, v7, :cond_5

    .line 71
    .line 72
    if-eq p2, v6, :cond_4

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    move v1, v6

    .line 76
    goto :goto_1

    .line 77
    :cond_5
    move v1, v7

    .line 78
    :goto_1
    new-instance p2, Lcom/umeng/commonsdk/internal/utils/b;

    .line 79
    .line 80
    invoke-direct {p2}, Lcom/umeng/commonsdk/internal/utils/b;-><init>()V

    .line 81
    .line 82
    .line 83
    iput v0, p2, Lcom/umeng/commonsdk/internal/utils/b;->a:I

    .line 84
    .line 85
    iput v2, p2, Lcom/umeng/commonsdk/internal/utils/b;->b:I

    .line 86
    .line 87
    iput v5, p2, Lcom/umeng/commonsdk/internal/utils/b;->d:I

    .line 88
    .line 89
    iput v3, p2, Lcom/umeng/commonsdk/internal/utils/b;->c:I

    .line 90
    .line 91
    iput v1, p2, Lcom/umeng/commonsdk/internal/utils/b;->e:I

    .line 92
    .line 93
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 94
    .line 95
    .line 96
    move-result-wide v0

    .line 97
    iput-wide v0, p2, Lcom/umeng/commonsdk/internal/utils/b;->f:J

    .line 98
    .line 99
    invoke-static {}, Lcom/umeng/commonsdk/internal/utils/c;->d()Landroid/content/Context;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    const v1, 0x8003

    .line 112
    .line 113
    .line 114
    invoke-static {p1, v1, v0, p2}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/utils/c$1;->a:Lcom/umeng/commonsdk/internal/utils/c;

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/umeng/commonsdk/internal/utils/c;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :catchall_0
    move-exception p1

    .line 124
    invoke-static {}, Lcom/umeng/commonsdk/internal/utils/c;->d()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-static {p2, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    :cond_6
    :goto_2
    return-void
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method
