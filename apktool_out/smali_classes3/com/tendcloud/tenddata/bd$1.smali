.class Lcom/tendcloud/tenddata/bd$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/bd;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/bd;


# direct methods
.method constructor <init>(Lcom/tendcloud/tenddata/bd;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/bd$1;->this$0:Lcom/tendcloud/tenddata/bd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/o;->C(Landroid/content/Context;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lcom/tendcloud/tenddata/bv;

    .line 10
    .line 11
    invoke-direct {v1}, Lcom/tendcloud/tenddata/bv;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "env"

    .line 15
    .line 16
    iput-object v2, v1, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    .line 17
    .line 18
    const-string v2, "arp"

    .line 19
    .line 20
    iput-object v2, v1, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    .line 21
    .line 22
    iput-object v0, v1, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    .line 23
    .line 24
    sget-object v0, Lcom/tendcloud/tenddata/a;->ENV:Lcom/tendcloud/tenddata/a;

    .line 25
    .line 26
    iput-object v0, v1, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    .line 27
    .line 28
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :catchall_0
    :cond_0
    return-void
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
