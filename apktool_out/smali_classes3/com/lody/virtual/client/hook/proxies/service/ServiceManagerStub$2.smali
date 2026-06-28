.class Lcom/lody/virtual/client/hook/proxies/service/ServiceManagerStub$2;
.super Lcom/lody/virtual/client/hook/base/StaticMethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/hook/proxies/service/ServiceManagerStub;->onBindMethods()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/proxies/service/ServiceManagerStub;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/hook/proxies/service/ServiceManagerStub;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/service/ServiceManagerStub$2;->this$0:Lcom/lody/virtual/client/hook/proxies/service/ServiceManagerStub;

    invoke-direct {p0, p2}, Lcom/lody/virtual/client/hook/base/StaticMethodProxy;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v1, p3, v0

    .line 3
    .line 4
    check-cast v1, Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v1}, Lcom/lody/virtual/client/core/ServiceLocalManager;->getService(Ljava/lang/String;)Lcom/lody/virtual/client/hook/base/BinderInvocationStub;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/4 v3, 0x1

    .line 11
    const-string v4, "kk"

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    new-array p1, p1, [Ljava/lang/Object;

    .line 17
    .line 18
    aput-object v1, p1, v0

    .line 19
    .line 20
    aput-object v2, p1, v3

    .line 21
    .line 22
    const-string p2, "ServiceLocalManager.checkService:%s->%s"

    .line 23
    .line 24
    invoke-static {v4, p2, p1}, Lcom/lody/virtual/helper/utils/VLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object v2

    .line 28
    :cond_0
    new-array v2, v3, [Ljava/lang/Object;

    .line 29
    .line 30
    aput-object v1, v2, v0

    .line 31
    .line 32
    const-string v0, "ServiceLocalManager.checkService:%s no find"

    .line 33
    .line 34
    invoke-static {v4, v0, v2}, Lcom/lody/virtual/helper/utils/VLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-super {p0, p1, p2, p3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
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
