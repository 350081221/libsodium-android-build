.class Lcom/umeng/analytics/pro/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/pro/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/umeng/analytics/pro/m;


# direct methods
.method constructor <init>(Lcom/umeng/analytics/pro/m;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/analytics/pro/m$a;->a:Lcom/umeng/analytics/pro/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/m$a;->a:Lcom/umeng/analytics/pro/m;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/umeng/analytics/pro/m;->a(Lcom/umeng/analytics/pro/m;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "MobclickRT"

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/umeng/analytics/pro/m$a;->a:Lcom/umeng/analytics/pro/m;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/umeng/analytics/pro/m;->b(Lcom/umeng/analytics/pro/m;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/umeng/analytics/pro/m$a;->a:Lcom/umeng/analytics/pro/m;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {v0, v2}, Lcom/umeng/analytics/pro/m;->a(Lcom/umeng/analytics/pro/m;Z)Z

    .line 23
    .line 24
    .line 25
    const-string v0, "--->>> went background."

    .line 26
    .line 27
    invoke-static {v1, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/m$a;->a:Lcom/umeng/analytics/pro/m;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/umeng/analytics/pro/m;->c(Lcom/umeng/analytics/pro/m;)Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-ge v2, v0, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, Lcom/umeng/analytics/pro/m$a;->a:Lcom/umeng/analytics/pro/m;

    .line 43
    .line 44
    invoke-static {v0}, Lcom/umeng/analytics/pro/m;->c(Lcom/umeng/analytics/pro/m;)Ljava/util/ArrayList;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lcom/umeng/analytics/pro/n;

    .line 53
    .line 54
    invoke-interface {v0}, Lcom/umeng/analytics/pro/n;->n()V

    .line 55
    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const-string v0, "--->>> still foreground."

    .line 61
    .line 62
    invoke-static {v1, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-void
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
