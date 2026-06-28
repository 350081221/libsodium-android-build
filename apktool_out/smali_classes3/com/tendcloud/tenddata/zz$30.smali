.class Lcom/tendcloud/tenddata/zz$30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/zz;->a(Landroid/content/Context;Ljava/lang/String;ILcom/tendcloud/tenddata/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/zz;

.field final synthetic val$apiType:I

.field final synthetic val$features:Lcom/tendcloud/tenddata/a;

.field final synthetic val$pageName:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/tendcloud/tenddata/zz;ILjava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/zz$30;->this$0:Lcom/tendcloud/tenddata/zz;

    iput p2, p0, Lcom/tendcloud/tenddata/zz$30;->val$apiType:I

    iput-object p3, p0, Lcom/tendcloud/tenddata/zz$30;->val$pageName:Ljava/lang/String;

    iput-object p4, p0, Lcom/tendcloud/tenddata/zz$30;->val$features:Lcom/tendcloud/tenddata/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/tendcloud/tenddata/zz$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/tendcloud/tenddata/zz$a;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 11
    .line 12
    const-string v2, "apiType"

    .line 13
    .line 14
    iget v3, p0, Lcom/tendcloud/tenddata/zz$30;->val$apiType:I

    .line 15
    .line 16
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 24
    .line 25
    const-string v2, "occurTime"

    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget-object v1, v0, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 39
    .line 40
    const-string v2, "pageName"

    .line 41
    .line 42
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$30;->val$pageName:Ljava/lang/String;

    .line 43
    .line 44
    if-nez v3, :cond_0

    .line 45
    .line 46
    const-string v3, ""

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-static {v3}, Lcom/tendcloud/tenddata/y;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    :goto_0
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    iget-object v1, v0, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 57
    .line 58
    const-string v2, "service"

    .line 59
    .line 60
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$30;->val$features:Lcom/tendcloud/tenddata/a;

    .line 61
    .line 62
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lcom/tendcloud/tenddata/zz;->c()Landroid/os/Handler;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const/16 v2, 0x66

    .line 70
    .line 71
    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    :catchall_0
    :cond_1
    return-void
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
