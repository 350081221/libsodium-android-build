.class public Lcom/lody/virtual/remote/BroadcastIntentData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public intent:Landroid/content/Intent;

.field public targetPackage:Ljava/lang/String;

.field public userId:I


# direct methods
.method public constructor <init>(ILandroid/content/Intent;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/lody/virtual/remote/BroadcastIntentData;->userId:I

    .line 3
    iput-object p2, p0, Lcom/lody/virtual/remote/BroadcastIntentData;->intent:Landroid/content/Intent;

    .line 4
    iput-object p3, p0, Lcom/lody/virtual/remote/BroadcastIntentData;->targetPackage:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Intent;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "_VA_|_user_id_"

    const/4 v1, -0x1

    .line 6
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/BroadcastIntentData;->userId:I

    const-string v0, "_VA_|_intent_"

    .line 7
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    iput-object v0, p0, Lcom/lody/virtual/remote/BroadcastIntentData;->intent:Landroid/content/Intent;

    const-string v0, "_VA_|_target_pkg_"

    .line 8
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/lody/virtual/remote/BroadcastIntentData;->targetPackage:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public saveIntent(Landroid/content/Intent;)V
    .locals 2

    .line 1
    const-string v0, "_VA_|_user_id_"

    .line 2
    .line 3
    iget v1, p0, Lcom/lody/virtual/remote/BroadcastIntentData;->userId:I

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    const-string v0, "_VA_|_intent_"

    .line 9
    .line 10
    iget-object v1, p0, Lcom/lody/virtual/remote/BroadcastIntentData;->intent:Landroid/content/Intent;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    const-string v0, "_VA_|_target_pkg_"

    .line 16
    .line 17
    iget-object v1, p0, Lcom/lody/virtual/remote/BroadcastIntentData;->targetPackage:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
