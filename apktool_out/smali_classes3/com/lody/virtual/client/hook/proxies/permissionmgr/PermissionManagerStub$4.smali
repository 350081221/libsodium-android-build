.class Lcom/lody/virtual/client/hook/proxies/permissionmgr/PermissionManagerStub$4;
.super Lcom/lody/virtual/client/hook/base/StaticMethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/hook/proxies/permissionmgr/PermissionManagerStub;->onBindMethods()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/proxies/permissionmgr/PermissionManagerStub;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/hook/proxies/permissionmgr/PermissionManagerStub;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/permissionmgr/PermissionManagerStub$4;->this$0:Lcom/lody/virtual/client/hook/proxies/permissionmgr/PermissionManagerStub;

    invoke-direct {p0, p2}, Lcom/lody/virtual/client/hook/base/StaticMethodProxy;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    array-length p1, p3

    .line 2
    const/4 p2, 0x4

    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    if-lt p1, p2, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/lody/virtual/client/ipc/VPackageManager;->get()Lcom/lody/virtual/client/ipc/VPackageManager;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    aget-object p2, p3, v0

    .line 12
    .line 13
    check-cast p2, Ljava/lang/String;

    .line 14
    .line 15
    aget-object v0, p3, v1

    .line 16
    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    aget-object p3, p3, v1

    .line 21
    .line 22
    check-cast p3, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    invoke-virtual {p1, p2, v0, p3}, Lcom/lody/virtual/client/ipc/VPackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_0
    invoke-static {}, Lcom/lody/virtual/client/ipc/VPackageManager;->get()Lcom/lody/virtual/client/ipc/VPackageManager;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    aget-object p2, p3, v1

    .line 42
    .line 43
    check-cast p2, Ljava/lang/String;

    .line 44
    .line 45
    aget-object v0, p3, v0

    .line 46
    .line 47
    check-cast v0, Ljava/lang/String;

    .line 48
    .line 49
    const/4 v1, 0x2

    .line 50
    aget-object p3, p3, v1

    .line 51
    .line 52
    check-cast p3, Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result p3

    .line 58
    invoke-virtual {p1, p2, v0, p3}, Lcom/lody/virtual/client/ipc/VPackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;I)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1
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
