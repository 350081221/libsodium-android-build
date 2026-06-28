.class public Lcom/huawei/agconnect/apms/u0;
.super Lcom/huawei/agconnect/apms/k0;
.source "SourceFile"


# instance fields
.field public cde:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/agconnect/apms/k0;-><init>()V

    return-void
.end method


# virtual methods
.method public bcd()Lcom/huawei/agconnect/apms/l0;
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/huawei/agconnect/apms/k0;->bcd()Lcom/huawei/agconnect/apms/l0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getExecutor()Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lcom/huawei/agconnect/apms/u0$abc;

    .line 14
    .line 15
    invoke-direct {v2, p0, v0}, Lcom/huawei/agconnect/apms/u0$abc;-><init>(Lcom/huawei/agconnect/apms/u0;Lcom/huawei/agconnect/apms/l0;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-object v0
    .line 22
    .line 23
.end method

.method public cde(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/huawei/agconnect/apms/k0;->cde(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/huawei/agconnect/apms/u0;->cde:Ljava/lang/String;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
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
