.class Lcom/tendcloud/tenddata/br$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/br;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/br;


# direct methods
.method constructor <init>(Lcom/tendcloud/tenddata/br;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iput-wide v1, v0, Lcom/tendcloud/tenddata/br;->f:J

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    .line 10
    .line 11
    iget-wide v1, v0, Lcom/tendcloud/tenddata/br;->f:J

    .line 12
    .line 13
    iget-wide v3, v0, Lcom/tendcloud/tenddata/br;->g:J

    .line 14
    .line 15
    sub-long/2addr v1, v3

    .line 16
    invoke-static {v0}, Lcom/tendcloud/tenddata/br;->a(Lcom/tendcloud/tenddata/br;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    cmp-long v0, v1, v3

    .line 21
    .line 22
    if-lez v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    .line 25
    .line 26
    iget-wide v1, v0, Lcom/tendcloud/tenddata/br;->f:J

    .line 27
    .line 28
    iput-wide v1, v0, Lcom/tendcloud/tenddata/br;->g:J

    .line 29
    .line 30
    invoke-static {v0}, Lcom/tendcloud/tenddata/br;->b(Lcom/tendcloud/tenddata/br;)Lcom/tendcloud/tenddata/ba;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, v0, Lcom/tendcloud/tenddata/br;->d:Lcom/tendcloud/tenddata/ba;

    .line 35
    .line 36
    iget-object v0, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    .line 37
    .line 38
    iget-object v1, v0, Lcom/tendcloud/tenddata/br;->d:Lcom/tendcloud/tenddata/ba;

    .line 39
    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    invoke-static {v0}, Lcom/tendcloud/tenddata/br;->c(Lcom/tendcloud/tenddata/br;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    .line 46
    .line 47
    invoke-static {v0}, Lcom/tendcloud/tenddata/br;->d(Lcom/tendcloud/tenddata/br;)Lcom/tendcloud/tenddata/ba;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iput-object v1, v0, Lcom/tendcloud/tenddata/br;->d:Lcom/tendcloud/tenddata/ba;

    .line 52
    .line 53
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    .line 54
    .line 55
    invoke-static {v0}, Lcom/tendcloud/tenddata/br;->d(Lcom/tendcloud/tenddata/br;)Lcom/tendcloud/tenddata/ba;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iput-object v1, v0, Lcom/tendcloud/tenddata/br;->e:Lcom/tendcloud/tenddata/ba;

    .line 60
    .line 61
    iget-object v0, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    .line 62
    .line 63
    iget-object v1, v0, Lcom/tendcloud/tenddata/br;->d:Lcom/tendcloud/tenddata/ba;

    .line 64
    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    iget-object v2, v0, Lcom/tendcloud/tenddata/br;->e:Lcom/tendcloud/tenddata/ba;

    .line 68
    .line 69
    if-nez v2, :cond_1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    iget-object v0, v0, Lcom/tendcloud/tenddata/br;->a:Lcom/tendcloud/tenddata/bb;

    .line 73
    .line 74
    invoke-virtual {v0, v1, v2}, Lcom/tendcloud/tenddata/bb;->a(Lcom/tendcloud/tenddata/ba;Lcom/tendcloud/tenddata/ba;)D

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    const-wide v2, 0x3fe999999999999aL    # 0.8

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    cmpg-double v0, v0, v2

    .line 84
    .line 85
    if-gez v0, :cond_2

    .line 86
    .line 87
    iget-object v0, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    .line 88
    .line 89
    invoke-static {v0}, Lcom/tendcloud/tenddata/br;->c(Lcom/tendcloud/tenddata/br;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    nop

    .line 93
    :catchall_0
    :cond_2
    :goto_0
    return-void
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
