.class public Lcom/lody/virtual/server/pm/VAppInstallerSession;
.super Lcom/lody/virtual/server/app/IAppInstallerSession$Stub;
.source "SourceFile"


# instance fields
.field private mApp:Lcom/lody/virtual/server/pm/VAppManagerService;

.field private mCacneled:Z

.field private mCommited:Z

.field private mContext:Landroid/content/Context;

.field private final mSplitUris:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private mStatusReceiver:Landroid/content/IntentSender;

.field private final mUris:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/lody/virtual/server/pm/VAppManagerService;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/server/app/IAppInstallerSession$Stub;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/lody/virtual/server/pm/VAppInstallerSession;->mCommited:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/lody/virtual/server/pm/VAppInstallerSession;->mCacneled:Z

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/lody/virtual/server/pm/VAppInstallerSession;->mUris:Ljava/util/List;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/lody/virtual/server/pm/VAppInstallerSession;->mSplitUris:Ljava/util/List;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lcom/lody/virtual/server/pm/VAppInstallerSession;->mStatusReceiver:Landroid/content/IntentSender;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/lody/virtual/server/pm/VAppInstallerSession;->mContext:Landroid/content/Context;

    .line 27
    .line 28
    iput-object p2, p0, Lcom/lody/virtual/server/pm/VAppInstallerSession;->mApp:Lcom/lody/virtual/server/pm/VAppManagerService;

    .line 29
    .line 30
    return-void
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
.method public addPackage(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/server/pm/VAppInstallerSession;->mUris:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addSplit(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/server/pm/VAppInstallerSession;->mSplitUris:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public cancel()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/lody/virtual/server/pm/VAppInstallerSession;->mCommited:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/lody/virtual/server/pm/VAppInstallerSession;->mCacneled:Z

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v1, "Session that have already been committed cannot be cancelled."

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public commit(Landroid/content/IntentSender;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/lody/virtual/server/pm/VAppInstallerSession;->mCacneled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/lody/virtual/server/pm/VAppInstallerSession;->mCommited:Z

    .line 7
    .line 8
    iput-object p1, p0, Lcom/lody/virtual/server/pm/VAppInstallerSession;->mStatusReceiver:Landroid/content/IntentSender;

    .line 9
    .line 10
    :try_start_0
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VAppInstallerSession;->mContext:Landroid/content/Context;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    new-instance v4, Landroid/content/Intent;

    .line 14
    .line 15
    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v1, p1

    .line 21
    invoke-virtual/range {v1 .. v6}, Landroid/content/IntentSender;->sendIntent(Landroid/content/Context;ILandroid/content/Intent;Landroid/content/IntentSender$OnFinished;Landroid/os/Handler;)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "A canceled session cannot be committed."

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
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
