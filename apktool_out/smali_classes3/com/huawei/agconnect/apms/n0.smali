.class public Lcom/huawei/agconnect/apms/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/b;


# instance fields
.field public abc:Lcom/huawei/agconnect/apms/m0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abc()V
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    if-nez v0, :cond_0

    return-void

    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/m0;->abc()V

    return-void
.end method

.method public abc(Lcom/huawei/agconnect/apms/g0;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/huawei/agconnect/apms/g0;->abc:Ljava/lang/String;

    .line 2
    sget-object v1, Lcom/huawei/agconnect/apms/m0;->fgh:Lcom/huawei/agconnect/apms/log/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start trace: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 3
    new-instance v1, Lcom/huawei/agconnect/apms/c;

    invoke-direct {v1, v0}, Lcom/huawei/agconnect/apms/c;-><init>(Ljava/lang/String;)V

    .line 4
    new-instance v0, Lcom/huawei/agconnect/apms/m0;

    invoke-direct {v0, v1, p1}, Lcom/huawei/agconnect/apms/m0;-><init>(Lcom/huawei/agconnect/apms/c;Lcom/huawei/agconnect/apms/g0;)V

    .line 5
    iget-object p1, v0, Lcom/huawei/agconnect/apms/m0;->abc:Lcom/huawei/agconnect/apms/o0;

    const/4 v2, 0x1

    .line 6
    invoke-virtual {p1, v1, v2}, Lcom/huawei/agconnect/apms/o0;->abc(Lcom/huawei/agconnect/apms/c;Z)V

    .line 7
    iput-object v0, p0, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    .line 8
    invoke-static {p0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->addListener(Lcom/huawei/agconnect/apms/b;)V

    return-void
.end method

.method public bcd()Lcom/huawei/agconnect/apms/l0;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->clearListener()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    .line 11
    .line 12
    iget-object v2, v0, Lcom/huawei/agconnect/apms/m0;->bcd:Lcom/huawei/agconnect/apms/l0;

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    iget-object v2, v0, Lcom/huawei/agconnect/apms/m0;->cde:Lcom/huawei/agconnect/apms/g0;

    .line 18
    .line 19
    sget-object v3, Lcom/huawei/agconnect/apms/g0;->bcd:Lcom/huawei/agconnect/apms/g0;

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    if-ne v2, v3, :cond_2

    .line 23
    .line 24
    iput-boolean v4, v0, Lcom/huawei/agconnect/apms/m0;->def:Z

    .line 25
    .line 26
    :cond_2
    iget-object v2, v0, Lcom/huawei/agconnect/apms/m0;->abc:Lcom/huawei/agconnect/apms/o0;

    .line 27
    .line 28
    if-eqz v2, :cond_4

    .line 29
    .line 30
    iget-object v3, v2, Lcom/huawei/agconnect/apms/o0;->abc:Ljava/lang/ThreadLocal;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->remove()V

    .line 33
    .line 34
    .line 35
    iget-object v2, v2, Lcom/huawei/agconnect/apms/o0;->bcd:Ljava/lang/ThreadLocal;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lcom/huawei/agconnect/apms/o0$bcd;

    .line 42
    .line 43
    if-nez v2, :cond_3

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->clear()V

    .line 47
    .line 48
    .line 49
    :cond_4
    :goto_0
    iget-object v0, v0, Lcom/huawei/agconnect/apms/m0;->bcd:Lcom/huawei/agconnect/apms/l0;

    .line 50
    .line 51
    iget-boolean v2, v0, Lcom/huawei/agconnect/apms/l0;->cde:Z

    .line 52
    .line 53
    if-eqz v2, :cond_5

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_5
    iput-boolean v4, v0, Lcom/huawei/agconnect/apms/l0;->cde:Z

    .line 57
    .line 58
    iget-object v1, v0, Lcom/huawei/agconnect/apms/l0;->def:Lcom/huawei/agconnect/apms/c;

    .line 59
    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    invoke-virtual {v1, v2, v3}, Lcom/huawei/agconnect/apms/c;->abc(J)V

    .line 65
    .line 66
    .line 67
    iget-object v1, v0, Lcom/huawei/agconnect/apms/l0;->def:Lcom/huawei/agconnect/apms/c;

    .line 68
    .line 69
    iget-wide v1, v1, Lcom/huawei/agconnect/apms/c;->bcd:J

    .line 70
    .line 71
    iput-wide v1, v0, Lcom/huawei/agconnect/apms/l0;->ghi:J

    .line 72
    .line 73
    move-object v1, v0

    .line 74
    :goto_1
    return-object v1
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
