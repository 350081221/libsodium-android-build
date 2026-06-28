.class Lcom/tendcloud/tenddata/ck$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/ck$1;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tendcloud/tenddata/ck$1;

.field final synthetic val$service:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Lcom/tendcloud/tenddata/ck$1;Landroid/os/IBinder;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/ck$1$1;->this$1:Lcom/tendcloud/tenddata/ck$1;

    iput-object p2, p0, Lcom/tendcloud/tenddata/ck$1$1;->val$service:Landroid/os/IBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/ck$1$1;->this$1:Lcom/tendcloud/tenddata/ck$1;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/tendcloud/tenddata/ck$1;->this$0:Lcom/tendcloud/tenddata/ck;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/tendcloud/tenddata/ck;->a(Lcom/tendcloud/tenddata/ck;)Ljava/util/concurrent/LinkedBlockingQueue;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/tendcloud/tenddata/ck$1$1;->this$1:Lcom/tendcloud/tenddata/ck$1;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/tendcloud/tenddata/ck$1;->this$0:Lcom/tendcloud/tenddata/ck;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/tendcloud/tenddata/ck;->a(Lcom/tendcloud/tenddata/ck;)Ljava/util/concurrent/LinkedBlockingQueue;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/ck$1$1;->this$1:Lcom/tendcloud/tenddata/ck$1;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/tendcloud/tenddata/ck$1;->this$0:Lcom/tendcloud/tenddata/ck;

    .line 29
    .line 30
    invoke-static {v0}, Lcom/tendcloud/tenddata/ck;->a(Lcom/tendcloud/tenddata/ck;)Ljava/util/concurrent/LinkedBlockingQueue;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, Lcom/tendcloud/tenddata/ck$1$1;->val$service:Landroid/os/IBinder;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    :catchall_0
    return-void
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
