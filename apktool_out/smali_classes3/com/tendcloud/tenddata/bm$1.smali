.class Lcom/tendcloud/tenddata/bm$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/bm;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/bm;


# direct methods
.method constructor <init>(Lcom/tendcloud/tenddata/bm;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/bm$1;->this$0:Lcom/tendcloud/tenddata/bm;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/bm$1;->this$0:Lcom/tendcloud/tenddata/bm;

    .line 14
    .line 15
    invoke-static {p1}, Lcom/tendcloud/tenddata/bm;->a(Lcom/tendcloud/tenddata/bm;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/tendcloud/tenddata/bm$1;->this$0:Lcom/tendcloud/tenddata/bm;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/tendcloud/tenddata/bm;->b(Lcom/tendcloud/tenddata/bm;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object p1, p0, Lcom/tendcloud/tenddata/bm$1;->this$0:Lcom/tendcloud/tenddata/bm;

    .line 25
    .line 26
    invoke-static {p1}, Lcom/tendcloud/tenddata/bm;->a(Lcom/tendcloud/tenddata/bm;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    iget-object p1, p0, Lcom/tendcloud/tenddata/bm$1;->this$0:Lcom/tendcloud/tenddata/bm;

    .line 31
    .line 32
    invoke-static {p1}, Lcom/tendcloud/tenddata/bm;->b(Lcom/tendcloud/tenddata/bm;)V

    .line 33
    .line 34
    .line 35
    :goto_0
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
.end method
