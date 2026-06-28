.class public Lcom/lody/virtual/remote/ServiceData$ServiceStopData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/remote/ServiceData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ServiceStopData"
.end annotation


# instance fields
.field public component:Landroid/content/ComponentName;

.field public startId:I

.field public token:Landroid/os/IBinder;

.field public userId:I


# direct methods
.method public constructor <init>(ILandroid/content/ComponentName;ILandroid/os/IBinder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/lody/virtual/remote/ServiceData$ServiceStopData;->userId:I

    .line 3
    iput-object p2, p0, Lcom/lody/virtual/remote/ServiceData$ServiceStopData;->component:Landroid/content/ComponentName;

    .line 4
    iput p3, p0, Lcom/lody/virtual/remote/ServiceData$ServiceStopData;->startId:I

    .line 5
    iput-object p4, p0, Lcom/lody/virtual/remote/ServiceData$ServiceStopData;->token:Landroid/os/IBinder;

    return-void
.end method

.method public constructor <init>(Landroid/content/Intent;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-virtual {p1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 8
    invoke-static {v0}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/remote/ServiceData$ServiceStopData;->component:Landroid/content/ComponentName;

    :cond_0
    const-string v0, "user_id"

    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/ServiceData$ServiceStopData;->userId:I

    const-string v0, "start_id"

    .line 10
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/ServiceData$ServiceStopData;->startId:I

    const-string v0, "token"

    .line 11
    invoke-static {p1, v0}, Lcom/lody/virtual/helper/compat/BundleCompat;->getBinder(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    iput-object p1, p0, Lcom/lody/virtual/remote/ServiceData$ServiceStopData;->token:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public saveToIntent(Landroid/content/Intent;)V
    .locals 2

    .line 1
    const-string v0, "stop_service"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/lody/virtual/remote/ServiceData$ServiceStopData;->component:Landroid/content/ComponentName;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    const-string v0, "user_id"

    .line 16
    .line 17
    iget v1, p0, Lcom/lody/virtual/remote/ServiceData$ServiceStopData;->userId:I

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    const-string v0, "start_id"

    .line 23
    .line 24
    iget v1, p0, Lcom/lody/virtual/remote/ServiceData$ServiceStopData;->startId:I

    .line 25
    .line 26
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    const-string v0, "token"

    .line 30
    .line 31
    iget-object v1, p0, Lcom/lody/virtual/remote/ServiceData$ServiceStopData;->token:Landroid/os/IBinder;

    .line 32
    .line 33
    invoke-static {p1, v0, v1}, Lcom/lody/virtual/helper/compat/BundleCompat;->putBinder(Landroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;)V

    .line 34
    .line 35
    .line 36
    return-void
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
