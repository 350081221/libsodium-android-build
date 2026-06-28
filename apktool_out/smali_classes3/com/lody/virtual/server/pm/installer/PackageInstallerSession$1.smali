.class Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$1;->this$0:Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$1;->this$0:Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->access$000(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$1;->this$0:Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;

    .line 13
    .line 14
    check-cast p1, Landroid/content/pm/IPackageInstallObserver2;

    .line 15
    .line 16
    invoke-static {v1, p1}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->access$102(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;Landroid/content/pm/IPackageInstallObserver2;)Landroid/content/pm/IPackageInstallObserver2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    :cond_0
    :try_start_1
    iget-object p1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$1;->this$0:Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->access$200(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;)V
    :try_end_1
    .catch Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$PackageManagerException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception p1

    .line 26
    :try_start_2
    invoke-static {p1}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->getCompleteMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "PackageInstaller"

    .line 31
    .line 32
    new-instance v3, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v4, "Commit of session "

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v4, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$1;->this$0:Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;

    .line 43
    .line 44
    iget v4, v4, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->sessionId:I

    .line 45
    .line 46
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v4, " failed: "

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v2, v3}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$1;->this$0:Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;

    .line 65
    .line 66
    invoke-static {v2}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->access$300(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$1;->this$0:Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;

    .line 70
    .line 71
    iget p1, p1, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$PackageManagerException;->error:I

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-static {v2, p1, v1, v3}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->access$400(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;ILjava/lang/String;Landroid/os/Bundle;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    monitor-exit v0

    .line 78
    const/4 p1, 0x1

    .line 79
    return p1

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    throw p1
    .line 83
    .line 84
    .line 85
.end method
