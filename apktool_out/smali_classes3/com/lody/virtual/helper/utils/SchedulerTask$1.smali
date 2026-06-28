.class Lcom/lody/virtual/helper/utils/SchedulerTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/utils/SchedulerTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/helper/utils/SchedulerTask;


# direct methods
.method constructor <init>(Lcom/lody/virtual/helper/utils/SchedulerTask;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/helper/utils/SchedulerTask$1;->this$0:Lcom/lody/virtual/helper/utils/SchedulerTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/utils/SchedulerTask$1;->this$0:Lcom/lody/virtual/helper/utils/SchedulerTask;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/lody/virtual/helper/utils/SchedulerTask$1;->this$0:Lcom/lody/virtual/helper/utils/SchedulerTask;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/SchedulerTask;->access$000(Lcom/lody/virtual/helper/utils/SchedulerTask;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/lody/virtual/helper/utils/SchedulerTask$1;->this$0:Lcom/lody/virtual/helper/utils/SchedulerTask;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/SchedulerTask;->access$100(Lcom/lody/virtual/helper/utils/SchedulerTask;)Landroid/os/Handler;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Lcom/lody/virtual/helper/utils/SchedulerTask$1;->this$0:Lcom/lody/virtual/helper/utils/SchedulerTask;

    .line 25
    .line 26
    invoke-static {v1}, Lcom/lody/virtual/helper/utils/SchedulerTask;->access$000(Lcom/lody/virtual/helper/utils/SchedulerTask;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
    .line 34
    .line 35
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
