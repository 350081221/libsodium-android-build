.class Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub$4;
.super Lcom/lody/virtual/client/hook/base/StaticMethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub;->onBindMethods()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub$4;->this$0:Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub;

    invoke-direct {p0, p2}, Lcom/lody/virtual/client/hook/base/StaticMethodProxy;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    const/4 v0, 0x3

    .line 2
    aget-object v1, p3, v0

    .line 3
    .line 4
    instance-of v2, v1, Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    check-cast v1, Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isAppPkg(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getHostPkg()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    aput-object v1, p3, v0

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub$4;->this$0:Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub;

    .line 23
    .line 24
    invoke-static {v0, p3}, Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub;->access$000(Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-super {p0, p1, p2, p3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
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
