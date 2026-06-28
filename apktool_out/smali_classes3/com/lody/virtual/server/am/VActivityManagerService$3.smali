.class Lcom/lody/virtual/server/am/VActivityManagerService$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lody/virtual/helper/compat/PermissionCompat$CallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/am/VActivityManagerService;->startRequestPermissions(Z[Ljava/lang/String;Landroid/os/ConditionVariable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/server/am/VActivityManagerService;

.field final synthetic val$permissionLock:Landroid/os/ConditionVariable;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/am/VActivityManagerService;Landroid/os/ConditionVariable;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/am/VActivityManagerService$3;->this$0:Lcom/lody/virtual/server/am/VActivityManagerService;

    iput-object p2, p0, Lcom/lody/virtual/server/am/VActivityManagerService$3;->val$permissionLock:Landroid/os/ConditionVariable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(I[Ljava/lang/String;[I)Z
    .locals 0

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/lody/virtual/server/am/VActivityManagerService$3;->this$0:Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 2
    .line 3
    invoke-static {p3}, Lcom/lody/virtual/helper/compat/PermissionCompat;->isRequestGranted([I)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-static {p1, p2}, Lcom/lody/virtual/server/am/VActivityManagerService;->access$302(Lcom/lody/virtual/server/am/VActivityManagerService;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/lody/virtual/server/am/VActivityManagerService$3;->val$permissionLock:Landroid/os/ConditionVariable;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/lody/virtual/server/am/VActivityManagerService$3;->this$0:Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/lody/virtual/server/am/VActivityManagerService;->access$300(Lcom/lody/virtual/server/am/VActivityManagerService;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    iget-object p2, p0, Lcom/lody/virtual/server/am/VActivityManagerService$3;->val$permissionLock:Landroid/os/ConditionVariable;

    .line 24
    .line 25
    invoke-virtual {p2}, Landroid/os/ConditionVariable;->open()V

    .line 26
    .line 27
    .line 28
    throw p1
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
.end method
