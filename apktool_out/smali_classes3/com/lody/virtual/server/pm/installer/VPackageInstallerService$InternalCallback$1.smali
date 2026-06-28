.class Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;->onSessionFinished(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;

.field final synthetic val$session:Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback$1;->this$1:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;

    iput-object p2, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback$1;->val$session:Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback$1;->this$1:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;->this$0:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;->access$600(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;)Landroid/util/SparseArray;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback$1;->this$1:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;

    .line 11
    .line 12
    iget-object v1, v1, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;->this$0:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;

    .line 13
    .line 14
    invoke-static {v1}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;->access$600(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;)Landroid/util/SparseArray;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback$1;->val$session:Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;

    .line 19
    .line 20
    iget v2, v2, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->sessionId:I

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->remove(I)V

    .line 23
    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw v1
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method
