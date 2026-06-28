.class public Lcom/huawei/agconnect/apms/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/agconnect/apms/o0$bcd;
    }
.end annotation


# static fields
.field public static final def:Lcom/huawei/agconnect/apms/log/AgentLog;


# instance fields
.field public abc:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/huawei/agconnect/apms/c;",
            ">;"
        }
    .end annotation
.end field

.field public bcd:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/huawei/agconnect/apms/o0$bcd<",
            "Lcom/huawei/agconnect/apms/c;",
            ">;>;"
        }
    .end annotation
.end field

.field public cde:Lcom/huawei/agconnect/apms/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/o0;->def:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/apms/o0;->abc:Ljava/lang/ThreadLocal;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/huawei/agconnect/apms/o0;->bcd:Ljava/lang/ThreadLocal;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lcom/huawei/agconnect/apms/o0;->cde:Lcom/huawei/agconnect/apms/c;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method


# virtual methods
.method public abc()Lcom/huawei/agconnect/apms/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/o0;->abc:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/agconnect/apms/c;

    return-object v0
.end method

.method public abc(Lcom/huawei/agconnect/apms/c;Z)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/o0;->bcd:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/agconnect/apms/o0$bcd;

    if-nez v0, :cond_1

    .line 3
    new-instance v0, Lcom/huawei/agconnect/apms/o0$bcd;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/agconnect/apms/o0$bcd;-><init>(Lcom/huawei/agconnect/apms/o0$abc;)V

    .line 4
    :cond_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p1, :cond_3

    .line 5
    :cond_2
    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    sget-object v1, Lcom/huawei/agconnect/apms/o0;->def:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v2, "push stack: "

    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 7
    iget-object v3, p1, Lcom/huawei/agconnect/apms/c;->efg:Ljava/util/UUID;

    .line 8
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", metricName: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    iget-object v3, p1, Lcom/huawei/agconnect/apms/c;->def:Ljava/lang/String;

    .line 10
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", stack size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 11
    :cond_3
    iget-object v1, p0, Lcom/huawei/agconnect/apms/o0;->bcd:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 12
    iget-object v0, p0, Lcom/huawei/agconnect/apms/o0;->abc:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    if-eqz p2, :cond_4

    .line 13
    iput-object p1, p0, Lcom/huawei/agconnect/apms/o0;->cde:Lcom/huawei/agconnect/apms/c;

    :cond_4
    return-void
.end method
