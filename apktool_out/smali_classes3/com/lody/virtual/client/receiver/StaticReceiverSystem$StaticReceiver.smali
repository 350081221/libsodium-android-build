.class Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/receiver/StaticReceiverSystem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "StaticReceiver"
.end annotation


# instance fields
.field private info:Landroid/content/pm/ActivityInfo;

.field final synthetic this$0:Lcom/lody/virtual/client/receiver/StaticReceiverSystem;


# direct methods
.method public constructor <init>(Lcom/lody/virtual/client/receiver/StaticReceiverSystem;Landroid/content/pm/ActivityInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticReceiver;->this$0:Lcom/lody/virtual/client/receiver/StaticReceiverSystem;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticReceiver;->info:Landroid/content/pm/ActivityInfo;

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
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getFlags()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/high16 v0, 0x40000000    # 2.0f

    .line 6
    .line 7
    and-int/2addr p1, v0

    .line 8
    if-nez p1, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->isInitialStickyBroadcast()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_3

    .line 15
    .line 16
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_3

    .line 21
    .line 22
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lcom/lody/virtual/client/VClient;->getCurrentApplication()Landroid/app/Application;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v0, "_VA_protected_"

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/lody/virtual/client/VClient;->getCurrentApplication()Landroid/app/Application;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p2, p1}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    .line 65
    .line 66
    .line 67
    new-instance p1, Lcom/lody/virtual/remote/BroadcastIntentData;

    .line 68
    .line 69
    invoke-direct {p1, p2}, Lcom/lody/virtual/remote/BroadcastIntentData;-><init>(Landroid/content/Intent;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p1, Lcom/lody/virtual/remote/BroadcastIntentData;->intent:Landroid/content/Intent;

    .line 73
    .line 74
    if-nez v0, :cond_2

    .line 75
    .line 76
    iput-object p2, p1, Lcom/lody/virtual/remote/BroadcastIntentData;->intent:Landroid/content/Intent;

    .line 77
    .line 78
    invoke-virtual {p2}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p1, Lcom/lody/virtual/remote/BroadcastIntentData;->targetPackage:Ljava/lang/String;

    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    if-eqz p2, :cond_3

    .line 93
    .line 94
    iget-object v0, p0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticReceiver;->this$0:Lcom/lody/virtual/client/receiver/StaticReceiverSystem;

    .line 95
    .line 96
    iget-object v1, p0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticReceiver;->info:Landroid/content/pm/ActivityInfo;

    .line 97
    .line 98
    invoke-static {v0, p1, v1, p2}, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->access$100(Lcom/lody/virtual/client/receiver/StaticReceiverSystem;Lcom/lody/virtual/remote/BroadcastIntentData;Landroid/content/pm/ActivityInfo;Landroid/content/BroadcastReceiver$PendingResult;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_3

    .line 103
    .line 104
    :try_start_0
    invoke-virtual {p2}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :catch_0
    move-exception p1

    .line 109
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 110
    .line 111
    .line 112
    :cond_3
    :goto_0
    return-void
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
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
