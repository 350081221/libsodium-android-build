.class Lcom/lody/virtual/server/pm/VUserManagerService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/pm/VUserManagerService;->createUser(Ljava/lang/String;I)Lcom/lody/virtual/os/VUserInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/server/pm/VUserManagerService;

.field final synthetic val$userInfo:Lcom/lody/virtual/os/VUserInfo;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/pm/VUserManagerService;Lcom/lody/virtual/os/VUserInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/pm/VUserManagerService$1;->this$0:Lcom/lody/virtual/server/pm/VUserManagerService;

    iput-object p2, p0, Lcom/lody/virtual/server/pm/VUserManagerService$1;->val$userInfo:Lcom/lody/virtual/os/VUserInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/env/SpecialComponentList;->getPreInstallPackages()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VUserManagerService$1;->val$userInfo:Lcom/lody/virtual/os/VUserInfo;

    .line 22
    .line 23
    iget v2, v2, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-static {}, Lcom/lody/virtual/server/pm/VAppManagerService;->get()Lcom/lody/virtual/server/pm/VAppManagerService;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v3, p0, Lcom/lody/virtual/server/pm/VUserManagerService$1;->val$userInfo:Lcom/lody/virtual/os/VUserInfo;

    .line 33
    .line 34
    iget v3, v3, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 35
    .line 36
    invoke-virtual {v2, v3, v1}, Lcom/lody/virtual/server/pm/VAppManagerService;->isAppInstalledAsUser(ILjava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    invoke-static {}, Lcom/lody/virtual/server/pm/VAppManagerService;->get()Lcom/lody/virtual/server/pm/VAppManagerService;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v3, p0, Lcom/lody/virtual/server/pm/VUserManagerService$1;->val$userInfo:Lcom/lody/virtual/os/VUserInfo;

    .line 47
    .line 48
    iget v3, v3, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 49
    .line 50
    invoke-virtual {v2, v3, v1}, Lcom/lody/virtual/server/pm/VAppManagerService;->installPackageAsUser(ILjava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return-void
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
