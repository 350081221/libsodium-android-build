.class final Lcom/uc/crashsdk/e$c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/uc/crashsdk/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/uc/crashsdk/e$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "android.intent.action.BATTERY_CHANGED"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const-string p1, "level"

    .line 14
    .line 15
    const/4 v0, -0x1

    .line 16
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Lcom/uc/crashsdk/e;->c(I)I

    .line 21
    .line 22
    .line 23
    const-string p1, "scale"

    .line 24
    .line 25
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {p1}, Lcom/uc/crashsdk/e;->d(I)I

    .line 30
    .line 31
    .line 32
    const-string p1, "voltage"

    .line 33
    .line 34
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-static {p1}, Lcom/uc/crashsdk/e;->e(I)I

    .line 39
    .line 40
    .line 41
    const-string p1, "health"

    .line 42
    .line 43
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-static {p1}, Lcom/uc/crashsdk/e;->f(I)I

    .line 48
    .line 49
    .line 50
    const-string p1, "plugged"

    .line 51
    .line 52
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-static {p1}, Lcom/uc/crashsdk/e;->g(I)I

    .line 57
    .line 58
    .line 59
    const-string p1, "status"

    .line 60
    .line 61
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-static {p1}, Lcom/uc/crashsdk/e;->h(I)I

    .line 66
    .line 67
    .line 68
    const-string p1, "temperature"

    .line 69
    .line 70
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-static {p1}, Lcom/uc/crashsdk/e;->i(I)I

    .line 75
    .line 76
    .line 77
    const-string p1, "technology"

    .line 78
    .line 79
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Lcom/uc/crashsdk/e;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    invoke-static {}, Lcom/uc/crashsdk/e;->J()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    const/4 p2, 0x2

    .line 91
    if-lt p1, p2, :cond_2

    .line 92
    .line 93
    invoke-static {}, Lcom/uc/crashsdk/e;->K()V

    .line 94
    .line 95
    .line 96
    invoke-static {}, Lcom/uc/crashsdk/e;->L()I

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_0
    const-string p2, "android.intent.action.BATTERY_LOW"

    .line 101
    .line 102
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_3

    .line 107
    .line 108
    const-string v1, "android.intent.action.BATTERY_OKAY"

    .line 109
    .line 110
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    const-string p2, "android.intent.action.ANR"

    .line 118
    .line 119
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-eqz p2, :cond_2

    .line 124
    .line 125
    :try_start_0
    invoke-static {p1}, Lcom/uc/crashsdk/e;->c(Landroid/content/Context;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :catchall_0
    move-exception p1

    .line 130
    invoke-static {p1}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    :cond_2
    return-void

    .line 134
    :cond_3
    :goto_0
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    invoke-static {p1}, Lcom/uc/crashsdk/e;->g(Z)Z

    .line 139
    .line 140
    .line 141
    invoke-static {}, Lcom/uc/crashsdk/e;->K()V

    .line 142
    .line 143
    .line 144
    return-void
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
