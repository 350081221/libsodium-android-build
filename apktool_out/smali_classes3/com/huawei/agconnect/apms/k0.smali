.class public Lcom/huawei/agconnect/apms/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final bcd:Lcom/huawei/agconnect/apms/log/AgentLog;


# instance fields
.field public abc:Lcom/huawei/agconnect/apms/n0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/k0;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/huawei/agconnect/apms/n0;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/n0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/apms/k0;->abc:Lcom/huawei/agconnect/apms/n0;

    .line 10
    .line 11
    return-void
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
.end method


# virtual methods
.method public abc()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/k0;->abc:Lcom/huawei/agconnect/apms/n0;

    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/n0;->abc()V

    return-void
.end method

.method public abc(Ljava/lang/String;)V
    .locals 2

    .line 7
    :try_start_0
    invoke-static {}, Landroid/os/Looper;->myQueue()Landroid/os/MessageQueue;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/agconnect/apms/k0;->abc:Lcom/huawei/agconnect/apms/n0;

    .line 8
    iget-object v1, v1, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    .line 9
    invoke-static {p1, v1}, Lcom/huawei/agconnect/apms/r0;->abc(Ljava/lang/String;Lcom/huawei/agconnect/apms/q0;)Landroid/os/MessageQueue$IdleHandler;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 10
    sget-object v0, Lcom/huawei/agconnect/apms/k0;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "Looper.myQueue().addIdleHandler has an error, "

    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public abc(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/k0;->abc:Lcom/huawei/agconnect/apms/n0;

    new-instance v1, Lcom/huawei/agconnect/apms/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/huawei/agconnect/apms/i0;->bcd:Lcom/huawei/agconnect/apms/i0;

    .line 3
    iget p2, p2, Lcom/huawei/agconnect/apms/i0;->abc:I

    .line 4
    invoke-direct {v1, p1, p2}, Lcom/huawei/agconnect/apms/c;-><init>(Ljava/lang/String;I)V

    .line 5
    iget-object p1, v0, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    if-nez p1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1, v1}, Lcom/huawei/agconnect/apms/m0;->cde(Lcom/huawei/agconnect/apms/c;)V

    :goto_0
    return-void
.end method

.method public bcd()Lcom/huawei/agconnect/apms/l0;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/huawei/agconnect/apms/k0;->abc:Lcom/huawei/agconnect/apms/n0;

    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/n0;->abc()V

    .line 9
    iget-object v0, p0, Lcom/huawei/agconnect/apms/k0;->abc:Lcom/huawei/agconnect/apms/n0;

    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/n0;->bcd()Lcom/huawei/agconnect/apms/l0;

    move-result-object v0

    return-object v0
.end method

.method public bcd(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/k0;->abc:Lcom/huawei/agconnect/apms/n0;

    sget-object v1, Lcom/huawei/agconnect/apms/g0;->cde:Lcom/huawei/agconnect/apms/g0;

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/n0;->abc(Lcom/huawei/agconnect/apms/g0;)V

    .line 2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/k0;->abc:Lcom/huawei/agconnect/apms/n0;

    new-instance v1, Lcom/huawei/agconnect/apms/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object v2, Lcom/huawei/agconnect/apms/i0;->bcd:Lcom/huawei/agconnect/apms/i0;

    .line 3
    iget v2, v2, Lcom/huawei/agconnect/apms/i0;->abc:I

    .line 4
    invoke-direct {v1, p2, v2}, Lcom/huawei/agconnect/apms/c;-><init>(Ljava/lang/String;I)V

    .line 5
    iget-object p2, v0, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    if-nez p2, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p2, v1}, Lcom/huawei/agconnect/apms/m0;->cde(Lcom/huawei/agconnect/apms/c;)V

    .line 7
    :goto_0
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/k0;->abc(Ljava/lang/String;)V

    return-void
.end method

.method public cde()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/k0;->abc:Lcom/huawei/agconnect/apms/n0;

    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/n0;->abc()V

    return-void
.end method

.method public cde(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/k0;->abc:Lcom/huawei/agconnect/apms/n0;

    new-instance v1, Lcom/huawei/agconnect/apms/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/huawei/agconnect/apms/i0;->bcd:Lcom/huawei/agconnect/apms/i0;

    .line 3
    iget p2, p2, Lcom/huawei/agconnect/apms/i0;->abc:I

    .line 4
    invoke-direct {v1, p1, p2}, Lcom/huawei/agconnect/apms/c;-><init>(Ljava/lang/String;I)V

    .line 5
    iget-object p1, v0, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    if-nez p1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1, v1}, Lcom/huawei/agconnect/apms/m0;->cde(Lcom/huawei/agconnect/apms/c;)V

    :goto_0
    return-void
.end method
