.class Lcom/lody/virtual/client/hook/proxies/media/session/SessionManagerStub$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/hook/proxies/media/session/SessionManagerStub$1;->call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/lody/virtual/client/hook/proxies/media/session/SessionManagerStub$1;

.field final synthetic val$ISession:Landroid/os/IInterface;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/hook/proxies/media/session/SessionManagerStub$1;Landroid/os/IInterface;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/media/session/SessionManagerStub$1$1;->this$1:Lcom/lody/virtual/client/hook/proxies/media/session/SessionManagerStub$1;

    iput-object p2, p0, Lcom/lody/virtual/client/hook/proxies/media/session/SessionManagerStub$1$1;->val$ISession:Landroid/os/IInterface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "getController"

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcom/lody/virtual/client/hook/proxies/media/session/SessionManagerStub$1$1;->val$ISession:Landroid/os/IInterface;

    .line 14
    .line 15
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Landroid/os/IInterface;

    .line 20
    .line 21
    new-instance p2, Lcom/lody/virtual/client/hook/proxies/media/session/SessionManagerStub$1$1$1;

    .line 22
    .line 23
    invoke-direct {p2, p0, p1}, Lcom/lody/virtual/client/hook/proxies/media/session/SessionManagerStub$1$1$1;-><init>(Lcom/lody/virtual/client/hook/proxies/media/session/SessionManagerStub$1$1;Landroid/os/IInterface;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, p2}, Lcom/lody/virtual/client/hook/proxies/media/session/SessionManagerStub;->access$000(Landroid/os/IInterface;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/proxies/media/session/SessionManagerStub$1$1;->val$ISession:Landroid/os/IInterface;

    .line 32
    .line 33
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
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
