.class final Lcom/tendcloud/tenddata/bo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;ZLjava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$data:Ljava/util/Map;

.field final synthetic val$host:Ljava/lang/String;

.field final synthetic val$sendStatusSuccess:Z


# direct methods
.method constructor <init>(Ljava/util/Map;ZLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/bo$1;->val$data:Ljava/util/Map;

    iput-boolean p2, p0, Lcom/tendcloud/tenddata/bo$1;->val$sendStatusSuccess:Z

    iput-object p3, p0, Lcom/tendcloud/tenddata/bo$1;->val$host:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/bo$1;->val$data:Ljava/util/Map;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/tendcloud/tenddata/bo$1;->val$sendStatusSuccess:Z

    .line 12
    .line 13
    iget-object v1, p0, Lcom/tendcloud/tenddata/bo$1;->val$data:Ljava/util/Map;

    .line 14
    .line 15
    const-string v2, "targetUrl"

    .line 16
    .line 17
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, Lcom/tendcloud/tenddata/bo$1;->val$host:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0, v1, v2}, Lcom/tendcloud/tenddata/bo;->a(ZLjava/lang/String;Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const/4 v0, 0x1

    .line 35
    new-array v0, v0, [Ljava/lang/String;

    .line 36
    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Lcom/tendcloud/tenddata/bo$1;->val$data:Ljava/util/Map;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v2, " host: "

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v2, p0, Lcom/tendcloud/tenddata/bo$1;->val$host:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const/4 v2, 0x0

    .line 66
    aput-object v1, v0, v2

    .line 67
    .line 68
    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->dForInternal([Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v0, Lcom/tendcloud/tenddata/bv;

    .line 72
    .line 73
    invoke-direct {v0}, Lcom/tendcloud/tenddata/bv;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v1, "sdk"

    .line 77
    .line 78
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    .line 79
    .line 80
    iget-boolean v1, p0, Lcom/tendcloud/tenddata/bo$1;->val$sendStatusSuccess:Z

    .line 81
    .line 82
    if-eqz v1, :cond_1

    .line 83
    .line 84
    const-string v1, "send_ok"

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    const-string v1, "send_fail"

    .line 88
    .line 89
    :goto_0
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v1, p0, Lcom/tendcloud/tenddata/bo$1;->val$data:Ljava/util/Map;

    .line 92
    .line 93
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    .line 94
    .line 95
    sget-object v1, Lcom/tendcloud/tenddata/a;->ENV:Lcom/tendcloud/tenddata/a;

    .line 96
    .line 97
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    .line 98
    .line 99
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    :catchall_0
    :cond_2
    return-void
.end method
