.class Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "InternalCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;->this$0:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSessionActiveChanged(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;Z)V
    .locals 2

    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;->this$0:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;

    invoke-static {v0}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;->access$200(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;)Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;

    move-result-object v0

    iget v1, p1, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->sessionId:I

    iget p1, p1, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->userId:I

    invoke-static {v0, v1, p1, p2}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;->access$400(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;IIZ)V

    return-void
.end method

.method public onSessionBadgingChanged(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;)V
    .locals 2

    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;->this$0:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;

    invoke-static {v0}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;->access$200(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;)Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;

    move-result-object v0

    iget v1, p1, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->sessionId:I

    iget p1, p1, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->userId:I

    invoke-static {v0, v1, p1}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;->access$300(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;II)V

    return-void
.end method

.method public onSessionFinished(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;->this$0:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;->access$200(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;)Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p1, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->sessionId:I

    .line 8
    .line 9
    iget v2, p1, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->userId:I

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, p2}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;->notifySessionFinished(IIZ)V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;->this$0:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;

    .line 15
    .line 16
    invoke-static {p2}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;->access$700(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;)Landroid/os/Handler;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    new-instance v0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback$1;-><init>(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void
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

.method public onSessionPrepared(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;)V
    .locals 0

    return-void
.end method

.method public onSessionProgressChanged(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;F)V
    .locals 2

    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;->this$0:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;

    invoke-static {v0}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;->access$200(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;)Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;

    move-result-object v0

    iget v1, p1, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->sessionId:I

    iget p1, p1, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->userId:I

    invoke-static {v0, v1, p1, p2}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;->access$500(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$Callbacks;IIF)V

    return-void
.end method

.method public onSessionSealedBlocking(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;)V
    .locals 0

    return-void
.end method
