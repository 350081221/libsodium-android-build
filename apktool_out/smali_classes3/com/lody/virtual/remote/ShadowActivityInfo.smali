.class public Lcom/lody/virtual/remote/ShadowActivityInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public info:Landroid/content/pm/ActivityInfo;

.field public intent:Landroid/content/Intent;

.field public userId:I

.field public virtualToken:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroid/content/Intent;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    const-string v0, "_VA_|_intent_"

    .line 7
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    iput-object v0, p0, Lcom/lody/virtual/remote/ShadowActivityInfo;->intent:Landroid/content/Intent;

    const-string v0, "_VA_|_info_"

    .line 8
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ActivityInfo;

    iput-object v0, p0, Lcom/lody/virtual/remote/ShadowActivityInfo;->info:Landroid/content/pm/ActivityInfo;

    const-string v0, "_VA_|_user_id_"

    const/4 v1, -0x1

    .line 9
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/ShadowActivityInfo;->userId:I

    const-string v0, "_VA_|_token_"

    .line 10
    invoke-static {p1, v0}, Lcom/lody/virtual/helper/compat/BundleCompat;->getBinder(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    iput-object p1, p0, Lcom/lody/virtual/remote/ShadowActivityInfo;->virtualToken:Landroid/os/IBinder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Intent;Landroid/content/pm/ActivityInfo;ILandroid/os/IBinder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/lody/virtual/remote/ShadowActivityInfo;->intent:Landroid/content/Intent;

    .line 3
    iput-object p2, p0, Lcom/lody/virtual/remote/ShadowActivityInfo;->info:Landroid/content/pm/ActivityInfo;

    .line 4
    iput p3, p0, Lcom/lody/virtual/remote/ShadowActivityInfo;->userId:I

    .line 5
    iput-object p4, p0, Lcom/lody/virtual/remote/ShadowActivityInfo;->virtualToken:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public saveToIntent(Landroid/content/Intent;)V
    .locals 2

    .line 1
    const-string v0, "_VA_|_intent_"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lody/virtual/remote/ShadowActivityInfo;->intent:Landroid/content/Intent;

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    const-string v0, "_VA_|_info_"

    .line 9
    .line 10
    iget-object v1, p0, Lcom/lody/virtual/remote/ShadowActivityInfo;->info:Landroid/content/pm/ActivityInfo;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    const-string v0, "_VA_|_user_id_"

    .line 16
    .line 17
    iget v1, p0, Lcom/lody/virtual/remote/ShadowActivityInfo;->userId:I

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    const-string v0, "_VA_|_token_"

    .line 23
    .line 24
    iget-object v1, p0, Lcom/lody/virtual/remote/ShadowActivityInfo;->virtualToken:Landroid/os/IBinder;

    .line 25
    .line 26
    invoke-static {p1, v0, v1}, Lcom/lody/virtual/helper/compat/BundleCompat;->putBinder(Landroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;)V

    .line 27
    .line 28
    .line 29
    return-void
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
.end method
