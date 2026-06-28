.class public Lcom/lody/virtual/remote/ServiceData$ServiceBindData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/remote/ServiceData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ServiceBindData"
.end annotation


# instance fields
.field public component:Landroid/content/ComponentName;

.field public connection:Landroid/app/IServiceConnection;

.field public flags:I

.field public info:Landroid/content/pm/ServiceInfo;

.field public intent:Landroid/content/Intent;

.field public userId:I


# direct methods
.method public constructor <init>(Landroid/content/ComponentName;Landroid/content/pm/ServiceInfo;Landroid/content/Intent;IILandroid/app/IServiceConnection;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->component:Landroid/content/ComponentName;

    .line 3
    iput-object p2, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->info:Landroid/content/pm/ServiceInfo;

    .line 4
    iput-object p3, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->intent:Landroid/content/Intent;

    .line 5
    iput p4, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->flags:I

    .line 6
    iput p5, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->userId:I

    .line 7
    iput-object p6, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->connection:Landroid/app/IServiceConnection;

    return-void
.end method

.method public constructor <init>(Landroid/content/Intent;)V
    .locals 3

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "info"

    .line 9
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ServiceInfo;

    iput-object v0, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->info:Landroid/content/pm/ServiceInfo;

    if-eqz v0, :cond_0

    .line 10
    new-instance v0, Landroid/content/ComponentName;

    iget-object v1, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->info:Landroid/content/pm/ServiceInfo;

    iget-object v2, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-direct {v0, v2, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->component:Landroid/content/ComponentName;

    :cond_0
    const-string v0, "intent"

    .line 11
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    iput-object v0, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->intent:Landroid/content/Intent;

    const-string v0, "flags"

    const/4 v1, 0x0

    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->flags:I

    const-string v0, "user_id"

    .line 13
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->userId:I

    const-string v0, "conn"

    .line 14
    invoke-static {p1, v0}, Lcom/lody/virtual/helper/compat/BundleCompat;->getBinder(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 15
    invoke-static {p1}, Landroid/app/IServiceConnection$Stub;->asInterface(Landroid/os/IBinder;)Landroid/app/IServiceConnection;

    move-result-object p1

    iput-object p1, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->connection:Landroid/app/IServiceConnection;

    :cond_1
    return-void
.end method


# virtual methods
.method public saveToIntent(Landroid/content/Intent;)V
    .locals 2

    .line 1
    const-string v0, "info"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->info:Landroid/content/pm/ServiceInfo;

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    const-string v0, "intent"

    .line 9
    .line 10
    iget-object v1, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->intent:Landroid/content/Intent;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    const-string v0, "flags"

    .line 16
    .line 17
    iget v1, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->flags:I

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    const-string v0, "user_id"

    .line 23
    .line 24
    iget v1, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->userId:I

    .line 25
    .line 26
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/lody/virtual/remote/ServiceData$ServiceBindData;->connection:Landroid/app/IServiceConnection;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    const-string v1, "conn"

    .line 34
    .line 35
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {p1, v1, v0}, Lcom/lody/virtual/helper/compat/BundleCompat;->putBinder(Landroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;)V

    .line 40
    .line 41
    .line 42
    :cond_0
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
.end method
